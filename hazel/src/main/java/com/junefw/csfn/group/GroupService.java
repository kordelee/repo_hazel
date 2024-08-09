package com.junefw.csfn.group;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
	
	@Autowired
	GroupDao dao;
	
	public int groupInsert(GroupDto dto) throws Exception {
		
			dao.groupInsert(dto);
			dao.mappingInsert(dto);
			
		return 1;
		
	}
	
	public List<GroupDto> selectList(GroupVo vo) throws Exception {
		
		return dao.selectList(vo);
		
	}
	
//	public List<GroupDto> groupFriendList(GroupVo vo) throws Exception {
//		
//		return dao.groupFriendList(vo);
//	}
	
	public List<GroupDto> friendAddList(GroupVo vo) throws Exception {
		
		return dao.friendAddList(vo);
	}
	
	public List<GroupDto> groupAcceptList(GroupVo vo) throws Exception {
		
		return dao.groupAcceptList(vo);
	}
	
	public GroupDto selectOne(GroupDto dto) throws Exception {
		
		return dao.selectOne(dto);
	}
	
	public GroupDto friendSearchOne(GroupVo vo) throws Exception {
		
		return dao.friendSearchOne(vo);
	}
	
	public int friendAdd(GroupDto dto) throws Exception {
		
		return dao.friendAdd(dto);
	}
	
	public int friendUelete(GroupDto dto) throws Exception {
		
		return dao.friendUelete(dto);
	}
	
	public int groupNameUpdate(GroupDto dto) throws Exception {
		
		return dao.groupNameUpdate(dto);
	}
}
