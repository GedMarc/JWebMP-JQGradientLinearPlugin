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
package com.jwebmp.plugins.jqgradientlinear;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.children.ImageMapFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * @author mmagon
 * @version 1.0
 * @since Forver
 */
public class JQGradientsLinearFeature
		extends Feature<JavaScriptPart, JQGradientsLinearFeature>
		implements ImageMapFeatures
{

	private static final long serialVersionUID = 1L;

	private JQGradientOptions options;

	public JQGradientsLinearFeature(Component componentToApply)
	{
		super("JWGradientsFeature");
		setComponent(componentToApply);
		componentToApply.addFeature(this);
		getJavascriptReferences().add(new JQGradientsJavascriptReference());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getOptions().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQGradientsLinearFeature that = (JQGradientsLinearFeature) o;

		return getOptions().equals(that.getOptions());
	}

	@Override
	public JQGradientOptions getOptions()
	{
		if (options == null)
		{
			options = new JQGradientOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "gradient(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	@Override
	public JQGradientsLinearFeature setComponent(ComponentHierarchyBase component)
	{
		return super.setComponent(component);
	}
}
