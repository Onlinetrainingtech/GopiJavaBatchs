package com.xyz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="student")  
public class StudentEntity {  
  
    @Id  
    private int id;  
    private String name;  
    private int age;  
      
    public StudentEntity(int s_id, String s_name, int s_age) {  
        super();  
        this.id = s_id;  
        this.name = s_name;  
        this.age = s_age;  
    }  
  
    public StudentEntity() {  
        super();  
    }  
  
    public int getS_id() {  
        return id;  
    }  
  
    public void setS_id(int s_id) {  
        this.id = s_id;  
    }  
  
    public String getS_name() {  
        return name;  
    }  
  
    public void setS_name(String s_name) {  
        this.name = s_name;  
    }  
  
    public int getS_age() {  
        return age;  
    }  
  
    public void setS_age(int s_age) {  
        this.age = s_age;  
    }  
      
}  