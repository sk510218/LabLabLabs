package com.example.fsse_lab_b02V2.data.domainObject.Request;

import com.example.fsse_lab_b02V2.data.dto.Request.GetLastNameRequestDto;
import com.example.fsse_lab_b02V2.data.dto.Request.RemovePersonRequestDto;

public class GetLastNameRequestData {

    private String lastName;

    private String firstName;

    private String hkid;

    public GetLastNameRequestData(GetLastNameRequestDto dto) {

        this.lastName = dto.getLastName();
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
