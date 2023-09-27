/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.liquidrekto.service;

import com.liquidrekto.data.model.Student;
import java.util.Optional;

/**
 *
 * @author WINDOWS
 */
public interface StudentService {
    Optional<Student> findStudentById(int studentId);
    
    Iterable<Student> findStudentsByAddress(String address);
    
    Iterable<Student> findAllStudents();
    
    void deleteStudent(Student std);
    
    Student saveStudent(Student std);
    
    
}
