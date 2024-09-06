package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.StudentDao;
import com.demo.entity.Student;

@Service
@Transactional
public class ServiceImpl implements StudentService {

	@Autowired
	private StudentDao sd;

	@Override
	public Student save(Student s) {
		return sd.save(s);
	}

	@Override
	public Student findById(int sid) {
		return sd.findBySid(sid);
	}

	@Override
	public List<Student> findAll() {
		return sd.findAll();
	}

	@Override
	public void deleteById(int sid) {
		sd.deleteById(sid);
	}

	@Override
	public Student m1(int sid) {
		return sd.m1(sid);
	}

	@Override
	public Student m2(int sid, String name) {
		return sd.m2(sid, name);
	}

	@Override
	public List<Student> m3(int sid, String scity) {
		return sd.m3(sid, scity);
	}
	
	@Override
	public List<Student> finddByAny(String str) {
		return sd.findByAny(str);
	}

}
