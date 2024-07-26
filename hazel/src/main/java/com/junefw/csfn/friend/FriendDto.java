package com.junefw.csfn.friend;

import com.junefw.common.base.BaseDto;

public class FriendDto extends BaseDto{
	
	private String ifmmSeq;
	private String ifmmName;
	private String ifmmId;
	private String ifmmPwd;
	private String ifmmToSeq;
	private String ifmmFromSeq;
	private String sessSeqUsr;
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
	public String getIfmmId() {
		return ifmmId;
	}
	public void setIfmmId(String ifmmId) {
		this.ifmmId = ifmmId;
	}
	public String getIfmmPwd() {
		return ifmmPwd;
	}
	public void setIfmmPwd(String ifmmPwd) {
		this.ifmmPwd = ifmmPwd;
	}
	public String getIfmmToSeq() {
		return ifmmToSeq;
	}
	public void setIfmmToSeq(String ifmmToSeq) {
		this.ifmmToSeq = ifmmToSeq;
	}
	public String getIfmmFromSeq() {
		return ifmmFromSeq;
	}
	public void setIfmmFromSeq(String ifmmFromSeq) {
		this.ifmmFromSeq = ifmmFromSeq;
	}
	public String getSessSeqUsr() {
		return sessSeqUsr;
	}
	public void setSessSeqUsr(String sessSeqUsr) {
		this.sessSeqUsr = sessSeqUsr;
	}
	
}
