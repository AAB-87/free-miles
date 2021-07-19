public class Main {
    public static void main(String[] args) {
        double ticket_price = 357.7;
        int one_mile = 20;
        double total_miles = ticket_price/one_mile;
        double free_miles = (int) total_miles;
        System.out.println(free_miles);
    }
}
