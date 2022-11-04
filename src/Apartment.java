import java.util.Objects;

public class Apartment {
   private String name;
     private int price;
     private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("address = " + address);
    }
    public int payPerMonth(Student[] students){
        int studentCounter=0;
        for(Student student:students){
            if(Objects.equals(student.getAddress(),address)){
            studentCounter++;}

        }return price/studentCounter;


    }
}
