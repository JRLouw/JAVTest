package JavEx1;

public class Q7StringClass {

    public static void main(String []args ) {

        String str1= "I don’t like programming";
        String str2= "its better to go home";


        System.out.println("The index of k:" +" "+ str1.indexOf("k"));
        System.out.println("The index of g:" +" "+ str2.indexOf("g"));
        System.out.println(str1.concat(str2));
        System.out.println("The substring (better) :" +" "+ str2.substring(3,10));
        System.out.println("str2 to upper case :" +" "+ str1.toUpperCase());
        System.out.println("The index of the letter 'o' in programming :" +" "+
                str2.indexOf("o", 1));



    }
}

