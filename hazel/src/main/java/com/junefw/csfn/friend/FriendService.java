package com.junefw.csfn.friend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {

	@Autowired
	FriendDao dao;

	public FriendDto searchOne(FriendVo vo) throws Exception {
		
		return dao.searchOne(vo);
	}
	
	public List<FriendDto> myRequestList(FriendVo vo) throws Exception {
		
		return dao.myRequestList(vo);
	}
	
	public List<FriendDto> myResponseList(FriendVo vo) throws Exception {
		
		return dao.myResponseList(vo);
	}
	
	public List<FriendDto> friendList(FriendVo vo) throws Exception {
		
		return dao.friendList(vo);
	}
	
	public int requestInsert(FriendDto dto) throws Exception {
		
		return dao.requestInsert(dto);
	}
	
	public int requestUelete(FriendDto dto) throws Exception {
		
		return dao.requestUelete(dto);
	}
	
	public int updateAccept(FriendDto dto) throws Exception {
		
		return dao.updateAccept(dto);
	}
	
	public int updateRefuse(FriendDto dto) throws Exception {
		
		return dao.updateRefuse(dto);
	}
	
	public int friendUelete(FriendDto dto) throws Exception {
		
		return dao.friendUelete(dto);
	}
	
}
