package log.azure.controller;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsoft.applicationinsights.TelemetryClient;

import log.azure.model.DTO.TestOutPara;

@RestController
@RequestMapping("/log")
@ControllerAdvice
public class TestController {
	
	@Autowired
	TelemetryClient tClinet;
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

	
	@GetMapping("/test")
	
	public TestOutPara testlog(HttpServletResponse response) {
		tClinet.trackEvent("event log/test is triggered by BT log send event");
		response.setStatus(403);
		TestOutPara para = new TestOutPara();
		try {
			  int temp = Integer.valueOf(para.getTest1());
			
			} catch (Exception e) {
				// TODO: handle exception
				///tClinet.trackEvent(e.toString());
				logger.error(e.toString());
				tClinet.trackException(e);
			}
		
		return para;
		
		
		
	}
	
	

}
