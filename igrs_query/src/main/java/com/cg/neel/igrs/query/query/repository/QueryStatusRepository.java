/**
 * 
 */
package com.cg.neel.igrs.query.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.neel.igrs.query.query.QueryStatusAccessBean;

/**
 * @author Preeti
 *
 */
public interface QueryStatusRepository extends JpaRepository<QueryStatusAccessBean, Long> {

}
