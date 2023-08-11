import java.util.ArrayList;

public class LargeThanFourNeighbours {
    public static void main(String[] args) {
        int [] a1 = {5, 18, 9, 27, 12, 3, 14, 22, 7, 30};
        int [] a2 = {8, 15, 29, 11, 20, 6, 25, 17, 13, 4};
        int [] a3 = {23, 10, 19, 2, 28, 16, 21, 1, 24, 26};

        //System.out.println(LargeThan4Neighbours(a1)); // should print 27 30
        //System.out.println(LargeThan4Neighbours(a2)); //should print 29,25
        //System.out.println(LargeThan4Neighbours(a3)); //should print 23 28 26

        System.out.println(LargeThan4NeighboursWithHelper(a1));
        System.out.println(LargeThan4NeighboursWithHelper(a2));
        System.out.println(LargeThan4NeighboursWithHelper(a3));
    }

    public static ArrayList<Integer> LargeThan4Neighbours(int[] array){
        ArrayList<Integer> ans = new ArrayList();

        for(int i = 0;i<array.length;i++){
            Boolean passAllTest = true;
            for(int j = 1;j<=2;j++){
                if(i-j<0){

                    break;
                }else if(array[i-j]>array[i]){
                    passAllTest=false;
                    break;
                }
            }

            for(int k=1;k<=2;k++){
                if(k+i>=array.length){
                    break;
                }else if(array[k+i]>array[i]){
                    passAllTest=false;
                    break;
                }
            }

            if(passAllTest){
                ans.add(array[i]);
            }
        }

        return ans;
    }

    public static  ArrayList<Integer> LargeThan4NeighboursWithHelper(int[] array){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i<array.length;i++){
            if(isLargestOfFive(i,array)){
                ans.add(array[i]);
            }
        }

        return ans;
    }
    public static boolean isLargestOfFive(int i,int[] array){
        boolean isMax = true;
        for(int j=-2; j<=2;j++){
            int compareIndex = i+j;
            if(compareIndex<0){
                continue;
            }
            if(j==0){
                continue;
            }

            if(compareIndex>=array.length){
                break;
            }

            if(array[compareIndex]>=array[i]){
                isMax=false;
                break;
            }
        }

        return isMax;
    }
}
