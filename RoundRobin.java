/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fanta_000
 */
public class RoundRobin {
    int id,bt;
Process()
{
Scanner src=new Scanner(System.in);
System.out.println("Enter ID,BT: ");
id=src.nextInt();
bt=src.nextInt();
}
}

class RoundRobin
{ 
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
int sum=0;
System.out.println("Enter number of processes: ");
int n=src.nextInt();
Process p[]=new Process[n];
for(int i=0;i p[i]=new Process();
System.out.println("Enter Time slice: ");
int ts=src.nextInt();
int count[]=new int[n];
int dup[]=new int[n];
for(int i=0;i{
dup[i]=count[i]=p[i].bt;
while(dup[i]>0)
{
dup[i]=dup[i]-ts;
sum++;
}
}
int k=1;
for(int i=0;i<=sum;i++)
{
if(count[k%n]>0)
{
System.out.print("P"+((k%n))+" ");
count[k%n]=count[k%n]-ts;
k=(k+1)%n;
}
if(count[k%n]<=0)
k++;
}
}

    
}
