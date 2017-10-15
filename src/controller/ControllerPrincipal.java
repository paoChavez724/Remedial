/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewPrincipal;
import model.ModelPrincipal;
import view.ViewMayor;
import view.ViewOperaciones;


/**
 *
 * @author PC11
 */
public class ControllerPrincipal implements ActionListener {
    ViewPrincipal viewprincipal;
    ViewMayor viewmayor;
    ViewOperaciones modeloperaciones;
    ModelPrincipal modelprincipal;
    
    
    public ControllerPrincipal( ViewPrincipal viewprincipal,ViewMayor viewmayor,ViewOperaciones modeloperaciones, ModelPrincipal modelprincipal){
        this.viewprincipal = viewprincipal;
        this.viewmayor = viewmayor;
        this.modeloperaciones = modeloperaciones;
        this.modelprincipal = modelprincipal;
        this.viewprincipal.jmi_mayor.addActionListener(this);
        initView();
    }
   
    

    
    private void initView(){
        this.viewprincipal.setLocationRelativeTo(null);
        this.viewprincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
    

