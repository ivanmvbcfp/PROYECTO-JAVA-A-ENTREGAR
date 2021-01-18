
package misrc;


public class Main1 {


    public static void main(String[] args) {
        int nota;
        System.out.println("Ingrese una nota = ");
        nota = Entrada.readInt();
        switch(nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("APROBADA");break;
            case 6:
            case 7: System.out.println("BIEN");break;
            case 8:
            case 9: System.out.println("NOTABLE");break;
            case 10: System.out.println("SOBRESALIENTE");break;
            default: System.out.println("NO VALIDA");
    }
   }
}
