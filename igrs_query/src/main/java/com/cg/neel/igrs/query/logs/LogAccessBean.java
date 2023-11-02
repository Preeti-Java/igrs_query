/**
 * 
 */
package com.cg.neel.igrs.query.logs;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name= "IGRSLOG")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogAccessBean {
	
	@Id
	@Column(name = "LOG_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logId;
	
	//@ManyToOne
	//@JoinColumn(name = "userId")
	private Long userId;
	
	@OneToMany(mappedBy = "logAccessBean")
	private List<LogDetailsAccessBean> logDetailsAccessBeans;
	
	@ManyToOne
	@JoinColumn( name= "eventTypeId")
	private EventTypeAccessBean eventTypeAccessBean;
	
	@Column(name = "LOGTIME")
	private Date logTime;
	
	

}
