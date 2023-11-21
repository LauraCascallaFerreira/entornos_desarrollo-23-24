public class ejemplo02 {

    public static void main(String[] args) {
        int arr[] = new int[5];

        arr[0]=0;
        arr[1]=65;
        arr[2]=78;
        arr[3]=88;
        arr[4]=arr[3]++;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
    
}
