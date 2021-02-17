import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Input the initial size of the array.");
 int[] Arr = CreateArray(scanner.nextInt());
    while (true){
        System.out.println("Input directions. Options: 'create *', 'add * *', 'resize *', 'view *', 'exit'. '*' stands in for an integer.");
        switch (scanner.next().charAt(1)){
            case 'a':{
             Arr =  Add(scanner.nextInt(), scanner.nextInt(), Arr);
            }
            case 'c':{
                Arr = CreateArray(scanner.nextInt());
            }
            case 'r':{
                Arr = Resize(scanner.nextInt(), Arr);

            }
            case 'v':{
                System.out.println(Arr[scanner.nextInt()]);
            }
            case 'e':{
                break;
            }
        }
       }
}
    private static int[] CreateArray(int length) {
        return new int[length];
    }
    private static int[] Add(int index, int element, int[] Arrr) {
        Arrr[index] = element;
        return Arrr;
    }
    private static int[] Resize(int length, int[] Arr) {
        int[] Ar = CreateArray(length);
        if (Arr.length < length){
            for(int i = 0; i<length;i++){
                Ar[i] = Arr[i];
            }}
        else {
                for(int i = 0; i<Arr.length;i++){
                    Ar[i] = Arr[i];
            }
        }
        return Ar;
    }
}