package curriculum_B;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // Q1
        int[] cart = {1, 2, 3, 4, 5};
        for (int i = 0; i < cart.length; i++) {
            System.out.println(cart[i]);
        }

        // Q2
        int[] cart2 = {10, 20, 30, 40, 50};
        for (int i = cart2.length - 1; i >= 0; i--) {
            System.out.println(cart2[i]);
        }

        // Q3
        int[] nums1 = {3, 5, 7, 9, 11};
        int sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            sum += nums1[i];
        }
        System.out.println("合計：" + sum);

        // Q4
        int[] nums2 = {12, 7, 9, 21, 5, 18};
        int max = nums2[0];
        int min = nums2[0];
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] > max) {
                max = nums2[i];
            }
            if (nums2[i] < min) {
                min = nums2[i];
            }
        }
        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);

        // Q5
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num * 2);
        }

        // Q6
        int[] list = {4, 7, 10, 15, 20};

        Scanner scanner = new Scanner(System.in);
        System.out.print("数字を入力してください: ");
        int input = scanner.nextInt();

        boolean found = false;
        for (int num2 : list) {
            if (num2 == input) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(input + " は配列に含まれています");
        } else {
            System.out.println(input + " は配列に含まれていません");
        }

        scanner.close();

        // Q7
        int[][] array1 = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < array1.length; i++) {            // 行
            for (int j = 0; j < array1[i].length; j++) {     // 列
                System.out.println(array1[i][j]);
            }
        }

        // Q8
        int[][] array2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {            // 行
            for (int j = 0; j < array2[i].length; j++) {     // 列
                sum2 += array2[i][j];
            }
        }
        System.out.println("合計値：" + sum2);
        
        
        // Q9
        int[][] array3 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};

        int max2 = array3[0][0];  // 最大値の初期値
        int min2 = array3[0][0];  // 最小値の初期値

        for (int i = 0; i < array3.length; i++) {            // 行
            for (int j = 0; j < array3[i].length; j++) {     // 列
                if (array3[i][j] > max2) {
                    max2 = array3[i][j];
                }
                if (array3[i][j] < min2) {
                    min2 = array3[i][j];
                }
            }
        }

        System.out.println("最大値：" + max2);
        System.out.println("最小値：" + min2);

        //Q10
        int[][][] array = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };

        for (int i = 0; i < array.length; i++) {               
            for (int j = 0; j < array[i].length; j++) {        
                for (int k = 0; k < array[i][j].length; k++) { 
                    System.out.println(array[i][j][k]);
                }
            }
        }
        
    }
}

             
         
      
