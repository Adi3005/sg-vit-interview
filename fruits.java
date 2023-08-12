/*Aditya K Iyer*/

import java.util.*;

class Fruits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.next();
            if(!hm.containsKey(s))
                hm.put(s,1);
            else
                hm.put(s,hm.get(s)+1);    
        }

        for(String s: hm.entrySet())
            System.out.println(s + " " + hm.get(s));

    }
}
