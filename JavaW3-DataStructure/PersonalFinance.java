import java.util.ArrayList;
public class PersonalFinance{

    public static void main(String []args){

        ArrayList<Integer> spend = new ArrayList<Integer>();

        spend.add(500);
        spend.add(1000);
        spend.add(1250);
        spend.add(175);
        spend.add(800);
        spend.add(120);
        int size = spend.size();
        float sum =0;
        int temp =0;


        for(int i=0; i < size; i++ ){
            sum += spend.get(i); // How much did we spend?

        }
        int sum2 = (int) sum; // 3

        System.out.println(sum2);
        //            Collections.sort(spend);
        for(int i=0; i < size; i++ ){
            for(int j= i + 1; j < size; j++ ){
                if(spend.get(i) > spend.get(j)) {
                    temp = spend.get(i);
                    spend.set(i,spend.get(j));
                    spend.set(j,temp);
                }
            }


        }
        System.out.println(spend.get(spend.size()-1)); // Which was our greatest expense?
        System.out.println(spend.get(0)); //Which was our cheapest spending?
        float average =  sum / spend.size();
        System.out.println(average);

    }
}