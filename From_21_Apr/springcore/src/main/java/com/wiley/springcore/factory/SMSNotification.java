package com.wiley.springcore.factory;

public class SMSNotification implements Notification {
	 
    public void notifyUser()
    {
        System.out.println("Sending an SMS notification");
    }
}