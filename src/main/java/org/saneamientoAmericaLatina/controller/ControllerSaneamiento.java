/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.saneamientoAmericaLatina.controller;

import org.saneamientoAmericaLatina.repository.CountrySanitationStatisticsRepositoryFileImpl;
import org.saneamientoAmericaLatina.service.SanitationStatisticService;
import org.saneamientoAmericaLatina.service.SanitationStatisticServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class ControllerSaneamiento {

  private final SanitationStatisticService sanitationStatisticService =
      new SanitationStatisticServiceImpl(new CountrySanitationStatisticsRepositoryFileImpl());

  @GetMapping("/average-water-access")
  public Double averageWaterAccess() {
    return sanitationStatisticService.averageWaterAccess();
  }

  @GetMapping("/country-greater-access-water")
  public String countryGreaterAccessWater() {
    return sanitationStatisticService.countryGreaterAccessWater();
  }

  @GetMapping("/median-population")
  public Double medianPopulation() {
    return sanitationStatisticService.medianPopulation();
  }

  @GetMapping("/average-population-affected-by-drought")
  public Double averagePopulationAffectedByDrought() {
    return sanitationStatisticService.averagePopulationAffectedByDrought();
  }

  @GetMapping("/variance-affected-population-droughts")
  public Double varianceAffectedPopulationDroughts() {
    Double average = sanitationStatisticService.averagePopulationAffectedByDrought();
    return sanitationStatisticService.varianceAffectedPopulationDroughts(average);
  }
}
