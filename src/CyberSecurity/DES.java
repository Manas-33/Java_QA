package CyberSecurity;
import java.util.Scanner;
public class DES {
    int[] p10 = {3,5,2,7,4,10,1,9,8,6};
    int[] p8 = {6,3,7,4,8,5,10,9};
    int[] p4 = {2,4,3,1};
    int[] ep = {4,1,2,3,2,3,4,1};
    int[] ip = {2,6,3,1,4,8,5,7};
    int[] ipInv = {4,1,3,5,7,2,8,6};
    int[][] s0 = {{1,0,3,2},{3,2,1,0},{0,2,1,3},{3,1,3,2}};
    int[][] s1 = {{0,1,2,3},{2,0,1,3},{3,0,1,0},{2,1,0,3}};
    public int[] shift1 (int[] temp){
        int t1 = temp[0];
        for (int i = 0; i < 5; i++) {
            temp[i]=temp[i+1];
        }
        temp[4] = t1;
        int t2 = temp[5];
        for (int i = 5; i < 9; i++) {
            temp[i]=temp[i+1];
        }
        temp[9] = t2;
        return temp;
    }

    public int[][] keyGeneration(int[] key10){
        int[][] keys =new int[2][8];
        int[] temp = new int[10];

        for (int i = 0; i < p10.length; i++) {
            int index = p10[i];
            temp[i]= key10[index-1];
        }

        temp= shift1(temp);

        int[] key1 = new int[8];
        for (int i = 0; i < p8.length; i++) {
            int index = p8[i];
            key1[i]= temp[index-1];
        }

        temp= shift1(temp);
        temp= shift1(temp);

        int[] key2 = new int[8];
        for (int i = 0; i < p8.length; i++) {
            int index = p8[i];
            key2[i]= temp[index-1];
        }
        keys[0] = key1;
        keys[1] = key2;
        return keys;
    }

    String binary_(int val) {
        if (val == 0)
            return "00";
        else if (val == 1)
            return "01";
        else if (val == 2)
            return "10";
        else
            return "11";
    }

    int binaryToDecimal_(String val) {
        if (val.equals("00"))
            return 0;
        else if (val.equals("01"))
            return 1;
        else if (val.equals("10"))
            return 2;
        else
            return 3;
    }

    public int[] fk(int[]key,int[] input){
        int[] expand = new int [8];
        for (int i = 0; i < ep.length; i++) {
            int index = ep[i];
            expand[i] = input[index-1+4];
        }
        for (int i = 0; i < 8; i++) {
            expand[i] ^= key[i];
        }
        int[] beforeP4 = new int [4];

        String row = Integer.toString(expand[0])+Integer.toString(expand[3]);
        String col = Integer.toString(expand[1])+Integer.toString(expand[2]);
        int r1 = binaryToDecimal_(row);
        int c1 = binaryToDecimal_(col);
        int s = s0[r1][c1];
        String b1 = binary_(s);
        beforeP4[0] = Integer.parseInt(String.valueOf(b1.charAt(0)));
        beforeP4[1] = Integer.parseInt(String.valueOf(b1.charAt(1)));
        row = Integer.toString(expand[4])+Integer.toString(expand[7]);
        col = Integer.toString(expand[5])+Integer.toString(expand[6]);
        r1 = binaryToDecimal_(row);
        c1 = binaryToDecimal_(col);
        s = s1[r1][c1];
        String b2 = binary_(s);
        beforeP4[2] = Integer.parseInt(String.valueOf(b2.charAt(0)));
        beforeP4[3] = Integer.parseInt(String.valueOf(b2.charAt(1)));

        int[] afterP4=new int [4];
        for (int i = 0; i < p4.length; i++) {
            int index = p4[i];
            afterP4[i] = beforeP4[index-1];
        }
        for (int i = 0; i < 4; i++) {
            input[i] ^= afterP4[i];
        }
        return input;
    }

    public int[] cipherGeneration(int[] plainText,int[]key1,int[] key2){
        int[] temp = new int[8];
        for (int i = 0; i < ip.length; i++) {
            int index = ip[i];
            temp[i] = plainText[index-1];
        }
        int[] fk1=  fk(key1, temp);

        for (int i = 0; i < 4; i++) {
            int var = fk1[i];
            fk1[i] = fk1[4+i];
            fk1[4+i] = var;
        }
        int[] fk2 = fk(key2,fk1);
        int[] cipher = new int[8];
        for (int i = 0; i < ipInv.length; i++) {
            int index = ipInv[i];
            cipher[i] = fk2[index-1];
        }
        return cipher;
    }
}
class Main{
    public static void main(String[] args) {
//        int[] key10Bit = new int[10];
//        int[] p = new int[8];
//        Scanner s  = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            key10Bit[i]=s.nextInt();
//        }
//        for (int i = 0; i < 8; i++) {
//            p[i]=s.nextInt();
//        }
//        1010000010
//        01000001
        int[] key10Bit = {1,0,1,0,0,0,0,0,1,0};
        int[] p = {0,1,0,0,0,0,0,1};
        DES d = new DES();
        int[][] keys= d.keyGeneration(key10Bit);
        for (int i = 0; i < keys.length; i++) {
            System.out.print("Key "+(i+1)+" : ");
            for (int j = 0; j < keys[0].length; j++) {
                System.out.print(keys[i][j]+" ");
            }
            System.out.println();
        }
        int [] cipherText = d.cipherGeneration(p,keys[0],keys[1]);
        System.out.println("The cipher text is : ");
        for (int i = 0; i < cipherText.length; i++) {
            System.out.print(cipherText[i]+" ");
        }
        System.out.println();
        int[] plainText = d.cipherGeneration(cipherText,keys[1],keys[0]);
        System.out.println("The plain text is : ");
        for (int i = 0; i < plainText.length; i++) {
            System.out.print(plainText[i]+" ");
}
}
}
