package Abstract;

abstract class Test1 {
    abstract int sum(int a, int b);

    abstract char chara(char ch);

}

class Ex2 extends Test1{
    
    int sum(int a, int b){
        System.out.println(a + b);
        return 100;
    }
    
    char chara(char ch){
        System.out.println(ch);
        return 'c';
    }
    public static void main(String[] args){
        Ex2 t = new Ex2();
        int a = t.sum(10,20);
        System.out.println(a);
        char c = t.chara('a');
        System.out.println(c);
        
    }
}
