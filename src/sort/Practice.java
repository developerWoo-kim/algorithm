package sort;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,0,5};
        for(int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println();

        // QuickSort
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 퀵 정렬 메서드
    public static void quickSort(int[] arr, int left, int right) {
        // 왼쪽 인덱스가 오른 인덱스 보다 작을때까지 재귀 호출
        if(left < right) {
            int part = partition(arr, left, right);

            if(left < part -1) {
                quickSort(arr, left, part-1);
            }
            if(right > part) {
                quickSort(arr, part, right);
            }
        }
    }

    // 파티션 메서드
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (pivot < arr[right]) {
                right--;
            }
            if(left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    };

    // 스왑 메서드
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    };
}
