/**
 * 
 */
package com.cg.neel.igrs.query.payment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.neel.igrs.query.external.service.Payment_Service;
import com.cg.neel.igrs.query.query.dto.PaymentDropdownIdAndPaymentIdAndDateDto;
import com.cg.neel.igrs.query.query.dto.PaymentDropdownIdAndPaymentIdAndDateDto.PaymentDropdownIdAndPaymentIdAndDateDtoBuilder;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/**
 * @author Preeti
 * @dis This service used for reuse method of payment related info.
 * @apiNote Used For Call other Micro-service method and  Fault tolerance and circuit breaker and retry module
 *
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentService {
	
	 private final Payment_Service PAYMENT_SERVICE;
	
	/**
	 * @param userId
	 * @return payment id list - PaymentDropdownIdAndPaymentIdAndDateOnly
	 */
	//@CircuitBreaker(name = "paymentDetailsByUserIdBreaker_Query_Payment", fallbackMethod = "paymentDetailsByUserFallback_Query_Payment")
	//@Retry(name = "paymentDetailsByUserIdRetry_Query_Payment", fallbackMethod = "paymentDetailsByUserIdFallback_Query_Payment")
	@RateLimiter(name = "paymentDetailsByUserIdRetry_Query_Payment", fallbackMethod = "paymentDetailsByUserIdFallback_Query_Payment")
	public List<PaymentDropdownIdAndPaymentIdAndDateDto> getDetailsPaymentRefund(Long userId) {
		//Need to implement in future
		//return PAYMENT_SERVICE.getDetailsPaymentRefund(userId);
		PaymentDropdownIdAndPaymentIdAndDateDto data= new PaymentDropdownIdAndPaymentIdAndDateDto();
		data.setPaymentRefundId(121L);
		data.setPaymentId("IGR-000-0001");
		data.setPaymentDate((new Date()));
		
		PaymentDropdownIdAndPaymentIdAndDateDto data1= new PaymentDropdownIdAndPaymentIdAndDateDto();
		data1.setPaymentRefundId(122L);
		data1.setPaymentId("IGR-000-0002");
		data1.setPaymentDate((new Date()));
		
		List<PaymentDropdownIdAndPaymentIdAndDateDto> dataList = new ArrayList<>();
		dataList.add(data);
		dataList.add(data1);
		log.debug("Getting Data for Payment dropdown.");
		return dataList;
		
	}
	
	//Creating fallback method for getDetailsPaymentRefund()
	public List<PaymentDropdownIdAndPaymentIdAndDateDto> paymentDetailsByUserIdFallback_Query_Payment(Long userId, Exception ex){
		log.info("Fallback is executed because service is down :" + ex);
		PaymentDropdownIdAndPaymentIdAndDateDtoBuilder data =  PaymentDropdownIdAndPaymentIdAndDateDto.builder()
				.paymentId("000-000-0000")
				.paymentRefundId(0L)
				.paymentDate(new Date());
		return (List<PaymentDropdownIdAndPaymentIdAndDateDto>) new ArrayList<>().set(0, data);
	}

}
