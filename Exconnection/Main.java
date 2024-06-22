package Exconnection;

public class Main {

    public static void main(String[] args) {
        crudoperation.insertData("Utsav patel", "MCA", "Bhavnagar", "9978457845");
        crudoperation.insertData("Herit vekariya", "MBA", "Surat", "9898565623");
        crudoperation.getData();

        crudoperation.updateData("Utsav patel", "MScIT", "Ahmedabad", "7845127845");
        crudoperation.getData();

        //crudoperation.deleteData("Herit vekariya");
        crudoperation.getData();
    }
}
