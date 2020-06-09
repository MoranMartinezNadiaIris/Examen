import java.util.Random;

public class Materiales {
    public static void main(String args []){
        int c1=0,c2=0,c3=0,c4=0,c5=0;
	boolean ban = false,ban2 = false,ban3 = false,ban4,ban5;
	Random Spawn= new Random(System.nanoTime());
        EjercicioPila Madera=new EjercicioPila(30);
        EjercicioPila Hilo=new EjercicioPila(30);
        EjercicioPila Resina=new EjercicioPila(30);
        
        for (int i = 0; i < 30; i++) {
        int m=Spawn.nextInt(3);
	if(m==0) {
            Madera.apilar(m);
	}else if(m==1) {
            Resina.apilar(m);
	}else if(m==2) {
            Hilo.apilar(m);
			}
		}
        System.out.println("Madera restante "+Madera.cantidad());
		System.out.println("Hilo restante "+Hilo.cantidad());
		System.out.println("Resina restante "+Resina.cantidad());
                System.out.println();
                if(Madera.cantidad()>=4){
                  Madera.sacar();
                    Madera.sacar();
                     Madera.sacar();
                      Madera.sacar();
                    c1++;
                    ban=true;
                }else{
                    ban=false;
                }
             for (int i = 30; i >0; i--) {
            if(ban==true&&Madera.cantidad()>=2){
              Madera.sacar();
              Madera.sacar();
                c2++;
                ban2=true;
            }else{
               ban2=false; 
            }
           if(ban==true&&Hilo.cantidad()>=4&&Resina.cantidad()>=1){
               Hilo.sacar();
              Hilo.sacar();
              Hilo.sacar();
              Hilo.sacar();
               
               Resina.sacar();
               ban3=true;
               c3++;
           }else{
               ban3=false;
           }
           if(ban==true&&ban2==true&&ban3==true){
               c4++;
               ban4=true;
           }else{
               ban4=false;
           }
           if(ban==true&&Madera.cantidad()>=5){
             Madera.sacar();
              Madera.sacar();
              Madera.sacar();
              Madera.sacar();
              Madera.sacar();
               c5++;
               ban5=true;
           }else{
               ban5=false;
           }
        }
             System.out.println("Mesa adquirida "+ c1);
	 	System.out.println("Baston adquirido "+c2);
	 	System.out.println("Cuerda adquirida "+c3);
	 	System.out.println("Cana adquiridab "+c4);
	 	System.out.println("Barco adquirido "+c5);
	 	System.out.println();
		System.out.println("Madera restante "+Madera.cantidad());
		System.out.println("Hilo restante "+Hilo.cantidad());
		System.out.println("Resina restante "+Resina.cantidad());
		
    } 
}
