package pragraClass.assignment.reportGenerator;

public class Main {
    public static void main(String[] args) {
        ReportGenerator report = new ExcelReport();
        ReportSetvice reportSetvice = new ReportSetvice();

        reportSetvice.genetate(report);
    }
}
