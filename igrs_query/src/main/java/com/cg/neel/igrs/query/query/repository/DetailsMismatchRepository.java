/**
 * 
 */
package com.cg.neel.igrs.query.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.neel.igrs.query.query.DetailsMismatchAccessBean;

/**
 * @author Preeti
 *
 */
public interface DetailsMismatchRepository extends JpaRepository<DetailsMismatchAccessBean, Long> {

}
