package codingTasks;

public class new_file {

    public static void main(String[] args) {
        
        int a = 0;
        int b = 1;
        int d = 10;

        int c = a + b;

        int res = 0;
        int count = 0;
        while(c <= d) {

            count ++;

            a = b;
            b = c;
            c = a+b;

            if(count == n) {
                res = c;
            }


            }

        System.out.println(res);


    }
}
