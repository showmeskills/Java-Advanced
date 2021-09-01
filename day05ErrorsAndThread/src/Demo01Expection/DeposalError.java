package Demo01Expection;

class DeposalErrorThrow {
    public static void main(String[] args) {
            int[] arr = new int[3];
            //int[] arr = null;
            int e = getElement(arr,3);
            System.out.println(e);
    }
    public static int getElement(int[] arr, int index){
        if(arr == null){
            throw new NullPointerException("arr is null");
        }
        if(index < 0 || index > arr.length){
            throw new ArrayIndexOutOfBoundsException("index out of bounds");
        }
        int ele = arr[index];
        return ele;
    }
}
