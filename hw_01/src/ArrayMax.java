public class ArrayMax {

    public static int max(int[] arr) {
        int max = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            if(max > arr[i+1]){
                continue;
            }else{
                max = arr[i+1];
            }
        }
        return max;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum = arr[i] + sum;
        }
        return sum;
    }

    public static int sumWhile(int[] arr){
        int i = 0;
        int sum = 0;
        while(i<arr.length){
            sum += arr[i];
            i+=1;
        }
        return sum;
    }

    public static void printStringContinue(String[] arr){
        for(int i = 0; i <arr.length; i++){
            if(arr[i].contains("horse")){
                continue;
            }else{
                for(int j = 0; j<3;j++){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void pringStringBreak(String[] arr){
        for(int i = 0; i <arr.length; i++){
                for(int j = 0; j<3;j++){
                    System.out.println(arr[i]);
                    if(arr[i].contains("horse")){
                        break;
                }
            }
        }
    }
    //enhanced for loop
    public static void printStringEnhanced(String[] arr){
        for(String s:arr){
            for(int i = 0; i< 3;i++){
                System.out.println(s);
                if(s.contains("horse")){
                    break;
                }
            }

        }
    }

    public static void windowPosSum(int[] arr, int n){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                continue;
            }

            for(int j=0; j<n; j++){
                if(i+j+1<arr.length){
                    arr[i] = arr[i] + arr[i+j+1];
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        int [] test = {1, 2, -3, 4, 5, 4};
        int [] test1 = {1, -1, -1, 10, 5, -1};
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        System.out.println(max(numbers));
        System.out.println(sum(numbers));
        System.out.println(sumWhile(numbers));
        //printStringContinue(a);
        //pringStringBreak(a);
        printStringEnhanced(a);
        windowPosSum(test,3);
        windowPosSum(test1,2);

    }

}
