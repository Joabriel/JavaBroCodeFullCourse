import javax.swing.JOptionPane; //Librería para interfaces GUI.
class FullCourse{
    public static void main(String[]args){

        String nombre = JOptionPane.showInputDialog("Nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:")); /*Se debe transformar
         cualquier tipo de dato porque solo acepta Strings aparentemente.*/
        JOptionPane.showMessageDialog(null,"NOMBRE: "+nombre);
        JOptionPane.showMessageDialog(null,"EDAD: "+edad);
        

    }
}