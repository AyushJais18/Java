// A 
// B B 
// C C C 
// D D D D
// E E E E E

class test15{
    public static void main(String args[]){
        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
    System.out.println();    }
    }
}