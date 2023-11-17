/**
 * 
 */
package com.cg.neel.igrs.query.query.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Preeti
 * @Dis Send data for drop-down
 * 
 */
@RequestMapping("/default")
public interface QueryRaiseCmd {
	
	@PostMapping("/docNotFound")
	ResponseEntity<String> saveDocumentNotFoundComplaint(@RequestBody Map<String,String> map);
	

}
