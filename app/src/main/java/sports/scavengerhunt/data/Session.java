package sports.scavengerhunt.data;

/**
 * Created by dave on 7/16/15.
 */
public class Session {
    private static boolean isLoggedIn;
    private static String currentUser;
    private static boolean isInGame;
    private static Game currentGame;

    public static void setUser(String user){
        currentUser = user;
    }

    public static void setLoggedInState(boolean loggedIn){
        isLoggedIn = loggedIn;
    }

    public static boolean isLoggedIn(){
        return isLoggedIn;
    }

    public static String currentUser(){
        return currentUser;
    }

    public static void setInGame(boolean startGame){
        isInGame = startGame;
    }

    public static boolean isInGame(){
        return isInGame;
    }

    public static void setGame(Game game){
        currentGame = game;
    }

    public static Game getCurrentGame(){
        return currentGame;
    }

    public static boolean authenticate(String user, String pw){
        if(true){//authentication success
            isLoggedIn = true;
            currentUser = user;
            return true;
        }
        return false;

    }

}
