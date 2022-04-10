package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,k,a[],ptr,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter element do u want to enter:");
        n=sc.nextInt();
        a=new int[n];
        System.out.print("enter element:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(k=0;k<n-i-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
        }
	for(int i=0;i<n;i++)
        System.out.println("enter element are:"+a[i]);

    }
}
