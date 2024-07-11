package com.junefw.infra.qna;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.common.base.BaseController;

@Controller
@RequestMapping(value="/v1/infra/qna")
public class qnaController extends BaseController {
	
	String pathCommonUsr = "usr/v1/infra/qna/";
	String pathRedirectCommonUsr = "";

	@RequestMapping(value="/qnaUsrForm")
	public String qnaUsrForm() throws Exception{
		
		return pathCommonUsr + "qnaUsrForm";
	}
	
	@RequestMapping(value="/qnaUsrList")
	public String qnaUsrList() throws Exception{
		
		return pathCommonUsr + "qnaUsrList";
	}
	
	@RequestMapping(value="/noticeUsrList")
	public String noticeUsrList() throws Exception{
		
		return pathCommonUsr + "noticeUsrList";
	}
	
	@RequestMapping(value = "/qnaUsrView")
	public String qnaUsrView() throws Exception{
		
		return pathCommonUsr + "qnaUsrView";
	}
}
