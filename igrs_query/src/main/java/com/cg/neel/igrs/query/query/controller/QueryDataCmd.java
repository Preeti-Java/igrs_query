/**
 * 
 */
package com.cg.neel.igrs.query.query.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.neel.igrs.query.query.dto.FileIdDto;
import com.cg.neel.igrs.query.query.dto.PaymentDropdownIdAndPaymentIdAndDateDto;
import com.cg.neel.igrs.query.query.projection.QueryDropdownIdAndNameProjection;


/**
 * @author Preeti
 * @Dis Send data for drop-down
 * 
 */
@RequestMapping("/default")
public interface QueryDataCmd {
	
	@GetMapping("/type")
	ResponseEntity<List<QueryDropdownIdAndNameProjection>> detailsQueryTypeDropdown();
	
	@GetMapping("/payRefund")
	ResponseEntity<List<PaymentDropdownIdAndPaymentIdAndDateDto>> detailsPaymentDropdownIdAndPaymentIdAndDateDropdown();
	
	@GetMapping("/document")
	ResponseEntity<List<FileIdDto>> fileIdDropdown();

}
