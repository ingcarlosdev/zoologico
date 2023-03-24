
package zoologico;


public class AnimalSalvaje extends Animal implements caracteristicasAnimal{
        private    String nivelPeligrosidad;

    public AnimalSalvaje(String nivelPeligrosidad, String nombre, String tipoAnimal, String tipoAnimalHabitat, String tipoAnimalAlimentacion, String familia, int codigo, int edad) {
        super(nombre, tipoAnimal, tipoAnimalHabitat, tipoAnimalAlimentacion, familia, codigo, edad);
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    @Override
    public String toString() {
        return "\n" + "Nivel de peligrosidad : " + nivelPeligrosidad +"\n" + super.toString();
    }
    @Override
    public String desplazar(){
       String p = this.getTipoAnimalHabitat();
       String r="";
        if(p=="Aereo"){
            r = "Este animal se desplaza por el aire";
        }else{
            if(p=="Terrestre"){
                r = "Este animal se desplaza por la tierra";
            }else{
                if(p=="Acuatico"){
                    r = "Este animal se desplaza por el agua";
                }
            }
        
    }       
            return r;
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

