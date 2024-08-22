package com.junefw.csfn.place;

import java.util.List;

public interface PlaceDao {
	
	public int insert(PlaceDto dto);
	
	public int mappingInsert(PlaceDto dto);
	
	public List<PlaceDto> selectList(PlaceDto dto);
	
	public List<PlaceDto> groupList(PlaceDto dto);
	
	public PlaceDto selectOne(PlaceDto dto);

}
