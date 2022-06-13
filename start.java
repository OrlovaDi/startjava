public class Main{
    public static void main(String[] args){
        int i = 0;
        int sum = 0;

        for (int a = 0; a < 5; a++){
            sum = sum + (i + 1);
            i++;
        }
        System.out.println(sum);
    }
}
