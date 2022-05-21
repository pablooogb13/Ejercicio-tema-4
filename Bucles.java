
public class Bucles {

	public static void main(String[] args) {
		
		int numeroIF = 5;
		if(numeroIF<0) {
			System.out.println(" El numero es Negativo");
		} else if(numeroIF == 0){
			System.out.println("El numero es igual a 0");
		}else if(numeroIF>0) {
			System.out.println("El numero es Positivo");
		}
		
		int numeroWhile = 0;
		while (numeroWhile<3) {
			numeroWhile++;
			System.out.println(numeroWhile);
		}
		
		do {
			numeroWhile++;
			System.out.println(numeroWhile);
		}while(numeroWhile<3);
		
		for(int numeroFor=0; numeroFor<=3; numeroFor++) {
			System.out.println(numeroFor);
		}
		
		String Estacion = "Invierno";
		switch(Estacion) {
		case "Invierno":
			System.out.println("Es invierno");
			break;
		case "Verano":
			System.out.println("Es Verano");
			break;
		case "Primavera":
			System.out.println("Es Primavera");
			break;
		case "Otoño":
			System.out.println("Es Otoño");
			break;
			default:
				System.out.println("Default");
		}
	}
}
