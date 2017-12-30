package com.jmsweblogic.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class JmsWeblogicListenerForSender implements ServletContextListener {
	
	private QueueSend jmsSender = null;

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		jmsSender.close();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		jmsSender = new QueueSend();
	}
}