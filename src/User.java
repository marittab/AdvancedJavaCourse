import enums.Gender;

import java.util.Date;
import java.util.Random;

public class User {
    private String fullName;
    private Date dob;
    private Gender gender;
    private Integer Id;

    public int generateId(){
        Random random = new Random();
        return random.nextInt(900);
    }
    public String getFullName(){
        return fullName;
    }
    public Date getDob(){
        return dob;
    }
    public Integer getId(){
        return Id;
    }

    public User(String fullName, Date dob, Gender gender){
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;

        this.Id = generateId();

    }
}
