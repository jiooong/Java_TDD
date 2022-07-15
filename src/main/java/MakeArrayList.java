public class MakeArrayList {
    int arr[] = new int[2];
    int lastindexnum;
    public int size() {
        return lastindexnum;
    }
    private void ifArrSizeBig(){
        if ( isFull() ) {
            sizeUp();
        }
    }
    private boolean isFull() {
        return lastindexnum == arr.length;
    }

    private void sizeUp() {
        int arr2[] = new int[arr.length*2];
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        arr=arr2;
    }

    public void add(int i) {
        ifArrSizeBig();
        arr[lastindexnum]=i;
        lastindexnum++;

    }
    public int get(int i) {

       int num =arr[i];

        return num;
    }

    public void removeAt(int i) {

        for(int num=i+1; num< lastindexnum; num++){
            arr[num-1]=arr[num];
        }
        lastindexnum--;
    }

    public int getArrayLength() {
        return arr.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");

        for ( int i = 0; i < lastindexnum; i++ ) {
            System.out.printf("%d : %d\n", i, arr[i]);
        }

    }
}
