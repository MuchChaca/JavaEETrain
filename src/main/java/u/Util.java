package u;

/**
 *
 * @author archuser
 */
public class Util {
    /**
     * SUPP/DEBUG
     */
    // BackgroundColor + TextColor
    // Some don't have background cause they are bright
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[47m" + "\u001B[30m";
    public static final String ANSI_RED = "\u001B[47m" + "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[47m" + "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[47m" + "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[46m" + "\u001B[37m";
    /**
     * <h2>Use with a dark theme like Dracula</h2>
     * Uses <i>System.out.println</i> to print in <b>Blue</b>
     * @param s The string to print
     */
    public static final void printBlue(String s){
        System.out.println(Util.ANSI_BLUE + s + Util.ANSI_RESET);
    }
    /**
     * <h2>Use with a dark theme like Dracula</h2>
     * Uses <i>System.out.println</i> to print in <b>Cyan</b>
     * @param s The string to print
     */
    public static final void printCyan(String s){
        System.out.println(Util.ANSI_CYAN + s + Util.ANSI_RESET);
    }
    /**
     * <h2>Use with a dark theme like Dracula</h2>
     * Uses <i>System.out.println</i> to print in <b>Black</b>
     * @param s The string to print
     */
    public static final void printBlack(String s){
        System.out.println(Util.ANSI_BLACK + s + Util.ANSI_RESET);
    }
    /**
     * <h2>Use with a dark theme like Dracula</h2>
     * Uses <i>System.out.println</i> to print in <b>Cyan</b>
     * @param s The string to print
     */
    public static final void printRed(String s){
        System.out.println(Util.ANSI_RED + s + Util.ANSI_RESET);
    }
    /**
     * <h2>Use with a dark theme like Dracula</h2>
     * Uses <i>System.out.println</i> to print in <b>Green</b>
     * @param s The string to print
     */
    public static final void printGreen(String s){
        System.out.println(Util.ANSI_GREEN + s + Util.ANSI_RESET);
    }
    /**
     * <h2>Use with a dark theme like Dracula</h2>
     * Uses <i>System.out.println</i> to print in <b>Yellow</b>
     * @param s The string to print
     */
    public static final void printYel(String s){
        System.out.println(Util.ANSI_YELLOW + s + Util.ANSI_RESET);
    }
    /**
     * <h2>Use with a dark theme like Dracula</h2>
     * Uses <i>System.out.println</i> to print in <b>Purple</b>
     * @param s The string to print
     */
    public static final void printPur(String s){
        System.out.println(Util.ANSI_PURPLE + s + Util.ANSI_RESET);
    }
    /**
     * <h2>Use with a dark theme like Dracula</h2>
     * Uses <i>System.out.println</i> to print in <b>White</b>
     * @param s The string to print
     */
    public static final void printWhite(String s){
        System.out.println(Util.ANSI_WHITE + s + Util.ANSI_RESET);
    }
}