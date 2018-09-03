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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
@PluginInformation(pluginName = "JQuery Gradient",
		pluginUniqueName = "jquery-gradient",
		pluginDescription = "A jQuery plugin that adds a dynamically created configurable gradient to the background of an element without the use of images. Does not use CSS3",
		pluginVersion = "1.0.0",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "jquery, gradients",
		pluginSubtitle = "Adds a dynamically created configurable gradient to the background of an element without the use of images.",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQGradientLinearPlugin",
		pluginSourceUrl = "https://github.com/brandonaaron/jquery-gradient",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQGradientLinearPlugin/wiki",
		pluginOriginalHomepage = "https://github.com/brandonaaron/jquery-gradient",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQGradientLinearPlugin.jar/download",
		pluginIconUrl = "gradients/logo.jpg",
		pluginIconImageUrl = "gradients/logo.jpg",
		pluginLastUpdatedDate = "2017/03/04")
public class JQGradientPageConfigurator
		implements IPageConfigurator
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	public JQGradientPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQGradientPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQGradientPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQGradientPageConfigurator.enabled;
	}
}
