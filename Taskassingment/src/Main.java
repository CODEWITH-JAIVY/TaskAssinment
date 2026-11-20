
public class Main {

    public static void main(String[] args) {

        ProblemTask task = new ProblemTask();

        System.out.println(task.longestValidParentheses("(()"));
        System.out.println(task.longestValidParentheses(")()())"));
        System.out.println(task.longestValidParentheses(""));
    }
}