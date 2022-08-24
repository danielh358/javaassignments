import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import java.util.Random;

public class Assignment1 {
    
    public static void main(String[] args) {
        //assignment 1 - Lambdas

        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("dog");
        words.add("fox");
        words.add("eel");
        words.add("wolf");
        words.add("sheep");
        words.add("cow");
        words.add("chicken");
        words.add("ant");
        //comparing descending length
        Comparator<String> wordlengthdesc = (s1, s2) -> (int) (s1.length() -s2.length() );

        Collections.sort(words, wordlengthdesc);

        System.out.println(words);

        //comparing ascending word length
        Comparator<String> wordlengthasc = (s1, s2) -> (int) (s2.length() -s1.length() );

        Collections.sort(words, wordlengthasc);

        System.out.println(words);

        //comparing first letter
        Comparator<String> wordfirstletter = (s1, s2) -> (int) (s1.charAt(0) - s2.charAt(0) );

        Collections.sort(words, wordfirstletter);

        System.out.println(words);

        Comparator<String> wordEFirst = (s1, s2) -> {
            if(s1.charAt(0)== 'e' && s2.charAt(0)== 'e'){
                return (int) (s1.charAt(0) - s2.charAt(0));
            }
            if(s1.charAt(0)== 'e' && s2.charAt(0) != 'e'){
                return-1;
            }
            if(s1.charAt(0)!= 'e' && s2.charAt(0)== 'e'){
                return 1;
            }
            else{
                return (int)(s1.charAt(0) - s2.charAt(0));

            }
        };

        Collections.sort(words, wordEFirst);

        System.out.println(words);

        Comparator<String> wordEfirsthelped = (s1, s2) -> efirst(s1,s2); //see below for method

        Collections.sort(words, wordEfirsthelped);

        System.out.println(words);


/*
 * Second part of the problem
 */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randint = new Random();
        StringBuilder answers = new StringBuilder();
        for(int i = 0; i <10; i ++){
            numbers.add(randint.nextInt(1000));
        }

        for(int current : numbers){
            if(current % 2 == 0){
                answers.append("e");
                answers.append(Integer.toString(current));
                answers.append(",");
            }
            else{
                answers.append("o");
                answers.append(Integer.toString(current));
                answers.append(",");
            }
        }
        String answer = answers.toString();
        System.out.println(answer);

/*
 * Third part of problem
 */
        List<String> thirdpart = Arrays.asList(
            new String("cat"),
            new String("dog"),
            new String("ant")
        );

        List<String> answer3 = thirdpart.stream()
                .filter(d -> d.length() == 3)
                .filter(d -> d.charAt(0)=='a')
                .collect(toList());
        System.out.println(answer3);


    
    }



    public static int efirst(String s1, String s2)
    {
        if(s1.charAt(0)== 'e' && s2.charAt(0)== 'e'){
            return (int) (s1.charAt(0) - s2.charAt(0));
        }
        if(s1.charAt(0)== 'e' && s2.charAt(0) != 'e'){
            return-1;
        }
        if(s1.charAt(0)!= 'e' && s2.charAt(0)== 'e'){
            return 1;
        }
        else{
            return (int)(s1.charAt(0) - s2.charAt(0));

        }
    }
}
