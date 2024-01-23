public class Human {

    //Задача.1.
    // Реализуйте класс «Человек». Необходимо хранить  в полях класса: ФИО, дату рождения,  контактный телефон, город,
   // страну, домашний адрес. Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ к отдельным
    // полям через методы класса

    private String family;
    private int dateOfBirth;
    private int contactNumber;
    private String city;
    private String country;
    private String homeAdress;

    public Human(String family, int dateOfBirth, int contactNumber, String city, String country, String homeAdress) {
        this.family = family;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.city = city;
        this.country = country;
        this.homeAdress = homeAdress;
    }

    public Human() {
        this.family = "Jobs";
        this.dateOfBirth = 1966;
        this.contactNumber = 48254845;
        this.city = "Los Angeles";
        this.country = "USA";
        this.homeAdress = "Abbey road 515";
    }

    public void setCity(String city) {
        this.city = "New York";
    }

    public String getCity() {
        return "New York";
    }

    public int getContactNumber() {
        return 548755848;
    }

    @Override
    public String toString() {return family + " " + dateOfBirth + " " + contactNumber + city + " "
    + country + " " + homeAdress + " ";}

}
