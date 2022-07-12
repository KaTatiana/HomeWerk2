public class Main {
    public static void main(String[] args) {

        //task 1
        byte num =0;
        short num6 = 6;
        int num1=1;
        long num2=2L;
        float num4=4.4f;
        double num5=5.5;

        //task 2
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;

        System.out.println("общий вес двух бойцов:"+(boxerWeight1+boxerWeight2));
        System.out.println("разница между весами бойцов:" +boxerWeight1%boxerWeight2);

        //task 3
        int numBananas = 5; //количество бананов
        int weightBanana = 80; //вес 1 банана
        int mlMilk = 200; //милилитров молока
        int weightMilk = 105; // вес молока в 100 мл.
        int numSundae =2; //количество брикетов пломбира
        int weightSundae = 100; //вес 1 брикета пломбира
        int numEgg = 4;// количество яиц
        int weightEgg = 70; //вес яйца
        double sum=0.00;//вес завтрака

        sum=(numBananas*weightBanana+mlMilk/100.0*weightMilk+numSundae*weightSundae+numEgg*weightEgg)/1000.0;

        System.out.println("вес спорт-завтрака="+ sum +"(килограмм)");

        //task4
        int ollLoseWeight=7;//количество килограмм, которые нужно сбросить
        int minLoseWeight=250;//минимальное количество грамм, которые можно сбросить за день
        int maxLoseWeight=500;//максимальное количество грамм, которые можно сбросить за день
        int maxDay =0;
        int minDay =0;

        maxDay=ollLoseWeight*1000/minLoseWeight;
        minDay=ollLoseWeight*1000/maxLoseWeight;

        System.out.println("Количество дней для потери веса при минимальном результате ="+ maxDay);
        System.out.println("Количество дней для потери веса при максимальном результате ="+ minDay);
        System.out.println("Усредненое количество дней для потери веса ="+ (maxDay+minDay)/2);

        //task5
        double salaryMasha = 67760.0;//зарплата Маши
        double salaryDen = 83690.0;//зарплата Дениса
        double salaryKris = 76230.0;//зарплата Крисс
        int percent = 10;//процент

        double salaryIncreaseMasha=0.0;//повышенная зарплата Маши
        double salaryIncreaseDen = 0.0;//повышенная зарплата Дениса
        double salaryIncreaseKris = 0.0;//повышенная зарплата Крисс

        salaryIncreaseMasha = salaryMasha+(salaryMasha*percent/100);
        salaryIncreaseDen = salaryDen+(salaryDen*percent/100);
        salaryIncreaseKris = salaryKris+(salaryKris*percent/100);

        System.out.println("Маша теперь получает "+ salaryIncreaseMasha +" рублей. Годовой доход вырос на "+ (salaryIncreaseMasha-salaryMasha)*12 +" рублей");
        System.out.println("Денис теперь получает "+ salaryIncreaseDen +" рублей. Годовой доход вырос на "+ (salaryIncreaseDen-salaryDen)*12 +" рублей");
        System.out.println("Кристина теперь получает "+ salaryIncreaseKris +" рублей. Годовой доход вырос на "+ (salaryIncreaseKris-salaryKris)*12 +" рублей");

    }
}