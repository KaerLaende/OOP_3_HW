public class Main {
    public static void main(String[] args) {
        //проверка класса Car
        Car bmw = new Car("BMW", "z8",2022,"Германия","синий цвет",280,"","");
        bmw.setBodyType("седан");
        System.out.println(bmw);
        // Создание 3х обьектов Бус из задания:
        Bus icarus = new Bus("Икарус","55",1972,"Венгрия","красный цвет",98,32);
        Bus capaCity = new Bus("Мерседес","CapaCity",2021,"Турция","серебристый цвет",120,1);
        capaCity.setSeatsNumber(193);
        Bus sprinterCity = new Bus("Мерседес","SprinterCity",2022,"Германия","белого цвета",160,22);
        System.out.println("Автобусы:");
        System.out.printf(icarus+ "\n"+capaCity+"\n"+sprinterCity+"\n");



    }
}