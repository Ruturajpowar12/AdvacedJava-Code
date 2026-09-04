package program1;
class demo1 <T>{
    T name;

    public demo1( T name) {
        this.name= name;
    }
     T showName(){
       return name;
     }

}

class gen1{
    public static void main(String[] args) {
        
        //string
        demo1<String> g = new demo1<>("Ruturaj");
        String str = g.showName();
        System.out.println("String:"+str); //Ruturaj

        // Integer
        demo1<Integer> i = new demo1<>(13);
        int num = i.showName();
        System.out.println("Integer :"+num);

        //double
        demo1<Double> d = new demo1<>(14.234);
        double num2 = d.showName();
        System.out.println("Double:"+num2);
    }
}