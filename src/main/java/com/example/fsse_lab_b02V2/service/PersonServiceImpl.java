package com.example.fsse_lab_b02V2.service;

import com.example.fsse_lab_b02V2.data.domainObject.Request.CreatePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.GetLastNameRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.RemovePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.UpdatePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Response.*;
import com.example.fsse_lab_b02V2.data.entity.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    List<PersonEntity> personEntityList= new ArrayList<>();

    @Override
    public PersonResponseData createPerson(CreatePersonRequestData createPersonRequestData){

        PersonEntity personEntity= new PersonEntity(createPersonRequestData);
        personEntityList.add(personEntity);

        return new PersonResponseData(personEntity);

    }
    @Override
    public List<GetAllPersonResponseData> getPersonList(){

        List<GetAllPersonResponseData> getAllPersonResponseDataList= new ArrayList<>();

        for (PersonEntity personEntity: personEntityList){

                getAllPersonResponseDataList.add(new GetAllPersonResponseData(personEntity));

        }return getAllPersonResponseDataList;
    }
    @Override
    public PersonResponseData updatePerson(UpdatePersonRequestData updatePersonRequestData){


            for(PersonEntity personEntity: personEntityList){
                if(!personEntity.getHkid().equals(updatePersonRequestData.getHkid())){
                    continue;
                }
                personEntity.setFirstName(updatePersonRequestData.getFirstName());
                personEntity.setLastName(updatePersonRequestData.getLastName());

                return new PersonResponseData(personEntity);
            }
            throw new PersonNotFoundException();
    }
    @Override
    public PersonResponseData removePerson(RemovePersonRequestData removePersonRequestData){


        for(PersonEntity personEntity: personEntityList) {
            if (!personEntity.getHkid().equals(removePersonRequestData.getHkid())) {
                continue;
            }
            personEntityList.remove(personEntity);
            return new PersonResponseData(personEntity);
        }
        throw new PersonNotFoundException();
    }
    @Override
    public PersonResponseData getLastName(GetLastNameRequestData getLastNameRequestData){

        for(PersonEntity personEntity: personEntityList) {
            if (!personEntity.getLastName().equals(getLastNameRequestData.getLastName())) {
                continue;
            }
            personEntityList.remove(personEntity);
            return new PersonResponseData(personEntity);
        }
        throw new PersonNotFoundException();

    }
}
