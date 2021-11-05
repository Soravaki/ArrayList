public class IntArrayList {
    private int elements;
    private int[] arraylist;

    // construct empty list
    public IntArrayList(){
        arraylist = new int[5];
        elements = 0;
    }

    //add element to end of list
    public void add(int element){
        expandlist();
        arraylist[elements] = element;
        elements++;
    }

    // insert element at index
    public boolean insert(int element, int index){
        if (index>elements) return false;
        expandlist();
        for (int i=elements; i>=index; i--){
            arraylist[i+1] = arraylist[i];
        }
        arraylist[index] = element;
        elements++;
        return true;
    }

    // remove element at index
    public boolean remove(int index){
        if (index>elements) return false;
        for (int i=index; i<elements; i++){
            arraylist[i] = arraylist[i+1];
        }
        arraylist[elements] = 0;
        elements--;
        return true;
    }

    // return true if list contains element
    public boolean find(int element){
        for (int i=0; i<elements; i++){
            if (arraylist[i] == element) return true;
        }
        return false;
    }

    // returns the number of elements in list
    public int size(){
        return elements;
    }

    // expands arraylist by 5
    public void expandlist(){
        if ( arraylist.length <= elements){
            int[] templist = new int[arraylist.length+5];
            for (int i=0; i<arraylist.length; i++){
                templist[i] = arraylist[i];
            }
            arraylist = templist;
        }
    }

    // print the list
    public String toString(){
        String output = "";
        for (int i=0; i<elements; i++){
            output += "" + arraylist[i] + " ";
        }
        return output;
    }
}
