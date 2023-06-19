package collections;

public class Worker
//implements Comparable<Worker>
{
    private String name;
    private String surname;
    private int age;

    public Worker(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+surname+"-"+age;
    }


//    @Override
//    public int compareTo(Worker o) {
////        if( this.age>o.age)
////            return 1;
////        if (this.age<o.age)
////            return -1;
////        return 0;
//        //OR
////        return this.age-o.age;
//
//        //name
////        return this.name.compareTo(o.name);
////        return this.surname.compareTo(o.surname);
//    }
}
