package com.munibalaji.StudentManagement.mappers;

import com.munibalaji.StudentManagement.dtos.StudentRequestDto;
import com.munibalaji.StudentManagement.dtos.StudentResponseDto;
import com.munibalaji.StudentManagement.models.Student;

public class StudentMapper {

    public static Student studentRequestDtoToEntity(StudentRequestDto studentRequestDto){

        if (studentRequestDto == null){
            return null;
        }

        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setCourse(studentRequestDto.getCourse());
        student.setEmail(studentRequestDto.getEmail());
        student.setAge(studentRequestDto.getAge());

        return student;
    }


    public static StudentResponseDto entityToResponseDto(Student student){

        if (student == null){
            return null;
        }

        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setName(student.getName());
        studentResponseDto.setCourse(student.getCourse());
        studentResponseDto.setEmail(student.getEmail());
        studentResponseDto.setAge(student.getAge());

        return studentResponseDto;
    }
}
