/**
 * 
 */
package com.cg.neel.igrs.query.query.service;

import java.util.List;

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

}
