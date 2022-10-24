package Task1;

import java.util.*;

public class Exercise_B {

    public static int[] noRepetitionList(int[] list){

        // find the maximum element in list
        int maxNum = 0;
        for (int i = 0; i < list.length; ++i){
            maxNum = Math.max(maxNum, list[i]);
        }

        //Creating the frequency array and initializing it with 0
        int[] freqList = new int[maxNum + 1];
        for (int i = 0; i < freqList.length; ++i){
            freqList[i] = 0;
        }

        //increment the value at freqList[a[i]] in freqList
        for (int i = 0; i < list.length; ++i){
            freqList[list[i]]++;
        }

        //Creating and filling resulting List with no repetition
        int resSize = 0;
        for (int i = 0; i < freqList.length; ++i){
            if (freqList[i] != 0){
                resSize++;
            }
        }

        int[] resList = new int[resSize];
        int resI = 0;
        for (int i = 0; i < freqList.length; ++i){
            if (freqList[i] != 0){
                resList[resI] = i;
                ++resI;
            }
        }
        return resList;
    }

    public static void main(String[] args) {

        //___________________#16___________________//
        System.out.println("Task B #16");
        int[] list = {8, 1, 2, 3, 4, 4, 0, 5, 6, 7, 7, 2, 9};

        System.out.print("Source List:\t\t\t\t");
        for (int i = 0; i < list.length; ++i){
            System.out.print(list[i] + " ");
        }
        System.out.println("");

        int[] resList = noRepetitionList(list);


        System.out.print("List without repetition:\t");
        for (int i = 0; i < resList.length; ++i){
            System.out.print(resList[i] + " ");
        }
        System.out.println("\n\n");

        //___________________#17___________________//
        System.out.println("Task B #17");

        int[] arr1 = {8, 1, 2, 3, 4, 4, 0, 5, 6, 7, 7, 2, 9};
        int[] arr2 = {4, 0, 5, 6, 7, 7, 2, 9};

        System.out.print("arr1:\t\t\t\t\t\t");
        for (int i = 0; i <  arr1.length; ++i) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        System.out.print("arr2:\t\t\t\t\t\t");
        for (int i = 0; i <  arr2.length; ++i) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");

        int arr3Size = 0;
        for (int i = 0; i <  arr1.length; ++i){
            for (int j = 0; j < arr2.length; ++j){
                if (arr1[i] == arr2[j])
                    ++arr3Size;
            }
        }

        int[] arr3 = new int[arr3Size];
        int arr3Iter = 0;
        for (int i = 0; i <  arr1.length; ++i){
            for (int j = 0; j < arr2.length; ++j){
                if (arr1[i] == arr2[j]){
                    arr3[arr3Iter] = arr1[i];
                    ++arr3Iter;
                }
            }
        }

        System.out.print("arr3 with repetition:\t\t");
        for (int i = 0; i <  arr3.length; ++i) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("");

        arr3 = noRepetitionList(arr3);
        System.out.print("arr3 with no repetition:\t");
        for (int i = 0; i <  arr3.length; ++i) {
            System.out.print(arr3[i] + " ");
        }

    }
}
