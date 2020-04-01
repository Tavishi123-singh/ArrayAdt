package ArrayADT;

public class MyArrayADT {
    private int[] data;
    private int size;
    private int end;

    public MyArrayADT(int size) {
        this.size = size;
        data= new int[this.size];
        end=0;
    }
    public boolean insert(int element){
        boolean response=false;
        if(!isFull()){
            data[end]=element;
            end++;
            response=true;
        }
        return response;
    }

    private boolean isFull() {
        boolean response=false;
        if(end==size){
            response=true;
        }
        return response;
    }
    public int delete(){
        int response=0;
        if (!isEmpty()){
            end--;
            response=data[end];
        }
        return response;
    }

    private boolean isEmpty() {
        boolean response=false;
        if(end==0){
            response=true;
        }
        return response;
    }
    public boolean search(int element){
        boolean response=false;
        for (int i = 0; i < end; i++) {
            if(data[i]==element){
                response=true;
                break;
            }
        }
        return response;
    }

    public int getEnd() {
        return end;
    }
    public void traverse(){
        System.out.println("Elements are....");
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]);
            if(i!=end-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
