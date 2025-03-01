package data_access;

import java.util.List;

import models.Student;

public interface StudentDao {

	Student saveStudent(Student student);
	Student findByEmail(String email);
	List<Student> findByName(String name);
	Student findById(int id);
	List<Student> findAll();
	boolean deleteStudent(Student student);
	
}



//map med id som key?