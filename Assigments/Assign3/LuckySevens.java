public class LuckySevens{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int output = 0;
        while(num > 0){
            if(num % 10 == 7){
                output++;
            }
            num = num /10;

        }
        System.out.println(output);



    }
}