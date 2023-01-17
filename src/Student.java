public class Student extends Person{

    public Student(String name, double height, int age) {
        super(name, height, age);
        super.Do(name, age,height);
    }


    @Override
    public String toString(){
        Do(getName(),getAge(),getHeight());
       return "Student{Окуйт"+" name: "+getName()+" age: "+getAge()+
               " height: "+getHeight();
    }

}
