public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + totalWeight + " kg");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + weightDifference + " kg");

        System.out.println("Задача 7");
        weightDifference = boxer2 - boxer1;
        System.out.println(weightDifference);
        weightDifference = boxer2 % boxer1;
        System.out.println(weightDifference);

        System.out.println("Задача 8");
        var totalHours = 640;
        var workTime = 8;
        var workerNumber = totalHours / workTime;
        System.out.println("Всего работников в компании — " + workerNumber + " человек.");

        var overWorkers = 94;
        var totalWorkers = workerNumber + overWorkers;
        var workHours = totalWorkers * workTime;
        System.out.println("Если в компании работает " + totalWorkers + " человек,то всего " + workHours + " часов" +
                "работы может быть поделено между сотрудниками.");
    }
}