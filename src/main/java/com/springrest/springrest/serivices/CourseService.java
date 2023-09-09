package com.springrest.springrest.serivices;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
   public List<Course> getCourses();
   public Course getCourse(long courseId);
   public Course addCourse(Course course);
   public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);
}
