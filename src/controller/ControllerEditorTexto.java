/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import view.ViewEditorTexto;
import model.ModelEditorTexto;

/**
 *
 * @author mark
 */
public class ControllerEditorTexto {
    private ViewEditorTexto view_editortexto;
    private ModelEditorTexto model_editortexto;
    private FileReader fr = null;
    private JFileChooser jfc = new JFileChooser();
    
    
public ControllerEditorTexto(ModelEditorTexto model_editortexto, ViewEditorTexto view_editortexto){
       this.model_editortexto = model_editortexto;
       this.view_editortexto = view_editortexto;



}
    
    
    
  private void jmi_abrir(){
  try{
      jfc.showOpenDialog(view_editortexto);
      
      model_editortexto.setArchivo(jfc.getSelectedFile());
      
      fr = new FileReader (model_editortexto.getArchivo());
      int character = 0;
      String texto = "";
      while((character = fr.read())!=-1){
          texto +=(char) character;
      
      }
      fr.close();
      view_editortexto.jta_archivo.setText(texto);
      
  } catch (FileNotFoundException e){
  
      System.err.println("Archivo no encontrado");
  }
  catch(IOException e){
          System.err.println("Error en el archivo");
     }
  finally{
          try{
          fr.close();
          }
          catch(IOException err){
            System.err.println("Error al correr");
          }
          
          }//finally 
  
   }//abrir 
} //class
