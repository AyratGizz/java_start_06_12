package Seminar_2;
// Обход Дерева в глубину
public class Task1 {
    public static void main(String[] args) {
        findPath(1, 5, 1, 2, "");

    }
    private static void findPath(int src, int target, int addend, int mult, String path){
        if (src > target){
            return;
        }
        if (src == target){
            System.out.println(path + " = " + target);
            return;
        }

        findPath(src + addend, target, addend, mult, path + " " + src + " + " + addend);
        findPath(src * mult, target, addend, mult, path + " " + src + " * " + mult);
    }
}
