package MinAndMax;

public class MinAndMax {
    public void MinMaxArr(int a[]){

        int min = a[0], max = a[0];

        for(int i=0; i<a.length; i++){

            if(min > a[i]){
                min = a[i];
            }
        }

        for(int i=0; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
