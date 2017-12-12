import java.util.Scanner;
public class array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
       String[] words;
       words = new String[i];
        int j = 0;
        String a = (" ");
        int b = 0;

        while(j < i){
           Scanner scan = new Scanner(System.in);
            words[j] = scan.nextLine();

           if (words[j].length() >= a.length()) {
               a = words[j];
               b = j;
           }
System.out.println("this"+a);
           j++;
        }
        System.out.println("finish"+words[b]);

    }
}
