package Forms;

//Librerias necesarias
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmClase implements ActionListener{ 

    String[][]  productos = {{"1010", "2x2", "26000"}, {"2020", "3x3", "29000"},
            {"3030", "4x4", "38000"}, {"4040", "5x5", "48000"},
            {"5050", "6x6", "70000"}, {"6060", "7x7", "85000"},
            {"7070", "Megaminx", "46000"}, {"8080", "Mirror", "32000"},
            {"9090", "Pyramix", "40000"}, {"0000", "Skewb", "40000"}}; // Matriz predefinida de los productos

    String[][] datos = new String[10][5]; //Matriz que manejara la grilla
    String[][] aux = new String[10][5]; // Matriz que guardara los datos de la grilla para actualizar

    //creando la grilla, asignandole el tamaño a los campos, la cabezas, instanciando la opcion scroll y la JTABLE con los datos y titulos
    String[] titulo = {"Codigo", "Descripcion", "Valor Unitario", "Cantidad", "Precio total"}; //Cabecera de la grilla

    JScrollPane scroll = new JScrollPane(); // La propieda de poder bajar o subir las tablas de la grilla
    JTable tabla = new JTable(datos, titulo); //Instanciando la JTABLE con la cabecera y la matriz datos
    Dimension d = new Dimension(); //Instanciando el tamaño de la pantalla

    //Creando el combobox y añadiendo sus respectivos datos
    String[] pago = {"", "Efectivo", "Cheque", "Credito"};
    JComboBox combo = new JComboBox(pago);
    String com = (String)combo.getSelectedItem();

    //Variables necesarias para la interfaz del formulario
    JButton btB, btC, btA, btS; // esto son los botones
    JLabel jIFOTO, jIT, jID, jIN, jIF, jISC, jICC, jINC, jITC, jIDC, jIFP, jIFdP, jIST, jIDE, jII, jIGT; //Estas son las etiquetas
    JTextField jt1, jt2, jt3, jt4, jt5, jt6, jt7, jt8, jt9, jt10; //Estas son las cajas de texto

    //Instanciamos el formulario, creandolo para poder añadir los objetos
    JFrame jf = new JFrame("Factura");

    //Clase la cual creara el formulario
    public FrmClase() {
        //Eliminamos el layout
        jf.setLayout(null);

        //Asignado los datos que mostrara las etiquetas(JLABEL)
        jIFOTO = new JLabel(""); //Etiqueta de fot vacia para poder agregar una imagen despues
        jIT = new JLabel("SISTEMAS DEL FUTURO");
        jID = new JLabel("Calle 76 1A13-18");
        jIN = new JLabel("60 2 255555555");
        jIF = new JLabel("Factura Nro.");
        jISC = new JLabel("Santiago de Cali");
        jICC = new JLabel("Cedula de Ciudadania");
        jINC = new JLabel("Nombre del Cliente");
        jIDC = new JLabel("Telefono del Cliente");
        jIFP = new JLabel("Direccion del Cliente");
        jIFdP = new JLabel("Formas de pago");
        jIST = new JLabel("Sub Total:");
        jIDE = new JLabel("Descuento:");
        jII = new JLabel("Iva;");
        jIGT = new JLabel("Gran total:");

        //Asignando el ancho de los cuadros de texto el cual se moficara luego gracias al setbounds
        jt1 = new JTextField("Aqui");
        jt2 = new JTextField();
        jt3 = new JTextField();
        jt4 = new JTextField();
        jt5 = new JTextField();
        jt6 = new JTextField();
        jt7 = new JTextField();
        jt8 = new JTextField();
        jt9 = new JTextField();
        jt10 = new JTextField();

        //Poniendo un nombre sobre los botonoes;
        btB = new JButton("Buscar");
        btC = new JButton("Buscar codigo");
        btA = new JButton("Aceptar");
        btS = new JButton("Sallir");

        //Eligiendo la posicion de las etiquetas, su ancho y alto
        // (x, y, ancho, alto)
        jIFOTO.setBounds(10, 10, 100, 100);
        jIT.setBounds(200, 10, 140, 10);
        jID.setBounds(215, 30, 140, 10);
        jIN.setBounds(222, 47, 140, 10);
        jIF.setBounds(540, 5, 90, 20);
        jISC.setBounds(218, 60, 140, 20);
        jICC.setBounds(10, 130, 140, 20);
        jINC.setBounds(10, 170, 140, 20);
        jIDC.setBounds(10, 210, 140, 20);
        jIFP.setBounds(10, 250, 140, 20);
        jIFdP.setBounds(300, 250, 140, 20);
        jIST.setBounds(430, 500, 140, 20);
        jIDE.setBounds(430, 530, 140, 20);
        jII.setBounds(430, 560, 140, 20);
        jIGT.setBounds(430, 590, 140, 20);

        //Eligiendo la posicion de las cajas de texto, su ancho y alto3
        jt1.setBounds(537, 23, 90, 20);
        jt2.setBounds(150, 132, 100, 20);
        jt3.setBounds(150, 172, 140, 20);
        jt4.setBounds(150, 212, 140, 20);
        jt5.setBounds(150, 252, 140, 20);
        jt6.setBounds(10, 300, 70, 20);
        jt7.setBounds(540, 500, 140, 20);
        jt8.setBounds(540, 530, 140, 20);
        jt9.setBounds(540, 560, 140, 20);
        jt10.setBounds(540, 590, 140, 20);

        //Eligiendo la posicion de los botones, su ancho y alto
        btB.setBounds(260, 132, 80, 20);
        btC.setBounds(90, 300, 130, 20);
        btA.setBounds(570, 630, 85, 20);
        btS.setBounds(490, 630, 70, 20);

        //Otra forma de poner los botones
        //JComboBox combo = new JComboBox();
        //comobo.addItem("null");
        //combo.addItem("Efectivo");
        //combo.addItem("Credito");
        //combo.addItem("Cheque");
        //combo.setBounds(400, 250, 90, 20);

        //Elegiendo la poscion del combobox y su ancho y alto
        combo.setBounds(400, 250, 90, 20);

        //Añadiendo la opcion de que las cabeceras sean estaticas
        scroll.setViewportView(tabla);

        //Eligiendo la posicion de la grilla, su ancho y alto
        scroll.setBounds(10, 330, 685, 150);

        //Añadiendo la grilla al formulario
        jf.add(scroll);

        //Pintamos los bordes de la etiqueta foto de color negro
        jIFOTO.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

        //Añadiendo las etiquetas al formulario
        jf.add(jIFOTO);
        jf.add(jIT);
        jf.add(jID);
        jf.add(jIN);
        jf.add(jIF);
        jf.add(jISC);
        jf.add(jICC);
        jf.add(jINC);
        jf.add(jIDC);
        jf.add(jIFP);
        jf.add(jIFdP);
        jf.add(jIST);
        jf.add(jIDE);
        jf.add(jII);
        jf.add(jIGT);

        //Añadiendo las cuadros de texto al formulario
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jt3);
        jf.add(jt4);
        jf.add(jt5);
        jf.add(jt6);
        jf.add(jt7);
        jf.add(jt8);
        jf.add(jt9);
        jf.add(jt10);

        //Añadiendo los botones al formulario
        jf.add(btB);
        jf.add(btC);
        jf.add(btA);
        jf.add(btS);

        //Añadiendo el combobox al formulario
        jf.add(combo);

        //Añadiendo el listener al boton para que funcionen con click
        btB.addActionListener(this);
        btC.addActionListener(this);
        btA.addActionListener(this);
        btS.addActionListener(this);
        combo.addActionListener(this);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para cerrar el formulario
        jf.setResizable(false); //Para que no se pueda modificar el tamaño del formulario
        jf.setLocation((int)((d.getWidth()/2)+290), 10);
        jf.pack(); //Para que se ajuste al tamaño de los objetos
        jf.setSize(720, 720); //Tamaño del formulario
    }

    public static void main(String[] args) {
        FrmClase frame = new FrmClase();
        Ope op = new Ope();
        ActionEvent e = null;
        op.actionPerformed(e);
    }

    @Override
    public void actionPerformed(ActionEvent e){   
    }
}
