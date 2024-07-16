package net.engineeringdigest.journalApp.entity;

import jakarta.persistence.*;
import net.engineeringdigest.journalApp.enums.Gender;
import net.engineeringdigest.journalApp.enums.Titles;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "JournalEntry")
public class JournalEntry {

    @Id
    private  long id;

    @Enumerated(EnumType.STRING)
    private  Titles title;

    private  String firstName;
    private  String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = Titles.valueOf(title);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }

    public long getId() {
        return id;
    }

    public Titles getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

}
