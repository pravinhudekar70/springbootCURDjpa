package com.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.demo.entity.Student;

public interface StudentService {
	public Student save(Student s);
	public Student findById(int sid);
	public List<Student>findAll();
	public void deleteById(int sid);
	public Student m1(@Param("a") int sid);
	public Student m2(@Param("a") int sid, @Param("b") String name);
	public List<Student> m3( int sid, String scity);
	public List<Student> finddByAny(String str);
}
