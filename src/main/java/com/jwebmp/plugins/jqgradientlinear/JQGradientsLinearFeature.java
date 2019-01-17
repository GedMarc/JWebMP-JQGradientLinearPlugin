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

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import javax.validation.constraints.NotNull;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * @author mmagon
 * @version 1.0
 * @since Forver
 */
public class JQGradientsLinearFeature
		extends Feature<JQGradientsLinearFeature, JavaScriptPart, JQGradientsLinearFeature>
{


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
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
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

	@NotNull
	@Override
	public JQGradientsLinearFeature setComponent(ComponentHierarchyBase component)
	{
		return super.setComponent(component);
	}
}
