package com.example.fsse_lab_b02V2.data.domainObject.Request;

import com.example.fsse_lab_b02V2.data.dto.Request.CreatePersonRequestDto;
import com.example.fsse_lab_b02V2.data.dto.Request.UpdatePersonRequestDto;
import com.example.fsse_lab_b02V2.data.entity.PersonEntity;

public class CreatePersonRequestData {

    private String lastName;

    private String firstName;

    private String hkid;

    public CreatePersonRequestData(CreatePersonRequestDto dto) {
        this.lastName = dto.getLastName();
        this.firstName = dto.getFirstName();
        this.hkid = dto.getHkid();
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
