package org.indevlabs;

import java.util.Arrays;

public class TechnicalAssessment {
    public static Integer solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Arrays.sort(arr);

        for (int i = 1, j = 0; i < arr.length; i++, j++) {
            if (arr[i] - 1 != arr[j]) {
                return arr[i] - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 0, 1, 3, 2}) == 4);
        System.out.println(solution(new int[]{7, 9, 10, 11, 12}) == 8);
        System.out.println(solution(new int[]{-1, -5, -6}) == -2);
        System.out.println(solution(new int[]{-1, -2, -3}) == null);
        System.out.println(solution(new int[]{5}) == null);
        System.out.println(solution(new int[]{}) == null);
    }
}