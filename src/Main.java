import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        задача - транспонировать матрицу
//
//
//        Матрица до
//        1 3 4
//        2 4 3
//        3 4 5
//
//        Матрица после:
//        1 2 3
//        3 4 4
//        4 3 5
//
//
//        Тех требования:
//        - Программа должна иметь дизайн с заменяемыми условиями ввода: консоль, файл
//                - Программа должна принимать только матрицу 3х3, в случае иного ввода должно выводиться сообщение об ошибке
//        - Программа должна завершаться посредсвие нажатия Ctrl+C в командной строке
//                - Программа должны быть написана в ООП расширяемом стиле, пример точек расширения,делать возможность производить
//                опрерации с матрицей, уметь принмать матрицы других размеров

        int i = 3;
        int j = 3;
        int massive [][] = new int [i][j];
        String input [] = new String[i*j];
        int inputInt [] = new int [i*j+1];
        Scanner scanner = new Scanner(System.in);
        printMenu (i,j);
        while (true){
        String choice = scanner.nextLine().toUpperCase();
        if(choice.equalsIgnoreCase("q")) {
            break;
        }
            if(choice.equalsIgnoreCase("file")) {
                System.out.println("File will be used");
                choice = IOFromFile.matpixFromFile();
            }
            input = choice.split("");
            inputInt = Transpose.stringToInt(input, (i*j));
            if (inputInt[i*j]==9){
                System.out.println("Incorrect amount of numbers, please, try again, enter " + (i*j) + " figures");
                continue;
            }
            massive = Transpose.intToMatrix (inputInt, i,j);
            Transpose.transpose(massive, i,j);
            break;
        }
    }
    private static void printMenu (int a, int b) {
        System.out.println("If you want to use data file enter word File");
        System.out.println("If you want to quit press Q");
        System.out.println("If you want to enter matrix for transposion please enter " + (a*b)+ " figures, any delimiters are allowed except ENTER");
    }
}
