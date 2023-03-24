
package zoologico;


import java.util.ArrayList;
import java.util.Date;


public class DepartamentoLogistica {

    public static ArrayList<Animal> Animal = new ArrayList();
    public static ArrayList<AnimalSalvaje> AnSalvaje = new ArrayList();
    public static ArrayList<AnimalDomestico> AnDomestico = new ArrayList();
    public static ArrayList<AnimalGranja> AnGranja = new ArrayList();
    public static ArrayList<Cliente> ListaClientes = new ArrayList();
    public static ArrayList<Ventas> Ventass = new ArrayList();
    
    public void ingresarAnimal(String pNombre, String pTipoAnimal,String pTipoAnimalHabitat,String pTipoAnimalAlimentacion ,String pFamilia, int pCodigo, int pEdad){
    Animal an = new Animal(pNombre,pTipoAnimal, pTipoAnimalHabitat, pTipoAnimalAlimentacion,pFamilia, pCodigo,pEdad);
    Animal.add(an);
    System.out.println(Animal.size()+"Se imprimio animal");
    }
    
    public void ingresarAnimalSalvaje(String pPeligrosidad, String pNombre, String pTipoAnimal,String pTipoAnimalHabitat,String pTipoAnimalAlimentacion, String pFamilia, int pCodigo, int pEdad) {
        AnimalSalvaje as = new AnimalSalvaje(pPeligrosidad, pNombre, pTipoAnimal,pTipoAnimalHabitat, pTipoAnimalAlimentacion,pFamilia, pCodigo,pEdad);
        AnSalvaje.add(as);
        Animal.add(as);
        System.out.println(AnSalvaje.size()+"Se imprimio animal salvaje");
    }

    public void ingresarAnimalDomestico(String pUso, String pNombre, String pTipoAnimal,String pTipoAnimalHabitat, String pTipoAnimalAlimentacion, String pFamilia, int pCodigo, int pEdad) {
        AnimalDomestico ad = new AnimalDomestico(pUso, pNombre,pTipoAnimal,pTipoAnimalHabitat, pTipoAnimalAlimentacion, pFamilia,pCodigo, pEdad);
        AnDomestico.add(ad);
        Animal.add(ad);
        System.out.println(AnDomestico.size()+"Se imprimio animal domestico");
    }

    public void ingresarAnimalGranja(String pProduccion, float pGanancias, String pNombre, String pTipoAnimal,String pTipoAnimalHabitat, String pTipoAnimalAlimentacion, String pFamilia, int pCodigo, int pEdad) {       
        AnimalGranja ag = new AnimalGranja(pProduccion, pGanancias, pNombre,pTipoAnimal,pTipoAnimalHabitat, pTipoAnimalAlimentacion,pFamilia, pCodigo, pEdad);
        AnGranja.add(ag);
        Animal.add(ag);
        System.out.println(AnGranja.size()+"Se imprimio animal de granja");
    }
   
    public void ingresarCliente(String pNombre, String pCedula, int pEdad, char pGenero, int pVisitas){
        Cliente cliente = new Cliente(pNombre, pCedula, pEdad, pGenero, pVisitas);
        ListaClientes.add(cliente);
    }
    
    public void ingresarVentas(String tipoCompra,  double valorCompraN, double valorCompraA, Date fecha, int cantidad, double total, String nombre, String cedula, int edad, char genero, int visitas){
        //Ventas venta = new Ventas(pTipoCompra, pValorCompra,pFecha, cantidad, total, pNombre, pCedula, pEdad, pGenero, pVisitas);
        Ventas venta = new Ventas(tipoCompra, valorCompraN, valorCompraA, fecha, cantidad, total, nombre, cedula, edad, genero, visitas);
        Ventass.add(venta);
        
    }

    
    }