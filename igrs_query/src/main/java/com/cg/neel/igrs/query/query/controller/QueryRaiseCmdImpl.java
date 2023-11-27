/**
 * 
 */
package com.cg.neel.igrs.query.query.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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
	public ResponseEntity<Map<String,String>> saveDocumentNotFoundComplaint(DocumentNotFoundAccessBean documentNotFoundAccessBean) {
		//Response
		Map<String,String> res = new HashMap<>();
		//Get User Details
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L) {
			res.put("msg",USER_NOT_FOUND_EXCEPTION);
			return ResponseEntity.ok().body(res);
		}
		
		documentNotFoundAccessBean.setUserId(userId);
		queryDataService.saveDocumentNotFound(documentNotFoundAccessBean);
		
		res.put("msg", SAVE_MSG);
		return ResponseEntity.ok().body(res);
	}

	@Override
	public ResponseEntity<Map<String,String>> saveDetailsMismatchComplaint(DetailsMismatchAccessBean detailsMismatchAccessBean) {
		//Response
		Map<String,String> res = new HashMap<>();
		//Get User Details
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L) {
			res.put("msg",USER_NOT_FOUND_EXCEPTION);
			return ResponseEntity.ok().body(res);
		}
		
		detailsMismatchAccessBean.setUserId(userId);
		queryDataService.saveDetailsMismatch(detailsMismatchAccessBean);
		res.put("msg", SAVE_MSG);
		return ResponseEntity.ok().body(res);
	}

	@Override
	public ResponseEntity<Map<String,String>> savePaymentRefundComplaint(PaymentRefundAccessBean paymentRefundAccessBean) {
		//Response
		Map<String,String> res = new HashMap<>();
		//Get User Details
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L) {
			res.put("msg",USER_NOT_FOUND_EXCEPTION);
			return ResponseEntity.ok().body(res);
		}
		paymentRefundAccessBean.setUserId(userId);
		queryDataService.savePaymentRefund(paymentRefundAccessBean);
		res.put("msg", SAVE_MSG);
		return ResponseEntity.ok().body(res);
	}

	@Override
	public ResponseEntity<List<DocumentNotFoundAccessBean>> getDocumentNotFoundComplaint() {
		//Get User Deatils
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L)
			throw new UsernameNotFoundException(USER_NOT_FOUND_EXCEPTION);
		return ResponseEntity.ok().body(queryDataService.getAllDocumentNotFoundByUserId(userId));
	}

	@Override
	public ResponseEntity<List<DetailsMismatchAccessBean>> getDetailsMismatchComplaint() {
		//Get User Deatils
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L)
			throw new UsernameNotFoundException(USER_NOT_FOUND_EXCEPTION);
		return ResponseEntity.ok().body(queryDataService.getAllDocumentMismatchByUserId(userId));
	}

	@Override
	public ResponseEntity<List<PaymentRefundAccessBean>> getPaymentRefundComplaint() {
		//Get User Deatils
		Long userId = UserUtils.getUserDetails();
		if(userId == 0L)
			throw new UsernameNotFoundException(USER_NOT_FOUND_EXCEPTION);
		return ResponseEntity.ok().body(queryDataService.getAllPaymentRefundByUserId(userId));
	}



}
