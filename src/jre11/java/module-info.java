import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.jqgradientlinear.JQGradientPageConfigurator;
import com.jwebmp.plugins.jqgradientlinear.implementations.JQGradientsExclusionsModule;

module com.jwebmp.plugins.jqgradientlinear {
	exports com.jwebmp.plugins.jqgradientlinear;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with JQGradientPageConfigurator;

	provides IGuiceScanModuleExclusions with JQGradientsExclusionsModule;
	provides IGuiceScanJarExclusions with JQGradientsExclusionsModule;

	opens com.jwebmp.plugins.jqgradientlinear to com.fasterxml.jackson.databind, com.jwebmp.core;
}
