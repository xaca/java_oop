import java.util.*;
class Ordenar implements Comparator<Vehiculo>
{
    public int compare(Vehiculo a, Vehiculo b)
    {
        return (int)(a.getKilometraje() - b.getKilometraje());
    }
}