package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.model.Course;
import com.jpa.entity.model.Student;
import com.jpa.entity.model.Subject;
import com.jpa.entity.model.repo.CourseSpringDataRepository;
import com.jpa.entity.model.repo.StudentRepository;
import com.jpa.entity.model.repo.SubjectRepo;
import com.jpa.entity.model.repo.TeacherRepo;
@RestController
@RequestMapping("/student")
public class Controller {
	@Autowired
	private StudentRepository sr;
	@Autowired
	private CourseSpringDataRepository c;
	@Autowired
	private TeacherRepo t;
	@Autowired
	private SubjectRepo s;
	
	@PostMapping("/{cid}")
    public Course createStudentToCourse(@RequestBody Student request, @PathVariable Long cid) {
		Course course = c.findById(cid).get();
		course.addStudent(request);
        return c.save(course);
    }
	@PostMapping("stud/{sid}")
	public Student assignCourseToStudent(@RequestBody Course request, @PathVariable Long sid) {
		Student student = sr.findById(sid).get();
		request.addStudent(student);
		student.addCourse(request);
		return sr.save(student);
	}
	@PostMapping("/course")
	public Course createCourse(@RequestBody Course request) {
		return c.save(request);
	}
//	@PostMapping("/sub")
//	public Subject createCourse(@RequestBody Subject request) {
//		return s.save(request);
//	}

}
