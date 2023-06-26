public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int home = 10000000;
        System.out.println("Значение переменной с int целочисленным типом равно " + home);

        byte winter = -15;
        System.out.println("Значение переменной с byte целочисленным типом равно " + winter);

        short book = 18374;
        System.out.println("Значение переменной с short целочисленным типом равно " + book);

        long cosmic = 700055577888L;
        System.out.println("Значение переменной с long целочисленным типом равно " + cosmic);

        float graphOne = 21.45f;
        System.out.println("Значение переменной с float плавающей точкой равно " + graphOne);

        double graphTwo = 2.8;
        System.out.println("Значение переменной с double плавающей точкой равно " + graphTwo);


        double exerciseOne = 27.12;
        System.out.println(exerciseOne);

        long exerciseTwo = 987678965549L;
        System.out.println(exerciseTwo);

        double exerciseThree = 2.786;
        System.out.println(exerciseThree);

        short exerciseFour = 569;
        System.out.println(exerciseFour);

        short exerciseFive = -159;
        System.out.println(exerciseFive);

        short exerciseSix = 27897;
        System.out.println(exerciseSix);

        byte exerciseSeven = 67;
        System.out.println(exerciseSeven);

        byte classOne = 23;
        System.out.println(classOne);
        byte classTwo = 27;
        System.out.println(classTwo);
        byte classThree = 30;
        System.out.println(classThree);
        int pupil = classOne + classTwo + classThree;
        System.out.println(pupil);
        short paper = 480;
        System.out.println(paper);
        int pupilPaper = paper / pupil;
        System.out.println("На каждого ученика рассчитано " + pupilPaper + " листов бумаги");

byte bottle = 16;
System.out.println(bottle);
byte time = 2;
System.out.println(time);
int minuteBottle = bottle / time;
System.out.println(minuteBottle);
int twentyBottle = minuteBottle * 20;
System.out.println(" За 20 минут машина произвела " + twentyBottle + " штук бутылок");
byte dayHour = 24;
System.out.println(dayHour);
byte minuteHour = 60;
System.out.println(minuteHour);
int dayMinute = dayHour * minuteHour;
System.out.println(dayMinute);
int dayBottle = dayMinute * minuteBottle;
System.out.println("За сутки машина произвела " + dayBottle + " штук бутылок");
int dayThree = dayBottle * 3;
System.out.println(dayBottle);
int dayThreeBottle  = dayThree * minuteBottle;
System.out.println("За 3 дня машина произвела " + dayThreeBottle + " штук бутылок");
int monthDayMinute = minuteHour * dayHour * 30;
System.out.println(monthDayMinute);
int monthBottle = monthDayMinute * minuteBottle;
System.out.println("За месяц машина произвела " + monthBottle + " штук бутылок");

byte paint = 120;
System.out.println(paint);
byte paintWhiteRoom = 2;
System.out.println(paintWhiteRoom);
byte paintBrownRoom = 4;
System.out.println(paintBrownRoom);
int paintRoom = paintWhiteRoom + paintBrownRoom;
System.out.println(paintRoom);
int classRoom = paint / paintRoom;
System.out.println(classRoom);
int classRoomWhite = paintWhiteRoom * classRoom;
System.out.println("В школе, где 20 классов, нужно " + classRoomWhite + " банок белой краски");
int classRoomBrown = paintBrownRoom * classRoom;
System.out.println("и " + classRoomBrown + " банок коричневой краски");

byte banan = 5;
System.out.println(banan);
byte bananGram = 80;
System.out.println(bananGram);
int bananGramSmuzi = banan * bananGram;
System.out.println(bananGramSmuzi);
int milk = 200;
System.out.println(milk);
int milkGram = 105;
System.out.println(milkGram);
int milkGramSmuzi = milkGram * 2;
System.out.println(milkGramSmuzi);
byte icecream = 2;
System.out.println(icecream);
byte icecreamGram = 100;
System.out.println(icecreamGram);
int icecreamGramSmuzi = icecream * icecreamGram;
System.out.println(icecreamGramSmuzi);
byte egg = 4;
System.out.println(egg);
byte eggGram = 70;
System.out.println(eggGram);
int eggGramSmuzi = egg * eggGram;
System.out.println(eggGramSmuzi);
int smuzi = bananGramSmuzi + milkGramSmuzi + icecreamGramSmuzi + eggGramSmuzi;
System.out.println("Вес спортзавтрака " + smuzi + " гр");
float smuziKg = 1000f / smuzi;
System.out.println("Вес спортзавтрака " + smuziKg + " кг");

int weight = 7 * 1000;
System.out.println(weight);
int weightDayOne = 250;
System.out.println(weightDayOne);
int weightDayTwo = 500;
System.out.println(weightDayTwo);
int dayWeightOne = weight / weightDayOne;
System.out.println("Потребуется " + dayWeightOne + " дней для похудения, при потере в весе 250 гр в день");
int dayWeightTwo = weight / weightDayTwo;
System.out.println("Потребуется " + dayWeightTwo + " дней для похудения, припотере в весе 500 гр в день");

int masha = 67760;
System.out.println(masha);
int mashaYear = masha * 12;
System.out.println(mashaYear);
int mashaProcent = masha / 100;
System.out.println(mashaProcent);
int masha10Procent = mashaProcent * 10;
System.out.println(masha10Procent);
int mashaNew = masha + masha10Procent;
System.out.println(mashaNew);
int mashaNewYear = mashaNew * 12;
System.out.println("Теперь Маша получает " + mashaNewYear + " рублей в год");
int mashaDifference = mashaNewYear % mashaYear;
System.out.println("Годовой доход вырос на " + mashaDifference + " рублей в год");
        int denis = 83690;
        System.out.println(denis);
        int denisYear = denis * 12;
        System.out.println(denisYear);
        int denisProcent = denis / 100;
        System.out.println(denisProcent);
        int denis10Procent = denisProcent * 10;
        System.out.println(denis10Procent);
        int denisNew = denis + denis10Procent;
        System.out.println(denisNew);
        int denisNewYear = denisNew * 12;
        System.out.println("Теперь Денис получает " + denisNewYear + " рублей в год");
        int denisDifference = denisNewYear % denisYear;
        System.out.println("Годовой доход вырос на " + denisDifference + " рублей в год");
        int kristina = 76230;
        System.out.println(kristina);
        int kristinaYear = kristina * 12;
        System.out.println(kristinaYear);
        int kristinaProcent = kristina / 100;
        System.out.println(kristinaProcent);
        int kristina10Procent = kristinaProcent * 10;
        System.out.println(kristina10Procent);
        int kristinaNew = kristina + kristina10Procent;
        System.out.println(kristinaNew);
        int kristinaNewYear = kristinaNew * 12;
        System.out.println("Теперь Кристина получает " + kristinaNewYear + " рублей в год");
        int kristinaDiffrence = kristinaNewYear % kristinaYear;
        System.out.println("Годовой доход вырос на " + kristinaDiffrence + " руб");








    }
}


