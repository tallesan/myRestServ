package com.example.myRestServ.service.impl;

import com.example.myRestServ.model.UserReg;
import com.example.myRestServ.repositories.UserRegRepository;
import com.example.myRestServ.service.UserRegService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRegServiceImpl implements UserRegService {

  private final UserRegRepository userRegRepository;

  @Autowired
  public UserRegServiceImpl(UserRegRepository userRegRepository) {
    this.userRegRepository = userRegRepository;
  }

  @Override
  public void save(UserReg userReg) {
    userRegRepository.save(userReg);
  }

  @Override
  public void deleteById(Long id) {
    userRegRepository.deleteById(id);
  }

  @Override
  public void update(UserReg userReg, Long id) {

  }

  @Override
  public List<UserReg> findAllUserReg() {
    List<UserReg> userRegList = userRegRepository.findAll();
    return userRegList;
  }

  @Override
  public UserReg loadById(Long id) {
    UserReg userReg = userRegRepository.getOne(id);
    return userReg;
  }

  @Override
  public UserReg loadByEmail(String email) {

    return userRegRepository.findByEmail(email);
  }
}
