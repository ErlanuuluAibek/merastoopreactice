public class Teacher extends Person{

    public Teacher(String name,double height,int age) {
        super(name ,height,age);
        super.Do(name,age,height);
    }

    @Override
    public String toString() {
        Do(getName(),getAge(),getHeight());
        return "Teacher{окутат "+" name "+getName()+" age: "+getAge()+" height "+getHeight();
    }
}
