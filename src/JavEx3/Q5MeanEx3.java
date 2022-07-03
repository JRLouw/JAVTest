package JavEx3;

public class Q5MeanEx3 {
    public static void main (String args[]) {

        int i, sum=0;
        double mean;

        for( i = 1;i<=50;i++) {
            sum = sum + i;

        }

        System.out.println(sum);

        mean= sum/50;

        System.out.println(mean);


    }
}

