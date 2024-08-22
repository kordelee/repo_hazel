package com.junefw.csfn.place;

import com.junefw.common.base.BaseDto;

public class PlaceDto extends BaseDto {

	private String csplSeq;
	private String csplUrl;
	private String csplName;
	private String csplMemo;
	private String csplCategoryCd;
	private String csplArea1;
	private String csplArea2;
	private String csplDelNy;
	
//	group
	private String csgrSeq;
	private String csgrName;
	
	private String[] csgrArrays;
	
	public String getCsplUrl() {
		return csplUrl;
	}
	public void setCsplUrl(String csplUrl) {
		this.csplUrl = csplUrl;
	}
	public String getCsplName() {
		return csplName;
	}
	public void setCsplName(String csplName) {
		this.csplName = csplName;
	}
	public String getCsplMemo() {
		return csplMemo;
	}
	public void setCsplMemo(String csplMemo) {
		this.csplMemo = csplMemo;
	}
	public String getCsplCategoryCd() {
		return csplCategoryCd;
	}
	public void setCsplCategoryCd(String csplCategoryCd) {
		this.csplCategoryCd = csplCategoryCd;
	}
	public String getCsplArea1() {
		return csplArea1;
	}
	public void setCsplArea1(String csplArea1) {
		this.csplArea1 = csplArea1;
	}
	public String getCsplArea2() {
		return csplArea2;
	}
	public void setCsplArea2(String csplArea2) {
		this.csplArea2 = csplArea2;
	}
	public String getCsplDelNy() {
		return csplDelNy;
	}
	public void setCsplDelNy(String csplDelNy) {
		this.csplDelNy = csplDelNy;
	}
	public String getCsplSeq() {
		return csplSeq;
	}
	public void setCsplSeq(String csplSeq) {
		this.csplSeq = csplSeq;
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
	public String[] getCsgrArrays() {
		return csgrArrays;
	}
	public void setCsgrArrays(String[] csgrArrays) {
		this.csgrArrays = csgrArrays;
	}
	
}
