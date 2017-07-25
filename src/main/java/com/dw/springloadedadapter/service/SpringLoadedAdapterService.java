package com.dw.springloadedadapter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * This service layer provide a methods to add, replace or delete file on given specific path. <br/>
 * For add operation, user can add file on given path <br/>
 * For replace operation, user can replace file with existing file on given path. <br/>
 * For delete operation, user can delete file for given path.
 * 
 * @author Jaydeep Kumbhani
 *
 */
@Service
public class SpringLoadedAdapterService {

  private static final Logger logger = LoggerFactory.getLogger(SpringLoadedAdapterService.class);


  public void add(String path, File file) {
    // TODO :: add file to classpath for given path
  }

  public void replace(String path, File file) {
    // TODO :: update file to classpath for given path
  }

  public void delete(String path) {
    // TODO :: delete file to classpath for given path
  }
}
