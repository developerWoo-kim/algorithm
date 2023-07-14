package sort;

public class MergeSort {
    static int[] temp;
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,9,6,7};
        temp = new int[arr.length];
        merge_sort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void merge_sort(int[] arr, int start, int end) {
        if(start == end) return;
        int mid = (start + end) / 2;
        merge_sort(arr, start, mid);
        merge_sort(arr, mid+1, end);
        // 분할된 배열 머지
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int index = start; // 인덱스 시작점
        int left = start;  // 왼쪽 배열 시작점
        int right = mid+1; // 오른쪽 배열 시작점

        // 왼쪽 끝부터 분할 기점 끝까지, 오른쪽 끝부터 마지막까지
        while (left <= mid && right <= end) {
            if(arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }
        // 왼쪽이 먼저 정복된 경우
        if(left > mid) {
            while (right <= end) {
                temp[index++] = arr[right++];
            }
        } else {
        // 오른쪽이 먼저 정복된 경우
            while (left <= mid) {
                temp[index++] = arr[left++];
            }
        }

        for(int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }
    }
}
