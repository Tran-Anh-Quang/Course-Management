package com.spring.task9.service;

import com.spring.task9.DTO.CourseDTO;
import com.spring.task9.entity.Course;
import com.spring.task9.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<CourseDTO> getAllCourse(){
        List<Course> courses = courseRepository.findAll();
        List<CourseDTO> courseDTOs = new ArrayList<>();

        for (Course course : courses){
            CourseDTO courseDTO = new CourseDTO();

            courseDTO.setId(course.getId());
            courseDTO.setName(course.getName());
            courseDTO.setCreatedDate(course.getCreatedDate());
            courseDTO.setFinishedDate(course.getFinishedDate());

            courseDTOs.add(courseDTO);
        }
        return courseDTOs;
    }

    public void creatNewCourse(CourseDTO courseDTO){
        Course course = new Course();

        course.setName(courseDTO.getName());
        course.setCreatedDate(courseDTO.getCreatedDate());
        course.setFinishedDate(courseDTO.getFinishedDate());

        courseRepository.save(course);
    }

    public void deleteCourseById(Long id){
        courseRepository.deleteById(id);
    }

}
