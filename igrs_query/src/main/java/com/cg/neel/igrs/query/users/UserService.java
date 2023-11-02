/**
 * 
 */
package com.cg.neel.igrs.query.users;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.cg.neel.igrs.query.external.service.Igrs_Service;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/**
 * @author Preeti
 * @dis This service used for reuse method of user related info.
 * @apiNote Used For Call other Micro-service method and  Fault tolerance and circuit breaker and retry module
 *
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
	
	 private final Igrs_Service IGRS_SERVICE;

	/**
	 * @param request
	 * @return Long user-Id
	 */
	//@CircuitBreaker(name = "userIdByPrincipalBreaker_Query_User", fallbackMethod = "userIdByPrincipalFallback_Query_User")
	//@Retry(name = "userIdByPrincipalRetry_Query_User", fallbackMethod = "userIdByPrincipalFallback_Query_User")
	@RateLimiter(name = "userIdByPrincipalLimiter_Query_User", fallbackMethod = "userIdByPrincipalFallback_Query_User")
	public Long getUserId() {
		//Get Principal in SecurityContextHolder 
		Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		log.debug("Getting object of User by Authenication");
		//Using fault tolerance
		return IGRS_SERVICE.getUserIdByPrincipal(object);
	}
	
	//Creating fallback method for getUserId()
	public Long userIdByPrincipalFallback_Query_User(Exception ex) {
		log.info("Fallback is executed because service is down :" + ex.getStackTrace().toString());
		return 0L;
	}

}
