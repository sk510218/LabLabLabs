package com.example.fsse_lab_b02V2.data.dto.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePersonRequestDto {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("HkId")
    private String hkid;

    public CreatePersonRequestDto(String lastName, String firstName, String hkid) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.hkid = hkid;
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
