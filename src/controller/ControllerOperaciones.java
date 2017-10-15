/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.ViewOperaciones;
import model.ModelOperaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC11
 */
public class ControllerOperaciones implements ActionListener{
    
    private final ViewOperaciones viewoperaciones;
    private final ModelOperaciones modeloperaciones;
    
    public ControllerOperaciones(ViewOperaciones viewoperaciones, ModelOperaciones modelOperaciones){
        this.viewoperaciones = viewoperaciones;
        this.modeloperaciones = modelOperaciones;
        this.viewoperaciones.jbtn_suma.addActionListener(this);
        this.viewoperaciones.jbtn_resta.addActionListener(this);
        this.viewoperaciones.jbtn_mult.addActionListener(this);
        this.viewoperaciones.jbtn_divi.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewoperaciones.jbtn_suma)
            jbtn_sumaActionPerformed();
        else if(e.getSource()==viewoperaciones.jbtn_resta)
            jbtn_restaActionPerformed();
         else if(e.getSource()==viewoperaciones.jbtn_mult)
            jbtn_diviActionPerformed();
         else if(e.getSource()==viewoperaciones.jbtn_divi)
            jbtn_diviActionPerformed();
    }
    
    private void jbtn_sumaActionPerformed(){
        modeloperaciones.setOperador("+");
        viewoperaciones.jtf_RN.setText(modeloperaciones.getOperador());
    }
    
    private void jbtn_restaActionPerformed(){
        modeloperaciones.setOperador("-");
        viewoperaciones.jtf_RN.setText(modeloperaciones.getOperador());
    }
    private void jbtn_multiActionPerformed(){
        modeloperaciones.setOperador("*");
        viewoperaciones.jtf_RN.setText(modeloperaciones.getOperador());
    }
    private void jbtn_diviActionPerformed(){
        modeloperaciones.setOperador("/");
        viewoperaciones.jtf_RN.setText(modeloperaciones.getOperador());
    }
    
    private void initView(){
        viewoperaciones.jtf_RN.setText(modeloperaciones.getOperador());
    }
    
   
   
    
 
        
    
 
    
    
    
     
    
    
}