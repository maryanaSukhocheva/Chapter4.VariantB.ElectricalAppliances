package chapter4.variantb.electricalappliances.entities;

import chapter4.variantb.electricalappliances.action.ElectricalNetworkUtils;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Fan extends ElectricalAppliance {
    private int mode;
   
    public Fan(int power, int weight) {
        super(power, weight);
        ElectricalNetworkUtils.getAllAppliances().add(this);
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public int getMode() {
        return mode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.mode;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fan other = (Fan) obj;
        if (this.mode != other.mode) {
            return false;
        }
        return true;
    }

   
   @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Фен: ").append("\n");
        str.append("мощность = ").append(getPower()).append("\n");
        str.append("вес = ").append(getWeight()).append("\n");
        str.append("количество режимов работы = ").append(mode);
       return  str.toString();
    }
   
}
