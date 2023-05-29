package com.wiley.springcore.factory;
import com.wiley.springcore.factory.Notification;
import com.wiley.springcore.factory.EmailNotification;
import com.wiley.springcore.factory.PushNotification;
import com.wiley.springcore.factory.SMSNotification;

	public class NotificationFactory {
		public Notification createNotification(String channel) {
		    if (channel == null || channel.isEmpty())
		        return null;
		    else if (channel.equals("SMS"))
		        return new SMSNotification();
		    else if (channel.equals("EMAIL"))
		        return new EmailNotification();
		    else if (channel.equals("PUSH"))
		        return new PushNotification();
		    else
		        throw new IllegalArgumentException("Unknown channel " + channel);
		}
	}
