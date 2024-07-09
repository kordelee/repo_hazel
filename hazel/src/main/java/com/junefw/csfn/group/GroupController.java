package com.junefw.csfn.group;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

@Controller
@RequestMapping(value = "/v1/infra/group")
public class GroupController extends BaseController {

	String pathCommonUsr = "usr/v1/infra/group/";
	String pathRedirectCommonUsr = "";
	
	@RequestMapping(value = "/createUsrGroup")
	public String createUsrGroup() {
		
		return pathCommonUsr + "/createUsrGroup";
	}
	
	@RequestMapping(value = "/group")
	public String group() {
		
		return pathCommonUsr + "/group";
	}
}
