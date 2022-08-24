import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.StringBuilder;

public class Assignment2to5 {
//Assignment 2
    public static List<Integer> rightDigit(List<Integer> inputList){
        List<Integer> outputList = new ArrayList<Integer>();
        for(Integer a: inputList){
            String s = a.toString();
            Character c = s.charAt(s.length()-1);
            outputList.add(Character.getNumericValue(c));
        }
        return outputList;

    }
//Assignment 3
    public static List<Integer> doubling(List<Integer> inputList){
        List<Integer> outputList = new ArrayList<Integer>();
        for(Integer a: inputList){
            
            outputList.add(a*2);
        }
        return outputList;

    }
//Assignment 4
    public static List<String> noX(List<String> inputList){
        List<String> outputList = new ArrayList<String>();
        for(String a: inputList){
            StringBuilder toAdd = new StringBuilder();
            char[] eachChar = a.toCharArray();
            for(char b:eachChar){
                if(b != 'x' && b != 'X'){
                    toAdd.append(b);
                }
            }
            outputList.add(toAdd.toString());
        }
            return outputList;
    }
    
//Assignment 5
   public static boolean groupSumClump(int numberPassed, List<Integer> numbers, int total ){


        //check if consecutive numbers
        int previousNumber = numbers.get(numberPassed);
        int numberConsec = 1;
        for(int i = numberPassed; i<numbers.size()-1;i++){
            if(i == numberPassed){
                continue;
            }
            if(previousNumber ==numbers.get(i)){
                numberConsec++;
            }
            else{
                break;
            }
        }
        //base cases
        if(total == 0){
            return true;
        }
        if (numbers.size() - numberPassed*numberConsec == 1)
             if(numbers.get(numberPassed) == total)
                 return true;
             else
                 return false;
        //recursive cases  
        boolean test1 = groupSumClump(numberPassed + numberConsec, numbers, total - numbers.get(numberPassed)*numberConsec);
            
        boolean test2 = groupSumClump(numberPassed + numberConsec, numbers, total);
            
        if(test1 || test2){
            return true;
        }
        else{
            return false;
        }

    }


    public static void main(String[] args){
        Random ranint = new Random();
        //create list of integers for assignments 2, 3 and 5
        List<Integer> testList = new ArrayList<Integer>();
        for(int i=0; i < 10; i++){
            testList.add(ranint.nextInt(100));
        }
        List<String> testStringList = new ArrayList<String>();
        testStringList.add("xxasd");
        testStringList.add("Xsard");
        testStringList.add("x");

        System.out.println(testList);
        System.out.println(rightDigit(testList)); //assignment 2 test
        System.out.println(doubling(testList)); //assignment 3 test
        int sum = ranint.nextInt(10,20);
        System.out.printf("The goal sum is %d%n", sum);
        System.out.println(groupSumClump(0,rightDigit(testList),sum));//assignment 5 test
        List<Integer> failureList = new ArrayList<Integer>(); //creating a sure-fire fail for assignment 5
        failureList.add(1);
        failureList.add(1);
        failureList.add(3);
        System.out.println("Testing failure condition");
        System.out.println(groupSumClump(0,failureList,9));
        System.out.println(noX(testStringList));//assignment 4 test


    }

    
}
