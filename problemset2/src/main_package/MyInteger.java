package main_package;
public class MyInteger {

	/*this code gives out the odd nbrs,even nbrs,prime nbrs,/*
	 * 
	 */
	public void setValue(int pardfVar){
		this.value=pardfVar;
	}

		public MyInteger(){
		}
		public void MyInteger(int setavalue) {
			this.value = setavalue;	
		}

		public int getValue(){
			return this.value;
		}



	public static boolean isEven(int nbr1){
		if (nbr1%2==0){
			return true;
		}
		return false;
	}

	public static boolean isOdd(int nbr1){
		if (nbr1%2==1){
			return true;
		}
		return false;
	}


	public boolean isOdd(){
		if (value%2==1){
			return true;
		}
		return false;
	}

	public boolean isEven(){
		if (value%2==0){
			return true;
		}
		return false;
	}


	public boolean isPrime(){
		for (int i=2; i<=value/2; i++){
			if(value % i == 0){
				return false;
			}
		}
		return true;
	}
	public static int parseInt(char[] arrayofchar){
		String fjt = java.lang.String.copyValueOf(arrayofchar);
		return parseInt(fjt);
	}

	public static boolean isOdd(MyInteger faninstance){
		if (faninstance.getValue()%2==1){
			return true;
		}
		return false;
	}

	public static boolean isEven(MyInteger faninstance){
		if (faninstance.getValue()%2==0){
			return true;
		}
		return false;
	}

	public static boolean isPrime(MyInteger faninstance){
		for (int i=2; i<=faninstance.getValue()/2; i++){
			if(faninstance.getValue()% i == 0){
				return false;
			}
		}
		return true;
	}
	private int value;

	public boolean equals(int somenbr){
		if (value==somenbr){
			return true;
		}
		return false;
	}

	public static boolean isPrime(int nbr1){
		for (int i=2; i<=(nbr1)/2; i++){
			if(nbr1 % i == 0){
				return false;
			}
		}
		return true;
	}


	public boolean equals(MyInteger myObjections){
		if (myObjections.getValue()==value){
			return true;
		}
		return false;
	}





	public static int parseInt(String s){
		return java.lang.Integer.parseInt(s);
	}
}


