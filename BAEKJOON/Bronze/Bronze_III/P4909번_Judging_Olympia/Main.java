package BAEKJOON.Bronze.Bronze_III.P4909번_Judging_Olympia;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        while (true) {
            int[] s = Arrays.stream(c.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            if (s[5] == 0)
                break;
            double a = Arrays.stream(s).skip(1).limit(4).average().orElse(0);
            System.out.println((int) a == a ? (int) a + "" : a);
        }
    }
}
