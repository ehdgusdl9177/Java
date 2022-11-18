package ch06;

public class ArrayEx03 {
    public static void main(String[] args) {
        int[][] ages = {
                {20, 15, 33, 72},
                {12, 50},
                {57, 20},
                {27, 32, 89},
                {73, 17}
        };
        int sum = 0;

        for(int i = 0; i < ages.length; i++) {
            for(int j = 0; j < ages[i].length; j++) {
                System.out.println("score["+i+"]["+j+"]="+ages[i][j] + "\n");
            }
        }
        for(int[] tmp : ages) {
            for(int i : tmp) {
                sum += i;
            }
        }
        System.out.println("sum" + sum);
    }
}
