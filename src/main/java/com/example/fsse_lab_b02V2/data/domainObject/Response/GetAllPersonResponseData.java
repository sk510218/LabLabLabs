package com.example.fsse_lab_b02V2.data.domainObject.Response;

import com.example.fsse_lab_b02V2.data.entity.PersonEntity;

public class GetAllPersonResponseData {

    private String lastName;

    private String firstName;

    private String hkid;

    public GetAllPersonResponseData(PersonEntity entity) {
        this.lastName = entity.getLastName();
        this.firstName = entity.getFirstName();
        this.hkid = entity.getHkid();
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
