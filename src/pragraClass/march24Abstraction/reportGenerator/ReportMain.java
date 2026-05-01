package pragraClass.march24Abstraction.reportGenerator;

public class ReportMain {
    public static void main(String[] args) {
        ReportGenerator generator = new ExcelReport();
        generator.generateReport();
      ReportGenerator  pdf= new PDFReport();
        generator.generateReport();
    }

}
