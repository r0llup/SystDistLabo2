/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calcul;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.ejb.EJB;

/**
 *
 * @author ShIfT
 */

public class Main
{
    @EJB private static calcul.CalculRemote calculRemote;

    public Main()
    {
    }

    public static void main(String[] args)
    {
        String nombre = "";
        try
        {
            do
            {
                System.out.println("Veuillez encoder un nombre : ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                nombre = br.readLine();
                if(!"".equals(nombre))
                    calculRemote.addNombre(Integer.parseInt(nombre));
            } while(!"".equals(nombre));
            System.out.println("Somme : " + calculRemote.getSomme());
            System.out.println("Moyenne : " + calculRemote.getMoyenne());
            System.out.println("Minimum : " + calculRemote.getMinimum());
            System.out.println("Maximum : " + calculRemote.getMaximum());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}