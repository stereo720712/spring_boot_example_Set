package log.azure.model.DTO;

import java.util.Date;

public class TestOutPara {

	String test1;
	String test2;
    Date date1;
	
	public TestOutPara() {
		
		test1 = "test1_for_app_insight_demo";
		test2 = "exception";
		date1 = new Date();
	}


	public String getTest1() {
		return test1;
	}


	public void setTest1(String test1) {
		this.test1 = test1;
	}


	public String getTest2() {
		return test2;
	}


	public void setTest2(String test2) {
		this.test2 = test2;
	}


	public Date getDate1() {
		return date1;
	}


	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	
	
	
	
}
