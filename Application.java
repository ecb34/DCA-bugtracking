import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void listarFallos(List<Fallo> fallos){
        for(int i = 0; i< fallos.size(); i++){
            System.out.println(fallos.get(i));
        }
    }


    public static void Main() {
        List <Fallo> fallos = new ArrayList(); 
        Scanner reader = new Scanner(System.in);

        System.out.println("Que quieres hacer?");
        System.out.println("1. Reportar nuevo fallo");
        System.out.println("2. Listar fallos");
        System.out.println("3. Agregar comentario a un fallo");
        System.out.println("4. Eliminar fallo");
        System.out.println("5. Listar comentarios de un fallo");
        System.out.println("6. Salir");

        do{  
            switch(reader.nextInt()){
                case 1: 
                    System.out.println("Nombre del fallo");
                    String nombre = reader.nextLine();
                    if(nombre != null){
                        fallos.add(new Fallo(nombre));
                    } 
                    break;
                case 2:
                    System.out.println("Lista de fallos:");
                    listarFallos(fallos);
                    break;
                case 3:
                    System.out.println("A cual fallo quieres agregar un comentario? Usa el id");
                    listarFallos(fallos);
                    int falloId = reader.nextInt();
                    Boolean encontrado = false;
                    System.out.println("Introduce el comentario");
                    for(Fallo f : fallos){
                        if(falloId == f.getId()){
                            f.addComentario(reader.nextLine());
                            encontrado = true;
                        } 
                    }
                    if(!encontrado) System.out.println("No existe un fallo con ese id");
                    break;
                case 4:
                    System.out.println("Que fallo quieres eliminar? Usa el id");
                    listarFallos(fallos);
                    int deleteId = reader.nextInt();
                    Boolean borrado = false;
                    for(Fallo f : fallos){
                        if(deleteId == f.getId()){
                            fallos.remove(f);
                            borrado = true;
                        } 
                    }
                    if(!borrado) System.out.println("No existe un fallo con ese id");
                    break;
                case 5:
                    System.out.println("De que fallo quieres listar sus comentarios? Usa el id");
                    listarFallos(fallos);
                    int aListarId = reader.nextInt();
                    Boolean listado = false;

                    for(Fallo f: fallos){
                        if(aListarId == f.getId()){
                            System.out.println("Comentarios de "+ f.getNombre());
                            for (String s : f.getComentarios()) {
                                System.out.println(s);
                            }
                            listado = true;
                        }
                    }
                    if(!listado) System.out.println("No existe un fallo con ese id");
                    break;
                case 6:
                 reader.close();
                 return; 
            }
        }while(true);
    }
}