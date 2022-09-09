package tuts.ClassesInJava;

public class ConstructorMain {
    public static void main(String[] args) {
        Human man1 = new Human("Bob", 12, 130);
        Human man2 = new Human("Jack", 16, 170);
        System.out.println(man1.name);
        System.out.println(man2.name);

    }
}
