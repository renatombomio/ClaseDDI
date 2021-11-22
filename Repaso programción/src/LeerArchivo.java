import java.io.*;

public class LeerArchivo {

    public static void main(String[] args) throws FileNotFoundException {
        LeerArchivo.iniciarFichero();
        LeerArchivo.leerFichero();
    }

    private static void iniciarFichero() {
        File fichero = new File("/Users/renato/Desktop/DAM 2/Desarrollo de Interfaces/Repaso programción/src/Hola.txt.");
        System.out.println(fichero.exists());
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void leerFichero() throws FileNotFoundException {
        File archivo = null;
        FileReader fileReader= null;
        BufferedReader bufferedReader=null;

        try {
            /*Apertura del fichero y creación de BufferedReader para poder hacer una
            * lectura comoda (disponer del metodo readLine)*/
            archivo= new File("/Users/renato/Desktop/DAM 2/Desarrollo de Interfaces/Repaso programción/src/Hola.txt.");
            fileReader = new FileReader(archivo);
            bufferedReader = new BufferedReader(fileReader);

            //lectura del fichero

            String linea;
            while ((linea = bufferedReader.readLine())!=null)
                System.out.println(linea);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //En el finally cerramos el fichero, para asegurarnos
            //que se cierra tanto si todo va bien como si salta
            //una excepcion.
            try{
                if (null != fileReader){
                    fileReader.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}

