package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	
	public Student save(Student s);
	public Student findBySid(int sid);
	public List<Student>findAll();
	public void deleteById(int sid);
	
	@Query(value = " from Student where sid =:a")
	public Student m1(@Param("a") int sid);
	
	@Query(value = "from Student where sid =:a and sname =:b")
    public Student m2(@Param("a") int sid, @Param("b") String name);
	
	@Query(value = "from Student where sid =?1 or scity =?2 ")
	public List<Student> m3( int sid, String scity);
	
	@Query(value ="select * from Student where sid=?1 or spercentage =?1 or scity like %?1% or sname like %?1% ", nativeQuery = true)
	public List<Student> findByAny(String s1);
}
