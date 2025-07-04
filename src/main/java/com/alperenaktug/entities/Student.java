package com.alperenaktug.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id ;

    @Column(name = "first_name" , nullable = false)
    private String firstName ;

    @Column(name = "last_name" , nullable = false)
    private String lastName ;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_of_date" , nullable = true)
    private Date birthOfDate ;


    @ManyToMany
    @JoinTable(name = "student_course",
    joinColumns  = @JoinColumn(name = "student_id" ),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses ;

}
