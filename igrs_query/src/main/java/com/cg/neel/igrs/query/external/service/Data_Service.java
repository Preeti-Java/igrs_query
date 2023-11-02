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
 *@Des this service called data_service controller by feign client
 */

@FeignClient("IGRSDATA-SERVICE")
@Service
public interface Data_Service {

	/**
	 * @return userId
	 */
	@PostMapping(value = "query_data/fileId/", consumes = "application/json")
	public Long getFileIdByPrincipal(@RequestParam Object object);
	

}
