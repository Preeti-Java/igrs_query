/**
 * 
 */
package com.cg.neel.igrs.query.query.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.neel.igrs.query.query.PaymentRefundAccessBean;

/**
 * @author Preeti
 *
 */
public interface PaymentRefundRepository extends JpaRepository<PaymentRefundAccessBean, Long> {

	/**
	 * @param userId
	 * @return
	 */
	List<PaymentRefundAccessBean> findAllByUserId(Long userId);

}
