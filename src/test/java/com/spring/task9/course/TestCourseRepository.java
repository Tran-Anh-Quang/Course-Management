package com.spring.task9.course;

import com.spring.task9.entity.Course;
import com.spring.task9.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class TestCourseRepository {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void testGetCourseById() {
        Long courseId = 1L;
        Optional<Course> course = courseRepository.findById(courseId);

        assertThat(course).isPresent();
    }
}
