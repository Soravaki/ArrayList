public class IntArrayList {
    private int elements, size;
    private int[] arraylist;
    // construct empty list
    public IntArrayList(){
        arraylist = new int[5];
        elements = 0;
        size = arraylist.length;
    }
    //add element to end of list
    public boolean add(int element){
        if ( size <= element){
            int[] templist = new int[size+5];
            for (int i=0; i<arraylist.length; i++){
                templist[i] = arraylist[i];
            }
            arraylist = templist;
        }
        arraylist[elements] = element;
        elements++;
        return true;
    }
    // insert element at index
    public boolean insert(int element, int index){
        return true;
    }
    // remove element at index
    public boolean remove(int index){
        return true;
    }
    // return true if list contains element
    public boolean find(int element){
        return true;
    }
    // returns the number of elements in list
    public int size(){
        return elements;
    }
    // print the list
    public String toString(){
        return "";
    }
}