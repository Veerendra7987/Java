class first{
    public static void main(String[] args) {
     int no=145;
     int no1=no;
     int single=0;
     int sum=0;
     while(no!=0)
     {
       single=no%10;
       for(int i=single-1;i>0;i--)
       {
          single=single*i;
       }
       sum+=single;
       no/=10;
     }
     if(sum==no1)
     System.out.println("YES it is a Strong Number");
     else
     System.out.println("It is not a strong Number");
    } 
}
