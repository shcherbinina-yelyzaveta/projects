package com.company.task24;

/**
 * Created by student on 15.12.2017.
 */
public class Phone {
    private int id;
    private int user_id;
    private String phone_number;

    public Phone() {
    }

    public Phone(int id, int user_id, String phone_number) {
        this.id = id;
        this.user_id = user_id;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (id != phone.id) return false;
        if (user_id != phone.user_id) return false;
        return phone_number != null ? phone_number.equals(phone.phone_number) : phone.phone_number == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + user_id;
        result = 31 * result + (phone_number != null ? phone_number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
