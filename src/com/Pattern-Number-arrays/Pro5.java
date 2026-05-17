package com.basics;

public class Pro5 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
	
		for(int i=1;i<=rows;i++) {
			int k=1;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		for(int i=1;i<=rows;i++) {
			int k=rows;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		for(int i=1;i<=rows;i++) {
			int k=rows+1-i;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		int k=1;
		for(int i=1;i<=rows;i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(k +" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		 k=1;
		for(int i=1;i<=rows;i++) {

			for(int j=1;j<=i;j++) {
				if(k%2==0) {
					System.out.print(0+" ");
				}
				else {
					System.out.print(1 +" ");
				}
				k++;
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		 k=1;
		for(int i=1;i<=rows;i++) {

			for(int j=1;j<=i;j++) {
				System.out.print((char)(k+64) +" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		 k=2;
			for(int i=1;i<=rows;i++) {

				for(int j=1;j<=i;j++) {
					if(k%2==0) {
						System.out.print(0+" ");
					}
					else {
						System.out.print(1+" ");
					}
					k++;
				}
				System.out.println();
			}
			
			System.out.println("------------------------------------------------------------------------------");
			
			 k=0;    //use k=0 or 2 to get output
				for(int i=1;i<=rows;i++) {

					for(int j=1;j<=i;j++) {
						System.out.print(k%2 +" ");
						k++;
					}
					System.out.println();
				}
				
				System.out.println("------------------------------------------------------------------------------");
				
				     //use k=0 or 2 to get output
					for(int i=1;i<=rows;i++) {
						 k=i;
						for(int j=1;j<=i;j++) {
							System.out.print(k%2 +" ");
							k++;
						}
						System.out.println();
					}
					
					System.out.println("------------------------------------------------------------------------------");
					
					for(int i=1;i<=rows;i++) {
						 k=i+1;
						for(int j=1;j<=i;j++) {
							System.out.print(k%2 +" ");
							k++;
						}
						System.out.println();
					}
					
					System.out.println("------------------------------------------------------------------------------");
					
					for(int i=1;i<=rows;i++) {
						 k=i;
						for(int j=1;j<=i;j++) {
							System.out.print(k +" ");
							k++;
						}
						System.out.println();
					}
					
					System.out.println("------------------------------------------------------------------------------");
					
					k=1;
					for(int i=1;i<=rows;i++) {
					
						for(int j=1;j<=i;j++) {
							System.out.print(k%5 +" ");
							k++;
						}
						System.out.println();
						
					}
					
					System.out.println();
					
					
					//same pattern code in different way
					
					k=1;
					for(int i=1;i<=rows;i++) {
					
						for(int j=1;j<=i;j++) {
							System.out.print(k +" ");
							k++;
							if(k==5) {
								k=0;
							}
						}
						System.out.println();
					}
					
					System.out.println("------------------------------------------------------------------------------");
					
					k=0;
					for(int i=1;i<=rows;i++) {
					k=k+i;
					int temp=k;
						for(int j=1;j<=i;j++) {
							System.out.print(temp +" ");
							temp--;
							
						}
						
						System.out.println();
						
					}
					
					
System.out.println("same pattern code------------------------------------------------------------------------------");
					

					k=0;
					for(int i=1;i<=rows;i++) {
					k=k+i;
						for(int j=1;j<=i;j++) {
							System.out.print(k+1-j+" ");
							
						}
						
						System.out.println();
						
					}
					
					System.out.println("--------------------------------------------------------------------------------");
					
					
					 k=1;
						for(int i=1;i<=rows;i++) {

							for(int j=1;j<=i;j++) {
								if(k%2==0) {
									System.out.print((char)(k+96)+" ");
								}
								else {
									System.out.print((char)(k+64)+" ");
								}
								
								k++;
							}
							System.out.println();
						}
						
					System.out.println("--------------------------------------------------------------------------------");
						
		
					
	}

}
