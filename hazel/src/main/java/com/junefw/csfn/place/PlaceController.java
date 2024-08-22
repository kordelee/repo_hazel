package com.junefw.csfn.place;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;
import com.junefw.csfn.group.GroupService;

@Controller
@RequestMapping(value = "/v1/csfn/place")
public class PlaceController extends BaseController{
	
	@Autowired
	PlaceService service;
	
	String pathCommonUsr = "usr/v1/csfn/place/";
	String pathRedirectCommonUsr = "redirect:/v1/csfn/place/";
	
	@RequestMapping(value = "/placeUsrForm")
	public String placeUsrForm(PlaceDto dto, Model model) throws Exception{
		
		model.addAttribute("list", service.groupList(dto));
		
		return pathCommonUsr + "placeUsrForm";
	}
	
	@RequestMapping(value = "/placeUsrInsert")
	public String placeUsrInsert(PlaceDto dto) throws Exception{
		
		service.insert(dto);
		
		return pathRedirectCommonUsr + "placeUsrList";
	} 
	
	@RequestMapping(value = "/placeUsrList")
	public String placeUsrList(PlaceDto dto, Model model) throws Exception{
		
		model.addAttribute("list", service.selectList(dto));
		
		model.addAttribute("item", service.selectOne(dto));
		
		return pathCommonUsr + "placeUsrList";
	}
	
}
