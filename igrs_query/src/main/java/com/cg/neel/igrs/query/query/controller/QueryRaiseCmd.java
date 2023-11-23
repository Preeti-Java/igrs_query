/**
 * 
 */
package com.cg.neel.igrs.query.query.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.neel.igrs.query.query.DetailsMismatchAccessBean;
import com.cg.neel.igrs.query.query.DocumentNotFoundAccessBean;
import com.cg.neel.igrs.query.query.PaymentRefundAccessBean;


/**
 * @author Preeti
 * @Dis Send data for drop-down
 * 
 */
@RequestMapping("/default")
public interface QueryRaiseCmd {
	
	@PostMapping("/docNotFound")
	ResponseEntity<String> saveDocumentNotFoundComplaint(@RequestBody final DocumentNotFoundAccessBean documentNotFoundAccessBean);
	
	@PostMapping("/deedMismatch")
	ResponseEntity<String> saveDetailsMismatchComplaint(@RequestBody final DetailsMismatchAccessBean detailsMismatchAccessBean);
	
	@PostMapping("/payIssue")
	ResponseEntity<String> savePaymentRefundComplaint(@RequestBody final PaymentRefundAccessBean paymentRefundAccessBean);
	
}
