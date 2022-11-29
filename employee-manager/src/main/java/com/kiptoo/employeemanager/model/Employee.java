package com.kiptoo.employeemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "email")
    private String email;

    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return id;
    }
    public void setFirstName(String firstname){
        this.firstname=firstname;
    }
    public String getFirstName(){
      return firstname;
    }

    public void setLastName(String lastname){
        this.lastname=lastname;
    }
    public String getLastName(){
        return lastname;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

}

