import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 시험 본 과목의 개수
        int[] arr = new int[N];     // arr 배열로 저장

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();   // Scanner에서 입력한 정수를 arr에 저장
        }

        Arrays.sort(arr);           // 오름차순 정렬(큰 정수가 마지막에 배치)
        int maxNum = arr[N-1];      // arr 배열의 마지막에 있는 정수를 maxNum으로 지정
        double sum = 0;             // 평균을 구하기 때문에 소수점이 나올 수 있음

        for (int i = 0; i < N; i++) {
            sum += (double) arr[i] / maxNum * 100;
            }

        System.out.println(sum / N);
    }
}
