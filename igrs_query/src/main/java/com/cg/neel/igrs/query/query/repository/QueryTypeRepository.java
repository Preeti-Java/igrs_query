/**
 * 
 */
package com.cg.neel.igrs.query.query.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.cg.neel.igrs.query.query.QueryTypeAccessBean;
import com.cg.neel.igrs.query.query.projection.QueryDropdownIdAndNameProjection;

/**
 * @author Preeti
 *
 */

public interface QueryTypeRepository extends Repository<QueryTypeAccessBean, Long> {

	/**
	 * @return
	 */
	List<QueryDropdownIdAndNameProjection> findAllDtoBy();
	
}
