package sanjeev.main;

import Assignment5.sanjeev.Singleton.Singleton;
import Assignment5.sanjeev.data.Initial;

public class Main {
    public static void main(String[] args) {
        Initial obj1=new Initial();

        obj1.printVariables();
        //obj1.printLocal();


        Singleton obj2=new Singleton();
        Singleton returnedObj=obj2.initialize("sanjeev",obj2);
        returnedObj.printString();
    }
}
