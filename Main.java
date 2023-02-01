import java.util.Scanner;

public class Main {
    //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void main(String[] args) throws Exception {
        int inp;
        Scanner myScan = new Scanner(System.in);
        myScan.useDelimiter("\\n");
        System.out.println("Введите число больше 7 : ");
        if (myScan.hasNextInt()) {
            inp = myScan.nextInt();
            if (inp > 7) {
                System.out.println("Привет");
            }


            //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
            String name = "";
            System.out.println("Введите Имя: ");
            if (myScan.hasNext()) {
                name = myScan.next();
            }
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        }


            //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        String newString ="";
        System.out.println("Введите массив целых чисел с разделителем ',' : ");
        if (myScan.hasNext()){
            newString = myScan.next();
        }
        String [] arrStr = newString
                .replaceAll(" ","")
                .replaceAll("[a-zA-Zа-яА-Я_]","")
                .replaceAll("\\]","").replaceAll("\\[","")
                .replaceAll("[;!#$%&<>:|]",",")
                .split(",");
        int [] arr = new int[arrStr.length];
        int counterWrite=0;
        for ( int i=0; i < arr.length; i++){
            arr[counterWrite] = Integer.valueOf(arrStr[i]);
            counterWrite++;
        }

        for (int i = 0; i < counterWrite; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}


        /*
        Дана скобочная последовательность: [((())()(())]]
        - Можно ли считать эту последовательность правильной?
        - Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?
         Скобочная последовательность является не правильной, она должна быть такой:
         [[(())()(())]] либо такой [[((())()(()))]]
        */
