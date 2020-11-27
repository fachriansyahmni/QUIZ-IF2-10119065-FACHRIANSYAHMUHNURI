package quiz.if2.pkg10119065.fachriansyahmuhnuri;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program kasir
 */
public interface ServiceItem {
    public void displayService();
    public float getPrice();
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
}
