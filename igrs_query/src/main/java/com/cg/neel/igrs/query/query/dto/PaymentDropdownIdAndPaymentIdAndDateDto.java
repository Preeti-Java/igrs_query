/**
 * 
 */
package com.cg.neel.igrs.query.query.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Preeti
 * @des For Payment Drop-down Page needs Id And Payment Id And Date
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDropdownIdAndPaymentIdAndDateDto {
	
	private Long paymentRefundId;
	
	private String paymentId;

	private Date paymentDate;

}
