import Files.CustomHashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        CustomHashMap customHashMap = new CustomHashMap<String,Integer>();


        customHashMap.put("hello",10);
        Integer value = (Integer) customHashMap.get("hello");
        System.out.println("value:" +value);
        customHashMap.put("helLO",20);
        value = (Integer) customHashMap.get("hello");
        System.out.println("value:" +value);
    }
}