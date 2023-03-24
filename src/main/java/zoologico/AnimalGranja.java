
package zoologico;

import javax.swing.JOptionPane;

public class AnimalGranja extends Animal implements caracteristicasAnimal{
    private String produccion;
    private float ganancias;

    public AnimalGranja(String produccion, float ganancias, String nombre, String tipoAnimal, String tipoAnimalHabitat, String tipoAnimalAlimentacion, String familia, int codigo, int edad) {
        super(nombre, tipoAnimal, tipoAnimalHabitat, tipoAnimalAlimentacion, familia, codigo, edad);
        this.produccion = produccion;
        this.ganancias = ganancias;
    }    

    public String getProduccion() {
        return produccion;
    }

    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }
    
    @Override
    public String toString() {
        return "\n" + "Produccion : " + produccion +"\n" +"Ganancias : "+ganancias  + super.toString();
    }
    
    @Override
    public String desplazar(){
       String p = this.getTipoAnimalHabitat();
       String d="";
        if(p=="Aereo"){
            d = "Este animal se desplaza por el aire";
        }else{
            if(p=="Terrestre"){
                d = "Este animal se desplaza por la tierra";
            }else{
                if(p=="Acuatico"){
                    d = "Este animal se desplaza por el agua";
                }
            }
        
    }
        return d;
    }

    @Override
    public String comer() {
        String v = this.getTipoAnimalAlimentacion();
        String c="";
        if(v=="Carnivoro"){
            c = "Este animal se alimenta de carne, les proporcionamos carne bovina o pescado";
        }else{
            if(v=="Herviboro"){
                c = "Este se animal se alimenta de plantas";
            }else{
                if(v=="Omnivoro"){
                    c = "Este animal se alimenta de carne y plantas, le proporcionamos una dieta balanceada";
                }
            }        
        }
        return c;
    }
}
