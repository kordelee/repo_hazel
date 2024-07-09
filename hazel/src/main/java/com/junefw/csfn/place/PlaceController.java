package com.junefw.csfn.place;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

@Controller
@RequestMapping(value = "/v1/csfn/place")
public class PlaceController extends BaseController{
	
	String pathCommonUsr = "usr/v1/csfn/place/";
	String pathRedirectCommonUsr = "";
	
	@RequestMapping(value = "/placeUsrForm")
	public String placeUsrForm() {
		
		return pathCommonUsr + "placeUsrForm";
	} 
	
	@RequestMapping(value = "/placeUsrList")
	public String placeUsrList() throws Exception{
		
		return pathCommonUsr + "placeUsrList";
	}
}
