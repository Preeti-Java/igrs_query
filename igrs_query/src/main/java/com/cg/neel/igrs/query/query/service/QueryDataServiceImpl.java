/**
 * 
 */
package com.cg.neel.igrs.query.query.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.neel.igrs.query.query.DetailsMismatchAccessBean;
import com.cg.neel.igrs.query.query.DocumentNotFoundAccessBean;
import com.cg.neel.igrs.query.query.PaymentRefundAccessBean;
import com.cg.neel.igrs.query.query.projection.QueryDropdownIdAndNameProjection;
import com.cg.neel.igrs.query.query.repository.DetailsMismatchRepository;
import com.cg.neel.igrs.query.query.repository.DocumentNotFoundRepository;
import com.cg.neel.igrs.query.query.repository.PaymentRefundRepository;
import com.cg.neel.igrs.query.query.repository.QueryTypeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Preeti
 *
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class QueryDataServiceImpl implements QueryDataService{
	
	private final QueryTypeRepository queryTypeRepository;
	
	private final DocumentNotFoundRepository documentNotFoundRepository;
	
	private final DetailsMismatchRepository detailsMismatchRepository;
	
	private final PaymentRefundRepository paymentRefundRepository;
	

	@Override
	public List<QueryDropdownIdAndNameProjection> getDetailsQueryTypeDropdown() {
		log.debug("Performing an action in QueryDataService");
		return queryTypeRepository.findAllDtoBy();
	}

	@Override
	public void saveDocumentNotFound(DocumentNotFoundAccessBean documentNotFoundAccessBean) {
		documentNotFoundRepository.save(documentNotFoundAccessBean);
	}

	@Override
	public void saveDetailsMismatch(DetailsMismatchAccessBean detailsMismatchAccessBean) {
		detailsMismatchRepository.save(detailsMismatchAccessBean);
	}

	@Override
	public void savePaymentRefund(PaymentRefundAccessBean paymentRefundAccessBean) {
		paymentRefundRepository.save(paymentRefundAccessBean);
	}

	@Override
	public List<DocumentNotFoundAccessBean> getAllDocumentNotFoundByUserId(Long userId) {
		return documentNotFoundRepository.findAllByUserId(userId);
	}

	@Override
	public List<DetailsMismatchAccessBean> getAllDocumentMismatchByUserId(Long userId) {
		return detailsMismatchRepository.findAllByUserId(userId);
	}

	@Override
	public List<PaymentRefundAccessBean> getAllPaymentRefundByUserId(Long userId) {
		return paymentRefundRepository.findAllByUserId(userId);
	}

}
