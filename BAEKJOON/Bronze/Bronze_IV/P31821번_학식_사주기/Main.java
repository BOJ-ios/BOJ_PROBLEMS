package P31821번_학식_사주기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] prices = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            int menu = Integer.parseInt(br.readLine());
            sum += prices[menu];
        }
        System.out.println(sum);
    }
}