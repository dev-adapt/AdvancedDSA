public class avgWaitngTime {
    public static double averageWaitingTime(int[][] arr) {
        int n=arr.length;
        int waiting=0;
        int processTime=arr[0][1];
        int arrival=arr[0][0];
        int currTime=arrival+processTime;
        waiting+=Math.abs(currTime-arrival);
        for(int i=1;i<n;i++){
             arrival=arr[i][0];
             processTime=arr[i][1];
             currTime+=processTime;
            if(currTime>arrival) waiting+=Math.abs(currTime-arrival);
            else waiting+=processTime;
        }
        return (double)waiting/n;
    }
    public static void main(String[] args) {
        int[][]customers={{5,2},{5,4},{10,3},{20,1}};
        System.out.println(averageWaitingTime(customers));
    }
}
