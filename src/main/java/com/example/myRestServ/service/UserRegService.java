package com.example.myRestServ.service;

import com.example.myRestServ.model.UserReg;
import java.util.List;

public interface UserRegService {

  void save(UserReg userReg);

  void deleteById(Long id);

  void update(UserReg userReg, Long id);

  List<UserReg> findAllUserReg();

  UserReg loadById(Long id);

  UserReg loadByEmail(String email);


}
