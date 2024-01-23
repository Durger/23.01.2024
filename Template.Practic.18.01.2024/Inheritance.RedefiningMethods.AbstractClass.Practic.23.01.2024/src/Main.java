// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//Задача.1.
        /*Device one = new Device("Device");
        Kettle two = new Kettle("Kettle");
        MicrowaveOven three = new MicrowaveOven("MicrowaveOven");
        Car four = new Car("Car");
        Steamer five = new Steamer("Steamer");

        one.Show();
        one.Desc();
        one.Sound();

        two.Show();
        two.Desc();
        two.Sound();

        three.Show();
        three.Desc();
        three.Sound();

        four.Show();
        four.Desc();
        four.Sound();

        five.Show();
        five.Desc();
        five.Sound();*/

        //Задача.2.
       /* Musicalinstrument six = new  Musicalinstrument("Musicalinstrument");
        Violin seven = new Violin("Violin");
        Trombone eight = new Trombone("Trombone");
        Ukulele nine = new Ukulele("Ukulele");
        Cello ten = new Cello("Cello");

        six.Show();
        six.Desc();
        six.Sound();
        six.History();

        seven.Show();
        seven.Desc();
        seven.Sound();
        seven.History();

        eight.Show();
        eight.Desc();
        eight.Sound();
        eight.History();

        nine.Show();
        nine.Desc();
        nine.Sound();
        nine.History();

        ten.Show();
        ten.Desc();
        ten.Sound();
        ten.History();*/

        Worker President = new President();
        Worker Security = new Security();
        Worker Manager = new Manager();
        Worker Engineer = new Engineer();

        President.Print();
        Security.Print();
        Manager.Print();
        Engineer.Print();

        }
        }
// Практика.17.Часть.5
//Задача.1.Создать базовый класс «Устройство» и производные классы «Чайник», «Микроволновка», «Автомобиль»,
//«Пароход». С помощью конструктора установить имя каждого устройства и его характеристики.
//Реализуйте для каждого из классов методы:
//■ Sound — издает звук устройства (пишем текстом в
//консоль);
//■ Show — отображает название устройства;
//■ Desc — отображает описание устройства.
        class Device {
    private String name;
    public Device(String name){
        this.name = name;
    }
    public void Sound(){
        System.out.println("Sound of device");}
        public void Show(){
            System.out.println("Name system" + name);
        }
        public void Desc(){
            System.out.println("Вescription of the device");
    }
        }
        class Kettle extends Device{
    public Kettle(String name){super(name);
    }
        }

class MicrowaveOven extends Device{
    public MicrowaveOven(String name){super(name);
    }
}
class Car extends Device{
    public Car(String name){super(name);
    }
}
class Steamer extends Device{
    public Steamer(String name){super(name);
    }
}


//Задача.2. Создать базовый класс «Музыкальный инструмент» и производные классы «Скрипка», «Тромбон», «Укулеле»,
//«Виолончель». С помощью конструктора установить имя каждого музыкального инструмента и его характеристики.
//Реализуйте для каждого из классов методы:
//■ Sound — издает звук музыкального инструмента (пишем текстом в консоль);
//■ Show—отображает название музыкального инструмента;
//■ Desc—отображает описание музыкального инструмента;
//■ History — отображает историю создания музыкального инструмента
class Musicalinstrument {
    private String name;
    public Musicalinstrument(String name){
        this.name = name;
    }
    public void Sound(){
        System.out.println("Sound of device");}
    public void Show(){
        System.out.println("Name system" + name);
    }
    public void Desc(){
        System.out.println("Вescription of the device");
    }
    public void History(){
        System.out.println("History of the device");
    }

}
class Violin extends Musicalinstrument{
    public Violin(String name){super(name);
    }
}
class Trombone extends Musicalinstrument{
    public Trombone(String name){super(name);
    }
}
class Ukulele extends Musicalinstrument{
    public Ukulele(String name){super(name);
    }
}
class Cello extends Musicalinstrument{
    public Cello(String name){super(name);
    }
}

// Задание.3.
abstract class Worker {
    public abstract void Print();
        class President extends Worker{
        @Override
        public void Print() {
            System.out.println("Information about president");
        }
    }
}
class Security extends Worker{
    @Override
    public void Print() {
        System.out.println("Information about security");
    }
}
class Manager extends Worker{
    @Override
    public void Print() {
        System.out.println("Information about manager");
    }
}
class Engineer extends Worker{
    @Override
    public void Print() {
        System.out.println("Information about engineer");
    }
}