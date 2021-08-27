package log.azure.handler;

import org.springframework.web.server.WebExceptionHandler;

import java.lang.annotation.Annotation;

import org.springframework.web.bind.annotation.ExceptionHandler;
public class ExceptionHandlerex implements ExceptionHandler {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends Throwable>[] value() {
		// TODO Auto-generated method stub
		return null;
	}

}
