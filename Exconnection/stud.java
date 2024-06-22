package Exconnection;

public class stud {

    private String name, field, city, contact_no;

    public stud() {

    }

    public stud(String name, String field, String city, String contact_no) {
        this.name = name;
        this.field = field;
        this.city = city;
        this.contact_no = contact_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String toString() {
        return "stud [name=" + name + ", field=" + field + ", city=" + city + ", contact_no=" + contact_no + "]";
    }
}
