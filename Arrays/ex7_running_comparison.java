class Codechef {

    public static int countHappyDays(int[] A, int[] B){

        int n = A.length;
        int count = 0;

        for(int i = 0; i < n; i++){

            boolean aliceUnhappy = B[i] > 2 * A[i];
            boolean bobUnhappy = A[i] > 2 * B[i];

            if(!aliceUnhappy && !bobUnhappy){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){

        int[] A = {100,200,300};
        int[] B = {300,200,100};

        System.out.println(countHappyDays(A,B));
    }
}