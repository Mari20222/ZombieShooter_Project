package ru.samsung.gamestudio;

public class GameSettings {

    // Device settings

    public static final int SCREEN_WIDTH = 720;
    public static final int SCREEN_HEIGHT = 1280;

    // Physics settings

    public static final float STEP_TIME = 1f / 60f;
    public static final int VELOCITY_ITERATIONS = 6;
    public static final int POSITION_ITERATIONS = 6;
    public static final float SCALE = 0.05f;

    public static float SHOOTER_FORCE_RATIO = 5;
    public static float ZOMBIE_VELOCITY = 15;
    public static long STARTING_ZOMBIE_APPEARANCE_COOL_DOWN = 2000; // in [ms] - milliseconds
    public static int BULLET_VELOCITY = 80; // in [m/s] - meter per second
    public static int SHOOTING_COOL_DOWN = 1500; // in [ms] - milliseconds

    public static final short ZOMBIE_BIT = 2;
    public static final short SHOOTER_BIT = 4;
    public static final short BULLET_BIT = 8;

    // Object sizes

    public static final int SHOOTER_WIDTH = 150;
    public static final int SHOOTER_HEIGHT = 150;
    public static final int ZOMBIE_WIDTH = 240;
    public static final int ZOMBIE_HEIGHT = 200;
    public static final int BULLET_WIDTH = 15;
    public static final int BULLET_HEIGHT = 45;



}
