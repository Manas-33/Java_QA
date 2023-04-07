package f4.BST;

import java.util.*;
import java.util.stream.Collectors;

public class CPUScheduling {

    static class Process {
        Integer at;
        Integer bt;
        public Process(int at,int bt){
            this.at=at;
            this.bt=bt;
        }
         public String toString() {
             return this.at + ", "+ this.bt;
         }
    }
    static class SortProcessByAT implements Comparator<Process>{
         @Override
        public int compare(Process p1,Process p2){
             return p1.at-p2.at;
         }
    }

    public static void main( String[] args) {
//        Scanner s= new Scanner(System.in);
//        System.out.print("No. of processes: ");
//        int n=s.nextInt();
//        int []processID=new int[n];
//
//        for (int i = 0; i < processID.length; i++) {
//            System.out.println("Enter Burst Time of Process P"+(i+1)+" ");
//            processID[i]=s.nextInt();
//        }
//        int[]wt=new int[processID.length];
//
//        wt[0]=0;
//        for (int i = 1,j=0; i < wt.length; i++,j++) {
//            wt[i]=wt[i-1]+processID[j];
//
//        }
//        for (int i = 0; i < wt.length; i++) {
//            System.out.println("Waiting Time for P"+(i+1));
//            System.out.println(wt[i]+" ");
//        }
//        double sum=0;
//        for (int i = 0; i < wt.length; i++) {
//            sum+=wt[i];
//        }
//        System.out.println("Average Waiting Time is "+(sum/wt.length));
//        System.out.println();
//
//        double atat=0;
//        for (int i = 0; i < wt.length; i++) {
//            System.out.println("Turnaround Time for P"+(i+1));
//            atat+=wt[i]+processID[i];
//            System.out.println((wt[i]+processID[i])+" ");
//        }
//        System.out.println("Average Turnaround Time is "+(atat/wt.length));//        System.out.println(Arrays.toString(p));
////        Arrays.stream(p).sorted((a, b)-> a.at.compareTo(b.at)).collect();

        Process[] p={
                new Process(3,4),
                new Process(5,3),
                new Process(0,2),
                new Process(5,1),
                new Process(4,3)
        };

        Arrays.sort(p,new SortProcessByAT());
        int[] waitingTime=new int[p.length];

        int currentTime=0;

        for (int i = 0; i < p.length; i++) {

            if(i==0){
                waitingTime[i]=0;
                currentTime+=p[i].bt;
//            }else if(){

            }

        }






    }
}
