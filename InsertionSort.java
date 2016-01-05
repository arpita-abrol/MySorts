//Arpita Abrol
//APCS1 pd10
//HW53 -- Poker Face
//01-05-2016

/*======================================
  class InsertionSort -- implements InsertionSort algorithm
  
  Q1: Is more work done toward beginning or end of insertion sort? Why?
      More work is done towards the end since elements now must be compared to a larger number of values while being sorted
  Q2: For n items, how many passes are necessary to sort?
      n-1 passes
  Q3: What is known after pass p, and how do you know it?
      All elements at and before index p are sorted since InsertionSort has 2 groups of elements, sorted and unsorted.
  Q4: What is the runtime classification of this sort?
      n*n
  
======================================*/

import java.util.ArrayList;

public class InsertionSort {

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
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void insertionSortV( ArrayList<Comparable> data ) {
	for( int i = 1; i < data.size(); i++ ) {
	    for( int x = i; x > 0; x-- ) {
		if( data.get(x).compareTo(data.get(x-1)) < 0 ) {
		    Comparable a = data.get(x);
		    Comparable b = data.get(x-1);
		    data.set(x-1,a);
		    data.set(x,b);
		}
		else {
		    break;
		}
		//System.out.println(data+"\n"+i+"\t"+x);
	    }
	}
    }//end insertionSort -- worst and best case are O(n*n) 


    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input ) {
	ArrayList<Comparable> data = new ArrayList<Comparable>();
	for( Comparable x : input ) {
	    data.add(x);
	}
	
	for( int i = 1; i < data.size(); i++ ) {
	    for( int x = i; x > 0; x-- ) {
		if( data.get(x).compareTo(data.get(x-1)) < 0 ) {
		    Comparable a = data.get(x);
		    Comparable b = data.get(x-1);
		    data.set(x-1,a);
		    data.set(x,b);
		}
		else {
		    break;
		}
		//System.out.println(data+"\n"+i+"\t"+x);
	    }
	}
	return data;
    }//end insertionSort -- O(n*n)


    public static void main( String [] args ) {
	/*===============for VOID methods=============
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	insertionSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	
	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	insertionSortV(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	
	============================================*/

	
    	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	ArrayList glenSorted = insertionSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" 
			    + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );

      	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = insertionSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" 
			    + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	System.out.println( coco );
	/*==========for AL-returning methods==========
	============================================*/

    }//end main

}//end class InsertionSort
