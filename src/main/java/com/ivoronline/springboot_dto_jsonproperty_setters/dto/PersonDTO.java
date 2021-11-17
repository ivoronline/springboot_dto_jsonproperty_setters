package com.ivoronline.springboot_dto_jsonproperty_setters.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDTO {

  //PROPERTIES
  public String  propName;
  public Integer propAge;

  //JSON PROPERTIES           //SETTERS
  @JsonProperty("First Name") private void setName(String  reqName) { this.propName = reqName; }
  @JsonProperty("Age")        private void setAge (Integer reqAge ) { this.propAge  = reqAge;  }

}
