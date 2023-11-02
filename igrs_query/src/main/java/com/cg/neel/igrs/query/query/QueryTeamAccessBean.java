/**
 * 
 */
package com.cg.neel.igrs.query.query;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti Rani
 * @des this bean data have name of team who resolve the query -> Quality Check, Technical Team
 *
 */

@Entity
@Table( name = "QueryTeam")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QueryTeamAccessBean {
	
	@Id
	@Column(name = "QueryTeamId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long queryTeamId;
	
	@Column(name = "QueryTeamName")
	private String queryTeamName;
	
	@Column(name = "QueryTeamNameHindi")
	private String queryTeamNameHindi;
	
	@Column(name = "QueryTeamDescription")
	private String queryTeamDescription;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private QueryTypeAccessBean  queryTypeAccessBean;
}
