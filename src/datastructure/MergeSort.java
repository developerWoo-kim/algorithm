package datastructure;

public class MergeSort {
    static int[] temp;
    public static void main(String[] args) {
        int[] arr = {4,6,2,1,8,7};
        temp = new int[arr.length];

        merge_sort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void merge_sort(int arr[], int start, int end) {
        // 종료 조건
        if(start == end) return;
        int mid = (start + end) / 2;
        // 왼쪽
        merge_sort(arr, start, mid);
        // 오른쪽
        merge_sort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int index = start; // 채워넣을 배열 인덱스
        int left = start; // 왼쪽 배열의 시작 포인트
        int right = mid+1; // 오른쪽 배열의 시작 포인트

        // 왼쪽 오른쪽 중 한쪽이라도 먼저 채워질때 까지
        while (left <= mid && right <= end)  {
            // 분할 기점으로 비교
            if(arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }
        // 왼쪽이 먼저 채워진 경우
        if(left > mid) {
            while (right <= end) {
                temp[index++] = arr[right++];
            }
        } else {
            while (left <= mid) {
                temp[index++] = arr[left++];
            }
        }

        // 정렬된 배열을 본 배열에 넣어준다.
        for(int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }
    }
}
