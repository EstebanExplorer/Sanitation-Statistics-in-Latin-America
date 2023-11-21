package org.saneamientoAmericaLatina.repository;

import java.util.List;
import org.saneamientoAmericaLatina.model.CountrySanitationStatistics;

public interface CountrySanitationStatisticsRepository {
  List<CountrySanitationStatistics> statisticsOfCountries();
}
