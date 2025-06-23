package com.alperenaktug.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentUI {



    @NotEmpty(message = "firstName alanı boş bırakılamaz")
    @Min(value = 3)
    @Max(value= 10)
    private String firstName;

    @Size(min = 3, max = 30)
    private String lastName;

    private Date birthOfDate;

    @Email(message = "Email formatında bir adres giriniz!")
    private String email;

    @Size(min = 11, max = 11)
    @NotEmpty(message = "tckNo alanı boş olamaz!")
    private String tckNo;

}
