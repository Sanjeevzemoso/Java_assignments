package sanjeev.Singleton;

public class Singleton {

        private String s;
        public static Singleton initialize(String val,Singleton obj2){
            if((obj2 instanceof Singleton)){
                obj2.s=val;
                return obj2;
            }
            Singleton Singleton=new Singleton();
            Singleton.s=val;
            return Singleton;
        }
        public void printString(){
            System.out.println(s);
        }

}
