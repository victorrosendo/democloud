package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @InjectMocks
    private StudentServiceImpl estudianteServicio;

    @Mock
    private StudentRepository estudianteRepositorioMock;

    @Test
    public void guardarEstudianteTest() {
        // Arrange
        Student estudiante = new Student();
        estudiante.setName("José Rondon");

        when(estudianteRepositorioMock.save(any())).thenReturn(estudiante);

        // Act
        Student resultado = estudianteServicio.createStudent(estudiante);

        // Assert
        assertEquals("José Rondon", resultado.getName());
    }

    // Otras pruebas para el servicio
}
