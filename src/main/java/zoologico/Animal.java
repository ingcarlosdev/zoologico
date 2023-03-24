
package zoologico;

public class Animal {
    private String nombre,tipoAnimal, tipoAnimalHabitat, tipoAnimalAlimentacion, familia;
    private int codigo,edad;

    public Animal(String nombre, String tipoAnimal, String tipoAnimalHabitat, String tipoAnimalAlimentacion, String familia, int codigo, int edad) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.tipoAnimalHabitat = tipoAnimalHabitat;
        this.tipoAnimalAlimentacion = tipoAnimalAlimentacion;
        this.familia = familia;
        this.codigo = codigo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAnimalHabitat() {
        return tipoAnimalHabitat;
    }

    public void setTipoAnimalHabitat(String tipoAnimalHabitat) {
        this.tipoAnimalHabitat = tipoAnimalHabitat;
    }

    public String getTipoAnimalAlimentacion() {
        return tipoAnimalAlimentacion;
    }

    public void setTipoAnimalAlimentacion(String tipoAnimalAlimentacion) {
        this.tipoAnimalAlimentacion = tipoAnimalAlimentacion;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
