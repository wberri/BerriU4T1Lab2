public class Main {
    public static void main (String[] args){
        WhileLoopFun fun = new WhileLoopFun();

        System.out.println("-- test printDigits --");
        fun.printDigits(5);
        System.out.println("---");
        fun.printDigits(361);
        System.out.println("---");
        fun.printDigits(98000);
        System.out.println("---");
        fun.printDigits(150856);

        System.out.println("-- test countLetter --");
        System.out.println(fun.countLetter("apple", "a"));
        System.out.println(fun.countLetter("apple", "z"));
        System.out.println(fun.countLetter("babababa", "a"));
        System.out.println(fun.countLetter("babababa", "b"));
        System.out.println(fun.countLetter("excellente", "e"));
        System.out.println(fun.countLetter("rawrrrrrr", "r"));

        System.out.println("-- test maxDoubles --");
        System.out.println(fun.maxDoubles(4, 20));
        System.out.println(fun.maxDoubles(2, 65));
        System.out.println(fun.maxDoubles(5, 500));
        System.out.println(fun.maxDoubles(2, 64));
        System.out.println(fun.maxDoubles(2, 63));
        System.out.println(fun.maxDoubles(8, 10));
        System.out.println(fun.maxDoubles(8, 5));
        System.out.println(fun.maxDoubles(10, 456000));


    }
}
