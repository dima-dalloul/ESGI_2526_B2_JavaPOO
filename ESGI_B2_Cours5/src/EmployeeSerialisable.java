import java.io.Serializable;

public class EmployeeSerialisable implements Serializable {
    private String name;
    private String address;
    private transient int numeroSecuriteSociale;
    private int numero;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    public void setNumeroSecuriteSociale(int numeroSecuriteSociale) {
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
