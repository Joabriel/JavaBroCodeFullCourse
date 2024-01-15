class FullCourse{   //String Methods;
    public static void main(String[]args){
        String nombre = "Joabriel";

        //Metodo booleano;
        boolean resultado = nombre.equals("Joaquín");
        System.out.println(resultado);

        //Método Longitud;
        int longitud = nombre.length();
        System.out.println(longitud);
        
        //Método caracter;        
        char carac = nombre.charAt(5);
        System.out.println(carac);

        //Método contador de coaracter(?)
        int numCarac = nombre.indexOf("a");
        System.out.println(numCarac);

        //Método para revisar si String está vasio;
        boolean empty = nombre.isEmpty();
        System.out.println(empty);

        //Método para mostrar todo en mayúsculas;
        String nombre = nombre.toUpperCase();
        System.out.println(nombre);

        //Método para mostrar todo en minúscula;
        String nombre = nombre.toLowerCase();
        System.out.println(nombre);

        //Método para borrar el espacio agregado; 
        String borrar = nombre.trim();
        System.out.println(borrar);

        //Método para remplazar caracter (Parece que tiene que ser String);
        String remplazar = nombre.replace("", "");
        System.out.println(remplazar)
    }
}
