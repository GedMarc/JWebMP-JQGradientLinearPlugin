package com.jwebmp.plugins.jqgradientlinear.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQGradientsExclusionsModule
		implements IGuiceScanModuleExclusions<JQGradientsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqgradientlinear");
		return strings;
	}
}
