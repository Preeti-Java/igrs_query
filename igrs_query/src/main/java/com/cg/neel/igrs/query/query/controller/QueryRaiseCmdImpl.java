/**
 * 
 */
package com.cg.neel.igrs.query.query.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.neel.igrs.query.data.DataService;
import com.cg.neel.igrs.query.payment.PaymentService;
import com.cg.neel.igrs.query.query.dto.FileIdDto;
import com.cg.neel.igrs.query.query.dto.PaymentDropdownIdAndPaymentIdAndDateDto;
import com.cg.neel.igrs.query.query.projection.QueryDropdownIdAndNameProjection;
import com.cg.neel.igrs.query.query.service.QueryDataService;
import com.cg.neel.igrs.query.users.UserService;

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
	
	private final UserService userService;
	
	private final PaymentService paymentService;
	
	private final DataService dataService;
	

	/*
	 * @Override public
	 * ResponseEntity<List<PaymentDropdownIdAndPaymentIdAndDateDto>>
	 * detailsPaymentDropdownIdAndPaymentIdAndDateDropdown() {
	 * log.info("Request received for /queryId/payRefund endpoint.");
	 * 
	 * //Calling User Micro Service Long userId = userService.getUserId(); if(userId
	 * == 0L) { return ResponseEntity.ok().body(Collections.emptyList()); }
	 * log.info("Getting UserId."); //Calling Payment micro service
	 * List<PaymentDropdownIdAndPaymentIdAndDateDto> paymentData =
	 * paymentService.getDetailsPaymentRefund(userId);
	 * 
	 * log.info("Getting Details Payment Refund of UserId : {}" , userId); return
	 * ResponseEntity.ok().body(paymentData); }
	 * 
	 * @Override public ResponseEntity<List<FileIdDto>> fileIdDropdown() { //Calling
	 * User Micro Service Long userId = userService.getUserId(); if(userId == 0L) {
	 * return ResponseEntity.ok().body(Collections.emptyList()); } //Calling Data
	 * micro service List<FileIdDto> fileIdData =
	 * dataService.getFileIdByPrincipal(userId); return
	 * ResponseEntity.ok().body(fileIdData); }
	 */

	@Override
	public ResponseEntity<String> saveDocumentNotFoundComplaint(Map<String, String> map) {
		
		return null;
	}

}
