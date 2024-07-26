package com.junefw.infra.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

import jakarta.servlet.http.HttpSession;

@Controller
//@RequestMapping(value = "/v1/infra/index")
public class IndexController extends BaseController{
	
	String pathCommonXdm = "xdm/v1/infra/index/";
	String pathRedirectCommonXdm = "redirect:/v1/infra/index/";

	String pathCommonUsr = "usr/v1/infra/index/";
	String pathRedirectCommonUsr = "";
	
	String pathCommonAdt = "adt/v1/infra/index/";
	String pathRedirectCommonAdt = "";	
	

	@RequestMapping(value = {"/v1/infra/index/indexUsrView", "/"})
	public String indexUsrView(HttpSession httpSession) throws Exception{
		
    	return pathCommonUsr + "indexUsrView";
    }
    
}
