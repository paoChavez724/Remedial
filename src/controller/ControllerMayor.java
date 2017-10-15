/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import view.ViewMayor;
import model.ModelMayor;

/**
 *
 * @author PC11
 */
public class ControllerMayor {
     ViewMayor viewmayor;
    ModelMayor modelmayor;

    public ControllerMayor(ViewMayor viewmayor, ModelMayor modelmayor) {
        this.viewmayor = viewmayor;
        this.modelmayor = modelmayor;
        initView();
    }

    public void initView() {

        viewmayor.jbtn_mayor.addActionListener(e -> jtbn_obtener_mayor_click());
        viewmayor.setVisible(true);
    }

    public void jtbn_obtener_mayor_click() {
        modelmayor.setN1(Integer.parseInt( viewmayor.jtf_N1.getText()));
        modelmayor.setN2(Integer.parseInt( viewmayor.jtf_N2.getText()));
        modelmayor.setN3(Integer.parseInt( viewmayor.jtf_N3.getText()));
        modelmayor.Mayor();
        viewmayor.jtf_MN.setText(String.valueOf(modelmayor.getMN()));
    }
}
