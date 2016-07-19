package main.java.model;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Comparable<User>, Serializable {


    protected String name;
    protected String surname;
    protected LocalDate dateOfBirth;
    protected String phoneNumber;
    protected String email;

    public User(String name, String surname, LocalDate dateOfBirth, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        return !(dateOfBirth != null ? !dateOfBirth.equals(user.dateOfBirth) : user.dateOfBirth != null);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "  name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if (this == o) return 0;

        if (this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        if (this.surname.equals(o.surname)) {
            return this.surname.compareTo(o.surname);
        }
        if (!(this.dateOfBirth.getYear() == o.dateOfBirth.getYear())){
            return this.dateOfBirth.getYear() - o.dateOfBirth.getYear();
        }
        if (!(this.dateOfBirth.getMonthValue() == o.dateOfBirth.getMonthValue())){
            return this.dateOfBirth.getMonthValue() - o.dateOfBirth.getMonthValue();
        }
        if (!(this.dateOfBirth.getDayOfMonth() == o.dateOfBirth.getDayOfMonth())){
            return this.dateOfBirth.getDayOfMonth() - o.dateOfBirth.getDayOfMonth();
        }
        if (this.phoneNumber.equals(o.phoneNumber)){
            return this.phoneNumber.compareTo(o.phoneNumber);
        }
        if (this.email.equals(o.email)){
            return this.email.compareTo(o.email);
        }
        return 0;
    }
}
