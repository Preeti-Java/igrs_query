/**
 * 
 */
package com.cg.neel.igrs.query.query;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti Rani
 * @dis Query Type
 *
 */

@Entity
@Table( name = "QueryType")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QueryTypeAccessBean {
	
	@Id
	@Column(name = "QueryTypeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long queryTypeId;
	
	@Column(name = "QueryName")
	private String queryName;
	
	@Column(name = "QueryNameHindi")
	private String queryNameHindi;
	
	@Column(name = "QueryDescription")
	private String queryDescription;
	
	@OneToMany(mappedBy = "queryTypeAccessBean", cascade = CascadeType.ALL)
	private List<QueryTeamAccessBean> queryTeamAccessBean;
}
