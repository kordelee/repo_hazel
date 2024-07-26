package com.junefw.infra.member;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.junefw.common.base.BaseDto;

public class MemberDto extends BaseDto{

//	infrMember	
	private String ifmmSeq;
	private Integer ifmmAdminNy;
	private Integer ifmmKoreanNy;
	private Integer ifmmSocialLoginCd;
	private String ifmmName;
	private String ifmmId;
	private String ifmmPwd;
	private Date ifmmPwdModDate;
	private String ifmmEmail;
	private Integer ifmmGenderCd;
	private String ifmmDob;
	private String ifmmFirstNameEng;
	private String ifmmMiddleNameEng;
	private String ifmmLastNameEng;
	private Integer ifmmAddrTypeCd;
	private String ifmmAddrTitle;
	private String ifmmAddr1;
	private String ifmmAddr2;
	private String ifmmAddr3;
	private String ifmmAddrZipcode;
	private Double ifmmAddrLat;
	private Double ifmmAddrLng;
	private Integer ifmmPhoneTypeCd;
	private Integer ifmmPhoneDeviceCd;
	private Integer ifmmPhoneTelecomCd;
	private Integer ifmmPhoneNumber;
	private Integer ifmmDelNy;
	
	private Boolean autoLogin;
	public String getIfmmSeq() {
		return ifmmSeq;
	}
	public void setIfmmSeq(String ifmmSeq) {
		this.ifmmSeq = ifmmSeq;
	}
	public Integer getIfmmAdminNy() {
		return ifmmAdminNy;
	}
	public void setIfmmAdminNy(Integer ifmmAdminNy) {
		this.ifmmAdminNy = ifmmAdminNy;
	}
	public Integer getIfmmKoreanNy() {
		return ifmmKoreanNy;
	}
	public void setIfmmKoreanNy(Integer ifmmKoreanNy) {
		this.ifmmKoreanNy = ifmmKoreanNy;
	}
	public Integer getIfmmSocialLoginCd() {
		return ifmmSocialLoginCd;
	}
	public void setIfmmSocialLoginCd(Integer ifmmSocialLoginCd) {
		this.ifmmSocialLoginCd = ifmmSocialLoginCd;
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
	public Date getIfmmPwdModDate() {
		return ifmmPwdModDate;
	}
	public void setIfmmPwdModDate(Date ifmmPwdModDate) {
		this.ifmmPwdModDate = ifmmPwdModDate;
	}
	public String getIfmmEmail() {
		return ifmmEmail;
	}
	public void setIfmmEmail(String ifmmEmail) {
		this.ifmmEmail = ifmmEmail;
	}
	public Integer getIfmmGenderCd() {
		return ifmmGenderCd;
	}
	public void setIfmmGenderCd(Integer ifmmGenderCd) {
		this.ifmmGenderCd = ifmmGenderCd;
	}
	public String getIfmmDob() {
		return ifmmDob;
	}
	public void setIfmmDob(String ifmmDob) {
		this.ifmmDob = ifmmDob;
	}
	public String getIfmmFirstNameEng() {
		return ifmmFirstNameEng;
	}
	public void setIfmmFirstNameEng(String ifmmFirstNameEng) {
		this.ifmmFirstNameEng = ifmmFirstNameEng;
	}
	public String getIfmmMiddleNameEng() {
		return ifmmMiddleNameEng;
	}
	public void setIfmmMiddleNameEng(String ifmmMiddleNameEng) {
		this.ifmmMiddleNameEng = ifmmMiddleNameEng;
	}
	public String getIfmmLastNameEng() {
		return ifmmLastNameEng;
	}
	public void setIfmmLastNameEng(String ifmmLastNameEng) {
		this.ifmmLastNameEng = ifmmLastNameEng;
	}
	public Integer getIfmmAddrTypeCd() {
		return ifmmAddrTypeCd;
	}
	public void setIfmmAddrTypeCd(Integer ifmmAddrTypeCd) {
		this.ifmmAddrTypeCd = ifmmAddrTypeCd;
	}
	public String getIfmmAddrTitle() {
		return ifmmAddrTitle;
	}
	public void setIfmmAddrTitle(String ifmmAddrTitle) {
		this.ifmmAddrTitle = ifmmAddrTitle;
	}
	public String getIfmmAddr1() {
		return ifmmAddr1;
	}
	public void setIfmmAddr1(String ifmmAddr1) {
		this.ifmmAddr1 = ifmmAddr1;
	}
	public String getIfmmAddr2() {
		return ifmmAddr2;
	}
	public void setIfmmAddr2(String ifmmAddr2) {
		this.ifmmAddr2 = ifmmAddr2;
	}
	public String getIfmmAddr3() {
		return ifmmAddr3;
	}
	public void setIfmmAddr3(String ifmmAddr3) {
		this.ifmmAddr3 = ifmmAddr3;
	}
	public String getIfmmAddrZipcode() {
		return ifmmAddrZipcode;
	}
	public void setIfmmAddrZipcode(String ifmmAddrZipcode) {
		this.ifmmAddrZipcode = ifmmAddrZipcode;
	}
	public Double getIfmmAddrLat() {
		return ifmmAddrLat;
	}
	public void setIfmmAddrLat(Double ifmmAddrLat) {
		this.ifmmAddrLat = ifmmAddrLat;
	}
	public Double getIfmmAddrLng() {
		return ifmmAddrLng;
	}
	public void setIfmmAddrLng(Double ifmmAddrLng) {
		this.ifmmAddrLng = ifmmAddrLng;
	}
	public Integer getIfmmPhoneTypeCd() {
		return ifmmPhoneTypeCd;
	}
	public void setIfmmPhoneTypeCd(Integer ifmmPhoneTypeCd) {
		this.ifmmPhoneTypeCd = ifmmPhoneTypeCd;
	}
	public Integer getIfmmPhoneDeviceCd() {
		return ifmmPhoneDeviceCd;
	}
	public void setIfmmPhoneDeviceCd(Integer ifmmPhoneDeviceCd) {
		this.ifmmPhoneDeviceCd = ifmmPhoneDeviceCd;
	}
	public Integer getIfmmPhoneTelecomCd() {
		return ifmmPhoneTelecomCd;
	}
	public void setIfmmPhoneTelecomCd(Integer ifmmPhoneTelecomCd) {
		this.ifmmPhoneTelecomCd = ifmmPhoneTelecomCd;
	}
	public Integer getIfmmPhoneNumber() {
		return ifmmPhoneNumber;
	}
	public void setIfmmPhoneNumber(Integer ifmmPhoneNumber) {
		this.ifmmPhoneNumber = ifmmPhoneNumber;
	}
	public Integer getIfmmDelNy() {
		return ifmmDelNy;
	}
	public void setIfmmDelNy(Integer ifmmDelNy) {
		this.ifmmDelNy = ifmmDelNy;
	}
	public Boolean getAutoLogin() {
		return autoLogin;
	}
	public void setAutoLogin(Boolean autoLogin) {
		this.autoLogin = autoLogin;
	}
	
	
	
}
