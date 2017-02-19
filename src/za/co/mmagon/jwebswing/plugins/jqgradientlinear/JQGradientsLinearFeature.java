/*
 * Copyright (C) 2017 Marc Magon
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
package za.co.mmagon.jwebswing.plugins.jqgradientlinear;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.children.ImageMapFeatures;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @since Forver
 * @author mmagon
 * @version 1.0
 */
public class JQGradientsLinearFeature extends Feature<JavaScriptPart, JQGradientsLinearFeature> implements ImageMapFeatures
{

    private static final long serialVersionUID = 1L;

    private String fromColour = "000000";
    private String toColour = "ffffff";
    private String direction = "horizontal";
    private String position = "top";
    private String length;
    private Component componentToApply;

    public JQGradientsLinearFeature(Component componentToApply)
    {
        super("JWGradientsFeature");
        this.componentToApply = componentToApply;
        getJavascriptReferences().add(new JQGradientsJavascriptReference());
    }

    public JQGradientsLinearFeature(Component componentToApply, String fromColour, String toColour, String direction)
    {
        this(componentToApply);
        this.componentToApply = componentToApply;
        this.fromColour = fromColour;
        this.toColour = toColour;
        this.direction = direction;
        this.position = position;
        this.length = length;
    }

    public String getFromColour()
    {
        return fromColour;
    }

    public void setFromColour(String fromColour)
    {
        this.fromColour = fromColour;
    }

    public String getToColour()
    {
        return toColour;
    }

    public void setToColour(String toColour)
    {
        this.toColour = toColour;
    }

    public String getGradientDirection()
    {
        return direction;
    }

    public void setDirection(String direction)
    {
        this.direction = direction;
    }

    public String getPositionString()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public String getLength()
    {
        return length;
    }

    public void setLength(String length)
    {
        this.length = length;
    }

    public Component getComponentToApply()
    {
        return componentToApply;
    }

    public void setComponentToApply(Component componentToApply)
    {
        this.componentToApply = componentToApply;
    }

    @Override
    public void assignFunctionsToComponent()
    {
        addQuery("$('#" + componentToApply.getID() + "').gradient({from: '" + fromColour + "', to: '" + toColour + "', direction: '" + direction + "'});");
    }
}
