import java.util.ArrayList;
import java.util.Locale;

public class CatRunner {
    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Bob");
        Cat cat2 = new Cat("sam");
        Cat cat3 = new Cat("Kay");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
        Cat cat4 = new Cat("Jess");
        Cat replace = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replace);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);

        for (int i = 0; i < cats.size(); i++) {
            String up = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(up);
        }
        System.out.println(cats);
        cats.add(new Cat("Jay"));
        System.out.println(cats);
    }
}
