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
 * @des Document details mismatch
 *
 */
@Entity
@Table(name = "DetailsMismatch")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetailsMismatchAccessBean {

	@Id
	@Column(name = "DetailsMismatchId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long detailsMismatchId;
	
	@Column(name = "DocumentId")
	private String documentId;

	@Column(name = "Description")
	private String description;
	
	@Column(name = "Explanation")
	private String explanation;
	
}
