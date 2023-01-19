package com.learning.project;

public class TwitterApplication {

    //1. Array of users
    private User allUsers[];
    //add user -> adds the user object to allUsers
    //get user -> checks for the id in the array of users and returns me matching id's user

    //2. Array of tweets
    private Tweet allTweets[];

    //3. Maximum no of users present in the application
    private int maxUserId; // 1 -> 100

    //4. Maximum no of tweets tweeted in the application
    private int maxTweetId; // 1 -> 200

    //Default Constructor -> Initialization
    public TwitterApplication() {
        this.allUsers = new User[100];
        this.allTweets = new Tweet[200];

        this.maxUserId = 0; //usercount -> 0 -> 99
        this.maxTweetId = 0;
    }

    public static void main(String[] args) {
        User rishabh = new User(123, "Rishabh");
        User richard = new User(345, "Richard");

        TwitterApplication application = new TwitterApplication();
        application.addUser(rishabh); //allUsers -> 0 ->rishabh obj
        application.addUser(richard); //allUsers -> 1 ->richard obj

        User fetchedUser = application.getUser(123);
        System.out.println("Fetched user :- " + fetchedUser);

        User fetchedUser2 = application.getUser(896);
        System.out.println("Fetched user :- " + fetchedUser2);
    }

    //Add user to the application
    public void addUser(User user) {
        allUsers[maxUserId] = user;
        maxUserId++;
    }

    public User getUser(int userId) {
        //allUsers -> new User(123, "Rishabh"), new User(345, "Richard")
        //getUser(123) -> return -> new User(123, "Rishabh")
        //getUser(567) -> null

        for (int i = 0; i < maxUserId; i++) {
            User currentIteratedUser = allUsers[i];
            if (currentIteratedUser.getUserId() == userId) {
                return currentIteratedUser;
            }
        }
        return null;
    }
}
