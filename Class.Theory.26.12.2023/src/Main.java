// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1.hmn();
        task2.cty();
        task3.cntr();
        task4.frct();
    }
    class task1 {
        public static void hmn() {
            Human one = new Human();
            System.out.println(one);
            System.out.println("Новый номер телефона: " + one.getContactNumber());
            one.setCity("New York");
            System.out.println("Новый город: " + one.getCity());
        }
    }
        class task2{
            public static void cty() {
                City two = new City();
                System.out.println(two);
                System.out.println("Новое название региона: " + two.getnameOfTheCountry());
                two.setnumberOfInhabitants("New York");
                System.out.println("Новая численность населения: " + two.getnumberOfInhabitants());
            }
        }

    class task3{
        public static void cntr() {
            Country three = new Country();
            System.out.println(three);
            System.out.println("Новое колличество жителей страны: " + three.getnumberOfInhabitantsinTheCountry());
            three.setnameOfTheCapitalCity("Stavanger");
            System.out.println("Новая столица страны: " + three.getnameOfTheCapitalCity());
        }
    }

    class task4{
        public static void frct() {
            Fraction four = new Fraction();
            System.out.println(four);
            System.out.println("Новый числитель: " + four.getnumerator());
            four.setgetnumerator("Stavanger");
            System.out.println("Новый знаменатель: " + four.getdenominator());
        }
    }


    }

