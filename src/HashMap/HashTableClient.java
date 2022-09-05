package HashMap;

public class HashTableClient {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        HashTable<String, Integer> map = new HashTable<>(4);
        map.put("Amsterdam", 200);
        map.put("Royal Albert Hall", 175);
        map.put("Indira Gandhi Arena", 300);
        map.put("The Dome at America's Center", 350);

        // map.display();

        map.put("China", 350);
        // map.display();
        // map.display();

        // map.display();

        map.put("Sweden", 100);
        // map.display();

        map.put("Nepal", 50);
        map.display();
        map.put("Ireland", 75);
        map.display();

        // System.out.println("***********************Get**************************");
        // System.out.println(map.get("India"));
        // System.out.println(map.get("Sweden"));
        // System.out.println(map.get("RSA"));
        //
        // System.out.println("*******************Remove****************************");
        // System.out.println(map.remove("India"));
        // map.display();

    }

}