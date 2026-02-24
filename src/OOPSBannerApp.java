/**
 * OOPSBannerApp UC5
 * Render OOPS Banner using Inline Array Initialization
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare + Initialize + Populate array INLINE
        String[] lines = {

            String.join(" ",
                    " *** ", " *** ", "******", "*****"
            ),

            String.join(" ",
                    "** **", "** **", "**    ", "**"
            ),

            String.join(" ",
                    "** **", "** **", "***** ", "*****"
            ),

            String.join(" ",
                    "** **", "** **", "**    ", "   **"
            ),

            String.join(" ",
                    "** **", "** **", "**    ", "   **"
            ),

            String.join(" ",
                    "** **", "** **", "**    ", "** **"
            ),

            String.join(" ",
                    " *** ", " *** ", "**    ", "*****"
            )
        };

        //  Loop through array
        for (String line : lines) {
            System.out.println(line);
        }
    }
}