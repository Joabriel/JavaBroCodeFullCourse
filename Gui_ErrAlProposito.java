import javax.swing.JOptionPane; //Librería para interfaces GUI.
class FullCourse{
    public static void main(String[]args){

        String name = JoptionPane.ShowImputDialog("Ingresa tu nombre"); /*JOptioPane es la clase que muestra cuadroos de diálogos a partir de algún strign u otro operando(Según creo hasta el momento).*/
        System.out.print(JOptionPane.ShowImputDialog(name)); //Error cometido a propósito para marcar la diferencia.
        //(No es la forma correcta de imprimir, da error).

    }
}