public class Finding2topNumbers {
    public void printTwoTop2Numbers(int[] numbers){
            int topOne = 0;
            int topTwo = 0;
            for(int n:numbers){
                if(topOne < n){
                    topTwo = topOne;
                    topOne =n;
                } else if(topTwo < n){
                    topTwo = n;
                }
            }
            System.out.println("First Highest Number is: "+topOne);
            System.out.println("Second Highest Number is: "+topTwo);
        }

        public static void main(String[] args){
            int[] numbers = {11,22,45,92,21,54,79,11};
            Finding2topNumbers tmn = new Finding2topNumbers();
            tmn.printTwoTop2Numbers(numbers);
        }
    }

