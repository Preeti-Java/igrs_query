/**
 * 
 */
package com.cg.neel.igrs.query.external.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.neel.igrs.query.query.dto.PaymentDropdownIdAndPaymentIdAndDateDto;

/**
 * @authorPreeti
 *@Des this service called payment_service controller by feign client
 */

@FeignClient("IGRSPAYMENT-SERVICE")
@Service
public interface Payment_Service {

	/**
	 * @param userId
	 * @return
	 */
	@GetMapping("/payment/refund")
	List<PaymentDropdownIdAndPaymentIdAndDateDto> getDetailsPaymentRefund(Long userId);


}
