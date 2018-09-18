import java.util.*;
/*Fantastic! For loops will be useful when reading and manipulating Java data structures. Let's talk about a few data structures that are built into Java. The first data structure we will explore is called the ArrayList.

The ArrayList stores a list of data of a specified type. Let's go through an example of how to create, or declare, an ArrayList of type Integer.
*/
/*ArrayList<Integer> quizGrades = new ArrayList<Integer>();*/
/* ArrayList is a pre-defined Java class. To use it, we must first create an ArrayList object.

In the example above, we create an ArrayList object called quizGrades that will store data types belonging to the <Integer> class (whole numbers).

*/


public class Olympics {

    public static void main(String[] args) {

        //Some Olympic sports

        ArrayList<String> olympicSports = new ArrayList<String>();
        olympicSports.add("Archery");
        olympicSports.add("Boxing");
        olympicSports.add("Cricket");
        olympicSports.add("Diving");

        System.out.println("There are " + olympicSports.size() + " Olympic sports in this list. They are: ");

        for (String sport: olympicSports) {
            System.out.println(sport);
        }

        //Host cities and the year they hosted the summer Olympics

        HashMap<String, Integer> hostCities = new HashMap<String, Integer>();

        hostCities.put("Beijing", 2008);
        hostCities.put("London", 2012);
        hostCities.put("Rio de Janeiro", 2016);

        for (String city: hostCities.keySet()) {

            if (hostCities.get(city) < 2016) {

                System.out.println(city + " hosted the summer Olympics in " + hostCities.get(city) + ".");

            } else {

                System.out.println(city + " will host the summer Olympics in " + hostCities.get(city) + ".");

            }
        }

    }

}