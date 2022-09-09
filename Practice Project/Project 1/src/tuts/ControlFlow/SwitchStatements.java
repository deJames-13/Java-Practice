package tuts.ControlFlow;

public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are authorized to all functions!");
                break;
            case "mod":
                System.out.println("You are authorized to edit messages!");
                break;
            default:
                System.out.println("You are a guest");
        }
    }
}
