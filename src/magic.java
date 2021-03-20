import rule.*;

import java.io.IOException;

class magic {
    public static void main(String[] args) throws IOException {

        System.out.print("1.2x2\n2.3x3\n3.4x4\n");
        int sel = System.in.read();
        //1
        //2
        //3
        switch (sel) {
            case 49 -> {
                int[] a = new int[4];
                int step = 0;
                magic_2x2.sort(a, step);
                System.out.print("\nThere is no 2x2!");
            }
            case 50 -> {
                int[] a = new int[9];
                int step = 0;
                magic_3x3.sort(a, step);
            }
            case 51 -> {
                int[] a = new int[16];
                int step = 0;
                magic_4x4.sort(a, step);
            }
        }
    }
}