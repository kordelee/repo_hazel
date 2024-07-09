package com.junefw.infra.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

@Controller
@RequestMapping(value="/v1/infra/notice")
public class noticeController extends BaseController{
	
	String pathCommonUsr = "usr/v1/infra/notice/";
	String pathRedirectCommonUsr = "";
	
	@RequestMapping(value="/noticeUsrList")
	public String noticeUsrList() throws Exception{
		
		return pathCommonUsr + "noticeUsrList";
	}
	
	
}
