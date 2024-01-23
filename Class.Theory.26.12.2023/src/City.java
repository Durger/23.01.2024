public class City {
    //Задача.2.Создайте класс «Город». Необходимо хранить в полях класса: название города, название региона, название
    //страны, количество жителей в городе, почтовый индекс города, телефонный код города. Реализуйте методы класса
    // для ввода данных, вывода данных, реализуйте доступ к отдельным полям через методы класса

    private String nameOfTheCity;
    private String nameOfTheRegion;
    private String nameOfTheCountry;
    private int numberOfInhabitants;
    private int postсodeOfTheCity;
    private int telephoneCodeOfTheCity;

    public City(String nameOfTheCity, String nameOfTheRegion, String nameOfTheCountry, int numberOfInhabitants,
                int postсodeOfTheCity, int telephoneCodeOfTheCity) {
        this.nameOfTheCity = nameOfTheCity;
        this.nameOfTheRegion = nameOfTheRegion;
        this.nameOfTheCountry = nameOfTheCountry;
        this.numberOfInhabitants = numberOfInhabitants;
        this.postсodeOfTheCity = postсodeOfTheCity;
        this.telephoneCodeOfTheCity = telephoneCodeOfTheCity;
    }
    public City() {
        this.nameOfTheCity = "Konigsberg";
        this.nameOfTheRegion = "Königsberg region";
        this.nameOfTheCountry = "Germany";
        this.numberOfInhabitants = 120000;
        this.postсodeOfTheCity = 97486;
        this.telephoneCodeOfTheCity = 9527;
    }

    public void setnameOfTheCountry(String nameOfTheCountry) {
        this.nameOfTheCountry = "Lithuania";
    }

    public String getnameOfTheCountry() {
        return "Lithuania";
    }

    public void setnumberOfInhabitants(String numberOfInhabitants) {
        this.numberOfInhabitants = 150000;
    }

    public int getnumberOfInhabitants() {
        return 150000;
    }

    @Override
    public String toString() {return nameOfTheCity + " " + nameOfTheRegion + " " + nameOfTheCountry + " "
            + numberOfInhabitants + " " + postсodeOfTheCity + " " + telephoneCodeOfTheCity + " ";}

}
