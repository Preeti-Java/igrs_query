/**
 * 
 */
package com.cg.neel.igrs.query.logs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name= "IGRSLOGDETAILS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogDetailsAccessBean {
	
	@Id
	@Column(name = "LOGDETAILS_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logDetailsId;
	
	@ManyToOne
	@JoinColumn(name = "logId")
	private LogAccessBean logAccessBean;
	
	
	@ManyToOne
	@JoinColumn(name = "eventParameterId")
	private EventParameterAccessBean eventParameterAccessBean;
	
	@Column(name = "VALUE")
	private String value;
	
	

}
