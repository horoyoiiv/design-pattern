import java.util.*;


interface Sortable{
    public void sort(ArrayList<Integer> arr);

}

class BubbleSort implements Sortable{
    
    @Override
    public void sort(ArrayList<Integer> arr){
        System.out.println("BUBBLE SORTED...!");
    }
}

class QuickSort implements Sortable{

    @Override
    public void sort(ArrayList<Integer> arr){
        System.out.println("QUICK QUICK");
    }
}

class MergeSort implements Sortable{

    @Override
    public void sort(ArrayList<Integer> arr){
        System.out.println("Divide and CONQUERRRR");
    }
}

class Sorter{
    private Sortable sortable;

    public void setSortable(Sortable sortable){
        this.sortable = sortable;
    }

    public void sort(ArrayList<Integer> arr){
        sortable.sort(arr);
    }
}


class Application{

    public static void main(String[] args){
        
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // When this list is needed to sort.

        Sorter sorter = new Sorter();

        /*
            The list size is too small so that it is fine with O(N^2);
            Then, use Bubble sort!
        */
        sorter.setSortable(new BubbleSort());
        sorter.sort(arr);
        

        /*
            There are too many elements in list.
            We need much faster sort.
            Let's use Quick Sort
        */
        sorter.setSortable(new QuickSort());
        sorter.sort(arr);


        /*
            Then we need that the elements should keep the order of inserting.
            We need stable and fast sort.
            use the Merge...!
        */

        sorter.setSortable(new MergeSort());
        sorter.sort(arr);
        
        

    }

}
