/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joesautomotive;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Arod6
 */
class ServicesPanel extends JPanel {

    public final double OIL_CHANGE = 26.00;
    public final double LUBE_JOB = 18.00;
    public final double RADIATOR_FLUSH = 30.00;
    public final double TRANSMISSION_FLUSH = 80.00;
    public final double INSPECTION = 15.00;
    public final double MUFFLER_REPLACEMENT = 100.00;
    public final double TIRE_ROTATION = 20.00;
    public final double HOURLY_RATE = 20.00;

    private JTextField hourlyRateField;
    private JCheckBox oilChange; //to select cream cheese
    private JCheckBox lubeJob; //to select butter
    private JCheckBox radiatorFlush; //to select peach jelly
    private JCheckBox tramissionFlush;
    private JCheckBox inpection;
    private JCheckBox mufflerReplacement;
    private JCheckBox tireRation;
    private JCheckBox nonRoutine;

    public ServicesPanel() {
        setLayout(new GridLayout(4, 1,3,3));//orginal 4-1

        //create the check boxes
        nonRoutine = new JCheckBox("hourly Rate");
        hourlyRateField = new JTextField("hourly Rate");
        oilChange = new JCheckBox("Oil Change");
        lubeJob = new JCheckBox("lube Job");
        radiatorFlush = new JCheckBox("Radiator Flush");
        tramissionFlush = new JCheckBox("Transmission Flush");
        inpection = new JCheckBox("Inpection");
        mufflerReplacement = new JCheckBox("Muffler Replacement");
        tireRation = new JCheckBox("Tire Rotation");

        //add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Services"));

        //add the check boxes to the panel.
        add(hourlyRateField,add(nonRoutine));
        add(oilChange);
        add(lubeJob);
        add(radiatorFlush);
        add(tramissionFlush);
        add(inpection);
        add(mufflerReplacement);
        add(tireRation);

    }

    double getServicesCost() {
        String kb;
        double servicesCost = 0.0;
        double nonRoutineCost = 0.0;

        if (oilChange.isSelected()) {
            servicesCost += OIL_CHANGE;
        }
        if (lubeJob.isSelected()) {
            servicesCost += LUBE_JOB;
        }
        if (radiatorFlush.isSelected()) {
            servicesCost += RADIATOR_FLUSH;
        }
        if (tramissionFlush.isSelected()) {
            servicesCost += TRANSMISSION_FLUSH;
        }
        if (inpection.isSelected()) {
            servicesCost += INSPECTION;
        }
        if (mufflerReplacement.isSelected()) {
            servicesCost += MUFFLER_REPLACEMENT;
        }
        if (tireRation.isSelected()) {
            servicesCost += INSPECTION;
        }

        if (nonRoutine.isSelected()) {
            kb = hourlyRateField.getText();
            nonRoutineCost = Double.parseDouble(kb) * 20;
            servicesCost += nonRoutineCost;
        }
        return servicesCost;
    }

}
