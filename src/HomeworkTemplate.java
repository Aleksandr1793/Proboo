import java.util.Scanner;

public class HomeworkTemplate {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0;
        int wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = new String[]{"как зовут сталина ", "Кто любит воду"};


        // TODO: Массив вариантов ответов
        String[][] answerOptions = new String[][]{{"иосиф  ", "кабзон"}, {"выдра", "кот"}};

        // TODO: Массив правильных ответов
        int[] correctAnswers = new int[]{1, 1};

        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for (int index = 0; index < questions.length; index++) {
            // TODO: Вывод вопроса на экран
            System.out.println(questions[index]);

            // TODO: Вывод вариантов ответов на экран
            for (int j = 0; j < answerOptions[index].length; j++) {
                System.out.println(answerOptions[index][j]);
            }

            System.out.println("Ваш ответ: ");
            //TODO: Считываем с консоли ответ пользователя
            int userinput = -1;
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    userinput = scanner.nextInt();
                    break;
                } else {
                    System.out.println("вы ввели не число");
                    scanner.next();
                }
            }

            //TODO: Проверяем ответ и выводим результат
            // а также увеличиваем счетчики правильных и неправильных ответов
            int rightAnswer = correctAnswers[index];
            if (userinput == rightAnswer) {
                System.out.println("правильно");
                correctCount++;
            } else {
                System.out.println("неправильно");
                wrongCount++;
            }

            System.out.println(userinput);
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}