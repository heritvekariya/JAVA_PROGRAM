package Expolymorphism;

public class Person {
    private String uniqueId;
    private String name;
    private String address;
    private String telephone;
    private String mobile;
    private String headOfFamily;

    public Person(String uniqueId, String name, String address, String telephone, String mobile, String headOfFamily) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setTelephone(String newTelephone) {
        telephone = newTelephone;
    }

    public void setMobile(String newMobile) {
        mobile = newMobile;
    }

    public void setHeadOfFamily(String newHeadOfFamily) {
        headOfFamily = newHeadOfFamily;
    }

    @Override
    public String toString() {
        return "Unique ID: " + uniqueId + "\n" +
               "Name: " + name + "\n" +
               "Address: " + address + "\n" +
               "Telephone: " + telephone + "\n" +
               "Mobile: " + mobile + "\n" +
               "Head of Family: " + headOfFamily + "\n";
    }

    public boolean matches(String keyword) {
        return uniqueId.contains(keyword) || name.contains(keyword) || address.contains(keyword) ||
               (telephone != null && telephone.contains(keyword)) || 
               (mobile != null && mobile.contains(keyword)) || 
               headOfFamily.contains(keyword);
    }
}

