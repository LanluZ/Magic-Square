package rule;

public class exchange {
    public static int[][] InOut(int[] a) {
        int[][] b;
        switch (a.length) {
            case 9 -> {
                b = new int[3][3];
                for (int i = 0, j = 0, index = 0; i < 3; j++, index++) {
                    if (j == 3) {
                        i++;
                        j = 0;
                    }
                    if (i == 3) break;
                    b[i][j] = a[index];
                }
                return b;
            }
            case 16 -> {
                b = new int[4][4];
                for (int i = 0, j = 0, index = 0; i < 4; j++, index++) {
                    if (j == 4) {
                        i++;
                        j = 0;
                    }
                    if (i == 4) break;
                    b[i][j] = a[index];
                }
                return b;
            }
        }
        return null;
    }

    //镜像
    private static int[][] Mirror(int[][] a) {
        int cache;
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a[0].length/2;y++){
                //保存左边的
                cache=a[x][y];
                //把右边的换到左边
                int ry=a[0].length-1-y;
                a[x][y]=a[x][ry];
                //把左边的换到右边
                a[x][ry]=cache;
            }
        }
        return a;
    }

    //旋转
    public static int[][] Rotate(int[][] b) {
        int[][] temp = new int[b[0].length][b.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                temp[i][j]=b[b[i].length-j-1][i];
            }
        }
        return temp;
    }

    //打印
    public static void C_Print(int[][] a) {
        //镜像
        for (int mirror = 0; mirror<2; mirror++) {
            //旋转
            for (int rotate = 0; rotate < 4; rotate++) {
                //打印
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        System.out.print(a[i][j] + "\t");
                    System.out.println();
                }
                System.out.println("---------");

                //开始旋转
                a = Rotate(a);
            }

            //开始镜像
            a = Mirror(a);
        }
    }
}