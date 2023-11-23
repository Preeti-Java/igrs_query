/**
 * 
 */
package com.cg.neel.igrs.query.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.cg.neel.igrs.query.exception.BadCredentialsException;
import com.cg.neel.igrs.query.jwtconfiguration.IgrsUser;

/**
 * 
 */
@Component
public class UserUtils {

	/**
	 * @return user id
	 */
	public static Long getUserDetails() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		final IgrsUser user = (IgrsUser) auth.getPrincipal();
		if(user == null)
			throw new BadCredentialsException("Invalid/Expired Token Received");
		return Long.parseLong(user.getUserId());
	}

}
