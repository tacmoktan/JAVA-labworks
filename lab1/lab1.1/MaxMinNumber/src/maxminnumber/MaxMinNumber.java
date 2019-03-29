/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxminnumber;
/**
 *
 * @author Tashi
 */
public class MaxMinNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums ={4,2,3,1,6};
        int minimum = getMinimum(nums);
        int maximum = getMaximum(nums);
        String output = String.format("minimum =%d & maximum =%d",minimum,maximum);
        System.out.println(output);
    }
    
    public static int getMinimum(int[] nums){
        
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    
    public static int getMaximum(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
