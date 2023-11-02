/**
 * 
 */
package com.cg.neel.igrs.query.query;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti Rani
 * @des Main Query table
 *
 */
@Entity
@Table(name = "Query")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QueryAccessBean {

	@Id
	@Column(name = "QueryId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long queryId;
	
	@Column(name = "QueryRaiseDate")
	private Date queryRaiseDate;
	
	@Column(name = "QueryUserId")
	@Transient
	private UserRegAccessBean userRegAccessBean;
	
	@OneToOne
	private QueryStatusAccessBean queryStatusAccessBean;
	
	@OneToOne
	private QueryTypeAccessBean queryTypeAccessBean;
	
}
