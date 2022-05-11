package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.NotificationFactory;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.service.Notification;

public class NotificationApplicationMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String to;
		String message;
		
		System.out.println("Enter contact :: ");
		to=scanner.next();
		message=scanner.nextLine();
		System.out.println("Enter message");
		message=scanner.nextLine();
		System.out.println("Enter your choice 1.SMS notification \n 2. Email Notification \3.WHatsup Notification ");
		
		int choice=scanner.nextInt();
		Notification notification=NotificationFactory.getNotification(choice);
		notification.sendNotification(to, message);
		
		//SMSNotification notification=new SMSNotification();
		//notification.sendNotification(to, message);
	}

}
