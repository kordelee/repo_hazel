package com.junefw.csfn.place;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

@Controller
@RequestMapping(value = "/v1/infra/group")
public class PlaceController extends BaseController{
	
	String pathCommonUsr = "usr/v1/infra/group/";
	String pathRedirectCommonUsr = "";
	
	@RequestMapping(value = "/createPlace")
	public String createPlace() {
		
		return pathCommonUsr + "/createPlace";
	} 

}
