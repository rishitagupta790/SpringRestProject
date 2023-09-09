package com.springrest.springrest.serivices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(1, "java Course",
				"Get mentorship by experts                                                                                                                                                                                                                   "));
		list.add(new Course(1, "python Course",
				"Get mentorship by experts                                                                                                                                                                                                                     "));
		list.add(new Course(1, "C++ Course",
				"Get mentorship by experts                                                                                                                                                                                                                     "));
		list.add(new Course(1, "Sql Course",
				"Get mentorship by experts                                                                                                                                                                                                                      "));
		list.add(new Course(1, "DSA Course",
				"Get mentorship by experts                                                                                                                                                                                                                      "));
	}

	@Override
	public List<Course> getCourses() {

		return list;
	}

	@Override
	public Course getCourse(long courseId) {

		// eek course return kr dena yaha se
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e -> {
			if (e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return null;
	}

	@Override
	public void deleteCourse(long parseLong) {

	}

}
