/**
 * 
 */
package com.cg.neel.igrs.query.query.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.neel.igrs.query.query.DetailsMismatchAccessBean;
import com.cg.neel.igrs.query.query.DocumentNotFoundAccessBean;
import com.cg.neel.igrs.query.query.PaymentRefundAccessBean;
import com.cg.neel.igrs.query.query.service.QueryDataService;
import com.cg.neel.igrs.query.utils.UserUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Preeti
 *
 */

@RestController
@RequestMapping("/queryd")
@Slf4j
@RequiredArgsConstructor
public class QueryRaiseCmdImpl implements QueryRaiseCmd{
	
	private final QueryDataService queryDataService;
	
	private static final String USER_NOT_FOUND_EXCEPTION = "User not found";
	private static final String SAVE_MSG = "Save";
	
	@Override
	public ResponseEntity<String> saveDocumentNotFoundComplaint(DocumentNotFoundAccessBean documentNotFoundAccessBean) {
		
		//Get User Details
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L)
			return ResponseEntity.ok().body(USER_NOT_FOUND_EXCEPTION);
		
		documentNotFoundAccessBean.setUserId(userId);
		queryDataService.saveDocumentNotFound(documentNotFoundAccessBean);
		
		return ResponseEntity.ok().body(SAVE_MSG);
	}

	@Override
	public ResponseEntity<String> saveDetailsMismatchComplaint(DetailsMismatchAccessBean detailsMismatchAccessBean) {
		//Get User Details
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L)
			return ResponseEntity.ok().body(USER_NOT_FOUND_EXCEPTION);
		
		detailsMismatchAccessBean.setUserId(userId);
		queryDataService.saveDetailsMismatch(detailsMismatchAccessBean);
		return ResponseEntity.ok().body(SAVE_MSG);
	}

	@Override
	public ResponseEntity<String> savePaymentRefundComplaint(PaymentRefundAccessBean paymentRefundAccessBean) {
		//Get User Details
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L)
			return ResponseEntity.ok().body(USER_NOT_FOUND_EXCEPTION);
		
		paymentRefundAccessBean.setUserId(userId);
		queryDataService.savePaymentRefund(paymentRefundAccessBean);
		return ResponseEntity.ok().body(SAVE_MSG);
	}

}
