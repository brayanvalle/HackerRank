/*
https://www.hackerrank.com/challenges/xoring-ninja


*/

import java.math.BigInteger;
import java.util.*;
public class Solution {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
        BigInteger res=new BigInteger("0");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        	res=res.or(sc.nextBigInteger());
        }  
        BigInteger b=new BigInteger("2");
        System.out.println((b.pow(n-1).multiply(res)).mod(new BigInteger("1000000007")));
  }}
}