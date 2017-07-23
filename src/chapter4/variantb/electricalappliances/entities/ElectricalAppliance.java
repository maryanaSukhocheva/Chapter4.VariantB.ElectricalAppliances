package chapter4.variantb.electricalappliances.entities;

import chapter4.variantb.electricalappliances.action.ElectricalNetworkUtils;

/**
 *
 * @author Sukhocheva Maryana
 */

public class ElectricalAppliance implements Comparable<ElectricalAppliance> {
    private int power;
    private int weight;
    private boolean isTurnedOn;

    public ElectricalAppliance() {
    }

    
    public ElectricalAppliance(int power, int weight ) {
        this.power = power;
        this.weight = weight;
        this.isTurnedOn = false;
    }

    public void setTurnedOn(){
        this.isTurnedOn=true;
        ElectricalNetworkUtils.getAppliancesTurnedOn().add(this);
    }
    public void setTurnedOff(){
        this.isTurnedOn=false;
        ElectricalNetworkUtils.getAppliancesTurnedOn().remove(this);
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(ElectricalAppliance o)
    {
        return this.getPower() - o.getPower();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.power;
        hash = 67 * hash + this.weight;
        hash = 67 * hash + (this.isTurnedOn ? 1 : 0);
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
        final ElectricalAppliance other = (ElectricalAppliance) obj;
        if (this.power != other.power) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (this.isTurnedOn != other.isTurnedOn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Электроприбор: ").append("\n");
        str.append("мощность = ").append(power).append("\n");
        str.append("вес = ").append(weight).append("\n");
        str.append("включенный = ").append(isTurnedOn);
        return  str.toString();
    }
}