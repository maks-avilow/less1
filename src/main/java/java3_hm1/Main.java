package java3_hm1;
  /*    1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        2. Написать метод, который преобразует массив в ArrayList;
        3. Большая задача:
        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        g. Не забываем про метод добавления фрукта в коробку.*/
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        Integer[] intArr = new Integer[2];

        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

        // Задание 2
        ArrayList<Integer> arrList = toArrayList(intArr);

        // Задание 3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
    }

        public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
            public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}


