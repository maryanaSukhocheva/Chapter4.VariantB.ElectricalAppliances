package chapter4.variantb.electricalappliances.main;

import chapter4.variantb.electricalappliances.action.ElectricalNetworkUtils;
import chapter4.variantb.electricalappliances.entities.Fan;
import chapter4.variantb.electricalappliances.entities.Iron;
import chapter4.variantb.electricalappliances.entities.Microwave;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {



    public static void main(String[] args) {

        Fan f1 = new Fan(150,2);
        Fan f2 = new Fan(200,1);
            f1.setTurnedOn();
            f1.setMode(4);
            Iron i1 = new Iron(2000,3);
        Iron i2 = new Iron(1500,5);
            i2.addWater();
            i2.setTurnedOn();
            i2.setHeat(12);
            i2.steam();
        Microwave m1 = new Microwave(350,10);
        Microwave m2 = new Microwave(500,15);
            m1.setTurnedOn();
            m1.heat();


        System.out.println("Приборы, включенные в сеть:");
        ElectricalNetworkUtils.outputTurnedOn();
        System.out.println();
        System.out.println("Суммарная мощность: " + ElectricalNetworkUtils.summaryPower());
        System.out.println();

        System.out.println("Приборы, отсортированные по мощности:");
        ElectricalNetworkUtils.sortByPower();
        ElectricalNetworkUtils.outputAll();
        int power=2000;
        int weight = 15;
        System.out.println("\nПриборы с мощностью меньше " + power +
                " и весом меньше, чем " + weight + ": ");
        System.out.println(ElectricalNetworkUtils.findApplianceByCriterion(power,weight));

    }

}
