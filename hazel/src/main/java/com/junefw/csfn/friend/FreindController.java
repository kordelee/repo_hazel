package com.junefw.csfn.friend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

@Controller
@RequestMapping(value = "/v1/infra/friend")
public class FreindController extends BaseController{

	String pathCommonUsr = "usr/v1/infra/friend/";
	String pathRedirectCommonUsr = "";
	
	@RequestMapping (value = "/frinedResponse")
	public String frinedResponse() {
		
		return pathCommonUsr + "frinedResponse";
	}
	
}
