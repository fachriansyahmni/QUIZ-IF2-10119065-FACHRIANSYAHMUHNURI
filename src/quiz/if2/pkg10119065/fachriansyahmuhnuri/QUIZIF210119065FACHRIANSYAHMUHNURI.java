package quiz.if2.pkg10119065.fachriansyahmuhnuri;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program kasir
 */
public class QUIZIF210119065FACHRIANSYAHMUHNURI {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        
        String name,email;
        
        System.out.println("==Program Kasir Rock n Roll Haircut===");
        System.out.print("Customer Name = ");
        
        customer.setName(sc.next());
        System.out.print("Customer Email = ");
        customer.setEmail(sc.next());
        
        System.out.println("");
        ServicePrice servicePrice = new ServicePrice();
        servicePrice.displayService();
        System.out.print("Choose (1/2/3) : ");
        servicePrice.setPriceService(sc.nextInt());
        System.out.print("Are you member (yes/no) : ");
        String is_member = sc.next();
        boolean cekMember;
        if(is_member.equals("member")) {
            cekMember = true;
        }else{
            cekMember = false;
        }
        customer.setMember(cekMember);
        
    }
    
}
