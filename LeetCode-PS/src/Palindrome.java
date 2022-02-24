public class Palindrome {

        public static boolean isPalindrome(int x) {
            int a,b;
            int c=x;
            int count = getLength(x);
            boolean result = false;

            if(x==0){
                return true;
            }
            else if(count%2==0){

                for(int i =0 ; i < count/2 ; i++){
                    a= (x/power(10,count-i-1))%10;
                    b=c%10;
                    c=c/10;
                    if(a!=b) {
                        result=false;
                        break;
                    }
                    else result=true;

                }



            }else {
                for(int i =0 ; i < (count+1)/2 ; i++){
                    a= (x/power(10,count-i-1))%10;
                    b=c%10;
                    c=c/10;
                    if(a!=b) {
                        result=false;
                        break;
                    }
                    else result=true;

                }



            }
            return  result;



        }
        public static int power(int base, int power){
            int y =1;
            for(int i =0; i<power; i++){
                y=y*base;
            }
            return y;
        }
        public static int getLength(int x){
            int count = 0;
            while (x > 0) {
                x = (x / 10);
                count++;
            }
            return count;

        }




}
