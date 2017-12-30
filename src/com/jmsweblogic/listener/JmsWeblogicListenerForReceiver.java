package com.jmsweblogic.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class JmsWeblogicListenerForReceiver implements ServletContextListener {
	
	private QueueReceive jmsReceiver = null;

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		jmsReceiver.close();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		jmsReceiver = new QueueReceive();
		jmsReceiver.start();		
	}
}