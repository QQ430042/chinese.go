package org.chinese.go.listener;
//package org.chinaese.go.listener;
//
//
//import javax.jms.Message;
//import javax.jms.MessageListener;
//import javax.jms.TextMessage;
//
//import org.chinaese.go.AppException;
//import org.chinaese.go.ServiceLogInfo;
////import org.chinaese.go.service.LogService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.TypeReference;
//
///**
// * 
// * 
// * 消息监听器
// * 
// *
// * @author 2430042@qq.com
// * @createDate 2018年9月4日
// * @version 1.0.0
// * @Project chinaese.go.base
// *
// * @copyright www.chinaesego.org
// */
//public class ChinaeseGoMessageListener implements MessageListener {
//
//	private static final Logger log = LoggerFactory.getLogger(ChinaeseGoMessageListener.class);
//
////	@Autowired
////	private LogService logService;
//
//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
//	 */
//	@Override
//	public void onMessage(Message message) {
//
//		String text = null;
//		
//		try {
//			
//			TextMessage textMessage = (TextMessage) message;
//			// 取消息内容
//			text = textMessage.getText();
//
//			if (log.isDebugEnabled()) {
//				log.debug("TextMessage [" + text + "]");
//			}
//			try {
//				ServiceLogInfo serviceLogBean = JSON.parseObject(text, new TypeReference<ServiceLogInfo>() {});	
////				logService.save(serviceLogBean);
//			} catch (Exception e) {
//				log.warn("TextMessage [" + text + "]");					
//				throw e;
//			}
//
//		} catch (Exception e) {
//			log.error("" + e);
//			ServiceLogInfo serviceLogBean = new ServiceLogInfo();
//			serviceLogBean.setException(e+" | "+text);
//						
////			try {
////				logService.save(serviceLogBean);
////			} catch (AppException e1) {
////				log.error("" + e);
////			}
//		}
//	}
//}