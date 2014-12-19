package visitor;

import abstractFactory.ElectronicsDepartment;
import abstractFactory.EntertainmentDepartment;
import abstractFactory.Product;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class VATVisitor implements Visitor {
    private final double taxablePrice = 75.0;
    private final double taxCoefficient = 1.21;

    private void applyVAT(Product product) {
        double productPrice = product.getPrice();
        if (productPrice > taxablePrice) {
            product.setPrice(productPrice * taxCoefficient);
            System.out.println("VAT tax is applied: x" + taxCoefficient + " = " +
                    String.format("%.2f" , product.getPrice()));
        }
    }

    @Override
    public void visit(ElectronicsDepartment electronics) {
        applyVAT(electronics);
    }

    @Override
    public void visit(EntertainmentDepartment entertainment) {
        applyVAT(entertainment);
    }

}
