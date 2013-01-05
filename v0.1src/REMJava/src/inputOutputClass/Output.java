package inputOutputClass;

/**
 *
 * @author onigiri
 */
public final class Output {
    /**
     *
     * @param string - if doFormat = true, put as if using System.out.format, else System.out.println
     * @param doFormat - determines if formatting is needed
     */
    public static void puts(String string, boolean doFormat) {
        if (doFormat == false) {
            System.out.println(string);
        } else if (doFormat == true) {
            System.out.format(string);
        }
    }
}
