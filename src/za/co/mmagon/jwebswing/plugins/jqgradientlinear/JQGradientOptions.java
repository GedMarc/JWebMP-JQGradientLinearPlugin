/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.jqgradientlinear;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
@ComponentInformation(name = "JQuery Gradient", description = "A jQuery plugin that adds a dynamically created configurable gradient to the background of an element without the use of images.",
        url = "https://github.com/brandonaaron/jquery-gradient")
public class JQGradientOptions extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;

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
    private String direction = "horizontal";
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
    public String getGradientDirection()
    {
        return direction;
    }

    /**
     * Sets the gradient direction
     *
     * @param direction
     */
    public void setDirection(String direction)
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
