package hspedu.generic;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> person =  new Person<String>("hsp");
        Person<Integer> person1 = new Person<>(123);
        person.show();

        Object o = person.t();
        System.out.println(o);
    }

}

class Person<E>{
    E s;

    public Person(E s) {
        this.s = s;
    }

    public E t(){
        return s;
    }

    public void show(){
        System.out.println("--"+s.getClass());
    }

}