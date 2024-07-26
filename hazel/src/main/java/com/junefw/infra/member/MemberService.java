package com.junefw.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3Client;
import com.junefw.common.base.BaseService;
import com.junefw.common.constants.Constants;
import com.junefw.common.util.UtilDateTime;
import com.junefw.common.util.UtilSecurity;

@Service
public class MemberService extends BaseService{
	

//	for aws.s3 fileupload s
	@Autowired
	private AmazonS3Client amazonS3Client;
	
//    @Autowired
//    public MemberService(AmazonS3Client amazonS3Client) {
//      this.amazonS3Client = amazonS3Client;
//    }
//	for aws.s3 fileupload e
    

	@Autowired
	MemberDao dao;
    

	public int selectOneCount(MemberVo vo) { 
    	return dao.selectOneCount(vo); 
    }

	
	public List<MemberDto> selectList(MemberVo vo) { 
		return dao.selectList(vo); 
	}
	
	
    public MemberDto selectOne(MemberVo vo) { 
    	return dao.selectOne(vo); 
    }
    
    
    public int insert(MemberDto dto) throws Exception {
    	
    	setRegMod(dto);
    	
    	dto.setIfmmPwd(UtilSecurity.encryptSha256(dto.getIfmmPwd()));
    	dto.setIfmmPwdModDate(UtilDateTime.nowDate());
    	
    	System.out.println("dto.getIfmmPwdModDate(): " + dto.getIfmmPwdModDate());
    	
    	dao.insert(dto);
    	
//    	uploadFiles(dto.getUploadImgProfile(), dto, "infrMemberUploaded", dto.getUploadImgProfileType(), dto.getUploadImgProfileMaxNumber(), dto.getIfmmSeq(), dao);
//    	uploadFiles(dto.getUploadImg(), dto, "infrMemberUploaded", dto.getUploadImgType(), dto.getUploadImgMaxNumber(), dto.getIfmmSeq(), dao);
//    	uploadFilesToS3(dto.getUploadImg(), dto, "infrMemberUploaded", dto.getUploadImgType(), dto.getUploadImgMaxNumber(), dto.getIfmmSeq(), dao, amazonS3Client);
//    	uploadFiles(dto.getUploadFile(), dto, "infrMemberUploaded", dto.getUploadFileType(), dto.getUploadFileMaxNumber(), dto.getIfmmSeq(), dao);
	
//    	dto.setIfmeDefaultNy(1);
//    	dto.setIfmeTypeCd(44);
//    	
//    	dao.insertEmail(dto);    	
//    	
//    	dto.setIfmpDefaultNy(1);
//    	dto.setIfmpTypeCd(54);
//    	dto.setIfmpDeviceCd(58);
//    	
//    	dao.insertPhone(dto);
//    	
//    	dto.setIfmaDefaultNy(1);
//    	dto.setIfmaTypeCd(78);
//    	dto.setIfmaTitle("Personal");
    	
//    	dao.insertAddress(dto);
    	
//    	// infrMemberEmail
//		for(int i = 0 ; i < dto.getIfmeEmailFullArray().length ; i++) {
//			dto.setIfmeDefaultNy(dto.getIfmeDefaultNyArray()[i]);
//			dto.setIfmeTypeCd(dto.getIfmeTypeCdArray()[i]);
//			dto.setIfmeEmailFull(dto.getIfmeEmailFullArray()[i]);
//			dao.insertEmail(dto);
//		}
//    	
//		// infrMemberPhone
//		for(int i = 0 ; i < dto.getIfmpNumberArray().length ; i++) {
//			if(!dto.getIfmpNumberArray()[i].isEmpty()) {	 
//				dto.setIfmpDefaultNy(dto.getIfmpDefaultNyArray()[i]);
//				dto.setIfmpTypeCd(dto.getIfmpTypeCdArray()[i]);
//				dto.setIfmpDeviceCd(dto.getIfmpDeviceCdArray()[i]);
//				dto.setIfmpTelecomCd(dto.getIfmpTelecomCdArray()[i]);
//				dto.setIfmpNumber(dto.getIfmpNumberArray()[i]);
//				dao.insertPhone(dto);
//			}
//		}
//		
////			infrMemberAddress
//		if (dto.getIfmaZipcodeArray().length >= 1) {
//			for(int i = 0 ; i < dto.getIfmaZipcodeArray().length ; i++) {
//				dto.setIfmaDefaultNy(dto.getIfmaDefaultNyArray()[i]);
//				dto.setIfmaTypeCd(dto.getIfmaTypeCdArray()[i]);
//				dto.setIfmaTitle(dto.getIfmaTitleArray()[i]);
//				dto.setIfmaAddress1(dto.getIfmaAddress1Array()[i]);
//				dto.setIfmaAddress2(dto.getIfmaAddress2Array()[i]);
//				dto.setIfmaAddress3(dto.getIfmaAddress3Array()[i]);
//				dto.setIfmaZipcode(dto.getIfmaZipcodeArray()[i]);
//				dto.setIfmaLat(dto.getIfmaLatArray()[i]);
//				dto.setIfmaLng(dto.getIfmaLngArray()[i]);
//				
//				dao.insertAddress(dto);
//			}
//		} else {
//			// by pass
//		}
//		
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				UtilMail.sendMail();
//			}
//		});
//		
//		thread.start();
		
		return 1;

    }
    
	public int update(MemberDto dto) throws Exception {
    	setRegMod(dto);
    	return dao.update(dto);
    }
    
    
    public int uelete(MemberDto dto) throws Exception {
    	setRegMod(dto);
    	return dao.uelete(dto); 
    }
    
    
    public int delete(MemberVo vo) { 
    	return dao.delete(vo); 
    }
    

	public List<MemberDto> selectListUploaded(MemberVo vo) throws Exception {
		return dao.selectListUploaded(vo);
	}
    
    
//	signin
	public MemberDto selectOneId(MemberDto dto) throws Exception {
		return dao.selectOneId(dto);
	}

	
	public MemberDto selectOneLogin(MemberDto dto) throws Exception {
		return dao.selectOneLogin(dto);
	}
	

	public int insertLogLogin(MemberDto dto) throws Exception {
		setRegMod(dto);
		return dao.insertLogLogin(dto);
	}
	
	
	public int updateIfmmPwdModDate(MemberDto dto) throws Exception {
		dto.setIfmmPwdModDate(UtilDateTime.calculateDayDate(UtilDateTime.nowLocalDateTime(), (int) Constants.PASSWOPRD_CHANGE_INTERVAL));
		return dao.updateIfmmPwdModDate(dto);
	}
	
}
