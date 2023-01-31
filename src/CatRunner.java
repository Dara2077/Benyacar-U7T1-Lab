import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Joey");
        Cat cat2 = new Cat("Max");
        Cat cat3 = new Cat("Jenny");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        // YOU WILL WRITE MORE CODE HERE
        Cat cat4 = new Cat("Dara");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replaced);
        cat4.setName(cat4.getName() + " meow");
        System.out.println(cat4);
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i ++){
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);
    }
}
