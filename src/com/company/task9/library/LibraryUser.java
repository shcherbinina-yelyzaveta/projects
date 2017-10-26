package com.company.task9.library;

public class LibraryUser {
    private String fullName;
    private String readerTickerNumber;
    private String faculty;
    private String birthday;
    private String phoneNumber;

    public LibraryUser() {
        this.fullName = "ФИО";
        this.readerTickerNumber = "00000000";
        this.faculty = "КИТ";
        this.birthday = "00.00.0000";
        this.phoneNumber = "+380000000000";
    }

    public LibraryUser(String fullName, String readerTickerNumber, String faculty, String birthday, String phoneNumber) {
        this.fullName = fullName;
        this.readerTickerNumber = readerTickerNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getReaderTickerNumber() {
        return readerTickerNumber;
    }

    public void setReaderTickerNumber(String readerTickerNumber) {
        this.readerTickerNumber = readerTickerNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "fullName='" + fullName + '\'' +
                ", readerTickerNumber='" + readerTickerNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
