package com.example.fsse_lab_b02V2.api;

import com.example.fsse_lab_b02V2.data.domainObject.Request.CreatePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.GetLastNameRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.RemovePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Request.UpdatePersonRequestData;
import com.example.fsse_lab_b02V2.data.domainObject.Response.GetAllPersonResponseData;
import com.example.fsse_lab_b02V2.data.domainObject.Response.GetLastNameResponseData;
import com.example.fsse_lab_b02V2.data.domainObject.Response.PersonResponseData;
import com.example.fsse_lab_b02V2.data.dto.Request.CreatePersonRequestDto;
import com.example.fsse_lab_b02V2.data.dto.Request.GetLastNameRequestDto;
import com.example.fsse_lab_b02V2.data.dto.Request.RemovePersonRequestDto;
import com.example.fsse_lab_b02V2.data.dto.Request.UpdatePersonRequestDto;
import com.example.fsse_lab_b02V2.data.dto.Response.*;
import com.example.fsse_lab_b02V2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Api {

    public final PersonService personService;

    @Autowired
    public Api(PersonService personService) {
        this.personService = personService;
    }

        @PostMapping("/person/create")
        public PersonResponseDto createPerson(@RequestBody CreatePersonRequestDto createPersonRequestDto){

        return new PersonResponseDto(
               personService.createPerson(
                       new CreatePersonRequestData(
                               createPersonRequestDto)));
        }

        @GetMapping("/person/get")
        public List<GetAllPersonResponseDto> getAllPerson(){

                List<GetAllPersonResponseDto> getAllPersonResponseDtoList= new ArrayList<>();

            List<GetAllPersonResponseData> getAllPersonResponseDataList= personService.getPersonList();

                 for(GetAllPersonResponseData getAllPersonResponseData: getAllPersonResponseDataList){

                     getAllPersonResponseDtoList.add(new GetAllPersonResponseDto(getAllPersonResponseData));

                 }

            return getAllPersonResponseDtoList;
        }
        @PutMapping("/person/update")
        public PersonResponseDto updatePerson(@RequestBody UpdatePersonRequestDto updatePersonRequestDto){

            return new PersonResponseDto(
                    personService.updatePerson(
                            new UpdatePersonRequestData(
                                    updatePersonRequestDto)));
        }

        @DeleteMapping("/person/remove")
    public PersonResponseDto removePerson(@RequestParam String hkid){


            return new PersonResponseDto(
                    personService.removePerson(
                            new RemovePersonRequestData(
                                    new RemovePersonRequestDto(hkid))));
    }

    @GetMapping(value = "/person/{last_name}")
    public PersonResponseDto getLastName(@PathVariable("last_name") String name){


        return new PersonResponseDto(
                personService.getLastName(
                        new GetLastNameRequestData(
                                new GetLastNameRequestDto(name))));

    }

}
