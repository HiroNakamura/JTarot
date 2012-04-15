/*
  JTarot - https://github.com/HiroNakamura/JTarot
 
  Es un proyecto sencillo, lo mejorare en cuanto pueda
 
*/

package org.proyecto.tarot;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



public class TarotTest extends JFrame{
final   private JTextField txtDia;
final    private JTextField txtMes;
final    private JTextField txtNuevo;
   private JButton btnMostrar;
   private JButton btnSalir;


   public TarotTest(){

   JLabel lblDia= new JLabel();
   lblDia.setText("Dia de nacimiento:");

   txtDia=new JTextField(6);


   JLabel lblMes= new JLabel();
   lblMes.setText("Mes de nacimiento:");

   txtMes=new JTextField(6);



  JLabel lblNuevo= new JLabel();
   lblNuevo.setText("Año que inicia:");

   txtNuevo=new JTextField(6);



   btnMostrar= new JButton("Mostrar");
       
   btnMostrar.addActionListener(new ActionListener()
   {
      public void actionPerformed(ActionEvent e) {
        
       String c1=obtenerSumaParc(txtDia.getText(),txtMes.getText(),txtNuevo.getText());
        //obtenerSuma(c1);
        //tuCarta(obtenerSuma(c1))
         

        JOptionPane.showMessageDialog(null,"La carta que te corresponde es:"+tuCarta(obtenerSuma(c1)));

        limpia();


      }

  });


  
   btnSalir= new JButton("Salir");
       
   btnSalir.addActionListener(new ActionListener()
   {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }

  });
   

  

   

   JPanel panel= new JPanel();  

   panel.setVisible(true); 
   
    panel.add(lblDia);   
     panel.add(txtDia); 
    panel.add(lblMes);   
     panel.add(txtMes); 
   panel.add(lblNuevo);   
     panel.add(txtNuevo); 
     panel.add(btnMostrar);
    panel.add(btnSalir);
    




    

    setTitle("Tarot Java by U-MAN");
	setVisible(true);
	setDefaultLookAndFeelDecorated(true);
    setSize(800,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(panel);
   }


    public static void main(String[] args)throws Exception{

	for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
          if("Nimbus".equals(laf.getName()))
	try {
	        UIManager.setLookAndFeel(laf.getClassName());
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel" ) ;
		    //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new TarotTest();
            
		}
		catch (ClassNotFoundException e) {
			System.out.println("[Main.main:ClassNotFoundException]"+ e.getMessage());
		}
		catch (InstantiationException e) {
			System.out.println("[Main.main:InstantiationException]"+ e.getMessage());
		}
		
	}
		
		
	
		
		
			
     

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

   txtNuevo.setText("");
   txtDia.setText("");
   txtMes.setText("");

}


//limpiar




}
