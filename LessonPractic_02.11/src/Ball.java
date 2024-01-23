public class Ball{
private int count = 0;

private String color = "name";
public Ball(String color){
    this.color = color;

    count++;//count = count + 1;

    static int getCountInstage() {
        return count;
        }

        @Override
                public String toString() {
        return "Ball color: " + color;

    }
}
