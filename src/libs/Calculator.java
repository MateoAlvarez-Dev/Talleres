package libs;

import java.util.ArrayList;
import java.lang.Math;

public class Calculator{
    public static String[] clearString(String[] arr){
        ArrayList<String> result = new ArrayList<String>();

        for (String c : arr) {
            if(!c.equals("E")){
                result.add(c);
            }
        }

        String[] resultArray = new String[result.size()];

        for (int i = 0; i < result.size(); i++) resultArray[i] = result.get(i);

        return resultArray;
    }

    public static double calc(String op){
        String[] splittedOp = op.split("");
        String finalResult = "";
        int mainIter = 0;
        double result = 0;
        boolean isSum = true;

        while(mainIter < splittedOp.length){
            int indexOfDivision = Calculator.arrIndexOf("/", splittedOp);
            int indexOfMultiplication = Calculator.arrIndexOf("*", splittedOp);

            if(indexOfDivision > -1){
                double firstN = Double.parseDouble(splittedOp[indexOfDivision - 1]);
                double secondN = Double.parseDouble(splittedOp[indexOfDivision + 1]);

                splittedOp[indexOfDivision - 1] = "E";
                splittedOp[indexOfDivision + 1] = "E";
                splittedOp[indexOfDivision] = Double.toString(firstN / secondN);
                splittedOp = clearString(splittedOp);
                continue;
            }

            else if(indexOfMultiplication > -1){
                double firstN = Double.parseDouble(splittedOp[indexOfMultiplication - 1]);
                double secondN = Double.parseDouble(splittedOp[indexOfMultiplication + 1]);

                splittedOp[indexOfMultiplication - 1] = "E";
                splittedOp[indexOfMultiplication + 1] = "E";
                splittedOp[indexOfMultiplication] = Double.toString(firstN * secondN);
                splittedOp = clearString(splittedOp);
                continue;
            }

            mainIter += 1;
        }

        for(String c : splittedOp){
            //finalResult += c;

            if(c.equals("-")) {
                isSum = false;
                continue;
            }
            else if(c.equals("+")){
                isSum = true;
                continue;
            };

            double numToSum = Double.parseDouble(c);

            if(isSum) result += numToSum;
            else result -= numToSum;
        }

        return result;
    }

    public static int arrIndexOf(String c, String[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(c)){
                return i;
            }
        }
        return -1;
    }
}