/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calcul;
import javax.ejb.Remote;

/**
 * Manage a CalculRemote
 * @author Sh1fT
 */

@Remote public interface CalculRemote
{
    public void addNombre(Integer nombre);
    public Integer getSomme();
    public Integer getMoyenne();
    public Integer getMinimum();
    public Integer getMaximum();
}