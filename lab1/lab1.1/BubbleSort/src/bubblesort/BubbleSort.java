/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Tashi
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {5,4,8,2,9};
        System.out.println("before sorting:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        
        for(int i=0;i<nums.length-1;i++){
            
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }            
            }
        }
        
        System.out.println("\nafter sorting:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}
