package JavaBasics;

import java.util.*;

public class Main<T, I extends Number, S> {
    public static <T> void main(String[] args) {
        Main obj = new Main();//Creating object to apply methods on array
        ArrayList array = new ArrayList<T>(); // array list is of type Object in order to take generic types
        array.add(11.5);
        array.add(221.45);
        array.add(34.54);
        array.add(45.54);
        array.add(51.54);


        System.out.println("Array indexes "+(array));
        System.out.println("Min value of the array is "+obj.minValue(array));
        System.out.println("Max value of the array is "+obj.maxValue(array));
        System.out.println("Sum of two indexes is "+obj.suma(array,3,4));//being summed up through its method
        System.out.println("Product of two indexes is "+obj.product(array,3,4));//being summed up through its method

    }

    public  <T> T minValue(ArrayList a){ //passing parameter "a" of type arraylist
        Integer n = a.size(); //using arraylist method on "a" variable
        Collections.sort(a); // sorts out the array
        T min = (T) a.get(0); //storing a.get result on returnable min variable
        return min;
    }
    public  <T> T maxValue(ArrayList a){
        Integer n = a.size(); // using arraylist method on "a" variable and storing it on Integer variable
        Collections.sort(a);// sorts out the array moving up the max value to the last position
        //Collections.sort(a);
        T max = (T) a.get(n-1); // n is size of array, max is getting index of last index
        return max;
    }
    public  <T extends Number> T suma(List a, int valorAsumar1, int valorAsumar2){ // had to extend from Class Number to be able to do additions
        T valor1 = (T) a.get(valorAsumar1);
        T valor2 = (T) a.get(valorAsumar2);
        Double suma= valor1.doubleValue() + valor2.doubleValue();//Making use of Number extension to use double on generic
        return (T) suma; //converting back to generic object

    }
    public  <T extends Number> T product(List a, int valorAmultiplicar1, int valorAmultiplicar2){
        T valor1 = (T) a.get((int) valorAmultiplicar1);
        T valor2 = (T) a.get((int)valorAmultiplicar2);
        Double product= valor1.doubleValue() * valor2.doubleValue();//storing result on variable product
        return (T) product;


    }
    public <T extends String> T Words(List a, String palabra1, String palabra2){
        T valor1 = (T) a.get(Integer.parseInt(palabra1));
        T valor2 = (T) a.get(Integer.parseInt(palabra2));
        String sumaPalabras =  palabra1 + palabra2;
        return (T) sumaPalabras;
    }
}

