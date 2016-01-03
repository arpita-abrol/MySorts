//Arpita Abrol
//APCS1 pd10
//HW?? -- MySorts
//2016-01-04

import java.util.ArrayList;

public class BogoSort {

    
    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //checks to see if an ArrayList is sorted
    public static boolean isSorted(ArrayList<Comparable> data) {
	boolean result = true;
	for(int i = 1; i < data.size(); i++) {
	    if(data.get(i-1).compareTo(data.get(i)) > 0) {
		result = false;
	    }
	}
	return result;
    }

    //sorts an ArrayList by shuffling
    public static void bogoSortV( ArrayList<Comparable> input) {
	while( !(isSorted(input)) ) {
	    shuffle(input);
	}
    }
    //O(infinity)

    //sorts an ArrayList by shuffling, returns the shuffled ArrayList
    public static ArrayList<Comparable> bogoSort( ArrayList<Comparable> data ) {
	ArrayList<Comparable> input = new ArrayList<Comparable>();
	for( Comparable x : data ) {
	    input.add(x);
	}
	
	while( !(isSorted(input)) ) {
	    shuffle(input);
	}
	return input;
    }
    
    public static void main( String[]args ) {
	/*
	//for VOID methods
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	bogoSort(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	bogoSort(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	*/
	
	//for NON-VOID methods
	
	ArrayList glen = populate( 3, 1, 1000);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	ArrayList glenSorted = bogoSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	ArrayList coco = populate( 5, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = bogoSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	System.out.println( coco );
	
    }
    
} //end class
