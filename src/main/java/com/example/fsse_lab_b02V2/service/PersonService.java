package com.example.fsse_lab_b02V2.service;

import com.example.fsse_lab_b02V2.data.domainObject.Request.CreatePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.GetLastNameRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.RemovePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.UpdatePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Response.*;

import java.util.List;


public interface PersonService {

    PersonResponseData createPerson(CreatePersonRequestData createPersonRequestData);

    List<GetAllPersonResponseData> getPersonList();

    PersonResponseData updatePerson(UpdatePersonRequestData updatePersonRequestData);

    PersonResponseData removePerson(RemovePersonRequestData removePersonRequestData);

    PersonResponseData getLastName(GetLastNameRequestData getLastNameRequestData);
}
