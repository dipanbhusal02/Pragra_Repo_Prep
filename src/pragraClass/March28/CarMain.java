package pragraClass.March28;

public class CarMain {
    public static void main(String[] args) {
        CanDrive drive = new CanDrive(179);

       try{ drive.canDrive();}
       catch (NotOfLegalAge e){
           System.out.println(e.getMessage());
       }

    }
}
