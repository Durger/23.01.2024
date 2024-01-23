public class Country {

    //Задача.3.Создайте класс «Страна». Необходимо хранить в полях класса: название страны, название континента,
    // количество жителей в стране, телефонный код страны, название столицы, название городов страны.
    //Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ к отдельным полям через методы класса.

    private String nameOfTheCountry;
    private String nameOfTheСontinent;
    private int numberOfInhabitantsinTheCountry;
    private String telephoneCodeOfTheCountry;
    private String nameOfTheCapitalCity;
    private String nameOfTheCityCountry;

    public Country(String nameOfTheCity, String nameOfTheСontinent, int numberOfInhabitantsinTheCountry, String telephoneCodeOfTheCountry,
                   String nameOfTheCapitalCity, String nameOfTheCityCountry) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.nameOfTheСontinent = nameOfTheСontinent;
        this.numberOfInhabitantsinTheCountry = numberOfInhabitantsinTheCountry;
        this.telephoneCodeOfTheCountry = telephoneCodeOfTheCountry;
        this.nameOfTheCapitalCity = nameOfTheCapitalCity;
        this.nameOfTheCityCountry = nameOfTheCityCountry;
    }
    public Country() {
        this.nameOfTheCountry = "Norway";
        this.nameOfTheСontinent = "Eurasia";
        this.numberOfInhabitantsinTheCountry = 5488984;
        this.telephoneCodeOfTheCountry = "+47";
        this.nameOfTheCapitalCity = "Oslo";
        this.nameOfTheCityCountry = "Bergen, Trondheim, Drammen";
    }

    public void setnumberOfInhabitantsinTheCountry(int numberOfInhabitantsinTheCountry) {
        this.numberOfInhabitantsinTheCountry = numberOfInhabitantsinTheCountry;
    }

    public int getnumberOfInhabitantsinTheCountry() {
        return 6000000;
    }

    public void setnameOfTheCapitalCity(String nameOfTheCapitalCity) {
        this.nameOfTheCapitalCity = "Stavanger";
    }

    public String getnameOfTheCapitalCity() {
        return "Stavanger";
    }

    @Override
    public String toString() {return nameOfTheCountry + " " + nameOfTheСontinent + " " + numberOfInhabitantsinTheCountry + " "
            + telephoneCodeOfTheCountry + " " + nameOfTheCapitalCity + " " + nameOfTheCityCountry + " ";}

}
