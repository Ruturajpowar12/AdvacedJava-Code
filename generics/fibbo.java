

class demo<T extends Number> {
    T n;
  

    demo(T n) {
        this.n = n;
    }

    void printFibbo() {
        int limit = n.intValue();
        int first = 0;
        int second = 1;

        for (int i = 0; i <= limit; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

public class fibbo {
     public static void main(String[] args) {
         demo<Integer> d = new demo<>(11);

         d.printFibbo();
     }
}
