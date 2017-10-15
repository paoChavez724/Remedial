/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import view.*;
import model.*;
import controller.*;
/**
 *
 * @author PC11
 */
public class Main {
    private static ViewPrincipal viewprincipal;
    private static ModelPrincipal modelprincipal;
    private static ControllerPrincipal controllerprincipal;
    
    private static ViewMayor viewmayor;
    private static ModelMayor  modelmayor;
    private static ControllerMayor  controllermayor;
    
   // private static ViewMayor viewmayor;
  //  private static ModelMayor  modelmayor;
    //private static ControllerMayor  controllermayor;
    
   // private static ViewMayor viewmayor;
   // private static ModelMayor  modelmayor;
   // private static ControllerMayor  controllermayor;
    
    /**
    
     */
    public static void main(String[] pao) {
        
        viewmayor = new ViewMayor();
       modelmayor = new ModelMayor();
       controllermayor = new ControllerMayor(viewmayor, modelmayor);
       
       viewprincipal = new ViewPrincipal();
       modelprincipal = new ModelPrincipal();
      //controllerprincipal = new ControllerPrincipal (viewprincipal, viewmayor, modelprincipal);
       
    }
    
}
