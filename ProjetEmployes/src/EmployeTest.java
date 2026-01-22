public class EmployeTest {
    public static void main(String[] args){
        Employe employe1 = new Employe("Emma", 4, 3251, "Pilote");
        employe1.setAge(25);
        employe1.afficheEmploye();

        Employe employe2 = new Employe("Pierre", 23, 5000, "Poste de fou");
        employe2.afficheEmploye();

        employe2.blamerEmploye();
        employe1.feliciterEmploye();
    }
}
