package com.jwebmp.plugins.jqgradientlinear.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class JQGradientsInclusionModule implements IGuiceScanModuleInclusions<JQGradientsInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.jqgradientlinear");
		return set;
	}
}
