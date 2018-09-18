public class Temp {
    public static void main(String[] args) {
        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
        weeklyTemperatures.add(78);
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);

        System.out.println(weeklyTemperatures.get(1));

        weeklyTemperatures.add(2,111);
        for (int j=0 ; j < weeklyTemperatures.size(); j++){
            System.out.println(weeklyTemperatures.get(j));

        }

        for (Integer temperature : weeklyTemperatures){
            System.out.println(temperature);
        }
    }
}

/*
HashMap
        Great! Another useful built-in data structure in Java is the HashMap.

        Although the name of the data structure might not make sense to you immediately, think of it as a real-life dictionary. A dictionary contains a set of words and a definition for each word. A HashMap contains a set of keys and a value for each key.

        If we look up a word in a dictionary, we can get the definition. If you provide a HashMap with a key that exists, you can retrieve the value associated with the key.

        Declaring a HashMap is shown in the following example:

        HashMap<String, Integer> myFriends = new HashMap<String, Integer>();
        In the example above, we create a HashMap object called myFriends. The myFriends HashMap will store keys of String data types and values of type Integer.

        Note: the String object allows you to store multiple characters, such as a word in quotations (e.g. "Rats!").
        */