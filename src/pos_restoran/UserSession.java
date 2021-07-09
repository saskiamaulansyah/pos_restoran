/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_restoran;

/**
 *
 * @author A455L
 */
public class UserSession {

    private static String username;

    public static void setUserLogin(String username) {
        UserSession.username = username;

    }

    public static String getUserLogin() {
        return username;
    }
}
