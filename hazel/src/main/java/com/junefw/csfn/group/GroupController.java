package com.junefw.csfn.group;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

@Controller
@RequestMapping(value = "/v1/csfn/group")
public class GroupController extends BaseController {

	String pathCommonUsr = "usr/v1/csfn/group/";
	String pathRedirectCommonUsr = "";
	
	@RequestMapping(value = "/groupUsrForm")
	public String groupUsrForm() {
		
		return pathCommonUsr + "groupUsrForm";
	}
	
	@RequestMapping(value = "/groupUsrList")
	public String group() {
		
		return pathCommonUsr + "groupUsrList";
	}
}
