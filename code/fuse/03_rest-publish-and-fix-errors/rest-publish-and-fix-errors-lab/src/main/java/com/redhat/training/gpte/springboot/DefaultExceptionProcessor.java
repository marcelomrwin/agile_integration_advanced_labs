package com.redhat.training.gpte.springboot;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DefaultExceptionProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Throwable caused = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Throwable.class);
		exchange.getIn().setHeader("error_code", 111);
		exchange.getIn().setHeader("error_message", caused.getMessage());
	}

}
