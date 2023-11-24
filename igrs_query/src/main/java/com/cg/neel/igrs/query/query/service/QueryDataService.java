/**
 * 
 */
package com.cg.neel.igrs.query.query.service;

import java.util.List;

import com.cg.neel.igrs.query.query.DetailsMismatchAccessBean;
import com.cg.neel.igrs.query.query.DocumentNotFoundAccessBean;
import com.cg.neel.igrs.query.query.PaymentRefundAccessBean;
import com.cg.neel.igrs.query.query.projection.QueryDropdownIdAndNameProjection;

/**
 * @author Preeti
 *
 */
public interface QueryDataService {

	/**
	 * @return List of query type drop-down
	 */
	List<QueryDropdownIdAndNameProjection> getDetailsQueryTypeDropdown();

	/**
	 * @param documentNotFoundAccessBean
	 */
	void saveDocumentNotFound(DocumentNotFoundAccessBean documentNotFoundAccessBean);

	/**
	 * @param detailsMismatchAccessBean
	 */
	void saveDetailsMismatch(DetailsMismatchAccessBean detailsMismatchAccessBean);

	/**
	 * @param paymentRefundAccessBean
	 */
	void savePaymentRefund(PaymentRefundAccessBean paymentRefundAccessBean);

	/**
	 * @param userId
	 * @return
	 */
	List<DocumentNotFoundAccessBean> getAllDocumentNotFoundByUserId(Long userId);

	/**
	 * @param userId
	 * @return
	 */
	List<DetailsMismatchAccessBean> getAllDocumentMismatchByUserId(Long userId);

	/**
	 * @param userId
	 * @return
	 */
	List<PaymentRefundAccessBean> getAllPaymentRefundByUserId(Long userId);

}
