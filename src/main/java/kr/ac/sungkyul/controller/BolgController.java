package kr.ac.sungkyul.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/blog/*" )
public class BolgController {
	
	@ResponseBody
	@RequestMapping
	public String list(
		@RequestParam( "p" ) int page,
		@RequestParam( "n" ) String name ){
		
		
		System.out.println( "page:" + page );
		System.out.println( "name:" + name );
		
		common();
		return "BlogController:list()";
	}

	@ResponseBody
	@RequestMapping
	public String add(){
		common();
		return "BlogController:add()";
	}
	
	private void common(){
		System.out.println( "common() called" );
	}
	
}
