package com.wiley.springcore.factory;
import com.wiley.springcore.factory.Notification;
import com.wiley.springcore.factory.EmailNotification;
import com.wiley.springcore.factory.PushNotification;
import com.wiley.springcore.factory.SMSNotification;
	public class NotificationFactory {
	    public Notification createNotification(String channel)
	    {
	        if (channel == null || channel.isEmpty())
	            return null;
	        switch (channel) {
	        case "SMS":
	            return new SMSNotification();
	        case "EMAIL":
	            return new EmailNotification();
	        case "PUSH":
	            return new PushNotification();
	        default:
	            throw new IllegalArgumentException("Unknown channel "+channel);
	        }
	    }
	}
