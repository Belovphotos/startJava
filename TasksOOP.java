public class TasksOOP {
    /* 1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
    Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
    задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
    Созданный вами класс должен отвечать принципам инкапсуляции.
    */

    /* 2. Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
    “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
    использовать). Придерживаться принципов инкапсуляции и использовать ключевое
    слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
    консоль.
    */

    public static void main(String[] args) {
        Car tiburon = new Car();
        tiburon.setModel("Tiburon");
        tiburon.setColor("black");
        tiburon.setYear(2004);
        System.out.println(tiburon);
        tiburon.info();
        System.out.println(tiburon.yearDifference(2022));



        Bike bike = new Bike(2020, "Grey", "Honda");
        System.out.println(bike.getColor() + " " + bike.getModel() + " " + bike.getYear());
        bike.info();
        System.out.println(bike.yearDifference(2022));

        Airplane airplane = new Airplane("Boeing", 2005, 40,100000);
        airplane.getFuel();
        airplane.fillUp(100.0);
        airplane.info();

        Airplane airplane1 = new Airplane("Pobeda", 2012,40,100000);
        airplane1.setYear(2014);
        airplane1.setLength(45);
        airplane1.fillUp(100);
        airplane1.info();


    }
}
