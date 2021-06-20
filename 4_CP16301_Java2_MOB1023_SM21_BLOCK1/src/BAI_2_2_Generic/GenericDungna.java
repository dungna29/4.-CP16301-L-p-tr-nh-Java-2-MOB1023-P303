/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_2_Generic;

/**
 *
 * @author DungnaPC
 */
public class GenericDungna<T> {
  private T t;

  public GenericDungna() {
  }

  public GenericDungna(T t) {
    this.t = t;
  }

  public T Get() {
    return t;
  }

  public void Add(T t) {
    this.t = t;
  }
  
}
