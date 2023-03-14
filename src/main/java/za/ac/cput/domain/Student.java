package za.ac.cput.domain;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String studentNumber;
    private String email;

    public Student(){}

    public Student(String firstName, String lastName, String studentNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.email = email;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getStudentNumber() {return studentNumber;}
    public String getEmail() {return email;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setStudentNumber(String studentNumber) {this.studentNumber = studentNumber;}
    public void setEmail(String email) {this.email = email;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(studentNumber, student.studentNumber) &&
                Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,
                lastName,
                studentNumber,
                email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", StudentNumber=" + studentNumber +
                ", Email='" + email + '\'' +
                '}';
    }
}
