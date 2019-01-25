package BBDD;

public class DominiosBD {

    private static final String[] estados = {"Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas", "Bolívar",
            "Carabobo","Caracas", "Cojedes", "DeltaAmacuro","Falcón", "Guarico", "Lara", "Mérida", "Miranda",
            "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia"};

    private static final String[] meses =  {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    private static final String[] tipoPropiedad =  {"Casa","Apartamento","Local","Oficina","Edificio","Finca","Bodega",
            "Estudio", "Piso"};

    private static final String[] tipoOperacion = {"Compra", "Alquiler", "Alquiler con opción a compra", "Transpaso", "Permuta"};

    private static final String[] tipoSuelo =  {"Gres","Parquet","Tarima","Terrazo","Marmol","Pergo","Barro cocido",
            "Parquet y Gress","Tarima y Gress","Corcho","Sintrasol","Otros Materiales"};

    private static final String[] tipoFachada = {"Ladrillo","Ladrillo Cerámico","Tirolesa","Enfoscada y Pintada",
            "Monocapa","Piedra de Musgo","Pizarra","Chapado Granito", "Mampostería Granito","Madera","Enfoscada","Revocada"};

    private static final String[] estadoInmueble = {"Habitada Por Propietario","Deshabitada","En Construcción","Habitada por Inquilino"};

    private static final String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" + "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";


}
