package com.junefw.csfn.group;

import com.junefw.common.base.BaseDto;

public class GroupDto extends BaseDto{
	
//	member
	private String ifmmId;
	private String ifmmSeq;
	private String ifmmName;

//	group
	private String csgrSeq;
	private String csgrName;
	private Integer csgrDelNy;
	
//	meberGroup
	private Integer csmgBossNy;

//	서브쿼리 
	private String bossName;
	private String xCount;
	
	public String getIfmmSeq() {
		return ifmmSeq;
	}
	public void setIfmmSeq(String ifmmSeq) {
		this.ifmmSeq = ifmmSeq;
	}
	public String getIfmmName() {
		return ifmmName;
	}
	public void setIfmmName(String ifmmName) {
		this.ifmmName = ifmmName;
	}
	public String getCsgrSeq() {
		return csgrSeq;
	}
	public void setCsgrSeq(String csgrSeq) {
		this.csgrSeq = csgrSeq;
	}
	public String getCsgrName() {
		return csgrName;
	}
	public void setCsgrName(String csgrName) {
		this.csgrName = csgrName;
	}
	public Integer getCsgrDelNy() {
		return csgrDelNy;
	}
	public void setCsgrDelNy(Integer csgrDelNy) {
		this.csgrDelNy = csgrDelNy;
	}
	public Integer getCsmgBossNy() {
		return csmgBossNy;
	}
	public void setCsmgBossNy(Integer csmgBossNy) {
		this.csmgBossNy = csmgBossNy;
	}
	public String getBossName() {
		return bossName;
	}
	public void setBossName(String bossName) {
		this.bossName = bossName;
	}
	public String getxCount() {
		return xCount;
	}
	public void setxCount(String xCount) {
		this.xCount = xCount;
	}
	public String getIfmmId() {
		return ifmmId;
	}
	public void setIfmmId(String ifmmId) {
		this.ifmmId = ifmmId;
	}

}
