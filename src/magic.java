import rule.magic_3x3;
import rule.magic_4x4;
import java.io.IOException;

class magic {
    public static void main(String args[]) throws IOException {
        System.out.print("1.3x3\n2.4x4\n");
        int sel=System.in.read();

        switch(sel){
            //1
            case 49:{
                int a[] = new int[9];
                int step = 0;
                magic_3x3.sort(a, step);
                break;
            }
            //2
            case 50:{
                int a[] = new int[16];
                int step = 0;
                magic_4x4.sort(a, step);
                break;
            }
        }
    }
}