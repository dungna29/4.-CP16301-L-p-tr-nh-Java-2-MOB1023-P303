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
public interface S2_IArrayService<T> {
  public void SetValueByIndex(int index,T giatri);
  public T GeValueByIndex(int index);
  public void setArrs(T[] arrs);
  public T[] getArrs();
}
