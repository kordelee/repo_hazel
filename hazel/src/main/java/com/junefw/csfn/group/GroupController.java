package com.junefw.csfn.group;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.junefw.common.base.BaseController;
import com.junefw.csfn.friend.FriendService;
import com.junefw.csfn.friend.FriendVo;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/v1/csfn/group")
public class GroupController extends BaseController {
	
	@Autowired
	GroupService service;
	
	@Autowired
	FriendService fservice;
	
	String pathCommonUsr = "usr/v1/csfn/group/";
	String pathRedirectCommonUsr = "redirect:/v1/csfn/group/";
	
	@RequestMapping(value = "/groupUsrForm")
	public String groupUsrForm(GroupVo vo,FriendVo fvo, HttpSession session,Model model) throws Exception {
		
		fvo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		
		return pathCommonUsr + "groupUsrForm";
	}
	
	@RequestMapping(value = "/groupUsrAdd")
	public String groupUsrAdd(GroupVo vo,GroupDto dto, HttpSession session,Model model) throws Exception {
		
		vo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		model.addAttribute("item", service.selectOne(dto));
		
		model.addAttribute("list", service.friendAddList(vo));
		
		return pathCommonUsr + "groupUsrAdd";
	}
	
	@RequestMapping(value = "/groupUsrAddLita")
	public String groupUsrAddLita(GroupVo vo, HttpSession session,Model model) throws Exception {
		
		vo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		
		model.addAttribute("item", service.friendSearchOne(vo));
		
		return pathCommonUsr + "groupUsrAddLita";
	}
	
	@RequestMapping(value = "/groupUsrInsert")
	public String groupUsrInsert(GroupDto dto,HttpSession session) throws Exception {
		
		dto.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		
			service.groupInsert(dto);
		
		return pathRedirectCommonUsr + "groupUsrList";
	}
	
	@RequestMapping(value = "/groupUsrList")
	public String groupUsrList(Model model,GroupVo vo,HttpSession session,GroupDto dto) throws Exception {
		vo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		model.addAttribute("list", service.selectList(vo));
		
		return pathCommonUsr + "groupUsrList";
	}
	
	@ResponseBody
	@RequestMapping(value = "/friendUsrAdd")
	public Map<String, Object> friendMyRequestUsrUelete(GroupDto dto,HttpSession session) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
			
			service.friendAdd(dto);
			returnMap.put("rt", "success");
			
			return returnMap;
	}
	
	@ResponseBody
	@RequestMapping(value = "/friendUsrUelete")
	public Map<String, Object> friendUsrUelete(GroupDto dto,HttpSession session) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		service.friendUelete(dto);
		returnMap.put("rt", "success");
		
		return returnMap;
	}
	
//	@RequestMapping(value = "/groupUsrAdd")
//	public String groupUsrAdd(Model model,GroupVo vo,FriendVo fvo,HttpSession session,GroupDto dto) throws Exception {
//		fvo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
//		System.out.println(dto.getCsgrSeq()+"@@@@@@@@@@@@@@@@@@@@@awefaewfe");
//		model.addAttribute("item", service.selectOne(dto));
//		model.addAttribute("list", fservice.friendList(fvo));
//		return pathCommonUsr + "groupUsrAdd";
//	}
	
}
