package day42_Exceptions;

import com.sun.tools.javac.Main;

class FadyException extends RuntimeException{// UNCHECKED EXCEPTION

    public FadyException(){
        super("time for a short break");
    }

    public FadyException(String message) {
        super(message);
       // System.out.println("it is time for break");
    }
}

class NoBreakException extends Exception{//CHECKED EXCEPTİON

}

public class CustomExceptions {

    public static void main(String[] args) {

      //  throw new FadyException();

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }


    //bitti

}
