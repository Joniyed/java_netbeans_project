
package knapsack_java;


public class Knapsack_java {
    
    static class ItemValue{
        Double cost;
        double weight,value,ind;
        public ItemValue(int weight,int value,int ind)
        {
            this.weight=weight;
            this.value=value;
            this.ind=ind;
            cost=new Double(value/weight);
        }
    }

    public static void main(String[] args) {
        
    }
    
}
