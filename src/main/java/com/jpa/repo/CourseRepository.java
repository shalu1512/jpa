//package com.jpa.repo;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.jpa.entity.Course;
//import com.jpa.entity.Review;
//import com.jpa.entity.ReviewRating;
//
//@Repository
//@Transactional
//public class CourseRepository {
//
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	EntityManager em;
//
//	public Course findById(Long id) {
//		Course course = em.find(Course.class, id);
//		logger.info("Course -> {}", course);
//		return course;
//	}
//
//	public Course save(Course course) {
//
//		if (course.getId() == null) {
//			em.persist(course);
//		} else {
//			em.merge(course);
//		}
//
//		return course;
//	}
//
//	public void deleteById(Long id) {
//		Course course = findById(id);
//		em.remove(course);
//	}
//
//	public void addReviewsForCourse() {
//		Course course = findById(10003l);
//		logger.info("course review: {}" + course.getReviews());
//		Review review1 = new Review(ReviewRating.FIVE, "great1");
//		Review review2 = new Review(ReviewRating.FIVE, "great2");
//
//		course.addReview(review1);
//		course.addReview(review2);
//
//		review1.setCourse(course);
//		review2.setCourse(course);
//
//		em.persist(review1);
//		em.persist(review2);
//	}
//
//	public void addReviewsForCourse(Long courseId, List<Review> reviews) {
//		Course course = findById(courseId);
//		for (Review review : reviews) {
//			course.addReview(review);
//			review.setCourse(course);
//			em.persist(review);
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	public void addReviewsForCourse1() {
//		Course course =new Course();
//		course.setName("Java Master class");
//		em.persist(course);
//		Review review1 = new Review(ReviewRating.FIVE, "great course 1");
//		Review review2 = new Review(ReviewRating.FOUR, "great course 2");
//		course.addReview(review1);
//		course.addReview(review2);
//		review1.setCourse(course);
//		review2.setCourse(course);
//		em.persist(review1);
//		em.persist(review2);
//		
//		
//		
//		
//	}
//
//}
