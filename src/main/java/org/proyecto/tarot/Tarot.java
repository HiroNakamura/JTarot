//package org.proyecto.tarot;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.awt.Color;



/*
@author yo
*/


public class Tarot extends JFrame{
private JTextField txtNombre,txtDiaNac,txtMes,txtAnyoNuevo;
private JTextArea textArea;
private JScrollPane scroller;

   public Tarot(){
   super("[JTarot ... los arcanos en Java ]"); 
	 setVisible(true);
	 setDefaultLookAndFeelDecorated(true);
     
	 
	 JPanel panel=new JPanel();   
	 JLabel lblImg= new JLabel(new ImageIcon(Prog03.class.getResource("JTarot.png")));
	 
	 panel.add(lblImg);
	 panel.add(new JLabel("<html><font color='blue'><b>Tu nombre:</b></font></html>"));
	 txtNombre=new JTextField(6);
	 txtNombre.setToolTipText("tu nombre");
	 panel.add(txtNombre);
	 panel.add(new JLabel("<html><font color='blue'><b>Día de nacimiento:</b></font></html>"));
	 txtDiaNac=new JTextField(6);
	 txtDiaNac.setToolTipText("el día que naciste");
	 panel.add(txtDiaNac);
	 panel.add(new JLabel("<html><font color='blue'><b>Mes de nacimiento:</b></font></html>"));
	 txtMes=new JTextField(6);
	 txtMes.setToolTipText("el mes");
	 panel.add(txtMes);
	 panel.add(new JLabel("<html><font color='blue'><b>Año nuevo que inicia:</b></font></html>"));
	 txtAnyoNuevo=new JTextField(6);
	 txtAnyoNuevo.setToolTipText("el año nuevo");
	 panel.add(txtAnyoNuevo);
	 
	 JButton calcular=new JButton("<html><font color='white'><b>Calcular</b></font></html>");
	 calcular.setToolTipText("obtener tu carta del tarot");
	  calcular.setBackground(Color.blue);
	  
	 calcular.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){
		
		
	String c1=obtenerSumaParc(txtDiaNac.getText().trim(),txtMes.getText().trim(),txtAnyoNuevo.getText().trim());
        JOptionPane.showMessageDialog(null, txtNombre.getText()+ " la carta que te corresponde es:\n"+tuCarta(obtenerSuma(c1)), "JTarot", JOptionPane.WARNING_MESSAGE, new ImageIcon(imgTarot(c1)));
        limpia();	 
		 }
	 });
	 panel.add(calcular);
	 JButton quitar=new JButton("<html><font color='yellow'><b>Quitar</b></font></html>");
	  quitar.setBackground(Color.red);
	 quitar.setToolTipText("quitar programa");
	  quitar.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){
		 System.exit(0);
		 }
	 });
	 
	 panel.add(quitar);
	 
	 
	 add(panel);
	 setSize(900,200);
     setLocationRelativeTo(null);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	 
	 
   }
   
   public static void main(String ... args)throws Exception{
   
      for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
	        if("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
				SplashScreen splash = new SplashScreen(10000);
                splash.showSplashOnly();
				new Tarot();
            } catch (Exception ex) {
            }
   
   }
}




public String imgTarot(String c){
String[] arcanos={"El-Mago.jpg","La-Papisa.jpg","La-Emperatriz.jpg","El-Emperador.jpg","El-Papa.jpg","El-Enamorado.jpg","El-Carro.jpg","La-Justicia.jpg","El-Ermitano.jpg","La-Rueda.jpg","La-Fuerza.jpg","El-Colgado.jpg","La-Muerte.jpg","La-Templanza.jpg","El-Diablo.jpg","La-Torre.jpg","La-Estrella.jpg","La-Luna.jpg","El-Sol.jpg","El-Juicio.jpg","El-Mundo.jpg","El-Loco.jpg"};

String tarot=null;
int aux=obtenerSuma(c);
//obtenerSuma(cadena);
for(int j=0;j<arcanos.length;j++){
  tarot=arcanos[aux-1];
}

return tarot;
}


// ------------- suma cadena  ----------------------------

static int obtenerSuma(String cad){
int sumaTotal=0;
  for(int i=0;i<cad.length();i++){
    char caracter=cad.charAt(i);
    String cadena=String.valueOf(caracter);
    sumaTotal+=Integer.parseInt(cadena);
  }
  return sumaTotal;
}

//----------------------------------------------


//-------- suma parcial -----------------------------------------

static String obtenerSumaParc(String dia,String mes, String nuevo){
  int sumaparc=0;
   int aux=0;
   String cade=null;
if(mes.equals("enero")){
   aux=1;
 
}
if(mes.equals("febrero")){
  aux=2;
 
}
if(mes.equals("marzo")){
  aux=3;
 
}
if(mes.equals("abril")){
  aux=4;
 
}
if(mes.equals("mayo")){
  aux=5;
 
}
if(mes.equals("junio")){
  aux=6;
 
}
if(mes.equals("julio")){
  aux=7;
 
}
if(mes.equals("agosto")){
  aux=8;
 
}
if(mes.equals("septiembre")){
  aux=9;
 
}
if(mes.equals("octubre")){
 aux=10;
 
}
if(mes.equals("noviembre")){
 aux=11;
   
}
if(mes.equals("diciembre")){
  aux=12;
 
 }
 
  sumaparc=Integer.parseInt(dia)+aux+Integer.parseInt(nuevo);
  cade=String.valueOf(sumaparc);
   
  return cade;

}

//-------- suma parcial -----------------------------------------


//  ----- tu carta -------------------------------------------------

static String tuCarta(int s){
  String horos=null;

  switch(s){
  case 1:
    horos="El Mago";
   
  break;
  case 2:
    horos="La Papisa";
   
  break;
  case 3:
   horos="La Emperatriz";
   
  break;
  case 4:
    horos="El Emperador";
  
  break;
  case 5:
    horos="El Papa";
   
  break;
  case 6:
    horos="El Enamorado";
   
  break;
  case 7:
    horos="El Carro";
   
  break;
  case 8:
    horos="La Justicia";
   
  break;
  case 9:
    horos="El Ermitaño";
   
  break;
  case 10:
    horos="La Rueda";
   
  break;
  case 11:
    horos="La Fuerza";
   
  break;
  case 12:
    horos="El Colgado";
   
  break;
  case 13:
    horos="La Muerte";
   
  break;
  case 14:
    horos="La Templanza";
   
  break;
  case 15:
    horos="El Diablo";
   
  break;
  case 16:
    horos="La Torre";
   
  break;
 case 17:
    horos="La Estrella";
   
  break;
  case 18:
    horos="La Luna";
   
  break;
  case 19:
    horos="El Sol";
   
  break;
  case 20:
    horos="El Juicio";
   
  break;
  case 21:
    horos="El Mundo";
   
  break;
  case 22:
    horos="El Loco";
   
   break;
}

  return horos;
 
}

// --- tu carta ----------------------------------------------------

// limpiar

public void limpia(){

   txtAnyoNuevo.setText("");
   txtDiaNac.setText("");
   txtMes.setText("");
   txtNombre.setText("");

}


//limpiar






}