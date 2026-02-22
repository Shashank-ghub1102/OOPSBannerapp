/**
 * OOPSBannerApp UC4
 * Render OOPS Banner using String Array and Loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // 1️⃣ Create String array for 7 banner lines
        String[] lines = new String[7];

        // 2️⃣ Populate each line using String.join()

        lines[0] = String.join(" ",
                " *** ", " *** ", "*****", "*****"
        );

        lines[1] = String.join(" ",
                "** **", "** **", "*   *", "**"
        );

        lines[2] = String.join(" ",
                "** **", "** **", "***** ","*****"
        );

        lines[3] = String.join(" ",
                "** **", "** **", "**    ", "   **"
        );

        lines[4] = String.join(" ",
                "** **", "** **", "**    ", "   **"
        );

        lines[5] = String.join(" ",
                "** **", "** **", "**    ", "** **"
        );

        lines[6] = String.join(" ",
                " *** ", " *** ", "**    ", "*****"
        );

        // 3️⃣ Use enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}