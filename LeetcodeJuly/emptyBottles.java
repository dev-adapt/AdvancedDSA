public class emptyBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int bottles=0;
        while(numBottles>=numExchange){
            int curr=numBottles/numExchange;//exchanged number of bottles
           int used=curr*numExchange;//how much bottles we drank
            numBottles-=used; //bottles decreased
            numBottles+=curr;//refilled bottles
            bottles+=used;
        }

        return numBottles>0?bottles+numBottles:bottles;
    }
    public static void main(String[] args) {
        int numBottles = 15, numExchange = 4;
        System.out.println(numWaterBottles(numBottles,numExchange));
    }
}
