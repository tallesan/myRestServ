package com.example.myRestServ.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user_reg")
public class UserReg {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "reg_date")
  LocalDate regDate = LocalDate.now();

  @Column(name = "edit_date")
  LocalDate editDate = LocalDate.now();

  @NotBlank(message = "Поле \"Имя\" не должно быть пустым")
  @Column(name = "first_name")
  String firstName;

  @NotBlank(message = "Поле \"Фамилия\" не должно быть пустым")
  @Column(name = "last_name")
  String lastName;

  @NotBlank(message = "Поле \"Город\" не должно быть пустым")
  String city;

  @Column(unique = true)
  @NotBlank(message = "Поле \"Почта\" не должно быть пустым")
  @Email(message = "Не корректный e-mail")
  String email;

  @NotBlank(message = "Поле \"пароль\" не должно быть менее 8 символов")
  @Size(min = 8)
  String password;

}
