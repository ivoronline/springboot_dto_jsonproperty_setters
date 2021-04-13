package com.ivoronline.springboot_dto_jsonproperty_setters.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //JSON PROPERTIES           //SETTERS
  @JsonProperty("First Name") private void setName(String  name) { this.name = name; }
  @JsonProperty("Age")        private void setAge (Integer age ) { this.age  = age;  }

}
