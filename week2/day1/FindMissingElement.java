package week2.day1;

import java.util.Arrays;
import java.util.Iterator;

import net.bytebuddy.implementation.bytecode.collection.ArrayLength;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 4,3,2,8, 6, 7};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
            if (arr[0] + i != arr[i]) {
                System.out.println("Missing Number is: " + (arr[0] + i));
                break;
            }
        }
    }
}
