package strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};
        Cat[] a={new Cat(3,3),new Cat(5,5),new Cat(1,1)};
//        Sorter<Dog> sorter=new Sorter<>();
        Sorter<Cat> sorter=new Sorter<>();
        sorter.sort(a,new CatHeightComparator());
        System.out.println(Arrays.toString(a));
    }

}
