package log.azure.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("log.azure")
public class LogAppInsightDemoApp {
	public static void main(String args[]) {
	  SpringApplication.run(LogAppInsightDemoApp.class,args);
	}
}
