//package CyberSecurity;
//import java.util.HashMap;
//
//public class AES {
//    int[] rcon1 = {1,0,0,0,0,0,0,0};
//    int[] rcon2 = {0,0,1,1,0,0,0,0};
//    int[][] sBox = {{9,4,10,11},{13,1,8,5},{6,2,0,3},{12,14,15,7}};
//
//    public void sboxValue(int[] rowCol){
//        HashMap<int[], int[]> hashMap = new HashMap<>();
//        hashMap.put(new int[]{0, 0, 0, 0}, new int[]{1,0,0,1});
//        hashMap.put(new int[]{0, 0, 0, 1}, new int[]{0,1,0,0});
//        hashMap.put(new int[]{0, 0, 1, 0}, new int[]{1,0,1,0});
//        hashMap.put(new int[]{0, 0, 1, 1}, new int[]{1,0,1,1});
//
//        hashMap.put(new int[]{0, 1, 0, 0}, new int[]{1,1,0,1});
//        hashMap.put(new int[]{0, 1, 0, 1}, new int[]{0,0,0,1});
//        hashMap.put(new int[]{0, 1, 1, 0}, new int[]{1,0,0,0});
//        hashMap.put(new int[]{0, 1, 1, 1}, new int[]{0,1,0,1});
//
//        hashMap.put(new int[]{1, 0, 0, 0}, new int[]{0,1,1,0});
//        hashMap.put(new int[]{1, 0, 0, 1}, new int[]{0,0,1,0});
//        hashMap.put(new int[]{1, 0, 1, 0}, new int[]{0,0,0,0});
//        hashMap.put(new int[]{1, 0, 1, 1}, new int[]{0,0,1,1});
//
//        hashMap.put(new int[]{1, 1, 0, 0}, new int[]{1,1,0,0});
//        hashMap.put(new int[]{1, 1, 0, 1}, new int[] 1,1,1,0});
//        hashMap.put(new int[]{1, 1, 1, 0}, new int[]{1,1,1,1});
//        hashMap.put(new int[]{1, 1, 1, 1}, new int[]{0,1,1,1});
//    }
//    public int[] subNibRotNib(int[] input){
//        int[] temp = new int[4];
//        System.arraycopy(input, 0, temp, 0, 4);
//        System.arraycopy(input, 4, input, 0, 4);
//        System.arraycopy(temp, 0, input, 4, 4);
//
//
//        return temp;
//    }
//
//    public int[][] keyGeneration(int[] key){
//        int[][] result = new int[3][16];
//        int[] w0 = new int[8];
//        int[] w1 = new int[8];
//        for (int i = 0; i < 8; i++) {
//            w0[i] = key[i];
//        }
//        for (int i = 8; i < 16; i++) {
//            w1[i-8] = key[i];
//        }
//        int[] w2 = new int[8];
//        int[] subRot2 = subNibRotNib(w1);
//        for (int i = 0; i < 8; i++) {
//            w2[i] = rcon1[i]^w0[i]^subRot2[i];
//        }
//        int[] w3 = new int[8];
//        for (int i = 0; i < w3.length; i++) {
//            w3[i] = w2[i]^w1[i];
//        }
//        int[] w4 = new int[8];
//        int[] subRot4 = subNibRotNib(w3);
//        for (int i = 0; i < 8; i++) {
//            w2[i] = rcon2[i]^w2[i]^subRot4[i];
//        }
//        int[] w5 = new int[8];
//        for (int i = 0; i < 8; i++) {
//            w5[i] = w3[i]^w4[i];
//        }
//        int[] key0 = new int[16];
//        System.arraycopy(w0, 0, key0, 0, 8);
//        System.arraycopy(w1, 0, key0, 8, 8);
//        int[] key1 = new int[16];
//        System.arraycopy(w2, 0, key1, 0, 8);
//        System.arraycopy(w3, 0, key1, 8, 8);
//        int[] key2 = new int[16];
//        System.arraycopy(w4, 0, key2, 0, 8);
//        System.arraycopy(w5, 0, key2, 8, 8);
//        result[0] = key0;
//        result[1] = key1;
//        result[2] = key2;
//        return result;
//    }
//}
//class RunClass{
//    public static void main(String[] args) {
//        int[] key16Bit = new int[16];
//        AES a = new AES();
////        int[][] keys = a.keyGeneration(key16Bit);
////        int[] p = {1,0,1,0,1,1,0,1};
////        a.subNibRotNib(p);
////
////        int[] p = new int[8];
////        Scanner s  = new Scanner(System.in);
////        for (int i = 0; i < 10; i++) {
////            key10Bit[i]=s.nextInt();
////        }
////        for (int i = 0; i < 8; i++) {
////            p[i]=s.nextInt();
////        }
////        int[] key10Bit = {0,0,1,0,0,1,0,1,1,1};
////        int[] p = {1,0,1,0,0,1,0,1};
////        DES d = new DES();
////        int[][] keys= d.keyGeneration(key10Bit);
////        for (int i = 0; i < keys.length; i++) {
////            System.out.print("Key "+(i+1)+" : ");
////            for (int j = 0; j < keys[0].length; j++) {
////                System.out.print(keys[i][j]+" ");
////            }
////            System.out.println();
////        }
////        int [] cipherText = d.cipherGeneration(p,keys[0],keys[1]);
////        System.out.println("The cipher text is : ");
////        for (int i = 0; i < cipherText.length; i++) {
////            System.out.print(cipherText[i]+" ");
////        }
////        System.out.println();
////        int[] plainText = d.cipherGeneration(cipherText,keys[1],keys[0]);
////        System.out.println("The plain text is : ");
////        for (int i = 0; i < plainText.length; i++) {
////            System.out.print(plainText[i]+" ");
//}
//}
//
