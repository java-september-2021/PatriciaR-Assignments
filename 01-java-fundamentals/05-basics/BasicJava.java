import java.util.ArrayList;


public class BasicJava {
    public void printNum() {
        for (int i = 0; i < 256; i++){
            System.out.println(i);
    
}

}
    public void printOdd(){
        for (int i = 0; i < 256; i ++){
            if (i % 2 != 0 ){
                System.out.println(i);
            }
        }
    }

    public int sigma(){
        int sum = 0;
        for (int i = 0; i< 256; i++){
            sum = sum + i;
        }
    
        return sum;
        
    }

    public void iterate(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(13);

        for (int i= 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        
    }

    public int findMax(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
        return maxVal;
    }

    public void arrayOdd(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < 256; i++){
            if (i % 2 != 0){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    public void getAvg(int[] arr){
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i ++){
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);

    }

    public int greaterY(int [] arr, int y){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > y){
                count = count + 1;
            }
        }
        System.out.println(count);
        return count;
    }

    public void sqaure(int [] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    
    }

    public void noNegative(int [] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}