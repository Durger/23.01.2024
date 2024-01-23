public class Student  {
    // ФИО студента

    private String fullName;

    // Возраст студента

    private int age;
public Student (String fullName,int age){
    this.fullName = fullName;
    this.age = age;
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
        return "Hello " + fullName + " you are " + age;
        }

}
