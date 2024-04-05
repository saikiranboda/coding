package bro;

public class Bubblesort {
	public static void array(int[]arr) {
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(" " +arr[i]);			
		}
		}
		public static void bubble(int[] arr) {
		
		int n=arr.length;
			int i,j,temp;
			for(i=0;i<n-1;i++) {
				for (j=0;j<n-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						 temp=arr[j];
						 arr[j]=arr[j+1];
						 arr[j+1]=temp;
					}
				}
			}	  
	    }
		public static void main(String[] args) {
			int[] arr= {3,4,5,8,2,1};
			 array(arr);
			 
			 System.out.println("After sorting-");
			 array(arr);
			}
		}
	

