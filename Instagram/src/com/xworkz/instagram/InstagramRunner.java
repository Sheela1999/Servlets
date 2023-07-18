package com.xworkz.instagram;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.instagram.config.InstagramConfig;
import com.xworkz.instagram.dto.InstagramDto;

public class InstagramRunner {

	public static void main(String[] args) {

		SessionFactory factory = InstagramConfig.getSessionFactory();

		InstagramDto dto = new InstagramDto(1, "Pallavi S", "pallavi@gmail.com", 1234567890l, "Pa12ll34vi",
				"Personal Account");

		InstagramDto dto1 = new InstagramDto(2, "Nikitha Nainar", "niki@gmail.com", 2234567899l, "Nikki@123",
				"Business Account");

		InstagramDto dto2 = new InstagramDto(3, "Sheela G", "sheelag@gmail.com", 3134567890l, "Shee@1",
				"Creator Account");

		InstagramDto dto3 = new InstagramDto(4, "Aishu", "aish@gmail.com", 4234567898l, "Aish@01", "Business Account");

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

//		session.save(dto);
//		session.save(dto1);
//		session.save(dto2);
//		session.save(dto3);

//		InstagramDto returnData = session.get(InstagramDto.class, 1);
//		System.out.println(returnData);

		session.update(dto2);
		session.delete(dto1);

//		Criteria criteria = session.createCriteria(InstagramDto.class);
//		List<InstagramDto> list = criteria.list();

//		Query query = session.createQuery("From InstagramDto where userName = 'Aishu'");
		Query query = session.createQuery("From InstagramDto");
		List<InstagramDto> list = query.list();

		for (InstagramDto dtos : list) {
			System.out.println(dtos);
		}

		transaction.commit();

		session.close();

	}

}
