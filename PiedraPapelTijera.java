import java.util.*;


//piedra gana a tijera y pierde a papel
//tijera gana a papel y pierde a piedra
//papel gana a piedra y pierde a papel

//piedra -> tijera -> papel
//papel -> piedra -> tijera
//tijera -> papel -> piedra

public class PiedraPapelTijera {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int intentos_jugador1 = 3;
        int intentos_jugador2 = 3;
        int puntos_jugador1 = 0;
        int puntos_jugador2 = 0;
        String OP_1 = "";
        String OP_2 = "";
        System.out.println("Vamos a jugar Piedra Papel o Tijeras.");
        System.out.println("Recuerda que:");
        System.out.println("P. Piedra.\nL. Papel\nT. Tijeras");
        System.out.println("Ingresa el nombre del Jugador 1:");
        String jugador1 = sc.nextLine();
        System.out.println("Ingresa el nombre del Jugador 2:");
        String jugador2 = sc.nextLine();
        limpiarPantalla();
        System.out.println("Empecemos!"); 
        
        while(intentos_jugador1 > 0 || intentos_jugador2 > 0){
            System.out.println("Puntos "+jugador1+"-->"+puntos_jugador1);
            System.out.println("Puntos "+jugador2+"-->"+puntos_jugador2);

            if(intentos_jugador1>=intentos_jugador2){
                //Jugador1 habilitado
                loadVista(jugador1);
                OP_1 = sc.nextLine();
                intentos_jugador1--; 
                limpiarPantalla();
            }else{
                
                loadVista(jugador2);
                OP_2 = sc.nextLine();
                limpiarPantalla();
                intentos_jugador2--;
                String ganador = Win(OP_1, OP_2);
                //System.out.println("Ganador "+ganador);
                if(OP_2.equals(ganador)){
                    puntos_jugador2++;
                    //System.out.println("Puntos "+jugador2+" "+puntos_jugador2);
                    OP_2 = "";
                }else if("M".equals(ganador)){
                    intentos_jugador1++;
                    intentos_jugador2++;
                    limpiarPantalla();
                    System.out.println("------>Ingrese valores válidos: P, T, L. Intente un valor diferente al ingresado anteriormente.");
                    //loadVista(jugador1);
                }else if(OP_1.equals(ganador)){
                    puntos_jugador1++;
                }
                
                //Jugador2 habilitado
            }
            
            //
        }
        
        if(puntos_jugador1>puntos_jugador2){
            System.out.println("El(a) ganador(a) es "+jugador1+".");
        }else{
            System.out.println("El(a) ganador(a) es "+jugador2+".");

        }
        sc.close();
    }
    
    
    public static String Win(String value1, String value2) {
        String win = "";
        
        switch (value1) {
            case "P":
                if(value2.equals("T")){
                    win = "P";
                }else if(value1.equals(value2)!=true){
                    win = value2;
                }else{
                    win = "M";
                }
                break;
            case "L":
                if(value2.equals("P")){
                    win = "L";
                    
                }else if(value1.equals(value2)!=true){
                    win = value2;
                }else{
                    win = "M";
                }
                break;
            case "T":
                if(value2.equals("L")){
                    win = "T";
                }else if(value1.equals(value2)!=true){
                    win = value2;
                }else{
                    win = "M";
                }
                break;
            
            default:
                win = "M";
        }
        
        return win;

    }
    public static void loadVista(String name){
        System.out.println("------->"+name+" es tu turno. Escoge:");
        System.out.println("P. Piedra.\nL. Papel\nT. Tijeras");
    }
    public static void limpiarPantalla(){
        System.out.println("\033[H\033[2J");
    }
}
