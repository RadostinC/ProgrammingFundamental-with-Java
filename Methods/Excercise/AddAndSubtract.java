package Methods.Excercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int third = Integer.parseInt(scanner.nextLine());

    }

    public static int Add(int first, int second, int third) {


         int AddSum = first + second;
        int subtractSum=AddSum-third;

        System.out.println(subtractSum);
        return subtractSum;

    }

}



