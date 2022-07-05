public class Main {

    public static void main(String[] args) {
        int ticketPrice = 10_025;
        int milesPrice = 20;
        int bonusMiles = ticketPrice / milesPrice;

        System.out.println("Количество бонусных миль " + bonusMiles);
    }
}