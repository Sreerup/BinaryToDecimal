import java.util.*;

public class BiToDeci {
    public static void main(String agrs[]) {
        String no;
        int n=0,c=0,count=1,rem,pos=0,i,n2=0;
        double sum1=0,sum2=0,val=0,num=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextDouble();
        val=num;
        no=Double.toString(num);                                                //storing original value in another variable
        n=(int)num;                                                             //considering only integer part
        while(n>0) {                                                            //loop for calculating binary value only for integral part
            rem=n%10;
            sum1=sum1+(rem*(Math.pow(2,c)));
            n=n/10;
            c++;
        }
        for(i=0; i<=(no.length()-1); i++) {
            if(no.charAt(i)=='.'){
                pos=i;
                break;
            }
        }
        StringBuilder sb= new StringBuilder(no.substring(pos+1, no.length()));
        n2=Integer.parseInt((sb.reverse()).toString());
        while(n2>0) {                                                           //loop for calculating binary value only for fractional part
            rem=(int)(n2%10);
            sum2=sum2+(rem*(1/(Math.pow(2,count))));
            n2=n2/10;
            count++;
        }
        System.out.println("Decimal conversion of "+val+" is "+(sum1+sum2));    //adding integral and fractional part
    }
}
