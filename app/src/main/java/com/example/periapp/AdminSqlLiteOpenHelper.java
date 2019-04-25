package com.example.periapp;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSqlLiteOpenHelper extends SQLiteOpenHelper{
    public AdminSqlLiteOpenHelper(Context context, String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase elementos) {
      elementos.execSQL("Create table elemento(simbolo_elem text primary key,msAto_elem text,nom_elem text,grupo_elem varchar(3),periodo_elem text," +
              "bloque_elem text,tipo_elem text)");
        elementos.execSQL("Create table aplicaciones(num_apli integer primary key autoincrement,apli_apli text,simbolo_elem text," +
                "CONSTRAINT fk_elementos foreign key (simbolo_elem) References elementos(simbolo_elem))");
        elementos.execSQL("Create table paises(num_pais integer primary key autoincrement,pais_pais text,simbolo_elem varchar(3)," +
                "CONSTRAINT fk_elementos1 foreign key (simbolo_elem) References elementos(simbolo_elem))");
        elementos.execSQL("Insert into elemento values('H','1,008','Hidrógeno','1','1','1S','Otros no metales')");
        elementos.execSQL("Insert into elemento values('Na','22,990','Sodio','3','1','3S','Alcalinos')");//ya
        elementos.execSQL("Insert into elemento values('Li','6,94','Litio','2','1','2S','Alcalinos')");//ya

        elementos.execSQL("Insert into elemento values('K','39,098','Potasio','4','1','4S','Alcalinos')");
        elementos.execSQL("Insert into elemento values('Rb','85,468','Rubidio','5','1','5S','Alcalinos')");
        elementos.execSQL("Insert into elemento values('Cs','132,91','Cesio','6','1','6S','Alcalinos')");
        elementos.execSQL("Insert into elemento values('Fr','223','Francio','7','1','7S','Alcalinos')");

        elementos.execSQL("Insert into elemento values('Be','9,0122','Berilio','2','2','2S','Alcalinoterreos')");
        elementos.execSQL("Insert into elemento values('Mg','24,305','Magnesio','3','2','3S','Alcalinoterreos')");
        elementos.execSQL("Insert into elemento values('Ca','40,078','Calcio','4','2','4S','Alcalinoterreos')");
        elementos.execSQL("Insert into elemento values('Sr','87,62','Estroncio','5','2','5S','Alcalinoterreos')");
        elementos.execSQL("Insert into elemento values('Ba','137,33','Bario','6','2','6S','Alcalinoterreos')");
        elementos.execSQL("Insert into elemento values('Ra','226','Radio','7','2','7S','Alcalinoterreos')");

//Metales de transicion
        elementos.execSQL("Insert into elemento values('Sc','44,956','Escandio','4','3','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Y','88,906','Itrio','5','3','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Ti','47,867','Titanio','4','4','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Zr','91,224','Circonio','5','4','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Hf','178,49','Hafnio','6','4','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Rf','276','Rutherfordio','7','4','6d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('V','50,942','Vanadio','4','5','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Nb','92,906','Niobio','5','5','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Ta','180,95','Tantalio','6','5','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Db','268','Dubnio','7','5','6d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Cr','51,996','Cromo','4','6','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Mo','95,95','Molbideno','5','6','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('W','183,84','Wolframio','6','6','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Sg','269','Seaborgio','7','6','6d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Mn','54,938','Manganeso','4','7','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Tc','98','Tecnecio','5','7','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Re','186,21','Renio','6','7','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Bh','270','Bohrio','7','7','6d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Fe','55,845','Hierro','4','8','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Co','58,933','Cobalto','4','9','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Ni','58,693','Niquel','4','10','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Cu','63,546','Cobre','4','11','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Zn','65,38','Cinc','4','12','3d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Ru','101,07','Rutenio','5','8','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Rh','102,91','Rodio','5','9','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Pd','106,42','Paladio','5','10','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Ag','107,87','Plata','5','11','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Cd','112,41','Cadmio','5','12','4d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Os','190,23','Osmio','6','8','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Ir','192,22','Iridio','6','9','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Pt','195,08','Platino','6','10','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Au','196,97','Oro','6','11','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Hg','200,59','Mercurio','6','12','5d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Hs','277','Hassio','7','8','6d','Metales de transicion')");
        elementos.execSQL("Insert into elemento values('Mt','278','Meitnerio','7','9','6d','Null')");
        elementos.execSQL("Insert into elemento values('Ds','281','Darmstadio','7','10','6d','Null')");
        elementos.execSQL("Insert into elemento values('Rg','282','Roentgenio','7','11','6d','Null')");
        elementos.execSQL("Insert into elemento values('Cn','285','Copernico','7','12','6d','Metales de transicion')");


        elementos.execSQL("Insert into elemento values('B','10,81','Boro','2','13','2p','Metaloides')");
        elementos.execSQL("Insert into elemento values('C','12,011','Carbono','2','14','2p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('N','14,007','Nitrogeno','2','15','2p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('O','15,999','Oxigeno','2','16','2p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('F','18,998','Fluor','2','17','2p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('Ne','20,180','Neon','2','18','2p','Gases nobles')");
        elementos.execSQL("Insert into elemento values('Al','26,982','Aluminio','3','13','3p','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('Si','28,085','Silicio','3','14','3p','Metaloides')");
        elementos.execSQL("Insert into elemento values('P','30,974','Fosforo','3','15','3p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('S','32,06','Azufre','3','16','3p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('Cl','35,45','Cloro','3','17','3p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('Ar','39,948','Argon','3','18','3p','Gases nobles')");
        elementos.execSQL("Insert into elemento values('Ga','69,723','Galio','4','13','4p','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('Ge','72,630','Germanio','4','14','4p','Metaloides')");
        elementos.execSQL("Insert into elemento values('As','74,922','Arsenico','4','15','4p','Metaloides')");
        elementos.execSQL("Insert into elemento values('Se','78,971','Selenio','4','16','4p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('Br','79,904','Bromo','4','17','4p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('Kr','83,798','Kripton','4','18','4p','Gases nobles')");
        elementos.execSQL("Insert into elemento values('In','114,82','Indio','5','13','5p','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('Sn','118,71','Estaño','5','14','5p','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('Sb','121,76','Antimonio','5','15','5p','Metaloides')");
        elementos.execSQL("Insert into elemento values('Te','127,60','Telurio','5','16','5p','Metaloides')");
        elementos.execSQL("Insert into elemento values('I','126,90','Yodo','5','17','5p','Otros no metales')");
        elementos.execSQL("Insert into elemento values('Xe','131,29','Xenon','5','18','5p','Gases nobles')");
        elementos.execSQL("Insert into elemento values('Tl','204,38','Talio','6','13','6p','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('Pb','207,2','Plomo','6','14','6p','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('Bi','208,98','Bismuto','6','15','6p','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('Po','209','Polonio','6','16','6p','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('At','210','Astato','6','17','6p','Metaloides')");
        elementos.execSQL("Insert into elemento values('Rn','222','Radon','6','18','6p','Gases nobles')");
        elementos.execSQL("Insert into elemento values('Nh','286','Nihonium','7','13','Ninguno','Null')");
        elementos.execSQL("Insert into elemento values('Fl','289','Flerovio','7','14','Ninguno','Metales del bloque p')");
        elementos.execSQL("Insert into elemento values('Mc','290','Moscovium','7','15','Ninguno','Null')");
        elementos.execSQL("Insert into elemento values('Lv','293','Livermorio','7','16','Ninguno','Null')");
        elementos.execSQL("Insert into elemento values('Ts','294','Tennessine','7','17','Ninguno','Null')");
        elementos.execSQL("Insert into elemento values('Og','294','Oganesson','7','18','Ninguno','Null')");

        elementos.execSQL("Insert into elemento values('La','138,91','Lantano','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Ce','140,12','Cerio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Pr','140,91','Praseodimio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Nd','144,24','Neodimio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Pm','145','Prometio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Sm','150,36','Samario','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Eu','151,96','Europio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('G','157,25','Gadolino','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Tb','158,93','Terbio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Dy','162,50','Disprosio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Ho','164,93','Holmio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Er','167,26','Erbio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Tm','168,93','Tulio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Yb','173,05','Iterbio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Lu','174,97','Lutecio','6','Niguno','4f','Lantanidos')");
        elementos.execSQL("Insert into elemento values('Ac','227','Actinio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Th','232,04','Torio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Pa','231,04','Protactinio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('U','238,03','Uranio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Np','237','Neptunio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Pu','244','Plutonio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Am','243','Americio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Cm','247','Curio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Bk','247','Berkelio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Cf','251','Californio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Es','252','Einstenio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Fm','257','Fermio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Md','258','Mendelevio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('No','259','Nobelio','7','Niguno','5f','Actinidos')");
        elementos.execSQL("Insert into elemento values('Lr','266','Lawrencio','7','Niguno','5f','Actinidos')");

//Informacion
      elementos.execSQL("Insert into aplicaciones values(null,'En las industrias del petróleo y química','H')");
      elementos.execSQL("Insert into aplicaciones values(null,'En las industrias del petróleo y química','H')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza como gas de protección en los métodos de soldadura','H')");
      elementos.execSQL("Insert into aplicaciones values(null,'se utiliza hidrógeno puro o mezclado con nitrógeno (a veces llamado forming gas) como gas indicador para detectar fugas','H')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','H')");

      elementos.execSQL("Insert into aplicaciones values(null,'El cloruro de litio y el bromuro de litio tienen una elevada higroscopicidad por lo que son excelentes secantes. El segundo se emplea en bombas de calor de contracción, entre otros compuestos como el nitrato de litio.','Li')");
      elementos.execSQL("Insert into aplicaciones values(null,'El estearato de litio es un lubricante de propósito general en aplicaciones a alta temperatura.','Li')");
      elementos.execSQL("Insert into aplicaciones values(null,'El hidróxido de litio se usa en las naves espaciales y submarinos para depurar el aire extrayendo el dióxido de carbono.','Li')");
      elementos.execSQL("Insert into aplicaciones values(null,'También tiene aplicaciones nucleares','Li')");
      elementos.execSQL("Insert into Paises values(null,'Argentina','Li')");
      elementos.execSQL("Insert into Paises values(null,'Bolivia','Li')");
      elementos.execSQL("Insert into Paises values(null,'Chile ','Li')");
      elementos.execSQL("Insert into Paises values(null,'Perú ','Li')");

      elementos.execSQL("Insert into aplicaciones values(null,'El principal uso del berilio metálico se encuentra en la manufactura de aleaciones berilio-cobre y en el desarrollo de materiales moderadores y reflejantes para reactores nucleares.','Be')");
      elementos.execSQL("Insert into aplicaciones values(null,'Elemento de aleación, en aleaciones cobre-berilio con una gran variedad de aplicaciones.','Be')");
      elementos.execSQL("Insert into aplicaciones values(null,'Moderador de neutrones en reactores nucleares.','Be')");
      elementos.execSQL("Insert into aplicaciones values(null,'Antaño se emplearon compuestos de berilio en tubos fluorescentes, uso abandonado por la beriliosis.','Be')");
      elementos.execSQL("Insert into Paises values(null,'Estados Unidos','Be')");
      elementos.execSQL("Insert into Paises values(null,'China','Be')");
      elementos.execSQL("Insert into Paises values(null,'Madagascar','Be')");
      elementos.execSQL("Insert into Paises values(null,'Ruanda','Be')");
      elementos.execSQL("Insert into Paises values(null,'Brasil','Be')");
      elementos.execSQL("Insert into Paises values(null,'Nigeria','Be')");

      elementos.execSQL("Insert into aplicaciones values(null,'En aleaciones antifricción (oro).','Na')");
      elementos.execSQL("Insert into aplicaciones values(null,'En la fabricación de desodorantes (en combinación con ácidos grasos).','Na')");
      elementos.execSQL("Insert into aplicaciones values(null,'En la purificación de metales fundidos.','Na')");
      elementos.execSQL("Insert into aplicaciones values(null,'El sodio metálico también se emplea en los laboratorios en la desecación de disolventes.','Na')");
      elementos.execSQL("Insert into aplicaciones values(null,'Iluminación mediante lámparas de vapor de sodio.','Na')");
      elementos.execSQL("Insert into Paises values(null,'Estados Unidos','Na')");
      elementos.execSQL("Insert into Paises values(null,'Francia','Na')");
      elementos.execSQL("Insert into Paises values(null,'Niagara Falls','Na')");
      elementos.execSQL("Insert into Paises values(null,'Estados Unidos.','Na')");

      elementos.execSQL("Insert into aplicaciones values(null,'El uso principal del metal es como elemento de aleación del aluminio, empleándose las aleaciones aluminio-magnesio en envases de bebidas. ','Mg')");
      elementos.execSQL("Insert into aplicaciones values(null,'Aditivo en propelentes convencionales.','Mg')");
      elementos.execSQL("Insert into aplicaciones values(null,'Agente reductor en la obtención de uranio y otros metales a partir de sus sales.','Mg')");
      elementos.execSQL("Insert into aplicaciones values(null,'El polvo de carbonato de magnesio (MgCO3) es utilizado por los atletas como gimnastas y levantadores.','Mg')");
      elementos.execSQL("Insert into Paises values(null,'Estados Unidos','Mg')");

      elementos.execSQL("Insert into aplicaciones values(null,'El potasio metal se usa en células fotoeléctricas.','K')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cloruro y el nitrato se emplean como fertilizantes.','K')");
      elementos.execSQL("Insert into aplicaciones values(null,'El peróxido de potasio se usa en aparatos de respiración autónomos de bomberos y mineros.','K')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cloruro de potasio se utiliza para provocar un paro cardíaco en las ejecuciones con inyección letal.','K')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','K')");

      elementos.execSQL("Insert into aplicaciones values(null,'El calcio es un agente reductor en la extracción de otros metales como el uranio, circonio y torio.','Ca')");
      elementos.execSQL("Insert into aplicaciones values(null,'Tiene aplicaciones en muchos productos lácteos o medicamentos para el refuerzo de los huesos.','Ca')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza en arcos de luz de alta intensidad (luz de cal).','Ca')");
      elementos.execSQL("Insert into aplicaciones values(null,'El hidróxido de calcio (Ca(OH)2), llamado cal apagada, tiene muchas aplicaciones en donde el ion hidroxilo es necesario.','Ca')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','Ca')");

      elementos.execSQL("Insert into aplicaciones values(null,'Recubrimientos fotoemisores de telurio-rubidio en células fotoeléctricas y detectores electrónicos.','Rb')");
      elementos.execSQL("Insert into aplicaciones values(null,'En medicina para la tomografía por emisión de positrones, el tratamiento de la epilepsia y la separación por ultracentrifugado de ácido nucleicos y virus.','Rb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Fluido de trabajo en turbinas de vapor.','Rb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Sirve para conseguir el color púrpura en los fuegos artificiales.','Rb')");
      elementos.execSQL("Insert into Paises values(null,'Canadá','Rb')");

      elementos.execSQL("Insert into aplicaciones values(null,'Pirotecnia (nitrato).','Sr')");
      elementos.execSQL("Insert into aplicaciones values(null,'Producción de imanes de ferrita','Sr')");
      elementos.execSQL("Insert into aplicaciones values(null,'El carbonato se usa en el refino del zinc.','Sr')");
      elementos.execSQL("Insert into aplicaciones values(null,'Otros compuestos de estroncio se utilizan en la fabricación de cerámicas, productos de vidrio, pigmentos para pinturas (cromato), lámparas fluorescentes (fosfato) y medicamentos (cloruro y peróxido).','Sr')");
      elementos.execSQL("Insert into Paises values(null,'China ','Sr')");
      elementos.execSQL("Insert into Paises values(null,'España,','Sr')");
      elementos.execSQL("Insert into Paises values(null,'México','Sr')");
      elementos.execSQL("Insert into Paises values(null,'Turquía','Sr')");
      elementos.execSQL("Insert into Paises values(null,'Argentina','Sr')");
      elementos.execSQL("Insert into Paises values(null,'Irán','Sr')");

      elementos.execSQL("Insert into aplicaciones values(null,'Las sales de cesio se han utilizado en medicina como agentes antishock después de la administración de drogas de arsénico.','Cs')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los compuestos de cesio se usan en la producción de vidrio y cerámica, como absorbentes en plantas de purificación de dióxido de carbono, en microquímica.','Cs')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cesio metálico se utiliza en celdas fotoeléctricas.','Cs')");
      elementos.execSQL("Insert into Paises values(null,'Rodesia  ','Cs')");

      elementos.execSQL("Insert into aplicaciones values(null,'El bario se usa en pirotecnia.','Ba')");
      elementos.execSQL("Insert into aplicaciones values(null,'El bario metálico tiene pocas aplicaciones prácticas, aunque a veces se usa para recubrir conductores eléctricos en aparatos electrónicos y en sistemas de encendido de automóviles.','Ba')");
      elementos.execSQL("Insert into aplicaciones values(null,'También conocido como Barita o Baritina, debido a su alta densidad, se utiliza como lodo de perforación en los pozos de petróleo.','Ba')");
      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de bario (BaO) forma parte de las lentes de vidrio mineral de alta calidad, usadas, por ejemplo, en instrumentos ópticos.','Ba')");
      elementos.execSQL("Insert into Paises values(null,'Italia','Ba')");

      elementos.execSQL("Insert into aplicaciones values(null,'No hay aplicaciones comerciales para el francio debido a su escasez y a su inestabilidad.','Fr')");
      elementos.execSQL("Insert into aplicaciones values(null,'Sólo ha sido usado en tareas de investigación, tanto en el campo de la biología como en el de la estructura atómica.','Fr')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Fr')");

      elementos.execSQL("Insert into aplicaciones values(null,'Antiguamente se usaba en pinturas luminiscentes para relojes y otros instrumentos. ','Ra')");
      elementos.execSQL("Insert into aplicaciones values(null,'Cuando se mezcla con berilio, es una fuente de neutrones para experimentos físicos.','Ra')");
      elementos.execSQL("Insert into aplicaciones values(null,'Una unidad de radiactividad, el curio, está basada en la radiactividad del radio-226.','Ra')");
      elementos.execSQL("Insert into aplicaciones values(null,'El radio se empleaba a principios de siglo hasta los años 30 en medicinas, entre ellos el Radithor (agua destilada con radio), que lo describían como solución ante todos los males.','Ra')");
      elementos.execSQL("Insert into Paises values(null,'Bohemia','Ra')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Ra')");


      elementos.execSQL("Insert into aplicaciones values(null,'La aplicación principal del escandio en peso es en las aleaciones de aluminio-escandio para componentes menores de la industria aeroespacial.','Sc')");
      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de escandio Sc2O3, se utiliza en luces de alta intensidad.','Sc')");
      elementos.execSQL("Insert into aplicaciones values(null,'La adición de escandio al aluminio limita el crecimiento excesivo del grano que se produce en la zona afectada por el calor en la soldadura de aleaciones de aluminio.','Sc')");
      elementos.execSQL("Insert into aplicaciones values(null,'El radio se empleaba a principios de siglo hasta los años 30 en medicinas, entre ellos el Radithor (agua destilada con radio), que lo describían como solución ante todos los males.','Sc')");
      elementos.execSQL("Insert into Paises values(null,'Escandinavia ','Sc')");
      elementos.execSQL("Insert into Paises values(null,'Madagascar','Sc')");

      elementos.execSQL("Insert into aplicaciones values(null,'El itrio se utiliza comercialmente en la industria metálica para aleaciones.','Y')");
      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de itrio se emplea para producir granates de itrio-hierro (Y3Fe5Si3O12), muy eficientes como filtros de microondas y también en la transmisión y transducción de energía acústica.','Y')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se usa como catalizador para la polimerización del etileno.','Y')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza como “atrapador” para eliminar oxígeno e impurezas de otros materiales; esto le permite reducir el óxido de vanadio y otros metales no ferrosos.','Y')");
      elementos.execSQL("Insert into aplicaciones values(null,'En pequeñas cantidades se añade óxido de itrio a las superaleaciones de níquel usadas en turbinas de aviación para mantener sus propiedades mecánicas a altas temperaturas.','Y')");
      elementos.execSQL("Insert into Paises values(null,' Suecia','Y')");
      elementos.execSQL("Insert into Paises values(null,'Japon','Y')");
      elementos.execSQL("Insert into Paises values(null,'Noruega','Y')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Y')");

      elementos.execSQL("Insert into aplicaciones values(null,'El titanio se emplea en las aleaciones de acero para reducir el tamaño del grano y como desoxidante, y en las de acero inoxidable para reducir su contenido de carbono.','Ti')");
      elementos.execSQL("Insert into aplicaciones values(null,'Pigmentos y aditivos.','Ti')");
      elementos.execSQL("Insert into aplicaciones values(null,'Las tuberías soldadas y ciertos equipamientos de titanio, como intercambiadores de calor, tanques, recipientes de encausado y válvulas, se emplean en las industrias químicas y petroquímicas, principalmente debido su resistencia a la corrosión.','Ti')");
      elementos.execSQL("Insert into aplicaciones values(null,'El metal de titanio se utiliza en diversas aplicaciones en la automoción, particularmente en el automovilismo y el motociclismo.','Ti')");
      elementos.execSQL("Insert into Paises values(null,'Australia','Ti')");
      elementos.execSQL("Insert into Paises values(null,'Sudafrica','Ti')");
      elementos.execSQL("Insert into Paises values(null,'China','Ti')");
      elementos.execSQL("Insert into Paises values(null,'Ucrania','Ti')");
      elementos.execSQL("Insert into Paises values(null,'Vietnam','Ti')");
      elementos.execSQL("Insert into Paises values(null,'Mozambique','Ti')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza como aditivo en aceros obteniéndose materiales muy resistentes.','Zr')");
      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de circonio impuro se emplea para fabricar crisoles de laboratorio (que soportan cambios bruscos de temperatura), recubrimiento de hornos y como material refractario en industrias cerámicas y de vidrio.','Zr')");
      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de circonio se usa en joyería; es una gema artificial denominada circonita que imita al diamante.','Zr')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza como aditivo para fabricar arenas sintéticas.','Zr')");
      elementos.execSQL("Insert into Paises values(null,'Australia','Zr')");
      elementos.execSQL("Insert into Paises values(null,'Brasil','Zr')");
      elementos.execSQL("Insert into Paises values(null,'India','Zr')");
      elementos.execSQL("Insert into Paises values(null,'Rusia ','Zr')");
      elementos.execSQL("Insert into Paises values(null,'Estados Unidos','Zr')");

      elementos.execSQL("Insert into aplicaciones values(null,'En lámparas de gas e incandescentes.','Hf')");
      elementos.execSQL("Insert into aplicaciones values(null,'En catalizadores para polimerización metalocénica.','Hf')");
      elementos.execSQL("Insert into aplicaciones values(null,'Para eliminar oxígeno y nitrógeno de tubos de vacío.','Hf')");
      elementos.execSQL("Insert into aplicaciones values(null,'En aleaciones de hierro, titanio, niobio, tántalo y otras aleaciones metálicas.','Hf')");
      elementos.execSQL("Insert into aplicaciones values(null,'En enero de 2007, se anunció como parte fundamental de una nueva tecnología de microprocesadores, desarrollada separadamente por IBM e Intel, en reemplazo del silicio.','Hf')");
      elementos.execSQL("Insert into Paises values(null,'Dinamarca','Hf')");

      elementos.execSQL("Insert into aplicaciones values(null,'Al ser un elemento sumamente inestable, se descompone con mucha facilidad en otros elementos, por tal razón, se ha considerado que no es necesario el estudio de los efectos que pudiese tener en la salud.','Rf')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Rf')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se emplea en acero inoxidable usado en instrumentos quirúrgicos y herramientas, en aceros resistentes a la corrosión, y mezclado con aluminio en aleaciones de titanio empleadas en motores de reacción. También, en aceros empleados en ejes de ruedas y cigüeñales, engranajes, y otros componentes críticos.','V')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se emplea en algunos componentes de reactores nucleares.','V')");
      elementos.execSQL("Insert into aplicaciones values(null,'Forma parte de algunos imanes superconductores.','V')");
      elementos.execSQL("Insert into aplicaciones values(null,'Algunos compuestos de vanadio se utilizan como catalizadores en la producción de anhídrido maleico y ácido sulfúrico.','V')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los óxidos mixtos de vanadio se utilizan como catalizadores para la producción de ácido acrílico a partir de propano, propileno o acroleína.','V')");
      elementos.execSQL("Insert into Paises values(null,'China','V')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','V')");
      elementos.execSQL("Insert into Paises values(null,'Sudáfrica','V')");

      elementos.execSQL("Insert into aplicaciones values(null,'Los soldadores utilizan el niobio para ligar los componentes de acero inoxidable.','Nb')");
      elementos.execSQL("Insert into aplicaciones values(null,'En aleación con titanio, se puede extrusionar el niobio en un alambre superconductor que luego se puede moldear para formar imanes que no pierden la superconductividad al ser colocados en campos magnéticos externos.','Nb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Lámparas de vapor de sodio.','Nb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Joyería','Nb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Dado a su propiedad de cambiar su color mediante el tratamiento de sus capas superficiales, también se emplea en la fabricación de monedas bimetálicas: 25 euros de Austria y 1 Lat en Letonia.','Nb')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Nb')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza casi exclusivamente en la fabricación de condensadores electrolíticos de tántalo.','Ta')");
      elementos.execSQL("Insert into aplicaciones values(null,'El Ta2O5-SiO2 es utilizado como catalizador en la síntesis de butadieno a partir de etano.','Ta')");
      elementos.execSQL("Insert into aplicaciones values(null,'En los últimos años el tántalo se ha introducido también en el mercado numismático de la moneda de colección.','Ta')");
      elementos.execSQL("Insert into Paises values(null,'Venezuela','Ta')");
      elementos.execSQL("Insert into Paises values(null,'República Democrática del Congo','Ta')");

      elementos.execSQL("Insert into aplicaciones values(null,'Al ser sintético solo es producido en el laboratorio mediante el bombardeo en aceleradores de partículas lineales y sus cantidades son muy pequeñas. Se desconoce su utilidad real, ya que hasta ahora solo se ha usado para la investigación y el desarrollo científico.','Db')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Db')");

      elementos.execSQL("Insert into aplicaciones values(null,'Aproximadamente las dos terceras partes del molibdeno consumido se emplean en aleaciones.','Mo')");
      elementos.execSQL("Insert into aplicaciones values(null,'El molibdeno se usa como catalizador en la industria petrolera.','Mo')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se emplea en distintos pigmentos.','Mo')");
      elementos.execSQL("Insert into aplicaciones values(null,'El disulfuro de molibdeno (MoS2) es un buen lubricante por sí mismo y brinda propiedades de tolerancia','Mo')");
      elementos.execSQL("Insert into aplicaciones values(null,'El molibdeno se emplea en determinadas aplicaciones electrónicas','Mo')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Mo')");
      elementos.execSQL("Insert into Paises values(null,'Africa','Mo')");
      elementos.execSQL("Insert into Paises values(null,'China','Mo')");
      elementos.execSQL("Insert into Paises values(null,'Chile','Mo')");
      elementos.execSQL("Insert into Paises values(null,'Perú','Mo')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Mo')");

      elementos.execSQL("Insert into aplicaciones values(null,'En estado puro se utiliza en la fabricación de filamentos para lámparas eléctricas, resistencias para hornos eléctricos con atmósfera reductoras o neutras','W')");
      elementos.execSQL("Insert into aplicaciones values(null,'Tiene usos importantes en aleaciones para herramientas de corte a elevada velocidad.','W')");
      elementos.execSQL("Insert into aplicaciones values(null,'El wolframio y su aleación más popular, el carburo de wolframio son en ambos casos, excelentes reflectores de neutrones.','W')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los wolframatos de calcio y magnesio se utilizan en la fabricación de tubos fluorescentes.','W')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','W')");
      elementos.execSQL("Insert into Paises values(null,'Bolivia','W')");
      elementos.execSQL("Insert into Paises values(null,'China','W')");
      elementos.execSQL("Insert into Paises values(null,'Portugal','W')");
      elementos.execSQL("Insert into Paises values(null,'Perú','W')");
      elementos.execSQL("Insert into Paises values(null,'Corea del sur','W')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','W')");
      elementos.execSQL("Insert into Paises values(null,'España','W')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se desconoce su utilidad y las pocas cantidades producidas son utilizadas para realizar estudios científicos.','Sg')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Sg')");

      elementos.execSQL("Insert into aplicaciones values(null,'El manganeso se utiliza en las baterías desechables estándar.','Mn')");
      elementos.execSQL("Insert into aplicaciones values(null,'El manganeso es esencial para producir el acero y el hierro. El manganeso es un componente esencial para la fabricación de acero inoxidable de bajo costo.','Mn')");
      elementos.execSQL("Insert into aplicaciones values(null,'En química, el óxido de manganeso se utiliza para oxidar el alcohol bencílico.','Mn')");
      elementos.execSQL("Insert into aplicaciones values(null,'El dioxígeno y el dicloro se procesan utilizando dióxido de manganeso.','Mn')");
      elementos.execSQL("Insert into Paises values(null,'Sudáfrica','Mn')");
      elementos.execSQL("Insert into Paises values(null,'Ucrania','Mn')");
      elementos.execSQL("Insert into Paises values(null,'Bolivia','Mn')");
      elementos.execSQL("Insert into Paises values(null,'China','Mn')");

      elementos.execSQL("Insert into aplicaciones values(null,'Medicina nuclear','Tc')");
      elementos.execSQL("Insert into aplicaciones values(null,'El Tc se desintegra emitiendo partículas beta de baja energía y sin presencia de rayos gamma.','Tc')");
      elementos.execSQL("Insert into aplicaciones values(null,'El tecnecio puede usarse como catalizador. ','Tc')");
      elementos.execSQL("Insert into aplicaciones values(null,'En los últimos años de la década de 1970, se efectuó con éxito la electrodeposición del tecnecio sobre varios sustratos','Tc')");
      elementos.execSQL("Insert into Paises values(null,'Todos los paises','Tc')");

      elementos.execSQL("Insert into aplicaciones values(null,'El renio, al ser un elemento metálico refractario y resistente a la corrosión, es usado principalmente en joyería.','Re')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza en aleaciones de wolframio y molibdeno, como conductor eléctrico.','Re')");
      elementos.execSQL("Insert into aplicaciones values(null,'En la fabricación de flashes fotográficos y para la construcción de los plumines de las estilográficas.','Re')");
      elementos.execSQL("Insert into Paises values(null,'Chile','Re')");
      elementos.execSQL("Insert into Paises values(null,'Kazajistán','Re')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se desconoce su utilidad y las pocas cantidades producidas son utilizadas para realizar estudios científicos.','Bh')");
      elementos.execSQL("Insert into Paises values(null,'Al ser un elemento artificial, su producción se realiza sintéticamente en el laboratorio, razón por la cual sus cantidades son pocas.','Bh')");

      elementos.execSQL("Insert into aplicaciones values(null,'El hierro es el metal duro más usado, con el 95 % en peso de la producción mundial de metal.','Fe')");
      elementos.execSQL("Insert into aplicaciones values(null,'El acero es indispensable debido a su bajo precio y tenacidad, especialmente en automóviles, barcos y componentes estructurales de edificios.','Fe')");
      elementos.execSQL("Insert into aplicaciones values(null,'Las aleaciones férreas presentan una gran variedad de propiedades mecánicas dependiendo de su composición o el tratamiento que se haya llevado a cabo.','Fe')");
      elementos.execSQL("Insert into Paises values(null,'Brasil','Fe')");
      elementos.execSQL("Insert into Paises values(null,'Australia','Fe')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Fe')");
      elementos.execSQL("Insert into Paises values(null,'India','Fe')");
      elementos.execSQL("Insert into Paises values(null,'China','Fe')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Fe')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Fe')");
      elementos.execSQL("Insert into Paises values(null,'Sucecia','Fe')");
      elementos.execSQL("Insert into Paises values(null,'Ucrania','Fe')");

      elementos.execSQL("Insert into aplicaciones values(null,'Debido a su gran efectividad para endurecer al paladio y al platino, se emplea en las aleaciones de estos metales que se usan en contactos eléctricos con una alta resistencia al desgaste.','Ru')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se incorpora al titanio como elemento de aleación para aumentar la resistencia a la corrosión. Un 0,1% la mejora en unas cien veces.','Ru')");
      elementos.execSQL("Insert into aplicaciones values(null,'Recientemente, se ha encontrado que algunos compuestos organometálicos de rutenio tienen actividad antitumoral.','Ru')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Ru')");

      elementos.execSQL("Insert into aplicaciones values(null,'Aplicaciones en química orgánica','Os')");
      elementos.execSQL("Insert into aplicaciones values(null,'El tetróxido de osmio es un buen oxidante.','Os')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se emplea en química orgánica como reactivo para sintetizar 1-2 cis-dioles a partir de un doble enlace.','Os')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Os')");

      elementos.execSQL("Insert into aplicaciones values(null,'Al producirse en el laboratorio, es utilizado para estudios e investigación científica.','Hs')");
      elementos.execSQL("Insert into Paises values(null,'Su producción se realiza en el laboratorio a través del bombardeo de átomos del 208-Pb, que es un isótopo del plomo, con un haz de proyectiles de 58-Fe.','Hs')");

      elementos.execSQL("Insert into aplicaciones values(null,'Catálisis del petróleo e industria química.','Co')");
      elementos.execSQL("Insert into aplicaciones values(null,'Recubrimientos metálicos por deposición electrolítica por su aspecto, dureza y resistencia a la oxidación.','Co')");
      elementos.execSQL("Insert into aplicaciones values(null,'Secante para pinturas, barnices y tintas.','Co')");
      elementos.execSQL("Insert into aplicaciones values(null,'Pigmentos (cobalto azul y cobalto verde).','Co')");
      elementos.execSQL("Insert into aplicaciones values(null,'Electrodos de baterías eléctricas','Co')");
      elementos.execSQL("Insert into aplicaciones values(null,'Cables de acero de neumáticos.','Co')");
      elementos.execSQL("Insert into Paises values(null,'República Democrática del Congo','Co')");

      elementos.execSQL("Insert into aplicaciones values(null,'Típicamente, el oro blanco es galvanizado con una capa externa de rodio','Rh')");
      elementos.execSQL("Insert into aplicaciones values(null,'Actuar como catalizador para la hidrogenación y es activo en la reformación catalítica de hidrocarburos.','Rh')");
      elementos.execSQL("Insert into aplicaciones values(null,'Secante para pinturas, barnices y tintas.','Rh')");
      elementos.execSQL("Insert into Paises values(null,'Sudáfrica','Rh')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Rh')");

      elementos.execSQL("Insert into aplicaciones values(null,'El alto punto de fusión, la dureza y resistencia a la corrosión del iridio y sus aleaciones determinan la mayoría de sus aplicaciones','Ir')");
      elementos.execSQL("Insert into aplicaciones values(null,'La resistencia a la corrosión y al calor hacen del iridio un agente de aleación importante.','Ir')");
      elementos.execSQL("Insert into aplicaciones values(null,'El iridio ha sido utilizado en los generadores termoeléctricos de radioisótopos de naves espaciales no tripuladas.','Ir')");
      elementos.execSQL("Insert into aplicaciones values(null,'El iridio se usa en la física de partículas para la producción de antiprotones, una forma de antimateria.','Ir')");
      elementos.execSQL("Insert into aplicaciones values(null,'Aleaciones de iridio-osmio se han usado en plumas estilográficas.','Ir')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Ir')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Ir')");
      elementos.execSQL("Insert into Paises values(null,'Sudráfica','Ir')");

      elementos.execSQL("Insert into aplicaciones values(null,'Es un elemento que solo se produce para realizar investigación científica, los usos de este elemento son muy escasos.','Mt')");
      elementos.execSQL("Insert into Paises values(null,'Alemania','Mt')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Mt')");

      elementos.execSQL("Insert into aplicaciones values(null,'Alnico, aleación para imanes.','Ni')");
      elementos.execSQL("Insert into aplicaciones values(null,'El mu-metal se usa para apantallar campos magnéticos por su elevada permeabilidad magnética.','Ni')");
      elementos.execSQL("Insert into aplicaciones values(null,'El metal es la opción más económica para hacer oro blanco. El níquel, un metal blanco y de tonalidad mate y de tacto suave, es un metal que encuentra mucha facilidad para «blanquear» a otros metales.','Ni')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza níquel para fabricar los volantes de los relojes mecánicos, no todos pero la mayoría de los relojes rusos antiguos y algunos suizos.','Ni')");
      elementos.execSQL("Insert into aplicaciones values(null,'Crisoles de laboratorios químicos.','Ni')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Ni')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Ni')");
      elementos.execSQL("Insert into Paises values(null,'Bolivia','Ni')");
      elementos.execSQL("Insert into Paises values(null,'Colombia','Ni')");
      elementos.execSQL("Insert into Paises values(null,'Francia','Ni')");

      elementos.execSQL("Insert into aplicaciones values(null,'El paladio se usa principalmente en los convertidores catalíticos.','Pd')");
      elementos.execSQL("Insert into aplicaciones values(null,'También se usa en la joyería, en odontología, relojería, en las tiras reactivas para comprobar los niveles de azúcar en la sangre, en las bujías de los aviones y en la producción de instrumentos quirúrgicos y contactos eléctricos.','Pd')");
      elementos.execSQL("Insert into aplicaciones values(null,'La segunda aplicación paladio en la electrónica es en el condensador eléctrico de cerámica de múltiples capas.','Pd')");
      elementos.execSQL("Insert into aplicaciones values(null,'A menudo se utiliza con el platino para imprimir fotos a blanco y negro, el paladio proporciona una alternativa a la plata.','Pd')");
      elementos.execSQL("Insert into aplicaciones values(null,'Arte.','Pd')");
      elementos.execSQL("Insert into Paises values(null,'Sudáfrica','Pd')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Pd')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Pd')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Pd')");

      elementos.execSQL("Insert into aplicaciones values(null,'Joyería','Pt')");
      elementos.execSQL("Insert into aplicaciones values(null,'El platino, junto con el paladio y el rodio, son los principales componentes de los catalizadores que reducen en los vehículos las emisiones de gases como hidrocarburos, monóxido de carbono u óxido de nitrógeno.','Pt')");
      elementos.execSQL("Insert into aplicaciones values(null,'Eléctrica y electrónica: El platino se usa en la producción de unidades de disco duro en ordenadores y en cables de fibra óptica.','Pt')");
      elementos.execSQL("Insert into aplicaciones values(null,'El platino se usa en fertilizantes y explosivos como una gasa para la conversión catalítica de amoníaco en ácido nítrico.','Pt')");
      elementos.execSQL("Insert into aplicaciones values(null,'El platino se usa en drogas anti-cancerígenas y en implantes.','Pt')");
      elementos.execSQL("Insert into Paises values(null,'Sudáfrica','Pt')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Pt')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Pt')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Pt')");
      elementos.execSQL("Insert into Paises values(null,'Zimbabue','Pt')");

      elementos.execSQL("Insert into aplicaciones values(null,'Su uso se limita a la investigación científica, siendo está muy poco frecuente en relación a este elemento químico de tipo transactinido, calificado como radiactivo, que a temperatura ambiente es sólido, por lo que resulta un elemento poco conocido.','Mt')");
      elementos.execSQL("Insert into Paises values(null,'Alemania','Mt')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Mt')");

      elementos.execSQL("Insert into aplicaciones values(null,'El cobre es el metal no precioso con mejor conductividad eléctrica.','Cu')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cobre se emplea en varios componentes de coches y camiones, principalmente los radiadores.','Cu')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cobre y, sobre todo, el bronce se utilizan también como elementos arquitectónicos y revestimientos en tejados, fachadas, puertas y ventanas.','Cu')");
      elementos.execSQL("Insert into aplicaciones values(null,'Desde el inicio de la acuñación de monedas en la Edad Antigua el cobre se emplea como materia prima de las mismas.','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Chile','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Perú','Cu')");
      elementos.execSQL("Insert into Paises values(null,'China','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Indonesia','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Polonia','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Republica dominicana del congo','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Zambia','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Cu')");
      elementos.execSQL("Insert into Paises values(null,'Kazajistán','Cu')");

      elementos.execSQL("Insert into aplicaciones values(null,'Armas blancas o cuerpo a cuerpo, tales como espadas, lanzas o puntas de flecha.','Ag')");
      elementos.execSQL("Insert into aplicaciones values(null,'Fotografía. Por su sensibilidad a la luz (especialmente el bromuro y el yoduro, así como el fosfato). El yoduro de plata se ha utilizado también para producir lluvia artificial.','Ag')");
      elementos.execSQL("Insert into aplicaciones values(null,'En electrónica, por su elevada conductividad es empleada cada vez más, por ejemplo, en los contactos de circuitos integrados y teclados de ordenador.','Ag')");
      elementos.execSQL("Insert into aplicaciones values(null,'En joyería y platería para fabricar gran variedad de artículos ornamentales y de uso doméstico cotidiano.','Ag')");
      elementos.execSQL("Insert into aplicaciones values(null,'Fotografía.','Ag')");
      elementos.execSQL("Insert into Paises values(null,'Perú','Ag')");
      elementos.execSQL("Insert into Paises values(null,'Polonia','Ag')");
      elementos.execSQL("Insert into Paises values(null,'Chile','Ag')");
      elementos.execSQL("Insert into Paises values(null,'Mexico','Ag')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Ag')");
      elementos.execSQL("Insert into Paises values(null,'Bolivia','Ag')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Ag')");

      elementos.execSQL("Insert into aplicaciones values(null,'Joyería','Au')");
      elementos.execSQL("Insert into aplicaciones values(null,'El oro y sus muchas aleaciones se emplean bastante en joyería, en relación con el intercambio monetario.','Au')");
      elementos.execSQL("Insert into aplicaciones values(null,'Hoy por hoy, los países emplean reservas de oro puro en lingotes que dan cuenta de su riqueza, véase patrón oro.','Au')");
      elementos.execSQL("Insert into aplicaciones values(null,'El oro ejerce funciones críticas en comunicaciones.','Au')");
      elementos.execSQL("Insert into aplicaciones values(null,'Su alta conductividad eléctrica y resistencia a la oxidación ha permitido un amplio uso como capas delgadas electrodepositadas.','Au')");
      elementos.execSQL("Insert into Paises values(null,'China','Au')");
      elementos.execSQL("Insert into Paises values(null,'Australia','Au')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Au')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Au')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Au')");
      elementos.execSQL("Insert into Paises values(null,'Perú','Au')");

      elementos.execSQL("Insert into aplicaciones values(null,'Su uso es exclusivamente en la investigación científica, por lo que la producción es muy poca y por ende se desconoce su utilidad fuera de los laboratorios de investigación.','Rh')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Rh')");

      elementos.execSQL("Insert into aplicaciones values(null,'Baterías de Zn-C usadas en la industria aeroespacial para misiles y cápsulas espaciales por su óptimo rendimiento por unidad de peso y baterías zinc-aire para computadoras portátiles.','Zn')");
      elementos.execSQL("Insert into aplicaciones values(null,'Piezas de fundición inyectada en la industria de automoción.','Zn')");
      elementos.execSQL("Insert into aplicaciones values(null,'Metalurgia de metales preciosos y eliminación de la plata del plomo.','Zn')");
      elementos.execSQL("Insert into aplicaciones values(null,'Aleaciones: latón, alpaca, cuproníquel-zinc, aluzinc, virenium, tombac, etc.','Zn')");
      elementos.execSQL("Insert into Paises values(null,'China','Zn')");
      elementos.execSQL("Insert into Paises values(null,'Perú','Zn')");
      elementos.execSQL("Insert into Paises values(null,'Australia','Zn')");
      elementos.execSQL("Insert into Paises values(null,'India','Zn')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Zn')");
      elementos.execSQL("Insert into Paises values(null,'Canada','Zn')");
      elementos.execSQL("Insert into Paises values(null,'Mexico dominicana del congo','Zn')");
      elementos.execSQL("Insert into Paises values(null,'Kazajistán','Zn')");
      elementos.execSQL("Insert into Paises values(null,'Bolivia','Zn')");
      elementos.execSQL("Insert into Paises values(null,'Irlanda','Zn')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se emplea en acumuladores eléctricos de níquel-cadmio recargables.','Cd')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza mucho en electrodeposición: recubrimiento de rectificadores y acumuladores.','Cd')");
      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de cadmio se usa como catalizador para la hidrogenación y la síntesis de metano.','Cd')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cloruro de cadmio se utiliza en galvanotecnia, fotografía y tintorería.','Cd')");
      elementos.execSQL("Insert into aplicaciones values(null,'El sulfuro de cadmio se utiliza como pigmento amarillo.','Cd')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Cd')");

      elementos.execSQL("Insert into aplicaciones values(null,'El mercurio se utiliza principalmente para la fabricación de productos químicos industriales o para aplicaciones eléctricas y electrónicas.','Hg')");
      elementos.execSQL("Insert into aplicaciones values(null,'El mercurio y sus compuestos se han utilizado en medicina, aunque son mucho menos comunes en la actualidad de lo que lo eran antes, debido a que los efectos tóxicos del mercurio y de sus compuestos son mejor conocidos.','Hg')");
      elementos.execSQL("Insert into aplicaciones values(null,'Algunos termómetros, especialmente los de altas temperaturas, contienen mercurio.','Hg')");
      elementos.execSQL("Insert into aplicaciones values(null,'El mercurio también se utiliza en los telescopios de espejo líquido.','Hg')");
      elementos.execSQL("Insert into aplicaciones values(null,'En algunos reclamos publicitarios del tipo letrero de neón.','Hg')");
      elementos.execSQL("Insert into Paises values(null,'China','Hg')");
      elementos.execSQL("Insert into Paises values(null,'Kirguistan','Hg')");
      elementos.execSQL("Insert into Paises values(null,'Chile','Hg')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Hg')");
      elementos.execSQL("Insert into Paises values(null,'Peru','Hg')");
      elementos.execSQL("Insert into Paises values(null,'Marruecos','Hg')");

      elementos.execSQL("Insert into aplicaciones values(null,'Su uso se limita a la investigación científica','Cn')");
      elementos.execSQL("Insert into Paises values(null,'Alemania','Cn')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Cn')");

      elementos.execSQL("Insert into aplicaciones values(null,'Las fibras de boro usadas en aplicaciones mecánicas especiales.','B')");
      elementos.execSQL("Insert into aplicaciones values(null,'El boro amorfo se usa en fuegos pirotécnicos por su color verde.','B')");
      elementos.execSQL("Insert into aplicaciones values(null,'El ácido bórico se emplea en productos textiles.','B')");
      elementos.execSQL("Insert into aplicaciones values(null,'El boro es usado como semiconductor.','B')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los compuestos de boro tienen muchas aplicaciones en la síntesis orgánica y en la fabricación de cristales de borosilicato.','B')");
      elementos.execSQL("Insert into Paises values(null,'Chile','B')");

      elementos.execSQL("Insert into aplicaciones values(null,'La utilización industrial del aluminio ha hecho de este metal uno de los más importantes.','Al')");
      elementos.execSQL("Insert into aplicaciones values(null,'El aluminio se usa en forma pura, aleado con otros metales o en compuestos no metálicos.','Al')");
      elementos.execSQL("Insert into aplicaciones values(null,'Por sus propiedades eléctricas es un buen conductor.','Al')");
      elementos.execSQL("Insert into aplicaciones values(null,'El uso del aluminio también se realiza a través de compuestos que forma.','Al')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como presenta un buen comportamiento a bajas temperaturas, se utiliza para fabricar contenedores criogénicos.','Al')");
      elementos.execSQL("Insert into Paises values(null,'Brasil','Al')");
      elementos.execSQL("Insert into Paises values(null,'Paises de Asia','Al')");
      elementos.execSQL("Insert into Paises values(null,'Mexico','Al')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Al')");

      elementos.execSQL("Insert into aplicaciones values(null,'Son buenos semiconductores y se usan en la fabricación de componentes electrónicos como transistores.','Ga')");
      elementos.execSQL("Insert into aplicaciones values(null,'También es usado en termostatos y registros de transferencia de calor.','Ga')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Ga')");

      elementos.execSQL("Insert into aplicaciones values(null,'En la fabricación de aleaciones de bajo punto de fusión.','In')");
      elementos.execSQL("Insert into aplicaciones values(null,'Para hacer fotoconductores, transistores de germanio, rectificadores y termistores.','In')");
      elementos.execSQL("Insert into aplicaciones values(null,'Su óxido se emplea en la fabricación de paneles electroluminiscentes.','In')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se puede depositar sobre otros metales y evaporarse sobre un vidrio formando un espejo tan bueno como los hechos con plata.','In')");
      elementos.execSQL("Insert into Paises values(null,'China','In')");

      elementos.execSQL("Insert into aplicaciones values(null,'El sulfato de talio, que es inodoro e insípido fue usado para exterminar ratas y hormigas.','Tl')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los cristales de bromuro y el yoduro de talio se utilizan en cristales infrarrojos, debido a que son más duros y transmiten longitudes de onda más largas que otros materiales.','Tl')");
      elementos.execSQL("Insert into aplicaciones values(null,'La conductividad eléctrica del sulfuro de talio cambia con la exposición a la luz infrarroja haciendo con ello sus compuestos útiles en fotorresistores.','Tl')");
      elementos.execSQL("Insert into aplicaciones values(null,'El talio se utiliza en la cintigrafía para la identificación de tumores óseos.','Tl')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Tl')");

      elementos.execSQL("Insert into aplicaciones values(null,'Por su vida media tan reducida de tan solo milisegundos a minutos y su inestabilidad son nulas las aplicaciones industriales o comerciales de este elemento súper pesado, por lo que su aplicación se relega solo a la investigación científica.','Nh')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Tl')");

      elementos.execSQL("Insert into aplicaciones values(null,'El grafito se combina con arcilla para fabricar las minas de los lápices.','C')");
      elementos.execSQL("Insert into aplicaciones values(null,'El diamante es transparente y muy duro. En su formación, cada átomo de carbono está unido de forma compacta a otros cuatro átomos.','C')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como elemento de aleación principal de los aceros.','C')");
      elementos.execSQL("Insert into aplicaciones values(null,'En varillas de protección de reactores nucleares.','C')");
      elementos.execSQL("Insert into aplicaciones values(null,'Las pastillas de carbón se emplean en medicina para absorber las toxinas del sistema digestivo y como remedio de la flatulencia.','C')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','C')");
      elementos.execSQL("Insert into Paises values(null,'Groelandia','C')");
      elementos.execSQL("Insert into Paises values(null,'Mexico','C')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','C')");
      elementos.execSQL("Insert into Paises values(null,'India','C')");

      elementos.execSQL("Insert into aplicaciones values(null,'Como material refractario, se usa en cerámicas, vidriados y esmaltados.','Si')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como elemento fertilizante en forma de mineral primario rico en silicio, para la agricultura.','Si')");
      elementos.execSQL("Insert into aplicaciones values(null,'Fabricación de vidrio para ventanas y aislantes.','Si')");
      elementos.execSQL("Insert into aplicaciones values(null,'El carburo de silicio es uno de los abrasivos más importantes.','Si')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se usa en láseres para obtener una luz con una longitud de onda de 456 nm.','Si')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Si')");

      elementos.execSQL("Insert into aplicaciones values(null,'Fibra óptica.','Ge')");
      elementos.execSQL("Insert into aplicaciones values(null,'Óptica de infrarrojos: Espectroscopios, sistemas de visión nocturna y otros equipos.','Ge')");
      elementos.execSQL("Insert into aplicaciones values(null,'En joyería se usa la aleación Au con 12% de germanio.','Ge')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como elemento endurecedor del aluminio, magnesio y estaño.','Ge')");
      elementos.execSQL("Insert into aplicaciones values(null,'Quimioterapia.','Ge')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Ge')");
      elementos.execSQL("Insert into Paises values(null,'China','Ge')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se usa como protector del hierro, del acero y de diversos metales usados en la fabricación de latas de conserva.','Sn')");
      elementos.execSQL("Insert into aplicaciones values(null,'También se usa para disminuir la fragilidad del vidrio.','Sn')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se usa para realizar bronce, aleación de estaño y cobre.','Sn')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se usa para la soldadura blanda, aleado con plomo.','Sn')");
      elementos.execSQL("Insert into aplicaciones values(null,'Tiene utilidad en etiquetas.','Sn')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Sn')");

      elementos.execSQL("Insert into aplicaciones values(null,'Su utilización como cubierta para cables, ya sea la de teléfono, de televisión, de internet o de electricidad, sigue siendo una forma de empleo adecuada.','Pb')");
      elementos.execSQL("Insert into aplicaciones values(null,'El uso del plomo en pigmentos sintéticos o artificiales ha sido muy importante, pero está decreciendo en volumen.','Pb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Tiene utilidad en etiquetas.','Pb')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Pb')");


      elementos.execSQL("Insert into aplicaciones values(null,'Su producción y uso se limita a la investigación científica, por lo cual esta es poca y no se le conoce ningún otro tipo de uso.','Fl')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Fl')");

      elementos.execSQL("Insert into aplicaciones values(null,'La aplicación comercial más importante del nitrógeno diatómico es la obtención de amoníaco por el proceso de Haber.','N')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los compuestos orgánicos de nitrógeno como la nitroglicerina y el trinitrotolueno son a menudo explosivos. La hidracina y sus derivados se usan como combustible en cohetes.','N')");
      elementos.execSQL("Insert into aplicaciones values(null,'Al ser un gas poco reactivo, el nitrógeno se emplea industrialmente para crear atmósferas protectoras y como gas criogénico para obtener temperaturas del orden de 78K de forma sencilla y económica. ','N')");
      elementos.execSQL("Insert into Paises values(null,'Todos los paises','N')");

      elementos.execSQL("Insert into aplicaciones values(null,'Los compuestos del fósforo intervienen en funciones vitales para los seres vivos.','P')");
      elementos.execSQL("Insert into aplicaciones values(null,'Las células lo utilizan para almacenar y transportar la energía mediante el adenosín trifosfato.','P')");
      elementos.execSQL("Insert into aplicaciones values(null,'Forma parte de la molécula de Pi.','P')");
      elementos.execSQL("Insert into Paises values(null,'Marruecos','P')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','P')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','P')");
      elementos.execSQL("Insert into Paises values(null,'Otros paises','P')");



      elementos.execSQL("Insert into aplicaciones values(null,'Preservante de la madera.','As')");
      elementos.execSQL("Insert into aplicaciones values(null,'Aditivo en aleaciones de plomo y latones.','As')");
      elementos.execSQL("Insert into aplicaciones values(null,'El disulfuro de arsénico se usa como pigmento y en pirotecnia.','As')");
      elementos.execSQL("Insert into aplicaciones values(null,'Decolorante en la fabricación del vidrio.','As')");
      elementos.execSQL("Insert into Paises values(null,'Perú','As')");
      elementos.execSQL("Insert into Paises values(null,'China','As')");
      elementos.execSQL("Insert into Paises values(null,'Filipinas','As')");
      elementos.execSQL("Insert into Paises values(null,'Canada','As')");
      elementos.execSQL("Insert into Paises values(null,'Chile','As')");



      elementos.execSQL("Insert into aplicaciones values(null,'Baterías y acumuladores.','Sb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Tipos de imprenta.','Sb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Cojinetes y rodamientos.','Sb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Las baterías eléctricas industriales incluyen las baterías de acumuladores de tracción en las locomotoras de las minas, carros del golf, y así sucesivamente, baterías de energía de emergencia. El antimonio en aleación con el plomo es usado para ciertas piezas de los acumuladores eléctricos para las cuales la resistencia a la corrosión es necesaria.','Sb')");
      elementos.execSQL("Insert into Paises values(null,'Rusia','Sb')");
      elementos.execSQL("Insert into Paises values(null,'China','Sb')");
      elementos.execSQL("Insert into Paises values(null,'Paises de europa','Sb')");

      elementos.execSQL("Insert into aplicaciones values(null,'En numerosos usos en balística y como balasto.','Bi')");
      elementos.execSQL("Insert into aplicaciones values(null,'Es utilizado para fabricar escudos de látex impregnados con bismuto para protección de los rayos-X durante exámenes médicos','Bi')");
      elementos.execSQL("Insert into aplicaciones values(null,'El oxicloruro de bismuto (BiOCl) a veces es utilizado en cosméticos.','Bi')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Bi')");

      elementos.execSQL("Insert into aplicaciones values(null,'Usos en investigaciones','Mc')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Mc')");

      elementos.execSQL("Insert into aplicaciones values(null,'El propósito esencial de la respiración es tomar el O2 del aire y, en medicina, se usan suplementos de oxígeno.','O')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los tratamientos son lo suficientemente flexibles como para ser usados en hospitales','O')");
      elementos.execSQL("Insert into aplicaciones values(null,'Una aplicación notable del O2 como gas respirable de baja presión se encuentra en los trajes espaciales modernos, que envuelven el cuerpo de sus ocupantes con aire presurizado.','O')");
      elementos.execSQL("Insert into aplicaciones values(null,'Otro 25 % de este oxígeno se dedica a la industria química','O')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','O')");

      elementos.execSQL("Insert into aplicaciones values(null,'El azufre se usa en multitud de procesos industriales.','S')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los sulfitos se usan para blanquear el papel y en fósforos.','S')");
      elementos.execSQL("Insert into aplicaciones values(null,'El azufre tiene usos como fungicida y en la manufactura de fosfatos fertilizantes.','S')");
      elementos.execSQL("Insert into Paises values(null,'Perú','S')");
      elementos.execSQL("Insert into Paises values(null,'China','S')");
      elementos.execSQL("Insert into Paises values(null,'Filipinas','S')");
      elementos.execSQL("Insert into Paises values(null,'Canada','S')");
      elementos.execSQL("Insert into Paises values(null,'Chile','S')");

      elementos.execSQL("Insert into aplicaciones values(null,'El selenio se usa con diversos fines.','Se')");
      elementos.execSQL("Insert into aplicaciones values(null,'El sulfuro de selenio, se usa en lociones y champúes como tratamiento para la dermatitis seborreica','Se')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Se')");

      elementos.execSQL("Insert into aplicaciones values(null,'El telurio se usa especialmente en el sector de la industria electrónica','Te')");
      elementos.execSQL("Insert into aplicaciones values(null,'También se utiliza para mejorar la maquinabilidad de otros materiales, como el cobre y el acero.','Te')");
      elementos.execSQL("Insert into Paises values(null,'España','Te')");

      elementos.execSQL("Insert into aplicaciones values(null,'Mezclado o aleado con berilio, el polonio puede ser una fuente de neutrones.','Po')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza también en dispositivos destinados a la eliminación de carga estática.','Po')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Po')");

      elementos.execSQL("Insert into aplicaciones values(null,'Por ser un elemento sumamente inestable con una vida media muy reducida y la dificultad que presenta para su obtención, no se han determinado aplicaciones industriales para el livermorio, quedando solo para realizar estudios a nivel científico.','Lv')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Lv')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se emplea flúor monoatómico en la fabricación de semiconductores.','F')");
      elementos.execSQL("Insert into aplicaciones values(null,'El fluoruro de hidrógeno se emplea en la obtención de criolita sintética, Na3AlF6, la cual se usa en el proceso de obtención de aluminio.','F')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se emplea flúor en la síntesis del hexafluoruro de uranio, UF6, es el gas más pesado conocido y se emplea en el enriquecimiento de uranio 235U.','F')");
      elementos.execSQL("Insert into Paises values(null,'Todos los paises','F')");

      elementos.execSQL("Insert into aplicaciones values(null,'Las principales aplicaciones de cloro son en la producción de un amplio rango de productos industriales y para consumo.','Cl')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cloro es un químico importante para la purificación del agua (como en plantas de tratamiento de agua), en desinfectantes, y en la lejía.','Cl')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cloro elemental es un oxidante. Interviene en reacciones de sustitución, donde desplaza a los halógenos menores de sus sales.','Cl')");
      elementos.execSQL("Insert into aplicaciones values(null,'El cloro es usado extensivamente en química orgánica y química inorgánica como un agente oxidante.','Cl')");
      elementos.execSQL("Insert into Paises values(null,'Todos los paises','Cl')");

      elementos.execSQL("Insert into aplicaciones values(null,'La prueba del bromo consiste en el uso de agua de bromo con el objetivo de detectar la presencia de compuestos orgánicos insaturados.','Br')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los bromuros actúan médicamente como sedantes y el bromuro de plata se utiliza como un elemento fundamental en las placas fotográficas.','Br')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Br')");
      elementos.execSQL("Insert into Paises values(null,'Israel','Br')");

      elementos.execSQL("Insert into aplicaciones values(null,'La glándula tiroides fabrica las hormonas tiroxina y triyodotironina, que contienen yodo','I')");
      elementos.execSQL("Insert into aplicaciones values(null,'Creacion de sales','I')");
      elementos.execSQL("Insert into Paises values(null,'Todos los paises','I')");

      elementos.execSQL("Insert into aplicaciones values(null,'Por ser un elemento raro en la naturaleza, es poco lo que se conoce de él, por tal razón es considerado un elemento más curioso y raro del mundo.','At')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','At')");

      elementos.execSQL("Insert into aplicaciones values(null,'Investigaciones en laboratorios.','Ts')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Ts')");

      elementos.execSQL("Insert into elemento values('He','40026','Helio','1','18','1p','Gases nobles')");

      elementos.execSQL("Insert into aplicaciones values(null,'Por su bajo punto de licuefacción y evaporación puede utilizarse como refrigerante en aplicaciones a temperatura extremadamente baja, como en imanes superconductores e investigación criogénica a temperaturas próximas al cero absoluto.','He')");
      elementos.execSQL("Insert into aplicaciones values(null,'En túneles de viento supersónicos.','He')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como agente refrigerante en reactores nucleares.','He')");
      elementos.execSQL("Insert into aplicaciones values(null,'El helio líquido encuentra cada vez mayor uso en las aplicaciones médicas de la imagen por resonancia magnética.','He')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','He')");

      elementos.execSQL("Insert into aplicaciones values(null,'Indicadores de alto voltaje.','Ne')");
      elementos.execSQL("Insert into aplicaciones values(null,'Tubos de televisión.','Ne')");
      elementos.execSQL("Insert into aplicaciones values(null,'Junto con el helio se emplea para obtener un tipo de láser.','Ne')");
      elementos.execSQL("Insert into aplicaciones values(null,'El neón licuado se comercializa como refrigerante criogénico.','Ne')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','Ne')");

      elementos.execSQL("Insert into aplicaciones values(null,'En la fotografía.','Kr')");
      elementos.execSQL("Insert into aplicaciones values(null,'Las lámparas de flash.','Kr')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los proyectores, en especial si son de alta definición.','Kr')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','Kr')");

      elementos.execSQL("Insert into aplicaciones values(null,'Soldadura por arco y soldadura a gas.','Ar')");
      elementos.execSQL("Insert into aplicaciones values(null,'Fabricación de titanio y otros elementos reactivos.','Ar')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','Ar')");

      elementos.execSQL("Insert into aplicaciones values(null,'Como anestésico en anestesia general.','Xe')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los perxenatos se usan como agentes oxidantes en química analítica.','Xe')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se usa en los faros de automóviles.','Xe')");
      elementos.execSQL("Insert into aplicaciones values(null,'Las lámparas de xenón son ampliamente utilizadas en los proyectores de cine.','Xe')");
      elementos.execSQL("Insert into aplicaciones values(null,'Gas de propulsión iónica para satélites.','Xe')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','Xe')");

      elementos.execSQL("Insert into aplicaciones values(null,'Se pueden utilizar para seguir masas de aire en un grado limitado.','Rn')");
      elementos.execSQL("Insert into aplicaciones values(null,'Aunque algunos médicos creyeron una vez que el radón se puede utilizar terapéuticamente, no hay evidencia para esta creencia y el radón no está actualmente en uso médico, por lo menos en el mundo desarrollado.','Rn')");
      elementos.execSQL("Insert into Paises values(null,'Todos los países','Rn')");

      elementos.execSQL("Insert into aplicaciones values(null,'El descubrimiento de este elemento fue en 2015 por lo que no hay aplicaciones definidas aun','Og')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Og')");

      elementos.execSQL("Insert into aplicaciones values(null,'Aleado con cerio, neodimio, praseodimio, gadolinio e iterbio forma la aleación llamada mischmetal, utilizada para fabricar piedras de encendedor.','La')");
      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de lantano confiere al vidrio resistencia a las bases y se emplea para la fabricación de vidrios ópticos especiales. Además se usa para fabricar crisoles.','La')");
      elementos.execSQL("Insert into aplicaciones values(null,'Es utilizado como componente de las pantallas intensificadoras de las unidades de rayos X. Puede ser pero no se sabe con seguridad.','La')");
      elementos.execSQL("Insert into aplicaciones values(null,'El Carbonato de Lantano es utilizado en el tratamiento de la insuficiencia Renal Crónica por su capacidad de formar complejos insolubles con fosfatos, reduciendo así la hiperfosfemia.','La')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','La')");

      elementos.execSQL("Insert into aplicaciones values(null,'Convertidores catalíticos para motores de combustión interna.','Ce')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como catalizador del proceso de cracking en la industria del petróleo.','Ce')");
      elementos.execSQL("Insert into aplicaciones values(null,'En aleaciones utilizadas en encendedores.','Ce')");
      elementos.execSQL("Insert into aplicaciones values(null,'En las aleaciones de los imanes permanentes.','Ce')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como en el tratamiento de quemaduras bajo el nombre comercial de flammacerium.','Ce')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Ce')");

      elementos.execSQL("Insert into aplicaciones values(null,'Como un agente de aleación con el magnesio para crear los metales de alta resistencia que se utilizan en motores de avión.','Pr')");
      elementos.execSQL("Insert into aplicaciones values(null,'Los compuestos del praseodimio son usados para dar a los vidrios y esmaltes un color amarillo.','Pr')");
      elementos.execSQL("Insert into aplicaciones values(null,'El praseodimio se utiliza para colorear zirconia cúbica de un color verde-amarillo, para simular peridoto.','Pr')");
      elementos.execSQL("Insert into aplicaciones values(null,'El praseodimio aleado con níquel (PrNi5) tiene un efecto magnetocalórico tan fuerte a que ha permitido que los científicos se acerquen a menos de una milésima de grado del cero absoluto.','Pr')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Pr')");

      elementos.execSQL("Insert into aplicaciones values(null,'Es un componente del didimio, usado para colorear cristales y la fabricación de gafas de protección para los soldadores, pues absorben la luz ámbar de la llama.','Nd')");
      elementos.execSQL("Insert into aplicaciones values(null,'Algunos tipos de cristal que contienen neodimio son utilizados para producir rubíes sintéticos utilizados en láser.','Nd')");
      elementos.execSQL("Insert into aplicaciones values(null,'Es muy buen sustituto de la pintura metalizada de los coches.','Nd')");
      elementos.execSQL("Insert into aplicaciones values(null,'Sales de neodimio son usadas como colorantes de esmaltes.','Nd')");
      elementos.execSQL("Insert into aplicaciones values(null,'El neodimio se utiliza en los imanes de neodimio permanentes del tipo de Nd2Fe14B, de gran intensidad de campo.','Nd')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Nd')");

      elementos.execSQL("Insert into aplicaciones values(null,'El uso que tiene el prometio está relacionado con la industria nuclear, ya que es utilizado como fuente beta para medidores de espesor y como batería de propulsión nuclear mediante la captura de luz en células fotoeléctricas y finalmente convertido en corriente eléctrica.','Pm')");
      elementos.execSQL("Insert into aplicaciones values(null,'También puede convertirse en una fuente portátil de rayos X para generadores termoeléctricos de radioisótopos, en el suministro de electricidad a sondas espaciales y satélites y para lasers de comunicación con submarinos que estén sumergidos.','Pm')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Pm')");

      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de samario se utiliza en óptica para absorber la luz infrarroja','Sm')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como catalizador en la deshidratación y en la deshidrogenación de etanol.','Sm')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se usa como parte de una aleación en los imanes de samario-cobalto.','Sm')");
      elementos.execSQL("Insert into aplicaciones values(null,'El Samario 153 se utiliza junto con el Estroncio 89 en radioterapia paliativa para la disminución del dolor en pacientes terminales.','Sm')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Sm')");

      elementos.execSQL("Insert into aplicaciones values(null,'El europio es uno de los elementos químicos que forman compuestos fluorescentes usados en dispositivos como televisiones en color, lámparas fluorescentes y cristales.','Eu')");
      elementos.execSQL("Insert into aplicaciones values(null,'El europio es peligroso en el ambiente de trabajo, debido al hecho de que los vapores y los gases pueden ser inhalados con el aire.','Eu')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Eu')");

      elementos.execSQL("Insert into aplicaciones values(null,'Es utilizado en la refrigeración magnética a nivel industrial y científico;','Gd')");
      elementos.execSQL("Insert into aplicaciones values(null,'Respecto al uso en medicina, se sabe que su uso es muy peligroso en personas con insuficiencia renal y es causante de una enfermedad muy grave conocida como fibrosis sistémica nefrogénica.','Gd')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Gd')");

      elementos.execSQL("Insert into aplicaciones values(null,'Este elemento se utiliza en el dopaje de materiales usados en dispositivos de estado sólido, tales como el fluoruro de calcio, el tungstato de calcio y el molibdato de estroncio.','Tb')");
      elementos.execSQL("Insert into aplicaciones values(null,'También se emplea como cristal estabilizador en células de combustible que operan a elevadas temperaturas, junto al óxido de circonio, en aleaciones y en la producción de componentes electrónicos.','Tb')");
      elementos.execSQL("Insert into aplicaciones values(null,'El borato de terbio y sodio se aplica también en electrónica.','Tb')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Tb')");

      elementos.execSQL("Insert into aplicaciones values(null,'El disprosio se usa, en conjunción con vanadio y otros elementos','Dy')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como componente de materiales para láseres.','Dy')");
      elementos.execSQL("Insert into aplicaciones values(null,'El disprosio también se usa en la fabricación de discos compactos.','Dy')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Dy')");

      elementos.execSQL("Insert into aplicaciones values(null,'El holmio tiene pocas aplicaciones prácticas, aunque se ha usado como catalizador en reacciones químicas industriales y también para la fabricación de algunos dispositivos electrónicos. En medicina se utiliza el láser de holmio.','Ho')");
      elementos.execSQL("Insert into aplicaciones values(null,'También se utiliza el filtro de vidrio de Oxido de Holmio como Material de Referencia Certificado para evaluación de la precisión de longitud de onda en las regiones UV y visibles en equipos de espectroscopía.','Ho')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Ho')");

      elementos.execSQL("Insert into aplicaciones values(null,'Cuando se adiciona al vanadio como elemento de aleación el erbio rebaja la dureza y mejora el mecanizado.','Er')");
      elementos.execSQL("Insert into aplicaciones values(null,'El óxido de erbio tiene un color rosa y se utiliza a veces como colorante para vidrios y esmaltes para porcelanas. Ese mismo vidrio se utiliza a menudo en gafas de sol y joyería barata.','Er')");
      elementos.execSQL("Insert into aplicaciones values(null,'Utilizado como dopante en amplificadores de fibra óptica.','Er')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se utiliza en tecnología nuclear como amortiguador de neutrones.','Er')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Er')");

      elementos.execSQL("Insert into aplicaciones values(null,'Desconocido','Tm')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Tm')");

      elementos.execSQL("Insert into aplicaciones values(null,'Un isótopo del iterbio se ha usado como fuente de radiación alternativa para una máquina de rayos X portátil cuando no se disponía de electricidad.','Yb')");
      elementos.execSQL("Insert into aplicaciones values(null,'u metal también puede usarse para mejorar el refinamiento del grano, la resistencia y otras propiedades mecánicas del acero inoxidable.','Yb')");
      elementos.execSQL("Insert into aplicaciones values(null,'Hay pocos usos más de este elemento.','Yb')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Yb')");

      elementos.execSQL("Insert into aplicaciones values(null,'Este metal se emplea como catalizador en el craqueo del petróleo en las refinerías, y en diversos procesos químicos, como alquilación, hidrogenación y polimerización.','Lu')");
      elementos.execSQL("Insert into aplicaciones values(null,'También se están investigando radioisótopos de lutecio para ser aplicados en medicina nuclear en tratamientos terapéuticos.','Lu')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Lu')");

      elementos.execSQL("Insert into aplicaciones values(null,'El uso del actinio es casi exclusivo para investigaciones científicas. La radiactividad del actinio es del orden de 150 veces la del radio,3​ haciéndolo útil como fuente de neutrones; al margen de ello, no tiene aplicaciones industriales significativas.','Ac')");
      elementos.execSQL("Insert into aplicaciones values(null,'Como catalizador del proceso de cracking en la industria del petróleo.','Ac')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Ac')");

      elementos.execSQL("Insert into aplicaciones values(null,'Incorporación al wolframio metálico para fabricar filamentos de lámparas eléctricas.','Th')");
      elementos.execSQL("Insert into aplicaciones values(null,'Aplicaciones en material cerámico de alta temperatura.','Th')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Th')");

      elementos.execSQL("Insert into aplicaciones values(null,'Debido a su escasez, alta radioactividad y toxicidad, actualmente no existen usos para el protactinio fuera de la investigación científica básica.','Pa')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Pa')");

      elementos.execSQL("Insert into aplicaciones values(null,'Por su alta densidad, se utiliza el uranio en la construcción de estabilizadores para aviones, satélites artificiales y veleros (balastos/quillas).','U')");
      elementos.execSQL("Insert into aplicaciones values(null,'Se ha utilizado uranio como agregado para la creación de cristales de tonos fluorescentes verdes o amarillos.','U')");
      elementos.execSQL("Insert into aplicaciones values(null,'El largo periodo de semi-desintegración del isotopo 238U se utiliza para estimar la edad de la Tierra.','U')");
      elementos.execSQL("Insert into aplicaciones values(null,'Algunos accesorios luminosos utilizan uranio, del mismo modo que lo hacen algunos químicos fotográficos (nitrato de uranio).','U')");
      elementos.execSQL("Insert into aplicaciones values(null,'El uranio en estado metálico es usado para los blancos de rayos X, para hacer rayos X de alta energía.','U')");
      elementos.execSQL("Insert into Paises values(null,'Alemania','U')");

      elementos.execSQL("Insert into aplicaciones values(null,'Desconocido','Np')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Np')");

      elementos.execSQL("Insert into aplicaciones values(null,'El isótopo plutonio-239 es un componente clave en las armas nucleares debido a su fácil fisión y su disponibilidad.','Pu')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Pu')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Pu')");


      elementos.execSQL("Insert into aplicaciones values(null,'Este elemento puede ser producido en cantidades de varios kilogramos y tiene algunos usos (en especial el Am, en virtud de que es relativamente más sencillo producir muestras de este radioisótopo).','Am')");
      elementos.execSQL("Insert into aplicaciones values(null,'Este mismo radioisótopo fue utilizado como una fuente portátil de rayos gamma para su uso en radiografías.','Am')");
      elementos.execSQL("Insert into aplicaciones values(null,'El americio tiene cierta utilidad en el hogar y en la industria: algunos detectores de humo contienen una pequeña muestra.','Am')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Am')");

      elementos.execSQL("Insert into aplicaciones values(null,'Desconocido','Cm')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Cm')");

      elementos.execSQL("Insert into aplicaciones values(null,'Este elemento químico es blando y radiactivo, su isótopo berkelio-249 puede emitir electrones de baja energía con una vida media de unos 330 días, y cuando se desintegra da origen al californio-249 el cual es un potente emisor de partículas alfa, las cuales son peligrosas..','Bk')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Bk')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Bk')");

      elementos.execSQL("Insert into aplicaciones values(null,'El californio-252 tiene aplicaciones especializadas como un fuerte emisor de neutrones y cada microgramo de californio puro produce 139 millones de neutrones por minuto.','Cf')");
      elementos.execSQL("Insert into aplicaciones values(null,'El californio también ha sido usado para producir otros elementos transuránicos','Cf')");
      elementos.execSQL("Insert into Paises values(null,'Estados unidos','Cf')");
      elementos.execSQL("Insert into Paises values(null,'Varios países','Cf')");

      elementos.execSQL("Insert into aplicaciones values(null,'El isótopo 253Es se emplea para producir el elemento mendelevio. Actualmente, no hay aplicaciones prácticas que no sean las de la investigación científica básica, debido a las pequeñas cantidades de einstenio que se producen y la corta vida media de su isótopo. En particular, el einstenio fue utilizado para sintetizar, por primera vez, 17 átomos del nuevo elemento mendelevio en 1955.','Es')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Es')");

      elementos.execSQL("Insert into aplicaciones values(null,'Este no es un elemento que se utiliza en las actividades humanas, razón por la cual su producción es poca y está vinculada a la investigación científica, ya que carece de uso comercial.','Fm')");
      elementos.execSQL("Insert into Paises values(null,'Desconocido','Fm')");


      elementos.execSQL("Insert into aplicaciones values(null,'Su producción es en mínimas cantidades ya que no tiene usos comerciales y este se reduce al campo de la investigación científica.','Md')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Md')");

      elementos.execSQL("Insert into aplicaciones values(null,'Al ser un elemento sintético, no se produce en la naturaleza sino en el laboratorio. Hoy día solo se conocen 11 isótopos del nobelio, siendo el más estable el No259, el cual tiene una vida media de 58 minutos. Su uso se restringe a la investigación científica, pero aun así no es mucho lo que se conoce de él.','No')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','No')");

      elementos.execSQL("Insert into aplicaciones values(null,'Su descubrimiento se produjo a través del bombardeo de átomos de californio con núcleos de boro en un acelerador lineal de iones pesados. Se conocen y se han determinado las propiedades nucleares de isótopos del laurencio cuya masa va de 255 a 260, siendo el más estable el 260Lr, el cual tiene un promedio de vida de unos 3 minutos. Su comportamiento es similar al de los primeros miembros tripositivos del grupo de los actínidos, pero es totalmente distinto al nobelio.','Lr')");
      elementos.execSQL("Insert into Paises values(null,'Laboratorios','Lr')");








    }

    @Override
    public void onUpgrade(SQLiteDatabase elementos, int oldVersion, int newVersion) {



    }
}
