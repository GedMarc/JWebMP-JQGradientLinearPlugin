import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jqgradientlinear.JQGradientPageConfigurator;

module com.jwebmp.plugins.jqgradientlinear {
	exports com.jwebmp.plugins.jqgradientlinear;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with JQGradientPageConfigurator;
	opens com.jwebmp.plugins.jqgradientlinear to com.fasterxml.jackson.databind,com.jwebmp.core;
}
