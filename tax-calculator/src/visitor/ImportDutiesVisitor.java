package visitor;

import abstractFactory.ElectronicsDepartment;
import abstractFactory.EntertainmentDepartment;
import abstractFactory.Product;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class ImportDutiesVisitor implements Visitor {
    private final double taxablePrice = 518.0;

    @Override
    public void visit(ElectronicsDepartment electronics) {
        final double taxCoefficient = 1.10;
        double productPrice = electronics.getPrice();
        if (productPrice > taxablePrice) {
            electronics.setPrice(productPrice * taxCoefficient);
            System.out.println("Import duties tax is applied: x" + taxCoefficient + " = " +
                    String.format("%.2f" , electronics.getPrice()));
        }
    }

    @Override
    public void visit(EntertainmentDepartment entertainment) {
        final double taxCoefficient = 1.03;
        double productPrice = entertainment.getPrice();
        if (productPrice > taxablePrice) {
            entertainment.setPrice(productPrice * taxCoefficient);
            System.out.println("Import duties tax is applied: x" + taxCoefficient + " = " +
                    String.format("%.2f" , entertainment.getPrice()));
        }
    }
}