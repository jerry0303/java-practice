package userstory.model;



import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class Users {


    public Integer id;

    @Size(min=2, message="Name should have atleast 2 characters")
    public String name;

    @Past
    public Date birthDate;

    @Override
    public String toString() {
        return "Users{" + "Id=" + id + ", Name='" + name + '\'' + ", BirthDate=" + birthDate + '}';
    }

    public Users(Integer id, Date birthDate, String name) {
        this.id = id;
        this.birthDate = birthDate;
        this.name = name;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
