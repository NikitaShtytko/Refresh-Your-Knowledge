package com.edu;

//        Среда программирования (Jet brains IDEA , Visual Studio, Pycharm и т.п): Debug Mode, Watch Expressions.
//        Условные выражения, циклы, синтаксические конструкции
//        Объекты и классы: назначение и примеры использования
//        Наследование: назначение и примеры использования
//        Интерфейсы и абстрактные классы (если поддерживается в языке программирования, которым вы владеете): назначение и примеры использования
//        Исключения и их обработка: назначение и примеры использования
//        Работа с файлами: создание, запись, чтение, удаление
//        Коллекции: назначение и примеры использования

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

    public static void main(String[] args) {
//        ifElse();
//        forEach();
    }
}