import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialisable {
    public static void main(String[] args){
        EmployeeSerialisable employe = new EmployeeSerialisable();
        employe.setName("Sarah");
        employe.setAddress("10 rue de la paix, Grenoble");
        employe.setNumeroSecuriteSociale(123456789);
        employe.setNumero(612345678);

        try{
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employe);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
