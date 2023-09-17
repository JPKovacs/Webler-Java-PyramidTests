package com.csaba79coder.task;

public class ReversePyramid {
    public String createPyramidFull(int rows) {
        int frame1 = 1;
        int frame2 = rows*2-1;
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= frame2; j++) {
                if (j >= frame1 && j <= frame2) {
                    result = result + "*";
                } else {
                    result = result + " ";
                }
            }
            frame1++;
            frame2--;
            result = result + "\n";
        }
        System.out.println(result);
        return result;
    }
}


