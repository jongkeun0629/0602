public class Main {
    public static void main(String[] args) {
        String mood = "happy";

        switch (mood){
            case "happy":
                System.out.println("^^");
                break;
            case "sad":
                System.out.println("ㅠㅠ");
                break;
            case "angry":
                System.out.println("화가 난다");
                break;
            case "tired":
                System.out.println("잠이 온다");
                break;
            default:
                System.out.println("몰루");
        }
    }
}