package Forms;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ope extends FrmClase { 

   @Override
   public void actionPerformed(ActionEvent e){
       jf.setVisible(true);//COMANDO QUE PERMITE MOSTRAR EL FORMULARIO
        //VARIABLES CON LAS CUALES GUARDAREMOS LAS DATOS DE LOS JTEXFIELD PARA HACER COMPARACIONES
        String cedula = jt2.getText(), cod = jt6.getText();

        //CONDICIONAL QUE EJECUTA EL BOTON BUSCAR
        if(e.getSource()==btB){
            //DATOS DE UN USUARIO PREDEFINIDO

            if("0001".equals(cedula)){
                jt3.setText("James Logan");
                jt4.setText("3105124768");
                jt5.setText("Calle 2a oeste #66-87");
                //ERROR SI EL USUARIO NO ESTA EN EL SISTEMA
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no se encuentra.");
            }
        }

        //CONDICIONAL QUE EJECUTA EL BOTON BUSCAR CODIGO
        if(e.getSource()==btC){
            //CONDICIONALES QUE SI SE CUMPLEN MOSTRARAN LA DESCRIPCION Y EL VALOR UNITARIO DE DICHO PRODUCTO
            if("1010".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/2x2.jpg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("2020".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/3x3.jpg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 1; i < 2; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("3030".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/42x42.jpeg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 2; i < 3; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("4040".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/42y42.jpeg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 3; i < 4; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("5050".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/6x6.jpg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 4; i < 5; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("6060".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/7x7.jpg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 5; i < 6; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("7070".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/Ball_megaminx.jpg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 6; i < 7; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("8080".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/mirror.jpg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 7; i < 8; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("9090".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/pyraminx.jpg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 8; i < 9; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            } else if("0000".equals(cod)){
                ImageIcon foto = new  ImageIcon(getClass().getResource("/ImagenesF/skewb.jpg"));
                ImageIcon mitad = new
                        ImageIcon(foto.getImage().getScaledInstance(jIFOTO.getWidth(), jIFOTO.getHeight(),Image.SCALE_DEFAULT));
                jIFOTO.setIcon(mitad);
                for (int i = 9; i < 10; i++) {
                    for (int j = 0; j <=2; j++) {
                        datos[i][j]=productos[i][j];
                    }
                }
            }

            //CICLOS ANIDADOS Y CONDICIONALES QUE SE ENCARGAN DE HACER LA OPERACION DE CANTIDAD*VALOR UNITARIO DE CADA PRODUCTO
            for (int i = 0; i < datos.length; i++) {
                if(datos[i][3] != null){
                    datos[i][4]=Integer.toString(Integer.parseInt(datos[i][2])*Integer.parseInt(datos[i][3]));
                }
            }
        }

        //VARIABLES QUE GUARDAN LAS OPERACIONES FINALES
        int st = 0;
        double iva = 0.0, dsc = 0.0, gt = 0.0, aum = 0.0;

        if(e.getSource() == btA){
            for (int i = 0; i < datos.length; i++) {
                if(datos[i][4] == null){
                    datos[i][4] = Integer.toString(0);
                }
                st = st + Integer.parseInt(datos[i][4]);
                jt7.setText("" + st);
            }
            
        if(com.equals("Cheque")){
                String c = JOptionPane.showInputDialog("¿Cheque valido?<Si><No>");
                if(c.equalsIgnoreCase("si")){
                   
                    iva = st* 0.19;
                    dsc = st* 0.025;
                    gt = (iva + st) - dsc;
                    jt8.setText(" "+ dsc);
                    jt9.setText(" "+iva); 
                    jt10.setText("" + gt);

                } else if(c.equalsIgnoreCase("no")){
                    iva=st*0.19;
                    aum=st*0.10;
                    gt=iva+st+aum;
                    jt8.setText(""+dsc);
                    jt9.setText(""+iva);
                    jt10.setText(""+gt);

                }

        }    else if(com.equalsIgnoreCase("Efectivo")){
                iva = st * 0.19;
                gt = iva + st;
                jt8.setText("" + dsc);
                jt9.setText("" + iva);
                jt10.setText("" + gt);
            } else if(com.equalsIgnoreCase("Credito")){
                iva = st * 0.19;
                dsc = st * 0.08;
                gt = iva + st - dsc;
                jt8.setText("" + dsc);
                jt9.setText("" + iva);
                jt10.setText("" + gt);
            }
    
    }

        //BOTON SALIR DEL FORMULARIO
        if(e.getSource()==btS){
            System.exit(0);
        }
    }
   
}
