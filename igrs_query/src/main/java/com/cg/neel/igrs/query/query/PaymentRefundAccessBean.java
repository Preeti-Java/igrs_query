/**
 * 
 */
package com.cg.neel.igrs.query.query;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti Rani
 * @des Main Query table
 *
 */
@Entity
@Table(name = "PaymentRefund")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRefundAccessBean {

	@Id
	@Column(name = "PaymentRefundId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentRefundId;
	
	@Column(name = "PaymentId")
	private String paymentId;

	@Column(name = "PaymentDate")
	private Date paymentDate;
	
	@Column(name = "Explanation")
	private String explanation;
}
