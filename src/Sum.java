public class Sum {
    static int add ( int x,int y) {
        return x+y;
    }
    static double add ( double x, double y){

        return x+y;
    }
    static class testOverloading{
        public static void main(String[] args){
            System.out.println(add(11,11));
            System.out.println(add(11.7,13.4));
        }
    }
}

