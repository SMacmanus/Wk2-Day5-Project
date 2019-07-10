import java.util.Arrays;

public class ArrayList implements List {
    private String[] arr = new String[10];
    private int listSize = 0;

    public int size() {
        return listSize;
    }

    public int getListSize(int listSize) {
        return this.listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    public void add(String a) {

        if(listSize >= arr.length){
            String[] arr2 = new String[arr.length*2];
            for(int i =0; i < arr.length; i++){
                arr2[i]= arr[i];
            }
            arr = new String[arr2.length];
            arr = arr2;
        }

        arr[listSize] = a;
        listSize++;
    }

    public String get(int i) {
        return arr[i];
    }

    public void remove(int r) {
        for (int i = (r); i < (arr.length) ; i++) {
            arr[i - 1] = arr[i];
        }
    }
}


