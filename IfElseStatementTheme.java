public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 18;

        if (age > 20) {
            System.out.println("Вы можете войти");
        } else {
            System.out.println("Вход возможен только при достижении 20 лет");
        }

        boolean isMen = false;

        if (!isMen) {
            System.out.println("Вход только для мужчин");
        }

        double height = 1.65;

        if (height < 1.80) {
            System.out.println("Добро пожаловать на аттракцион");
        } else {
            System.out.println("Это атракцион вам не подходит");
        }

        char firstLetter = "Diana".charAt(0);

        if (firstLetter == 'M') {
            System.out.println("Ваше имя начинается на букву \"М\"");
        } else if (firstLetter == 'I') {
            System.out.println("Ваше имя начинается на букву \"I\"");
        } else {
            System.out.println("Я не знаю на какую букву начинается ваше имя");
        }

        System.out.println("\n2.Поиск max и min числа");
        int number1 = 345;
        int number2 = 543;
        if (number1 > number2) {
            System.out.println("Максимальное число: " + number1 + "\nМинимальное число: " + number2);
        } else {
            System.out.println("Максимальное число: " + number2 + "\nМинимальное число: " + number1);
        }

        System.out.println("\n3.Работа с числом");
        int number = 27;

        if(number == 0) {
            System.out.println("Число равно 0");
        } else {
            if (number > 0) {
                System.out.print("Число положительное");
            } else {
                System.out.print("Число отрицательное");
            } if (number % 2 == 0) {
                System.out.println(" чётное");
            } else {
                System.out.println(" нечётное");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        number1 = 123;
        number2 = 126;
        int unitNumber1 = number1 / 100;
        int dozensNumber1 = (number1 / 10) % 10;
        int hundredNumber1 = number1 % 10;
        int unitNumber2 = number2 / 100;
        int dozensNumber2 = (number2 / 10) % 10;
        int hundredNumber2 = number2 % 10;

        if (unitNumber1 == unitNumber2 || dozensNumber1 == dozensNumber2 || hundredNumber1 == hundredNumber2) {
            if (unitNumber1 == unitNumber2) {
                System.out.print("В числах " + number1 + " и " + number2 + " одинаковые цифры " + unitNumber1);
                if (dozensNumber1 == dozensNumber2) {
                    System.out.print(", " + dozensNumber1);
                    if (hundredNumber1 == hundredNumber2) {
                        System.out.print(", " + hundredNumber1);
                        System.out.println(" стоят в 1, 2, 3 разрядах");
                    } else if (hundredNumber1 != hundredNumber2) {
                        System.out.println(" стоят в 1, 2 разрядах");
                    }
                } else if (dozensNumber1 != dozensNumber2 && hundredNumber1 == hundredNumber2) {
                    System.out.print(", " + hundredNumber1);
                    System.out.println(" стоят в 1, 3 разрядах");
                } else if (dozensNumber1 != dozensNumber2 && hundredNumber1 != hundredNumber2) {
                    System.out.println(" стоят в 1 разряде");
                }
            }
            else if (dozensNumber1 == dozensNumber2) {
                System.out.print("В числах " + number1 + " и " + number2 + " одинаковые цифры " + dozensNumber1);
                if (hundredNumber1 == hundredNumber2) {
                    System.out.print(", " + hundredNumber1);
                    System.out.println(" стоят во 2, 3 разряде");
                } else {
                    System.out.println(" стоят во 2 разряде");
                }
            } else if (hundredNumber1 == hundredNumber2) {
                System.out.print("В числах " + number1 + " и " + number2 + " одинаковые цифры " + hundredNumber1);
                System.out.println(" стоят 3 разряде");
                }
        } else {
            System.out.println("В числах " + number1 + " и " + number2 + " цифры не совпадают");
        }


        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        System.out.print(symbol + " - ");
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("это большая буква");
        } else if (symbol >= 'a' && symbol <='z') {
            System.out.println("это маленькая буква");
        } else if (symbol >= '0') {
            System.out.println("это число");
        } else {
            System.out.println("это не буква и не число");
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        int contribution = 300_000;
        int percentContribution;
        int sum;
        System.out.println("Сумма вклада : " + contribution);
        if (contribution < 100_000) {
            percentContribution = 5;
            sum = contribution * percentContribution / 100 + contribution;

        } else if (contribution >= 100_00 && contribution < 300_000) {
            percentContribution = 7;
            sum = contribution * percentContribution / 100 + contribution;

        } else {
            percentContribution = 10;
            sum = contribution * percentContribution / 100 + contribution;
        }
        System.out.println("Начисленный процент: " + percentContribution + "%");
        System.out.println("Итоговая сумма с процентами: " + sum);

        System.out.println("\n7.Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 0;
        int programmingGrade = 0;
        int numberLessons = 0;

        if (historyPercent > 91) {
            historyGrade = 5;
            numberLessons ++;
        } else if (historyPercent > 73) {
            historyGrade = 4;
            numberLessons ++;
        } else if (historyPercent > 60) {
            historyGrade = 3;
            numberLessons ++;
        } else if (historyPercent <= 60) {
            historyGrade = 2;
            numberLessons ++;
        }

        if (programmingPercent > 91) {
            programmingGrade = 5;
            numberLessons ++;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
            numberLessons ++;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
            numberLessons ++;
        } else if (programmingPercent <= 60){
            programmingGrade = 2;
            numberLessons ++;
        }
        System.out.println("Оценка " + historyGrade + " по истории");
        System.out.println("Оценка " + programmingGrade + " по программированию");
        System.out.println("Средний балл оценок по предметам: " + ((historyGrade + programmingGrade) / numberLessons));
        System.out.println("Средний % по предметам: " + ((historyPercent + programmingPercent) / numberLessons) + "%");

        System.out.println("\n8.Расчет прибыли");
        int rent = 5_000;
        int realization = 13_000;
        int costPrice = 9_000;
        int amountMonths = 12;
        int annualProfit = (realization - rent - costPrice) * amountMonths;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int cash = 567;
        int unit = 1;
        int dozens = 10;
        int hundred = 100;
        int dozensLimit = 5;
        int numberOfTen = cash / 100;;
        int numberOfDozens = (cash / 10) % 10;
        int numberOfUnit = cash % 10;
        int limit = ((cash % 100)) - (dozensLimit * dozens);

        if (((cash / 10) % 10) > dozensLimit) {
            numberOfDozens = dozensLimit;
            numberOfUnit = limit / unit;
        }
            int reverseSettlement = (numberOfTen * hundred) + (numberOfDozens * dozens) + (numberOfUnit * unit);
            System.out.println("Номиналы банкнот: " + unit + ", " + dozens + ", " + hundred);
            System.out.println("Требуемое количество банкнот: " + numberOfTen + " купюр по " + hundred + ", " + numberOfDozens + " купюр по " + dozens + ", " + numberOfUnit +" купюр по " + unit);
            System.out.println("Исходная сумма: " + reverseSettlement + " USD");
    }
}
