public class Main {
    public static void main(String[] args) {
        Reports reports = new Reports("Отчет", "Заработная плата");
        System.out.println(reports);
        Reports reportsClon = reports.copy();
        reportsClon.setName("Отчет-копия");
        System.out.println("~~~~~~~~~~~\n" + reportsClon);
    }

}