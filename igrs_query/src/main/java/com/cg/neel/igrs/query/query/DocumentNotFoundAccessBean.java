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
@Table(name = "DocumentNotFound")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DocumentNotFoundAccessBean extends DetailsForContactAccessBean{

	@Id
	@Column(name = "DocumentNotFoundId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long documentNotFoundId;
	
	@Column(name = "DistrictId")
	@Transient
	private DistrictAccessBean districtAccessBean;
	
	@Column(name = "VillageId")
	@Transient
	private VillageAccessBean villageAccessBean;
	
	@Column(name = "OwnerName")
	private String ownerName;
	
	@Column(name = "OwnerRelativeName")
	private String ownerRelativeName;
	
	@Column(name = "Explanation")
	private String explanation;
	
	
}
