class test{
    public int first = 0;
    public String stuff = "";
    public test(){

    }
    public test(String stuff, int first){


    }
    public test(int first, String stuff){


    }
    public static double testing(){
        return 3.8+2;
    }
}
class Main{
public static void main(String[] args) {
    test tst = new test();
    test tsting = new test(null, 0);
    test third = new test(6, "Bong");
    System.out.print( test.testing());
}
}