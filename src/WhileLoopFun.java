public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        while (number!=0) {
            System.out.println(number % 10);
            number = number / 10;
        }
    }

    public int countLetter(String word, String letter) {
        int count = 0;
        while(word.indexOf(letter)>=0){
            int start = word.indexOf(letter);
            count++;
            word = word.substring(start+1);
        }
        return count;
    }

    public int maxDoubles(int number, int threshold) {
        int count=0;
        while (number<threshold){
            count++;
            number*=2;
            if (number>threshold){
                count--;
            }
        }
        return count;
    }

    public boolean isPrime(int number) {
        int test = 2;
        if (number==1 || number==9) {
            return false;
        }
        while (number>test){
            if (number%test==0){
                return false;
            }
            test++;
        }
        return true;
    }
}

