package chainofresponsibility;

public class VAT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.01);
        System.out.println("VAT calculated");
        if(invoice.getAmount()<=100){
            // do not calculate any other taxes
            return invoice.getTax();
        }else {
            return successor.applyTax(invoice);
            // need to calculate taxes
        }
    }
}
