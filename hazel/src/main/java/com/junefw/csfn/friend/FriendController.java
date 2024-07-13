package com.junefw.csfn.friend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

@Controller
@RequestMapping(value = "/v1/csfn/friend")
public class FriendController extends BaseController{

	String pathCommonUsr = "usr/v1/csfn/friend/";
	String pathRedirectCommonUsr = "";
	
	@RequestMapping (value = "/friendRequestUsrList")
	public String friendRequestUsrList() {
		
		return pathCommonUsr + "friendRequestUsrList";
	}
	
	@RequestMapping (value = "/friendUsrList")
	public String friendUsrList() {
		
		return pathCommonUsr + "friendUsrList";
	}
	
	@RequestMapping (value = "/friendMyRequestUsrList")
	public String friendMyRequestUsrList() {
		
		return pathCommonUsr + "friendMyRequestUsrList";
	}
	
}
