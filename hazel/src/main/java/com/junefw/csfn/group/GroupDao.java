package com.junefw.csfn.group;

import java.util.List;

public interface GroupDao {
	
	public int groupInsert(GroupDto dto);
	
	public int mappingInsert(GroupDto dto);
	
	public List<GroupDto> selectList(GroupVo vo);
	
	public int friendInsert(GroupDto dto);
	
//	public List<GroupDto> groupFriendList(GroupVo vo);
	
	public List<GroupDto> friendAddList(GroupVo vo);
	
	public GroupDto friendSearchOne(GroupVo vo);
	
	public GroupDto selectOne(GroupDto dto);
	
	public int friendAdd(GroupDto dto);
	
	public int friendUelete(GroupDto dto);
	
}
