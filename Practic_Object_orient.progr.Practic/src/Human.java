import java.util.Scanner;

public class Human {

    private String fullName;
    private int age;
    private int telephone;
    private String city;
    private String country;
    private String address;
    // Присвоение типа данных
    public Human (String fullName,int ageOfBith, int telephone, String city, String country, String address) {
        this.fullName = fullName;
        this.age = ageOfBith;
        this.telephone = telephone;
        this.city = city;
        this.country = country;
        this.address = address;
    }
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
        public String getFullName() {
            return fullName;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge(){
            return age;
        }
        @Override
        public String toString(){
            return "Человек " + fullName + " Возраст " + age + "Город " + city + "Страна" + country + "Адрес" + address;
   // public static void main(String[] args) {


    }
}
