package com.spring.task9.controller;

import com.spring.task9.DTO.CourseDTO;
import com.spring.task9.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/courses")
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    private ResponseEntity<List<CourseDTO>> getAllCourses(){
        List<CourseDTO> courses = courseService.getAllCourse();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<String> createNewCourse(@RequestBody CourseDTO courseDTO){
        courseService.creatNewCourse(courseDTO);
        return new ResponseEntity<>("Course created successfully!", HttpStatus.CREATED);
    }

    @DeleteMapping()
    private ResponseEntity<String> deleteCourse(@RequestParam Long id){
        courseService.deleteCourseById(id);
        return new ResponseEntity<>("Deleted!", HttpStatus.OK);
    }
}
