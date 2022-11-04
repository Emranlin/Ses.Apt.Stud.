import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String fullName;
    private int phoneNumber;
    private String address;
    private int bankAccount;


    public void setFullName(String fullName){
        this.fullName=fullName;

    }

    public String getFullName() {
        return fullName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void getInfo(){
        System.out.println("fullName = " + fullName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("address = " + address);
        System.out.println("bankAccount = " + bankAccount);

    }
    public void liveIn(Student[] students,Apartment[] apartments){
        int result=0;
        for( Apartment apartment:apartments){
            if(Objects.equals(apartment.getAddress(),address)){
                result=bankAccount/ apartment.payPerMonth(students);
            }

            }System.out.println("Live in\n"+result);
        }
        public void changeInfo(){
            System.out.println("Enter full name:");
            fullName=new Scanner(System.in).nextLine();
            System.out.println("Enter phone number:");
            phoneNumber=new Scanner(System.in).nextInt();
            System.out.println("Enter address: ");
            address=new Scanner(System.in).nextLine();
            System.out.println("Enter bank account:");
            bankAccount=new Scanner(System.in).nextInt();



        }

}