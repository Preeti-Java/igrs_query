/**
 * 
 */
package com.cg.neel.igrs.query.query.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.neel.igrs.query.query.projection.QueryDropdownIdAndNameProjection;
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

	@Override
	public List<QueryDropdownIdAndNameProjection> getDetailsQueryTypeDropdown() {
		log.debug("Performing an action in QueryDataService");
		return queryTypeRepository.findAllDtoBy();
	}

}
