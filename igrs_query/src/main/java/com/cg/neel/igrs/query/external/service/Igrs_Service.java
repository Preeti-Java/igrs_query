/**
 * 
 */
package com.cg.neel.igrs.query.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @authorPreeti
 *@Des this service called user_service controller by feign client
 */

@FeignClient("IGRS-SERVICE")
@Service
public interface Igrs_Service {

	/**
	 * @return userId
	 */
	@PostMapping(value = "query_user/userId/", consumes = "application/json")
	public Long getUserIdByPrincipal(@RequestParam Object object);
	

}
