package com.alperenaktug.repository;

import com.alperenaktug.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

   // HQL : Sınıf ismi ve değişken isimleri kullanılarak sorgu yazılır.
   // SQL : Tablo ismi ve tablo içerisindeki kolon isimleriyle sorgu yazılır.(nativeQuery=true)
   @Query(value = "from Student " , nativeQuery = false)
   List<Student> findAllStudent();


}
