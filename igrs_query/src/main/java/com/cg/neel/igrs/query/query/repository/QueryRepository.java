/**
 * 
 */
package com.cg.neel.igrs.query.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.neel.igrs.query.query.QueryAccessBean;

/**
 * @author Preeti
 *
 */
public interface QueryRepository extends JpaRepository<QueryAccessBean, Long> {

}
