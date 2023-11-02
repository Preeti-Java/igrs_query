/**
 * 
 */
package com.cg.neel.igrs.query.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.neel.igrs.query.query.QueryTeamAccessBean;

/**
 * @author Preeti
 *
 */
public interface QueryTeamRepository extends JpaRepository<QueryTeamAccessBean, Long> {

}
