package JavEx4;

import java.util.Hashtable;

public class Q2HarshEx4 {

        public static void main (String[] args) {
            Hashtable<String, String> hsh = new Hashtable<String,String>();
            hsh.put("Name1", "Thato");
            hsh.put("Name2", "Radha");
            hsh.put("Name3", "Rambuda");
            hsh.put("Name4", "Mark");
            hsh.put("Name5", "Keletso");
            hsh.put("Name6", "Tata");
            hsh.put("Name7", "Nkosi");


            for(String key : hsh.keySet()){
                System.out.println(hsh.get(key));
            }
        }
    }
