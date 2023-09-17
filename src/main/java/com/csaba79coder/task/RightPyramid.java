package com.csaba79coder.task;

public class RightPyramid {
    public String createPyramidFull(int rows) {
        int frame1 = rows;
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= frame1 - 1) {
                    result = result + " ";
                } else {
                    result = result + "*";
                }
            }
            frame1--;
            result = result + "\n";
        }
        System.out.println(result);
        return result;
    }
}


