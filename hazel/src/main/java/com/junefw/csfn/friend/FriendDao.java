package com.junefw.csfn.friend;

import java.util.List;

public interface FriendDao {
	
	public FriendDto searchOne(FriendVo vo);
	
	public List<FriendDto> myRequestList(FriendVo vo);
	
	public List<FriendDto> myResponseList(FriendVo vo);
	
	public List<FriendDto> friendList(FriendVo vo);
	
	public int requestInsert(FriendDto dto);

	public int requestUelete(FriendDto dto);
	
	public int updateAccept(FriendDto dto);
	
	public int updateRefuse(FriendDto dto);
	
	public int friendUelete(FriendDto dto);

}
