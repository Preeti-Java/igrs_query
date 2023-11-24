/**
 * 
 */
package com.cg.neel.igrs.query.query.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.neel.igrs.query.query.DocumentNotFoundAccessBean;

/**
 * @author Preeti
 *
 */
public interface DocumentNotFoundRepository extends JpaRepository<DocumentNotFoundAccessBean, Long> {

	/**
	 * @param userId
	 * @return
	 */
	List<DocumentNotFoundAccessBean> findAllByUserId(Long userId);

}
