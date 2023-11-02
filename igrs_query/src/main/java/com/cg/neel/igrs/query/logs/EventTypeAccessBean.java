/**
 * 
 */
package com.cg.neel.igrs.query.logs;

import java.util.List;

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
 * @author Preeti
 *
 */

@Entity
@Table(name= "IGRSEVENTTYPE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventTypeAccessBean {
	
	@Id
	@Column(name = "EVENTTYPE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eventTypeId;
	
	@OneToMany(mappedBy = "eventTypeAccessBean")
	private List<LogAccessBean> logAccessBeans;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	

}
