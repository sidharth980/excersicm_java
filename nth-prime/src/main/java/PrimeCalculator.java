
class PrimeCalculator {

    int nth(int nth) {
        if (nth == 0){
            throw new IllegalArgumentException();
        }
        int prime = 0,i = 2;
        while (prime<nth){
            boolean isPrime = true;
            for (int j = 2;j<i;j++){
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                prime += 1;
            }
            i+=1;
        }
        return i-1;
    }

}
