package com.npx.weixin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: SendMessageController</p>  
 * <p>Description: 消息发送控制层</p>  
 * @author NiePengxiang  
 * @date 2018年8月22日
 */
@RestController
public class SendMessageController {
	
	
	public ResponseEntity<String> SendpromptMessage(){
		
		return new ResponseEntity<String>("你好",HttpStatus.OK);
	}
	
}
