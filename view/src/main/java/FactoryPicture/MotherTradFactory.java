package FactoryPicture;

import java.awt.Image;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating MotherTrad objects.
 */
public class MotherTradFactory {

	/** The Background rock. */
	MotherTrad BackgroundRock = new BackgroundRock();

	/** The Dirt. */
	MotherTrad Dirt = new DirtPicture();

	/** The Wall. */
	MotherTrad Wall = new WallPicture();

	/** The Enemy. */
	MotherTrad Enemy = new EnemyPicture();

	/** The Diamond. */
	MotherTrad Diamond = new DiamondPicture();

	/** The Stone. */
	MotherTrad Stone = new StonePicture();

	/** The Door. */
	MotherTrad Door = new DoorPicture();

	/** The Man up. */
	MotherTrad ManUp = new ManUp();

	/** The Man down. */
	MotherTrad ManDown = new ManDown();

	/** The Man left. */
	MotherTrad ManLeft = new ManLeft();

	/** The Man right. */
	MotherTrad ManRight = new ManRight();

	/** The Death. */
	MotherTrad Death = new DeathHead();

	MotherTrad Victory = new Victory();

	/**
	 * Gets the photo.
	 *
	 * @param Caractere the caractere
	 * @return the photo
	 */
	public Image getPhoto(char Caractere) {
		switch(Caractere) {

		case ' ':
			return BackgroundRock.getPicture();

		case 'T':
			return Dirt.getPicture();

		case 'X':
			return Wall.getPicture();

		case 'E':
			return Enemy.getPicture();

		case 'D':
			return Diamond.getPicture();

		case 'P':
			return Stone.getPicture();

		case 'A':
			return Door.getPicture();

		case 'O':
			return ManUp.getPicture();

		case 'L':
			return ManDown.getPicture();

		case 'K':
			return ManLeft.getPicture();

		case 'M':
			return ManRight.getPicture();

		case '9':
			return Death.getPicture();

		case '5':
			return Victory.getPicture();
		}
		return null;
	}

}
