package visitor;

import abstractFactory.ElectronicsDepartment;
import abstractFactory.EntertainmentDepartment;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public interface Visitor {
    public void visit(ElectronicsDepartment electronics);
    public void visit(EntertainmentDepartment entertainment);
}
