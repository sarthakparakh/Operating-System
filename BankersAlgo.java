
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fanta_000
 */
public class BankersAlgo {

/**
 * @param args the command line arguments

 

/**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 int n = Integer.parseInt(JOptionPane.showInputDialog("Number Of Process:"));
 int m = Integer.parseInt(JOptionPane.showInputDialog("Resource Type Number:"));
 
int available[] = new int[m];
 int max[][] = new int[n][m];
 int allocation[][] = new int[n][m];
 int need[][] = new int[n][m];
 String sequence = "";
 
for(int i = 0; i < m; i++)
 {
 available[i] = Integer.parseInt(JOptionPane.showInputDialog("Number Of Available Resource " + (i+1) + ":"));
 }
 
for(int i = 0; i < n; i++)
 {
 for(int j = 0; j < m; j++)
 {
 allocation[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Allocation P " + (i+1) + " for R " + (j+1) + ":"));
 
 }
 }
 for(int i = 0; i < n; i++)
 {
 for(int j = 0; j < m; j++)
 {
 
max[i][j] = Integer.parseInt(JOptionPane.showInputDialog("MAX P " + (i+1) + " for R " + (j+1) + ":"));
 need[i][j] = max[i][j] - allocation[i][j];
 }
 }
 int work[] = available;
 boolean finish[] = new boolean[n];
 
for(int i = 0; i < n; i++)
 {
 finish[i] = false;
 }
 
boolean check = true;
 while(check)
 {
 check = false;
 for(int i = 0; i < n; i++)
 {
 if(!finish[i])
 {
 int j;
 for(j = 0; j < m; j++)
 {
 if(need[i][j] > work[j])
 {
 break;
 }
 }
 
if(j == m)
 {
 for(j=0; j < m; j++)
 {
 work[j] = work[j] + allocation[i][j];
 }
 finish[i] = true;
 check = true;
 sequence += i + ", ";
 }
 }
 }
 }
 
int i;
 for(i = 0; i < n; i++)
 {
 if(!finish[i])
 break;
 }
 
if(i==n)
 {
 JOptionPane.showMessageDialog(null, "SAFE And Sequence is:"+(sequence));
 }
 else
 {
 JOptionPane.showMessageDialog(null, "DEAD LOCK");
 }
 }
}

