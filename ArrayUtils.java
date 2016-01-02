//Arpita Abrol
//APCS1 pd10
//HW27 -- Objectify Your Array Tools
//2015-11-10

public class ArrayUtils{

    //search though array for target
    public static int linSearch( Integer[] a, int target ) {
	for (int ctr = 0; ctr < a.length; ctr++) {
	    if (target == a[ctr]) {
		return ctr;
	    }
	}
	return -1; //bc compilier
    }

    public static int linSearch( String[] a, Object target ) {
	for (int ctr = 0; ctr < a.length; ctr++) {
	    if (target.equals(a[ctr])) {
		return ctr;
	    }
	}
	return -1; //bc compilier
    }

    
    //returns num of occurances of target
    public static int freq( Integer[] a, int target ) {
	int freqNum = 0;
	for (int ctr = 0; ctr < a.length; ctr++) {
	    if (target == a[ctr]) {
		freqNum++;
	    }
	}
	return freqNum;
    }

    public static int freq( String[] a, String target ) {
	int freqNum = 0;
	for (int ctr = 0; ctr < a.length; ctr++) {
	    if (target.equals(a[ctr])) {
		freqNum++;
	    }
	}
	return freqNum;
    }
	

    //method to generate random number between uppBound and lowBound
    public static int randomNum(int uppBound, int lowBound) {
	int num;
	int max;
	int min;
	if (uppBound > lowBound) {    
	    max = uppBound;
	    min = lowBound;
	}
	else {
	    max = lowBound;
	    min = uppBound;
	}
	int range = (max - min);
	num = (int)(Math.random() * range) + min;
	return num;
    }

    //method to randomly assign a value to each element in an array
    public static Integer[] randomPop(Integer[] arr, int uppBound, int lowBound) {
	//uses loop to randomly generate values for each element in the array
	for (int ctr = 0; arr.length > (ctr + 0); ctr++) {
	    arr[ctr] = randomNum(uppBound, lowBound);
	}
	return arr;
    }

    //method to generate random number between uppBound and lowBound
    public static String randomNumS(int uppBound, int lowBound) {
	int num;
	int max;
	int min;
	if (uppBound > lowBound) {    
	    max = uppBound;
	    min = lowBound;
	}
	else {
	    max = lowBound;
	    min = uppBound;
	}
	int range = (max - min);
	num = (int)(Math.random() * range) + min;
	String numS = "" + num;
	String fin = "\" " + numS + "\" ";
	return fin;
    }

    //method to randomly assign a value to each element in an array
    public static Object[] randomPop(String[] arr, int uppBound, int lowBound) {
	//uses loop to randomly generate values for each element in the array
	for (int ctr = 0; arr.length > (ctr + 0); ctr++) {
	    arr[ctr] = randomNumS(uppBound, lowBound);
	}
	return arr;
    }

    //return a string version of an array
    public static String stringify(Integer[] arr) {
	String finStr = "{ ";
	for (int ctr = 0; arr.length > (ctr + 0); ctr++) {
	    finStr += arr[ctr] + " ";
	}
	finStr += "}";
	return finStr;
    }

    public static String stringify(String[] arr) {
	String finStr = "{ ";
	for (int ctr = 0; arr.length > (ctr + 0); ctr++) {
	    finStr += "\"" + arr[ctr] + "\" ";
	}
	finStr += "}";
	return finStr;
    }

    public static void main( String[]args ) {
	Integer[] intArr = { 1,2,3,4,5,6,5,4,3,2,1 };
	String[] strArr = {"1","2","3","4","4","6","7","7"};
	
	System.out.println("\n======INT ARRAY=====");
	for (int i=0; i<intArr.length; i++) {
	    //String typeI =(intArr[i]).getClass().getName();
	    System.out.println( "intArr[" + i + "] DATA TYPE:"  
				+ (intArr[i]).getClass() );
	}
	System.out.println("Stringify(intArr):\t" + stringify(intArr) +
			   "\nlinSearch(intArr,6):\t" + linSearch(intArr,6) +
			   "\nfreq(intArr, 7):\t" + freq(intArr, 7) + "\n"
			   );

	System.out.println("=====STR ARRAY=====");
	for (int i=0; i<strArr.length; i++) {
	    System.out.println( "strArr[" + i + "] DATA TYPE:" + 
				(strArr[i]).getClass().getName() );
	}
	System.out.println("Stringify(strArr):\t" + stringify(strArr) +
			   "\nlinSearch(strArr, \"6\"):\t" + linSearch(strArr,"6") +
			   "\nfreq(strArr, \"7\"):\t" + freq(strArr, "7") + "\n"
			   );
    }
    
}
