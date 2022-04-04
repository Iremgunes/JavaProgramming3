package utilities;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

    }

    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

//prints each decimal of double array in seperate lines
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each char of char array in seperate lines
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length -1];
    }

    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length -1];
    }

    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //check if the integer contain in the given array
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if(each.equalsIgnoreCase(element)){
                result = true;
            }
        }
        return result;
    }

    public static int frequencyOfElemet(int[] array, int element){

        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElemet(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElemet(char[] array, char element){

        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElemet(String[] array, String element){

        int count = 0;
        for (String each : array) {
            if(each.equalsIgnoreCase(element)){
                count++;
            }
        }
        return count;
    }

    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1 ];

        int i = 0;
        for (int each: array) {
            result[i] = each;
            i++;

        }

        result[i] = element;
        return result;

    }

    public static double[] addElement(double[] array, double element){

        double[] newArray = new double[array.length +1];

        int j = 0;
        for (double each : array) {
            newArray[j] = each;
            j++;
        }

        //newArray[newArray.length-1] = element;
        newArray[array.length] = element;

        return newArray;
    }

    public static String[] addElement(String[] array, String element){

        String[] newArray = new String[array.length +1];

        int i = 0;
        for (String each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[array.length] = element;

        return newArray;
    }

    public static char[] addElement(char[] array, char element){
        char[] newArray = new char[array.length +1];

        int i = 0;
        for (char each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[array.length] = element;

        return newArray;

    }

    public static int[] uniqueElements(int[]array){
        int[] result = {};

        for (int each : array) {

            if(ArraysUtility.frequencyOfElemet(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    public static double[] uniqueElements(double[]array){
        double[] result = {};

        for (double each : array) {

            if(ArraysUtility.frequencyOfElemet(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    public static char[] uniqueElements(char[]array){
        char[] result = {};

        for (char each : array) {

            if(ArraysUtility.frequencyOfElemet(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    public static String[] uniqueElements(String[]array){
        String[] result = {};

        for (String each : array) {

            if(ArraysUtility.frequencyOfElemet(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }

    public static int[] removeElement(int[] array, int index){
        int[] result = new int[array.length-1];

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int j = 0;
        for (int each : array) {
            if(each == array[index]){
                continue;
            }

            result[j++] = each;
        }

        return result;
    }

    public static double[] removeElement(double[] array, int index){
        double[] result = new double[array.length-1];

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int j = 0;
        for (double each : array) {
            if(each == array[index]){
                continue;
            }

            result[j++] = each;
        }

        return result;
    }

    public static char[] removeElement(char[] array, int index){
        char[] result = new char[array.length-1];

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int j = 0;
        for (char each : array) {
            if(each == array[index]){
                continue;
            }

            result[j++] = each;
        }

        return result;
    }

    public static String[] removeElement(String[] array, int index){
        String[] result = new String[array.length-1];

        if(index<0 || index> array.length-1){
            System.err.println("invalid index" + index);
            System.exit(0);
        }

        int j = 0;
        for (String each : array) {
            if(each.equalsIgnoreCase( array[index])){
                continue;
            }

            result[j++] = each;
        }

        return result;
    }

    public static int[] merge(int[] array1, int[] array2){
        int[] newArray = new int[array1.length + array2.length];

        int i = 0;
        for (int each : array1) {
            newArray[i] = each;
            i++;
        }

        for (int each : array2 ) {
            newArray[i] = each;
            i++;
        }

        return newArray;

        }

    public static double[] merge(double[] array1, double[] array2){
        double[] newArray = new double[array1.length + array2.length];

        int i = 0;
        for (double each : array1) {
            newArray[i] = each;
            i++;
        }

        for (double each: array2) {
            newArray[i] = each;
            i++;
        }

        return newArray;


    }

    public static char[] merge(char[] array1, char[] array2){
        char[] newArray = new char[array1.length + array2.length];

        int i = 0;
        for (char each : array1) {
            newArray[i] = each;
            i++;
        }

        for (char each : array2 ) {
            newArray[i] = each;
            i++;
        }

        return newArray;

    }

    public static String[] merge(String[] array1, String[] array2){
        String[] newArray = new String[array1.length + array2.length];

        int i = 0;
        for (String each : array1) {
            newArray[i] = each;
            i++;
        }

        for (String each : array2 ) {
            newArray[i] = each;
            i++;
        }

        return newArray;

    }

    //reverse the given array returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {

            result[j] = array[i];

        }
        return result;

    }

    public static double[] reverse(double[] array){
        double[] result = new double[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {

            result[j] = array[i];

        }
        return result;

    }

    public static char[] reverse(char[] array){
        char[] result = new char[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {

            result[j] = array[i];

        }
        return result;

    }

    public static String[] reverse(String[] array){
        String[] result = new String[array.length];

        for (int i = 0, j = array.length-1; i < array.length ; i++, j--) {

            result[j] = array[i];

        }
        return result;

    }

// replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index<0 || index >= array.length){
            System.out.println("invalid index" + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }

    // replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index<0 || index >= array.length){
            System.out.println("invalid index" + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }

    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index<0 || index >= array.length){
            System.out.println("invalid index" + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }

    // replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index<0 || index >= array.length){
            System.out.println("invalid index" + index);
            System.exit(0);
        }

        array[index] = newElement;

        return array;

    }

    // replace all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }

        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }

        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }

        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement){

        for (int i = 0; i < array.length; i++) {

            if(array[i].equalsIgnoreCase(oldElement)){
                array[i] = newElement;
            }
        }

        return array;
    }

    //remove the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};

        for (int each:array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    public static double[] removeDuplicates(double[] array){

        double[] result = {};

        for (double each:array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    public static char[] removeDuplicates(char[] array){

        char[] result = {};

        for (char each:array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    public static String[] removeDuplicates(String[] array){

        String[] result = {};

        for (String each:array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

}
