import java.util.LinkedList;
import java.util.Scanner;

public class JavaCode1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 学生数量
        int m = scanner.nextInt(); // 调整次数
        LinkedList<Integer> students = new LinkedList<>();

        // 初始化队列
        for (int i = 1; i <= n; i++) {
            students.add(i);
        }

        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt(); // 学号
            int q = scanner.nextInt(); // 移动距离

            // 找到学号为p的学生的索引
            int index = students.indexOf(p);

            if (q > 0) { // 向后移动
                int temp = students.remove(index);
                index += q;
                if (index >= students.size()) {
                    students.addLast(temp);
                } else {
                    students.add(index, temp);
                }
            } else { // 向前移动
                int temp = students.remove(index);
                index += q;
                if (index <= 0) {
                    students.addFirst(temp);
                } else {
                    students.add(index, temp);
                }
            }
        }

        // 输出最终队列
        for (int student : students) {
            System.out.print(student + " ");
        }
	}

}
