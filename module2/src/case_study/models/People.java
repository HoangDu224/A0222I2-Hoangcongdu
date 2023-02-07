package case_study.models;

public abstract class People {
    public String name;
    public String birthday;
    public String gender;
    public int cMND;
    public int phone;
    public String email;
    public int ID;

    public People(String name, String birthday, String gender, int cMND, int phone, String email, int ID) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.cMND = cMND;
        this.phone = phone;
        this.email = email;
        this.ID = ID;
    }

    public People() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getcMND() {
        return cMND;
    }

    public void setcMND(int cMND) {
        this.cMND = cMND;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND=" + cMND +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
