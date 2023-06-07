public class Bt2 {
    public static void main(String[] args) {
        int[] arr = {9, 7, 2, 10, 4, 5};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        // Giá trị lớn nhất
        int max2 = Integer.MIN_VALUE;
        // Giá trị lớn thứ 2

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max2 = max;
                // Cập nhật giá trị lớn thứ 2
                max = arr[i];
                // Cập nhật giá trị lớn nhất
            } else if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
                // Cập nhật giá trị lớn thứ 2
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Không tìm thấy phần tử lớn thứ hai.");
        } else {
            System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
        }
    }
}
