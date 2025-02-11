// Problem Statement: Create a system to manage social media friend connections using a singly linked list. Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
// Add a friend connection between two users.
// Remove a friend connection.
// Find mutual friends between two users.
// Display all friends of a specific user.
// Search for a user by Name or User ID.
// Count the number of friends for each user.
// Hint:
// Use a singly linked list where each node contains a list of friends (which can be another linked list or array of Friend IDs).
// For mutual friends, traverse both lists and compare the Friend IDs.
// The List of Friend IDs for each user can be implemented as a nested linked list or array.




import java.util.*;

class FriendNode {
    int friendID;
    FriendNode next;

    public FriendNode(int friendID) {
        this.friendID = friendID;
        this.next = null;
    }
}

class User {
    int userID;
    String name;
    int age;
    FriendNode friendsHead; // Points to the list of friend IDs
    User next;

    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendsHead = null;
        this.next = null;
    }
}

class SocialMediaSystem {
    User head; // Head of the user list
    Scanner sc = new Scanner(System.in);

    public SocialMediaSystem() {
        head = null;
    }

    // Add a new user
    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Add a friend connection between two users
    public void addFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            addFriendToUser(user1, userID2);
            addFriendToUser(user2, userID1);
            System.out.println("Friendship between " + user1.name + " and " + user2.name + " added.");
        } else {
            System.out.println("User(s) not found.");
        }
    }

    private void addFriendToUser(User user, int friendID) {
        FriendNode newFriend = new FriendNode(friendID);
        if (user.friendsHead == null) {
            user.friendsHead = newFriend;
        } else {
            FriendNode temp = user.friendsHead;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newFriend;
        }
    }

    // Remove a friend connection between two users
    public void removeFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            removeFriendFromUser(user1, userID2);
            removeFriendFromUser(user2, userID1);
            System.out.println("Friendship between " + user1.name + " and " + user2.name + " removed.");
        } else {
            System.out.println("User(s) not found.");
        }
    }

    private void removeFriendFromUser(User user, int friendID) {
        if (user.friendsHead == null) return;
        if (user.friendsHead.friendID == friendID) {
            user.friendsHead = user.friendsHead.next;
        } else {
            FriendNode temp = user.friendsHead;
            while (temp.next != null && temp.next.friendID != friendID) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>();
            FriendNode temp1 = user1.friendsHead;
            while (temp1 != null) {
                FriendNode temp2 = user2.friendsHead;
                while (temp2 != null) {
                    if (temp1.friendID == temp2.friendID) {
                        mutualFriends.add(temp1.friendID);
                        break;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
            System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ": " + mutualFriends);
        } else {
            System.out.println("User(s) not found.");
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            FriendNode temp = user.friendsHead;
            System.out.print(user.name + "'s friends: ");
            while (temp != null) {
                User friend = findUserByID(temp.friendID);
                if (friend != null) {
                    System.out.print(friend.name + " ");
                }
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("User not found.");
        }
    }

    // Search for a user by Name or User ID
    public User findUserByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Count the number of friends for each user
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode friendTemp = temp.friendsHead;
            while (friendTemp != null) {
                count++;
                friendTemp = friendTemp.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMediaSystem system = new SocialMediaSystem();

        while (true) {
            System.out.println("\nSocial Media System Menu:");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Display Friends");
            System.out.println("6. Search for User by Name");
            System.out.println("7. Search for User by ID");
            System.out.println("8. Count Friends of Users");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userID = sc.nextInt();
                    sc.nextLine();  // consume the newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    system.addUser(userID, name, age);
                    break;

                case 2:
                    System.out.print("Enter User ID 1: ");
                    int userID1 = sc.nextInt();
                    System.out.print("Enter User ID 2: ");
                    int userID2 = sc.nextInt();
                    system.addFriend(userID1, userID2);
                    break;

                case 3:
                    System.out.print("Enter User ID 1: ");
                    userID1 = sc.nextInt();
                    System.out.print("Enter User ID 2: ");
                    userID2 = sc.nextInt();
                    system.removeFriend(userID1, userID2);
                    break;

                case 4:
                    System.out.print("Enter User ID 1: ");
                    userID1 = sc.nextInt();
                    System.out.print("Enter User ID 2: ");
                    userID2 = sc.nextInt();
                    system.findMutualFriends(userID1, userID2);
                    break;

                case 5:
                    System.out.print("Enter User ID: ");
                    userID = sc.nextInt();
                    system.displayFriends(userID);
                    break;

                case 6:
                    System.out.print("Enter Name: ");
                    sc.nextLine();  // consume the newline
                    name = sc.nextLine();
                    User user = system.findUserByName(name);
                    if (user != null) {
                        System.out.println("User found: " + user.name);
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter User ID: ");
                    userID = sc.nextInt();
                    user = system.findUserByID(userID);
                    if (user != null) {
                        System.out.println("User found: " + user.name);
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 8:
                    system.countFriends();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
