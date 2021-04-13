package com.ivoronline.springboot_dto_jsonproperty_setters.controllers;

import com.ivoronline.springboot_dto_jsonproperty_setters.dto.PersonDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/AddPerson")
  public String addPerson(@RequestBody PersonDTO personDTO) {
    return personDTO.name + " is " + personDTO.age + " years old";
  }

}
