public class seniorCitizen {
    public static int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String curr=details[i];
            int first=curr.charAt(11);
            int second=curr.charAt(12);
            int age=((first-48)*10)+(second-48);
            System.out.println(age);
            if(age>60){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
       System.out.println(countSeniors(details));
    }
}
