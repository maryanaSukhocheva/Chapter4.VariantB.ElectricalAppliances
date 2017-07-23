package chapter4.variantb.electricalappliances.entities;

import chapter4.variantb.electricalappliances.action.ElectricalNetworkUtils;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Iron extends ElectricalAppliance {
    private int heat;
    private boolean containsWater;

    public Iron(int power, int weight) {
        super(power, weight);
        ElectricalNetworkUtils.getAllAppliances().add(this);
    }

    public void steam(){
        if (this.containsWater)
            System.out.println("Отпаривание..");
        else System.out.println("Требуется вода для пара");
    }

    public void addWater(){
        this.containsWater = true;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Утюг: ").append("\n");
        str.append("мощность = ").append(getPower()).append("\n");
        str.append("вес = ").append(getWeight()).append("\n");
        str.append("температура = ").append(heat).append("\n");
        str.append("наличие воды в контейнере = ").append(containsWater);
       return  str.toString();
       
    }
}
