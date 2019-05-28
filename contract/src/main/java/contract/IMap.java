/*
 * @Author: Jougleux Bryan
 */
package contract;



// TODO: Auto-generated Javadoc
/**
 * The Interface IMap.
 */
public interface IMap {

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	int getHeight();

	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	void setHeight(int height);

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	int getWidth();

	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	void setWidth(int width);

	/**
	 * Gets the on the map XY.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the on the map XY
	 */
	IElement getOnTheMapXY(int x, int y);

	/**
	 * Sets the on the map XY.
	 *
	 * @param element the element
	 * @param x the x
	 * @param y the y
	 */
	void setOnTheMapXY(IElement element, int x, int y);
	Mobile mobilea();

}