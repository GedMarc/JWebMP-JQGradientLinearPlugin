/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqgradientlinear;

import com.jwebmp.core.generics.Direction;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
@ComponentInformation(name = "JQuery Gradient",
		description = "A jQuery plugin that adds a dynamically created configurable gradient to the background of an element without the use of images.",
		url = "https://github.com/brandonaaron/jquery-gradient")
public class JQGradientOptions
		extends JavaScriptPart<JQGradientOptions>
{


	/**
	 * The colour from
	 */
	private String fromColour = "000000";
	/**
	 * The to colour
	 */
	private String toColour = "ffffff";
	/**
	 * The direction in text
	 */
	private Direction direction = Direction.Horizontal;
	/**
	 * The direction in top
	 */
	private String position = "top";
	/**
	 * The length
	 */
	private String length;

	public JQGradientOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns the from colour
	 *
	 * @return
	 */
	public String getFromColour()
	{
		return fromColour;
	}

	/**
	 * Sets the from colour
	 *
	 * @param fromColour
	 */
	public void setFromColour(String fromColour)
	{
		this.fromColour = fromColour;
	}

	/**
	 * Returns the to colour
	 *
	 * @return
	 */
	public String getToColour()
	{
		return toColour;
	}

	/**
	 * Sets the to colour
	 *
	 * @param toColour
	 */
	public void setToColour(String toColour)
	{
		this.toColour = toColour;
	}

	/**
	 * Returns the gradient direction
	 *
	 * @return
	 */
	public Direction getGradientDirection()
	{
		return direction;
	}

	/**
	 * Sets the gradient direction
	 *
	 * @param direction
	 */
	public void setDirection(Direction direction)
	{
		this.direction = direction;
	}

	/**
	 * Returns the position string
	 *
	 * @return
	 */
	public String getPositionString()
	{
		return position;
	}

	/**
	 * Sets the position string
	 *
	 * @param position
	 */
	public void setPosition(String position)
	{
		this.position = position;
	}

	/**
	 * Gets the length
	 *
	 * @return
	 */
	public String getLength()
	{
		return length;
	}

	/**
	 * Sets the length
	 *
	 * @param length
	 */
	public void setLength(String length)
	{
		this.length = length;
	}
}
