module com.jwebmp.plugins.jqgradientlinear {
	exports com.jwebmp.plugins.jqgradientlinear;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqgradientlinear.JQGradientPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqgradientlinear.implementations.JQGradientsExclusionsModule;

	opens com.jwebmp.plugins.jqgradientlinear to com.fasterxml.jackson.databind, com.jwebmp.core;
}
