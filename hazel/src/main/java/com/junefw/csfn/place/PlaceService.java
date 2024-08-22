package com.junefw.csfn.place;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

	@Autowired
	PlaceDao dao;
	
	public int insert(PlaceDto dto) throws Exception {
		
		dao.insert(dto);
		
		for(String csgrArray : dto.getCsgrArrays()) {
			dto.setCsgrSeq(csgrArray);;
			dao.mappingInsert(dto);
		}
		
		return 1;
				
	}
	
	public List<PlaceDto> selectList(PlaceDto dto) throws Exception {
		
		return dao.selectList(dto);
	}
	
	public List<PlaceDto> groupList(PlaceDto dto) throws Exception {
		
		return dao.groupList(dto);
	}

	public PlaceDto selectOne(PlaceDto dto) throws Exception {
		
		return dao.selectOne(dto);
	}
}
