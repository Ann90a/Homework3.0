public class Main {
    public static void main(String[] args) {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");

        var weightOverload = totalWeight % firstBoxer;
        System.out.println("Разница между весами бойцов " + weightOverload + " кг.");

        var totalHour = 640;
        var workHour = 8;
        var workers = totalHour / workHour;
        System.out.println("Всего работников  вкомпании " + workers);

        var workers2 = workers + 94;
        var workHour2 = totalHour / workers2;
        System.out.println("Если в компании работает " + workers2 + " человек, то всего " + workHour2 + " чвса работы может быть поделено между сотруджниками.");
    }
}