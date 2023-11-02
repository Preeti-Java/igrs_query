/**
 * 
 */
package com.cg.neel.igrs.query.query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti Rani
 * @dis query status -> Pending,Assign,Received,Working,Solved,Issue,Rejected,Forward,Holding
 *
 */

@Entity
@Table( name = "QueryStatus")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QueryStatusAccessBean {
	
	@Id
	@Column(name = "QueryStatusId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long queryStatusId;
	
	@Column(name = "QueryStatusName")
	private String queryStatusName;
	
	@Column(name = "QueryStatusNameHindi")
	private String queryStatusNameHindi;
	
	@Column(name = "QueryStatusDescription")
	private String queryStatusDescription;
	

}
