    public class City {
        private String cityName;
        private String regionName;
        private String countryName;
        private int numberOfPeople;
        private int postNumber;
        private int telephoneCodeOfTheCity;

        // Присвоение типа данных
        public City(String cityName, String regionName, String countryName, int numberOfPeople, int postNumber, int telephoneCodeOfTheCity) {
            this.cityName = cityName;
            this.regionName = regionName;
            this.countryName = countryName;
            this.numberOfPeople = numberOfPeople;
            this.postNumber = postNumber;
            this.telephoneCodeOfTheCity = telephoneCodeOfTheCity;
            // Писвоение классам данных.
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getcityName() {
            return cityName;
        }

        public void regionName(String regionName) {
            this.regionName = regionName;
        }

        public String regionName() {
            return regionName;
        }

        public void countryName(String countryName) {
            this.regionName = countryName;
        }

        public String countryName() {
            return countryName;
        }

        public void numberOfPeople(int numberOfPeople) {
            this.numberOfPeople = numberOfPeople;
        }

        public int numberOfPeople() {
            return numberOfPeople;
        }

        public void postNumber(int postNumber) {
            this.numberOfPeople = postNumber;
        }

        public int postNumber() {
            return postNumber;
        }

        public void telephoneCodeOfTheCity(int telephoneCodeOfTheCity) {
            this.telephoneCodeOfTheCity = telephoneCodeOfTheCity;
        }

        public int telephoneCodeOfTheCity() {
            return telephoneCodeOfTheCity;
        }


        @Override
        public String toString() {
            return "Город - " + cityName + "Название региона - " + regionName + "Название страны - "
                    + countryName + "Население страны - " + numberOfPeople  + "Почтовый индекс страны - "
                    + postNumber + "Телефонный код города - " + telephoneCodeOfTheCity;
        }
        // public static void main(String[] args) {
    }
