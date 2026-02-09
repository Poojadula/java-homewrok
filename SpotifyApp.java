import java.util.Scanner;

public class SpotifyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== 🎵 SPOTIFY MUSIC APP 🎵 =====");
        System.out.println("Select Music Director:");
        System.out.println("1 → A R Rahman");
        System.out.println("2 → Anirudh");
        System.out.println("3 → Yuvan Shankar Raja");

        int director = sc.nextInt();

        switch (director) {

            // ================= A R RAHMAN =================
            case 1:
                System.out.println("\nA R Rahman Selected");
                System.out.println("Select Music Type:");
                System.out.println("1 → Melody");
                System.out.println("2 → Folk");

                int type1 = sc.nextInt();

                if (type1 == 1) {
                    System.out.println("\nSongs:");
                    System.out.println("1 → Munbe Vaa");
                    System.out.println("2 → Ennavale");

                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Munbe Vaa");
                    else if (song == 2)
                        System.out.println("Now Playing : Ennavale");
                    else
                        System.out.println("❌ Invalid song selection");

                } else if (type1 == 2) {
                    System.out.println("\nSongs:");
                    System.out.println("1 → Kummi Adi");
                    System.out.println("2 → Magudi");

                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Kummi Adi");
                    else if (song == 2)
                        System.out.println("Now Playing : Magudi");
                    else
                        System.out.println("❌ Invalid song selection");

                } else {
                    System.out.println("❌ Invalid music type");
                }
                break;

            // ================= ANIRUDH =================
            case 2:
                System.out.println("\nAnirudh Selected");
                System.out.println("Select Music Type:");
                System.out.println("1 → Melody");
                System.out.println("2 → Folk");

                int type2 = sc.nextInt();

                if (type2 == 1) {
                    System.out.println("\nSongs:");
                    System.out.println("1 → Kannamma");
                    System.out.println("2 → Naan Pizhai");

                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Kannamma");
                    else if (song == 2)
                        System.out.println("Now Playing : Naan Pizhai");
                    else
                        System.out.println("❌ Invalid song selection");

                } else if (type2 == 2) {
                    System.out.println("\nSongs:");
                    System.out.println("1 → Vaathi Coming");
                    System.out.println("2 → Arabic Kuthu");

                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Vaathi Coming");
                    else if (song == 2)
                        System.out.println("Now Playing : Arabic Kuthu");
                    else
                        System.out.println("❌ Invalid song selection");

                } else {
                    System.out.println("❌ Invalid music type");
                }
                break;

            // ================= YUVAN =================
            case 3:
                System.out.println("\nYuvan Shankar Raja Selected");
                System.out.println("Select Music Type:");
                System.out.println("1 → Melody");
                System.out.println("2 → Folk");

                int type3 = sc.nextInt();

                if (type3 == 1) {
                    System.out.println("\nSongs:");
                    System.out.println("1 → Idhazhin Oram");
                    System.out.println("2 → Venmegam");

                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Idhazhin Oram");
                    else if (song == 2)
                        System.out.println("Now Playing : Venmegam");
                    else
                        System.out.println("❌ Invalid song selection");

                } else if (type3 == 2) {
                    System.out.println("\nSongs:");
                    System.out.println("1 → Otha Sollaala");
                    System.out.println("2 → Rowdy Baby");

                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Otha Sollaala");
                    else if (song == 2)
                        System.out.println("Now Playing : Rowdy Baby");
                    else
                        System.out.println("❌ Invalid song selection");

                } else {
                    System.out.println("❌ Invalid music type");
                }
                break;

            // ================= INVALID =================
            default:
                System.out.println("❌ Invalid music director");
        }

        sc.close();
    }
}