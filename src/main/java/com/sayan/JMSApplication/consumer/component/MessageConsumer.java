package com.sayan.JMSApplication.consumer.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.sayan.JMSApplication.models.SystemMessage;

@Component
public class MessageConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);
	
	@JmsListener(destination = "silvermq")
	public void messageListener(SystemMessage systemMessage) {
		LOGGER.info("Message Received. {}", systemMessage);
	}
}
