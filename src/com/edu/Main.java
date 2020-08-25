package com.edu;

//+        Среда программирования (Jet brains IDEA , Visual Studio, Pycharm и т.п): Debug Mode, Watch Expressions.
//+        Условные выражения, циклы, синтаксические конструкции
//+        Объекты и классы: назначение и примеры использования
//+        Наследование: назначение и примеры использования
//+        Интерфейсы и абстрактные классы (если поддерживается в языке программирования, которым вы владеете): назначение и примеры использования
//+        Исключения и их обработка: назначение и примеры использования
//+        Работа с файлами: создание, запись, чтение, удаление
//        Коллекции: назначение и примеры использования

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {

    public static void ifElse(){
        //Условные выражения (if / else) (switch) (тернар)
        boolean bool = true;
        if (bool) System.out.println("Yes");
        else System.out.println("No");

        int x = 1;

        switch (x){
            case 1:
                System.out.println("Your number is equals 1");
                break;
            case 2:
                System.out.println("Your number is equals 2");
                break;
            default:
                System.out.println("Your number is not equals 1 or 2");
        }

        String resultTer = x < 3 ? "yes" : "no";
        System.out.println(resultTer);
    }

    public static void forEach(){

        for (int i = 0; i <= 3; i++){
            System.out.print(i + " ");
        }
        System.out.println("");

        int j = 0;
        while (j <= 3){
            System.out.print(j + " ");
            j++;
        }
        System.out.println("");

        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        }
        while (k <= 3);
        System.out.println("");

        int[] arr = {0,1,2,3};

        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void classesAndObjects(){
        class Car{

            public String name;
            public float speed;

            Car(String call, int x){
                name = call;
                speed = x;
            }

            float time(float distance){
                return distance / speed;
            }
        }

        Car audi = new Car("Audi", 220);
        System.out.println(audi.name + " spend " + audi.time(500) + " hours to travel for 500 km");

        Car mclaren = new Car("Mclaren", 325);
        System.out.println(mclaren.name + " spend " + mclaren.time(500) + " hours to travel for 500 km");
    }

    public static void Collections(){
        int[] mass = {1, 2, 8, 3, 5, 10, 1, 2, 3, 4};
        LinkedHashSet<Integer> x = new LinkedHashSet<Integer>();
        TreeSet<Integer> xi = new TreeSet<Integer>();
        Map<Integer, Integer> y = new HashMap<>();
        ArrayList<Integer> z = new ArrayList<>();
        LinkedList<Integer> zi = new LinkedList<>();

        for (int i = 0; i < mass.length; i++) {
            x.add(mass[i]);
            xi.add(mass[i]);
            y.put(i, mass[i]);
            z.add(mass[i]);
            zi.add(mass[i]);
        }

        System.out.println(x);
        System.out.println(xi);
        System.out.println(y);
        System.out.println(z);
        System.out.println(zi);
    }

    public static void Inheritance(){

        class Shape{
            int x;

            Shape(int a){
                x = a;
            }
            void Area(){
                System.out.println("This is base figure " + x);
            }
            void Area(int a){
                System.out.println("This is base figure " + a);
            }
        }

        class Square extends Shape{
            int x;
            Square(int a) {
                super(a);
                x = a;
            }
            @Override
            void Area(){
                System.out.println(x*x);
            }
        }

        class Triangle extends Shape{
            int x;
            Triangle(int a) {
                super(a);
                x = a;
            }
            @Override
            void Area(){
                System.out.println( x*x / 4 * sqrt(3));
            }
        }

        class Circle extends Shape{
            int x;
            Circle(int a) {
                super(a);
                x = a;
            }
            @Override
            void Area(){
                System.out.println(3.14 * x * x);
            }
        }

//        class Ex extends Circle, Square{} //Пример множественного наследования

        Shape one = new Shape(3);
        one.Area();

        Shape two = new Triangle(3); //наоборот будет ошибка ( Triangle two = new Shape )
        two.Area();

        Triangle three = new Triangle(3);
        three.Area();

        Square four = new Square(3);
        four.Area();

        Circle five = new Circle(3);
        five.Area();
        five.Area(4); //такого метода нет в классе, поэтому используется родительский
    }

    public static void InterfacesAndAbstracts(){
        //интерфейс работает с поведением а не с состоянием => нет состояния только методы
        //интерйесы нужны для связывания вещей по их поведению, но не имеющих больше ничего общего
        //абстрактные классы имеют как состояние так и поведение поэтому связывают схожие вещи
        //Абстрактный класс может не иметь реализации всех методов => абстрактный метод - метод без реализации (только сигнатура)
        //extends - наследование (для абстракт и обычных), implements - реализация (для наследования от интерфейсов)
        //Классы могут реализовывать сколько угодно интерфейсов, но наследоваться можно только от одного класса.

        abstract class A{
            int a;
            void Setter(int x){
                a = x;
            }
            void Getter(){
                System.out.println(a);
            }
        }

//        A a = new A(); 'A' is abstract; cannot be instantiated
    }

    public static void Exceptions() throws Exception{
        Scanner in = new Scanner(System.in);
        int x = 0;
        try {
            x = in.nextInt();
        }
        catch (Exception e){
            System.out.println("Error");
            if(e.getMessage() == null){
                throw new Exception("Your number is 123.0");
            }
        }
        finally {
            in.close();
        }
    }

    public static void Files() throws Throwable{
        File test = new File("D://Projects//ОсвежаемЗнания//src//com//edu//test");
        System.out.println(test.mkdir());

        //false для перезаписи, true для записи в конец
        FileWriter textWrite = new FileWriter(test.getAbsolutePath() + "//text.txt", false);

        textWrite.write("Хокку любит \nТренировки нужно пропускать \nРади проги )))\n");
        textWrite.close();

        FileReader textRead = new FileReader(test.getAbsolutePath() + "//text.txt");
        Scanner scanReader = new Scanner(textRead);
        while (scanReader.hasNextLine()){
            System.out.println(scanReader.nextLine());
        }
        textRead.close(); scanReader.close();

        try {
            File text = new File(test.getAbsolutePath() + "//text.txt");
            boolean markText = text.delete();
            boolean markTest = test.delete();
            System.out.println("Delete file");
            if(!(markTest && markText)){
                throw new Exception("Error when delete");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws Throwable{
//        ifElse();
//        forEach();
//        classesAndObjects();
//        Files();
//        Exceptions();
//        Inheritance();
//        InterfacesAndAbstracts();
        Collections();
    }
}