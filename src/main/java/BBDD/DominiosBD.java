package BBDD;

import java.util.HashMap;

public class DominiosBD {

    private static final String[] estados = {"Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas", "Bolívar",
            "Carabobo","Caracas", "Cojedes", "DeltaAmacuro","Falcón", "Guárico", "Lara", "Mérida", "Miranda",
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

    private static final HashMap<String,String[]> numerosTlfFijos = new HashMap<>();

    private static final  String[] numerosMoviles = {"0412","0416","0414","0424","0426"};



    static {
        String[] s = {"0248"};
        numerosTlfFijos.put("Amazonas", s);
        s = new String[]{"0281","0282","0283","0285","0292"};
        numerosTlfFijos.put("Anzoátegui", s);
        s = new String[]{"0240","0247","0278"};
        numerosTlfFijos.put("Apure", s);
        s = new String[]{"0243","0244","0246"};
        numerosTlfFijos.put("Aragua", s);
        s = new String[]{"0273","0278"};
        numerosTlfFijos.put("Barinas", s);
        s = new String[]{"0284","0285","0286","0288","0289"};
        numerosTlfFijos.put("Bolívar", s);
        s = new String[]{"0241","0242","0243","0245","0249"};
        numerosTlfFijos.put("Carabobo", s);
        s = new String[]{"0258"};
        numerosTlfFijos.put("Cojedes", s);
        s = new String[]{"0287"};
        numerosTlfFijos.put("Delta Amacuro", s);
        s = new String[]{"0212"};
        numerosTlfFijos.put("Caracas", s);
        s = new String[]{"0259","0268","0269","0279"};
        numerosTlfFijos.put("Falcón", s);
        s = new String[]{"0235","0238","0246","0247"};
        numerosTlfFijos.put("Guárico", s);
        s = new String[]{"0251","0252","0253"};
        numerosTlfFijos.put("Lara", s);
        s = new String[]{"0271","0274","0275"};
        numerosTlfFijos.put("Mérida", s);
        s = new String[]{"0212","0234","0239"};
        numerosTlfFijos.put("Miranda", s);
        s = new String[]{"0287","0291","0292"};
        numerosTlfFijos.put("Monagas", s);
        s = new String[]{"0295"};
        numerosTlfFijos.put("Nueva Esparta", s);
        s = new String[]{"0255","0256","0257","0272"};
        numerosTlfFijos.put("Portuguesa", s);
        s = new String[]{"0293","0294"};
        numerosTlfFijos.put("Sucre", s);
        s = new String[]{"0275","0276","0277","0278"};
        numerosTlfFijos.put("Táchira", s);
        s = new String[]{"0271","0272"};
        numerosTlfFijos.put("Trujillo", s);
        s = new String[]{"0212"};
        numerosTlfFijos.put("Vargas", s);
        s = new String[]{"0251","0253","0254"};
        numerosTlfFijos.put("Yaracuy", s);
        s = new String[]{"0261","0262","0263","0264","0265","0266","0267","0271","0275"};
        numerosTlfFijos.put("Zulia", s);
    }
}
