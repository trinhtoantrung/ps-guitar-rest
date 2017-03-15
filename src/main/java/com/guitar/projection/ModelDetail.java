package com.guitar.projection;

import com.guitar.model.Manufacturer;
import com.guitar.model.Model;
import com.guitar.model.ModelType;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

/**
 * Creation of ps-guitar-rest.
 * <p/>
 * Created by tttrinh
 * Created date 3/15/17 2:48 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Projection(name = "modelDetail", types = {Model.class})
public interface ModelDetail {
  String getName();
  BigDecimal getPrice();
  Manufacturer getManufacturer();
  ModelType getModelType();
  int getFrets();
  String getWoodType();
}
