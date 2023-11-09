package org.saneamientoAmericaLatina.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import org.saneamientoAmericaLatina.model.CountrySanitationStatistics;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountrySanitationStatisticsRepositoryFileImpl implements CountrySanitationStatisticsRepository {
    private static final Logger logger = LoggerFactory.getLogger( CountrySanitationStatisticsRepositoryFileImpl.class);
    
    
    private List<String> readFileWithCountrySanitation(){
    //Este método lee el archivo y adiciona cada linea en una posicion de una Lista

    //Para el ejercicio se utiliza la ruta donde se encentra el archivo en el codigo fuente.
    //Este ruta es diferente al momento de empaquetar el proyecto

    Path path = Paths.get( "./src/main/resources/Estadisticas_Saneamiento_Paises_Latinoamerica.txt");
    
    try (Stream<String> stream = Files.lines( path)) {
      return stream.toList();
    } catch (IOException x) {
      logger.error("IOException: {}", x.getMessage(), x);
    }
    return Collections.emptyList();
  }
    
  private CountrySanitationStatistics buildCountrySanitationStatistics(String plainTextCountrySanitation){
      logger.info( "Generando vectores" );
   
    String[] questionArray = plainTextCountrySanitation.split(",\\s*");//En el archivo las notas vienen separadas por comas por ejemplo: UNIDAD 1,4.5D,2023-08-01
    return new CountrySanitationStatistics(questionArray[0],
            Integer.valueOf(questionArray[1]),
            Double.valueOf(questionArray[2]),
            Integer.valueOf(questionArray[3]),
            Integer.valueOf(questionArray[4]),
            Integer.valueOf(questionArray[5]),
            Double.valueOf(questionArray[6])
    );
  }

    @Override
    public List<CountrySanitationStatistics> statisticsOfCountries(){
        logger.info( "Cargando los datos del archivo" );
        List<String> plainTextCountrySanitationList =  readFileWithCountrySanitation();
        List<CountrySanitationStatistics> countriesList = plainTextCountrySanitationList.stream().map( this::buildCountrySanitationStatistics ).toList();

        return countriesList;
    }
}
