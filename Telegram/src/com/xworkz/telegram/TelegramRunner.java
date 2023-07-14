package com.xworkz.telegram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.telegram.config.TelegramConfig;
import com.xworkz.telegram.dto.TelegramDto;

public class TelegramRunner {

	public static void main(String[] args) {
		
		SessionFactory factory = TelegramConfig.getSessionFactory();
		
		Session session = factory.openSession();
		
		TelegramDto dto = new TelegramDto(1, "Sheela", 1234567890l, "sheelag@gmail.com", "abcd", 5, 100, "to people nearby");
		
		Transaction transaction = session.beginTransaction();
		
		session.save(dto);
		
		transaction.commit();
		
		session.close();

	}

}
