package com.wiley.springcore.factory;
public class EmailNotification implements Notification {
	 
    public void notifyUser()
    {
       
        System.out.println("Sending an e-mail notification");
    }
}