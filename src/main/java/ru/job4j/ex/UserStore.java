package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("tetet", true)};
        try {
            User user = findUser(users, "tetet");
            validate(user);
        } catch (UserInvalidException e) {
            System.out.println("User is not valid");
        } catch (UserNotFoundException e) {
            System.out.println("User not found");
        }
    }
}
