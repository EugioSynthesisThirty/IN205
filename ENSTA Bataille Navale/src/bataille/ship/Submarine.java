package bataille.ship;

import bataille.Orientation;

public class Submarine extends AbstractShip
{
	public Submarine()
	{
		this(Orientation.WEST);
	}
	
	public Submarine(Orientation orientation)
	{
		/*
		 * TODO d�finir la taille des bateaux,
		 * et les coordonn�es des cases, quand
		 * l'�nonc� donnera la forme des bateaux.
		 */
		super('S', "Submarine", orientation, );
	}
}
