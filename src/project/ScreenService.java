package project;

import project.LockedMe;
import project.Screen;
import project.WelcomeScreen;
import project.Directory;


public class ScreenService {
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static LockedMe FileOptionsScreen = new LockedMe();
    
    public static Screen CurrentScreen = WelcomeScreen;
    public static Screen getCurrentScreen()
    {
        return CurrentScreen;
    }
    public static void setCurrentScreen(Screen currentScreen)
    {
        CurrentScreen = currentScreen;
    }   
}