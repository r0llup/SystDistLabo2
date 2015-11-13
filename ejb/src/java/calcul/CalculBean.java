/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calcul;
import java.util.LinkedList;
import javax.ejb.Stateful;

/**
 * Manage a CalculBean
 * @author Sh1fT
 */

@Stateful public class CalculBean implements CalculRemote
{
    private LinkedList<Integer> liste;

    public CalculBean()
    {
        this.liste = new LinkedList<Integer>();
    }

    @Override public void addNombre(Integer nombre)
    {
        this.liste.add(nombre);
    }

    @Override public Integer getSomme()
    {
        Integer sum = 0;
        for (Integer n : this.liste)
            sum += n;
        return sum;
    }

    @Override public Integer getMoyenne()
    {
        return this.getSomme() / this.liste.size();
    }

    @Override public Integer getMinimum()
    {
        Integer min = this.liste.get(0);
        for (Integer n : this.liste)
        {
            if (n < min)
                min = n;
        }
        return min;
    }

    @Override public Integer getMaximum()
    {
        Integer max = this.liste.get(0);
        for (Integer n : this.liste)
        {
            if (n > max)
                max = n;
        }
        return max;
    }
}