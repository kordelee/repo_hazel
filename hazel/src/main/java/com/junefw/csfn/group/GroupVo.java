package com.junefw.csfn.group;

import com.junefw.common.base.BaseVo;

public class GroupVo extends BaseVo{
	
	private String csgrSeq;
	
	private String ifmmName;
	private String ifmmSeq;

	public String getCsgrSeq() {
		return csgrSeq;
	}

	public void setCsgrSeq(String csgrSeq) {
		this.csgrSeq = csgrSeq;
	}

	public String getIfmmName() {
		return ifmmName;
	}

	public void setIfmmName(String ifmmName) {
		this.ifmmName = ifmmName;
	}

	public String getIfmmSeq() {
		return ifmmSeq;
	}

	public void setIfmmSeq(String ifmmSeq) {
		this.ifmmSeq = ifmmSeq;
	}

}
