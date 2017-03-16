package com.guitar.projection;

import com.guitar.model.Model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

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
  @Value("#{target.name}")
  String getModelName();
}
