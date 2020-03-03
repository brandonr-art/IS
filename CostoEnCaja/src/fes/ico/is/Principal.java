
package fes.ico.is;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        CamisaMangaCorta uno = new CamisaMangaCorta(1,190,"Camisa Manga Corta");
        CamisaCML dos = new CamisaCML(2, 230, "Camisa Casual Manga Larga");
        CamisaFML tres = new CamisaFML(3, 310, "Camisa Formal Manga Larga");
        
       
        
        int i = 0 ;
        int sumaUno = 0;
        int sumaDos = 0;
        int sumaTres = 0; 
        int contador = 0;
        while (i < 4) {
            i = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID de la prenda, Para terminar precione 4"));
            contador = contador + 1;
            if ( i == uno.getId() ) {
                sumaUno = sumaUno + uno.getPrecio();
                
            }
            if (i == dos.getId()){
                sumaDos = sumaDos + dos.getPrecio();
            }
            if(i == tres.getId()){
                sumaTres = sumaTres + tres.getPrecio();
            }
            
            
            
            }
        System.out.println("Camisas Compradas = " + (contador-1) );
        
        if ((contador - 1) < 3){
            System.out.println("Total a Pagar = " + (sumaUno + sumaDos+sumaTres) );
            
        }else if((contador - 1) >= 3 && (contador - 1) <= 5 ){
            System.out.println("Total a Pagar Sin Descuento = " + (sumaUno + sumaDos+sumaTres) );
            double descuento = (sumaUno + sumaDos+sumaTres)*0.05;
            double pagoDes = (sumaUno + sumaDos+sumaTres) - descuento;
            System.out.println("Total a Pagar Con Descuento de 5% = " + pagoDes);
            
        
        }else{
            System.out.println("Total a Pagar Sin Descuento = " + (sumaUno + sumaDos+sumaTres) );
            double descuento = (sumaUno + sumaDos+sumaTres)*0.08;
            double pagoDes = (sumaUno + sumaDos+sumaTres) - descuento;
            System.out.println("Total a Pagar Con Descuento de 8% = " + pagoDes);
        }
        
            
            
        }
        
        
        
    }

        
        
    
    

