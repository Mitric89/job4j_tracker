package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void getInfo() {
        System.out.println("Active is " + active + ". " + "Status is " + status + ". " + "Message is " + message + ".");
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 1, "error1");
        Error error2 = new Error(false, 2, "error2");
        Error error3 = new Error(true, 3, "error3");
        error.getInfo();
        error1.getInfo();
        error2.getInfo();
        error3.getInfo();
    }
}
