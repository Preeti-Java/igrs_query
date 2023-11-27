/**
 * 
 */
package com.cg.neel.igrs.query.spring.config;

import java.util.Arrays;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.cg.neel.igrs.query.jwtconfiguration.JwtTokenValidatorFilter;

/**
 * @author Preeti Rani
 *
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private static final String ACTUATOR_BASE = "/actuator/**";

    /**
     * @return
     */
    @Bean
    PasswordEncoder enoder() {
		//Update in future
		return new BCryptPasswordEncoder(11);
	}


    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.securityContext((context) -> context
                .requireExplicitSave(false))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .cors(corsCustomizer -> corsCustomizer.configurationSource(new CorsConfigurationSource() {
                    @Override
                    public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
                        CorsConfiguration config = new CorsConfiguration();
                        config.setAllowedOrigins(Arrays.asList("http://localhost:4200", "http://localhost"));
                        config.setAllowedMethods(Collections.singletonList("*"));
                        config.setAllowCredentials(true);
                        config.setAllowedHeaders(Collections.singletonList("*"));
                        config.setMaxAge(3600L);
                        return config;
                    }
                }))
                .csrf(csrf -> csrf.disable())
                .addFilterBefore(new JwtTokenValidatorFilter(), UsernamePasswordAuthenticationFilter.class)
                .authorizeHttpRequests()
                .antMatchers(ACTUATOR_BASE)
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .exceptionHandling(handling -> handling.authenticationEntryPoint((request, response, authException) ->
                        response.sendError(HttpServletResponse.SC_UNAUTHORIZED)));

      return http.build();
	}

    @Bean
    AuthenticationManager authenticationManagerBean(HttpSecurity http) throws Exception {
		  return http.getSharedObject(AuthenticationManagerBuilder.class)
		            .build();
	}
	
	/*
	 * @Bean public ResourceBundleMessageSource messageSource() {
	 * ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	 * source.setBasename("messages"); source.setCacheSeconds(3600); // Refresh
	 * cache once per hour. return source; }
	 */
}
