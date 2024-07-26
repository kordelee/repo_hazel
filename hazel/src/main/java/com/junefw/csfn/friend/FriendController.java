package com.junefw.csfn.friend;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.junefw.common.base.BaseController;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/v1/csfn/friend")
public class FriendController extends BaseController{
	
	@Autowired
	FriendService service;

	String pathCommonUsr = "usr/v1/csfn/friend/";
	String pathRedirectCommonUsr = "redirect:/v1/csfn/friend/";
	
//	친구요청 화면
	
	@RequestMapping (value = "/friendRequestUsrList")
	public String friendRequestUsrList(FriendVo vo, Model model, HttpSession session) throws Exception {
		
		vo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		
		model.addAttribute("list", service.myResponseList(vo));
		
		return pathCommonUsr + "friendRequestUsrList";
	}
	
	@ResponseBody
	@RequestMapping(value = "/friendRequestUsrAccept")
	public Map<String, Object> friendRequestUsrAccept(FriendDto dto,HttpSession session) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
			
			dto.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
			
			if(dto.getIfmmFromSeq() != null) {
				returnMap.put("rt", "success");
				service.updateAccept(dto);
			}
			
			return returnMap;
	}
	
	@ResponseBody
	@RequestMapping(value = "/friendRequestUsrRefuse")
	public Map<String, Object> friendRequestUsrRefuse(FriendDto dto,HttpSession session) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		dto.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		
		if(dto.getIfmmFromSeq() != null) {
			returnMap.put("rt", "success");
			service.updateRefuse(dto);
		}
		
		return returnMap;
	}
	
	
	
//	친구목록 화면
	@RequestMapping (value = "/friendUsrList")
	public String friendUsrList(FriendVo vo, Model model,HttpSession session) throws Exception {
		
		vo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		
		model.addAttribute("list", service.friendList(vo));
		
		return pathCommonUsr + "friendUsrList";
	}
	
	@ResponseBody
	@RequestMapping(value = "/friendUsrUelete")
	public Map<String, Object> friendUsrUelete(FriendDto dto,HttpSession session) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
			
			dto.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
			
			if(dto.getIfmmToSeq() != null) {
				returnMap.put("rt", "success");
				service.friendUelete(dto);
			}
			
			return returnMap;
	}
	
//	친구추가 화면
	
	@RequestMapping (value = "/friendAddUsrList")
	public String friendAddUsrList(FriendVo vo,FriendDto dto, Model model,HttpSession session) throws Exception {
		
		vo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		
			model.addAttribute("item", service.searchOne(vo));
		
		return pathCommonUsr + "friendAddUsrList";
	}
	
	@RequestMapping (value = "/friendRequestUsrInsert")
	public String friendRequestUsrInsert(FriendDto dto,HttpSession session) throws Exception {
		
		service.requestInsert(dto);
		
		return pathRedirectCommonUsr + "friendMyRequestUsrList";
	}
	
//	나의요청화면
	
	@RequestMapping (value = "/friendMyRequestUsrList")
	public String friendMyRequestUsrList(FriendVo vo, Model model,HttpSession session) throws Exception {
		
		vo.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
		
		System.out.println(vo.getSessSeqUsr() + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		model.addAttribute("list", service.myRequestList(vo));
		
		return pathCommonUsr + "friendMyRequestUsrList";
	}
	
	@ResponseBody
	@RequestMapping(value = "/friendMyRequestUsrUelete")
	public Map<String, Object> friendMyRequestUsrUelete(FriendDto dto,HttpSession session) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
			
			dto.setSessSeqUsr(session.getAttribute("sessSeqUsr").toString());
			
			if(dto.getIfmmToSeq() != null) {
				returnMap.put("rt", "success");
				service.requestUelete(dto);
			}
			
			return returnMap;
	}
	
	
}
