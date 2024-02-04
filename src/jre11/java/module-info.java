import com.jwebmp.plugins.jqgradientlinear.implementations.JQGradientsInclusionModule;

module com.jwebmp.plugins.jqgradientlinear {
	exports com.jwebmp.plugins.jqgradientlinear;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqgradientlinear.JQGradientPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqgradientlinear.implementations.JQGradientsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with JQGradientsInclusionModule;
	
	opens com.jwebmp.plugins.jqgradientlinear to com.fasterxml.jackson.databind, com.jwebmp.core;
}
