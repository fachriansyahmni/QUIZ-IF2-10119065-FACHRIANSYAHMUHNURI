package quiz.if2.pkg10119065.fachriansyahmuhnuri;

/**
 *
 * @author Fachriansyah PC
 */
public class ServicePrice implements ServiceItem{
    private float priceService, discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    
    
    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service Listt*****#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash : IDR 55K");
        System.out.println("3. Hairwash only : IDR 15K");
        System.out.println("#*************************#");
    }

    @Override
    public float getPrice() {
        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if(statusMember == "member") return true;
        return false;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        return 1;
    }
}
