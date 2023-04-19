package com.csci6366.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long personID;
    private String firstName;
    private String lastName;
    private Integer genderID;
    private Integer suffixID;
    private Integer prefixID;

    public Long getPersonID() {
        return personID;
    }

    public void setPersonID(Long personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGenderID() {
        return genderID;
    }

    public void setGenderID(Integer genderID) {
        this.genderID = genderID;
    }

    public Integer getSuffixID() {
        return suffixID;
    }

    public void setSuffixID(Integer suffixID) {
        this.suffixID = suffixID;
    }

    public Integer getPrefixID() {
        return prefixID;
    }

    public void setPrefixID(Integer prefixID) {
        this.prefixID = prefixID;
    }
}
