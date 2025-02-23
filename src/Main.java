public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        byte banana = 1;
        System.out.println("Бананов " + banana + " шт");
        short orange = 129;
        System.out.println("Апельсинов " + orange + " шт");
        int tomatoes = 2000;
        System.out.println("Помидоров " + tomatoes + " шт");
        long packages = 10000L;
        System.out.println("Пакетов " + packages + " шт");
        float times = 17.5f;
        System.out.println("Времени на разгрузку " + times + " часов");
        double additionalShifts = 11.5;
        System.out.println("Дополнительных смен " + additionalShifts + " шт");

        System.out.println("Задача №2");
        float a = 27.12f;
        System.out.println(a);
        long b= 987_678_965_549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short v = 27897;
        System.out.println(v);
        byte x = 67;
        System.out.println(x);

        System.out.println("Задача №3");

        byte lyudmilaPavlovnaStudents = 23;
        byte annaSergeevnaStudent = 27;
        byte ekaterinaAndreevnaStudent=30;
        byte totalStudent = (byte) (lyudmilaPavlovnaStudents + annaSergeevnaStudent + ekaterinaAndreevnaStudent);
        short sheetsPaper = 480;
        byte paperOneStudent= (byte)(sheetsPaper / totalStudent);
        System.out.println("На каждого ученика " + paperOneStudent + " листов бумаги" );

        System.out.println("Задача №4");
        byte bottles = 16;
        byte time = 2;
        byte perfomanceCar1Minute = (byte)(bottles / time);
        short perfomanceCar20Minute = (short)(perfomanceCar1Minute * 20);
        System.out.println("За 20 минут машина провезла "+ perfomanceCar20Minute + " штук бутылок");
        short day = 1440;
        short perfomanceCarDay = (short)(perfomanceCar1Minute * day);
        System.out.println("За сутки машина провезла "+ perfomanceCarDay + " штук бутылок");
        short freeDay = (short)(day * 3);
        int perfomanceCarFreeDay = perfomanceCar1Minute * freeDay;
        System.out.println("За 3 дня машина провезла "+ perfomanceCarFreeDay + " штук бутылок");
        int month1 = (day * 31);
        int perfomanceCarMonth1 = (perfomanceCar1Minute * month1);
        System.out.println("За 1 месяц машина провезла "+ perfomanceCarMonth1 + " штук бутылок");

        System.out.println("Задача №5");
        byte totalPaintCans= 120;
        byte whiteCansPaintClasses = 2;
        byte brownCansPaintClasses = 4;
        byte classesSchool = (byte)(totalPaintCans / (whiteCansPaintClasses + brownCansPaintClasses));
        byte totalClassesCansPanitWhite = (byte)(whiteCansPaintClasses * classesSchool);
        byte totalClassesCansPanitBrown = (byte)(brownCansPaintClasses * classesSchool);
        System.out.println("В школе, где " + classesSchool + " классов, нужно " + totalClassesCansPanitWhite +
                " банок белой краски и " + totalClassesCansPanitBrown + " банок коричневой краски." );

        System.out.println("Задача №6");
        short bananes = 5;
        short oneBananesGrams =80;
        short fiveBananesGrams = (short)(oneBananesGrams * bananes);

        short milk = 200;
        byte ml = 100;
        byte grams = 105;
        double oneGramsMilk = (double) grams /ml;
        double gramsMilk = (milk * oneGramsMilk);

        byte iceCream = 2;
        byte gramsOneIceCream = 100;
        short gramsTotalIceCream = (short)(iceCream * gramsOneIceCream);

        byte eggs = 4;
        byte gramsOneEggs = 70;
        short gramsTotalEggs =(short)(eggs * gramsOneEggs);

        short kilogramm = 1000;
        short breakfast = (short)(fiveBananesGrams + gramsMilk + gramsTotalIceCream + gramsTotalEggs);
        double kilogrammBreakfast = (double) breakfast / kilogramm;

        System.out.println("На завтрак требуется " + breakfast + " грамм");
        System.out.println("На завтрак требуется " + kilogrammBreakfast + " Килограмм");

        System.out.println("Задача №7");

        short athleteResetWeight = 7;
        short oneKilogramm = 1000;
        short gramsAthleteResetWeight = (short)(athleteResetWeight * oneKilogramm );
        short gramsA= 250;
        short gramsB= 500;
        short dayGramsA =(short) (gramsAthleteResetWeight / gramsA);
        short dayGramsB =(short) (gramsAthleteResetWeight / gramsB);
        System.out.println("Если скидывать по 250 грамм , будет худеть " + dayGramsA + " дней");
        System.out.println("Если скидывать по 500 грамм , будет худеть " + dayGramsB + " дней");

        short averageQuantityDay =(short)((dayGramsA + dayGramsB) /2 );
        System.out.println("Если скидывать по 250 грамм и 500 грамм, будет худеть в среднем " + averageQuantityDay + " дней");

        System.out.println("Задача №8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int increaseMasha = (int)(salaryMasha * 0.10);
        int increaseDenis = (int)(salaryDenis * 0.10);
        int increaseKristina = (int)(salaryKristina * 0.10);

        int increaseSalaryMasha = salaryMasha + increaseMasha;
        int increaseSalaryDenis = salaryDenis + increaseDenis;
        int increaseSalaryKristina = salaryKristina + increaseKristina;


        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryKristina = salaryKristina * 12;

        int newYearSalaryMasha = increaseSalaryMasha * 12;
        int newYearSalaryDenis = increaseSalaryDenis* 12;
        int newYearSalaryKristina = increaseSalaryKristina * 12;

        int differenceYearSalaryMasha = newYearSalaryMasha - yearSalaryMasha ;
        int differenceYearSalaryDenis = newYearSalaryDenis - yearSalaryDenis;
        int differenceYearSalaryKristina = newYearSalaryKristina - yearSalaryKristina;

        System.out.println("Маша теперь получает " + increaseSalaryMasha +" рублей. Годовой доход вырос на "
                + differenceYearSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + increaseSalaryDenis +" рублей. Годовой доход вырос на "
                + differenceYearSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + increaseSalaryKristina +" рублей. Годовой доход вырос на "
                + differenceYearSalaryKristina + " рублей.");










    }
}