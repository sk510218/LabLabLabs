package com.example.fsse_lab_b02V2.data.dto.Response;

import com.example.fsse_lab_b02V2.data.domainObject.Response.PersonResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonResponseDto {

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("HkId")
    private String hkid;


    public PersonResponseDto(PersonResponseData data) {
        this.lastName = data.getLastName();
        this.firstName = data.getFirstName();
        this.hkid = data.getHkid();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHkid() {
        return hkid;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }

}
