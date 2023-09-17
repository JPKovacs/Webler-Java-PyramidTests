package com.csaba79coder.task;

public class LeftPyramid {
    public String createPyramidFull(int rows) {
        int frame1 = 1;
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= frame1; j++) {
                result = result + "*";
            }
            frame1++;
            result = result + "\n";
        }
        System.out.println(result);
        return result;
    }
}


