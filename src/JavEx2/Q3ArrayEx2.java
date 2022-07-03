package JavEx2;

public class Q3ArrayEx2 {
    public static void main(String[] args) {
        String province[] = new String[7];

        province[0] = "Gauteng";
        province[1] = "Limpopo";
        province[2] = "Mpumalanga";
        province[3] = "Western Cape";
        province[4] = "Eastern Cape";
        province[5] = "Freestate";
        province[6] = "Kwazulu Natal";

        int r=0;

        do

        {

            System.out.println(province[r]);

            r++;

        }while (r<province.length);




    }
}

