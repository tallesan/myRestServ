package com.example.myRestServ.repositories;

import com.example.myRestServ.model.UserReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRegRepository extends JpaRepository<UserReg, Long> {

  @Query(value = "SELECT u FROM user_reg u WHERE u.email = email", nativeQuery = true)
  UserReg findByEmail(@Param("email") String email);

}
