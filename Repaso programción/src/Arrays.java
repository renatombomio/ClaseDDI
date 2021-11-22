public class Arrays {
    /*Crear un programa que almacene en un array las palabras: "Rojo","Azul","Amarillo","Verde"*/
    public static void main(String[] args) {
        new Arrays().almacenarArrays();
        new Arrays().posicionAzul();

    }

    public static boolean almacenarArrays(){
        String[] colores = {"Rojo", "Azul", "Amarillo", "Verde"};
        for (int i = 0; i < colores.length; i++) {
            System.out.println(colores[i]);
        }
        return false;
    }
    public static void posicionAzul(){
        String[] colores = {"Rojo", "Azul", "Amarillo", "Verde"};
        for (int i = 0; i < colores.length; i++) {

            System.out.println(colores[i]);
        }

    }
}
