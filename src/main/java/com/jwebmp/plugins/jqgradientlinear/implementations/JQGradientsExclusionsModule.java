package com.jwebmp.plugins.jqgradientlinear.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQGradientsExclusionsModule
		implements IGuiceScanModuleExclusions<JQGradientsExclusionsModule>,
				           IGuiceScanJarExclusions<JQGradientsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-gradients-linear-ie6-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqgradientlinear");
		return strings;
	}
}
