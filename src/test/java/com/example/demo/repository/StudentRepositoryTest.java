package com.example.demo.repository;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.Student;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void guardarEstudianteTest() {
        // Arrange
        Student estudiante = new Student();
        estudiante.setName("John Doe");

        // Act
        Student resultado = studentRepository.save(estudiante);

        // Assert
        assertNotNull(resultado.getId());
        assertEquals("John Doe", resultado.getName());
    }

    // Otras pruebas para el repositorio

}
