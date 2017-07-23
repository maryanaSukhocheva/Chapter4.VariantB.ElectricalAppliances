package chapter4.variantb.electricalappliances.entities;

import chapter4.variantb.electricalappliances.action.ElectricalNetworkUtils;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Microwave extends ElectricalAppliance {
    private Mode mode;
    enum Mode{HEAT,ROAST,UNFREEZE,STEAM}
    
    public Microwave(int power, int weight ) {
        super(power, weight);
        ElectricalNetworkUtils.getAllAppliances().add(this);
    }

    public void heat(){
        this.mode = Mode.HEAT;
    }
    public void roast(){
        this.mode = Mode.ROAST;
    }
    public void unfreeze(){
        this.mode = Mode.UNFREEZE;
    }
    public void steam(){
        this.mode=Mode.STEAM;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Микроволновая печь: ").append("\n");
        str.append("мощность = ").append(getPower()).append("\n");
        str.append("вес = ").append(getWeight()).append("\n");
        str.append("режим работы = ").append(mode);
       return  str.toString();
       
    }
}



