package QuanLiHocVien;

import java.util.Date;

public class HocVien {
    private String name;
    private int age;
    private String gender;
    private String phone;
    private Date birthday;
    private Lop lop;

    public HocVien() {
    }

    public HocVien(String name, int age, String gender, String phone, Date birthday, Lop lop) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.birthday = birthday;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", lop=" + lop +
                '}';
    }
}
