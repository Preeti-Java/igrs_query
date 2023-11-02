package com.cg.neel.igrs.query.query;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Village_District {
	
	private Long sno;
	
	@ManyToOne
	@JoinColumn(name="District_Sno")
	private DistrictAccessBean districtAccessBean;
	
	@ManyToOne
	@JoinColumn(name="Village_Sno")
	private VillageAccessBean villageAccessBean;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public DistrictAccessBean getDistrictAccessBean() {
		return districtAccessBean;
	}

	public void setDistrictAccessBean(DistrictAccessBean districtAccessBean) {
		this.districtAccessBean = districtAccessBean;
	}

	public VillageAccessBean getVillageAccessBean() {
		return villageAccessBean;
	}

	public void setVillageAccessBean(VillageAccessBean villageAccessBean) {
		this.villageAccessBean = villageAccessBean;
	}
	
	
	
	
	

}
