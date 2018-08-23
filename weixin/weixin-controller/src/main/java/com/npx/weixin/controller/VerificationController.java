package com.npx.weixin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: VerificationController</p>  
 * <p>Description: 微信验证控制层</p>  
 * @author NiePengxiang  
 * @date 2018年8月22日
 */
@RestController
@RequestMapping(value="/weixin")
public class VerificationController {
	
	private static final Logger log = LoggerFactory.getLogger(VerificationController.class);

	@GetMapping(value = "/verification",produces="text/html;charset=utf-8")
	public void Verification(
			/**微信加密签名,signtrue结合填写的token参数请求中的timestamp参数、nonce参数*/
			//@RequestParam("signatrue") String signtrue,
			
			/**时间戳*/
			@RequestParam(value = "timestamp") String timestamp,
			
			/**随机数*/
			@RequestParam(value = "nonce") String nonce,
			
			/**随机字符串*/
			@RequestParam(value = "echostr") String echostr,
			
			HttpServletResponse response
			){
		
		//log.info("加密签名："+signtrue);
		log.info("时间戳："+timestamp);
		log.info("随机数："+nonce);
		log.info("随机字符串："+echostr);
		
		try {
			response.getWriter().write(echostr);
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
