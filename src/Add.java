public class Add {
    void sum( int a , long b){
        System.out.println(a+b);
    }
    void sum (int s,int q){
        System.out.println(s+q);
    }
    public static void main(String[] args) {
        Add  s= new Add();
        s.sum ( 5,12345678L);
        s.sum(23,344);
    }
}

