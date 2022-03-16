package com.mark.studentmanagementsystem.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student_db")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long studentid;
    private String firstName;
    private String lastName;
    private String studentClass;
    private String Grade;
    private String age;
    private String classTeacher;


}
