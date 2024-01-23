// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello word");

      Student student = new Student( "Ивванов Константин Евгеньевич",22);
        System.out.println(student.toString ());

        Aspirant aspirant = new Aspirant(
                "Исследование объектно-реляционных баз данных",
                "Сидоров Константин Евгеньевич",
                32);
                        System.out.println(aspirant);

                        Student student1 = new Student(
                        fullName: " Петров Сергей Сергеевич", age: 45);
        System.out.println(student);

        Student aspirant1 = new Aspirant(workName:" Исследование объектно-реляционных баз данных", age: 45);
        System.out.println(aspirant);

        Ball redball = new Ball (color: "red");
        Ball blackBall = new Ball (color: "black");
        System.out.println(redball.getCountInstance());
        System.out.println(blackBall.getCountInstance());

        }
    }
