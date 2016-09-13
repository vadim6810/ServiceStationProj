package dao;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Client {
    Pattern pattern = Pattern.compile("0\\d{9}");
    Integer id;
    String name;
    String email;
    String password;
    String phone;
    TypeVehicle vehicle;
    Address area;
    String avatar;




    public boolean checkEmail(String checkedEmail) {
        return checkedEmail.contains("@");
    }

    public boolean checkPhone(String checkedPhone) {
        Matcher m = pattern.matcher(checkedPhone);
        return m.matches();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return id.equals(client.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public Client(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Client() {
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TypeVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(TypeVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Address getArea() {
        return area;
    }

    public void setArea(Address area) {
        this.area = area;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Client(String name, String email, String phone, TypeVehicle vehicle, Address area, String avatar) {
        id++;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.vehicle = vehicle;
        this.area = area;
        this.avatar = avatar;
    }
}
