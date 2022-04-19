
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno A = new Aluno();
        A.setM1(sc.nextLine());
        A.setM2(sc.nextLine());
        A.calc_media();
        System.out.println(A.getMedia());
    }
}