/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.example.calculatrice.ui.internal.CalculatriceActivator;

public class CalculatriceUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CalculatriceActivator.getInstance().getInjector("org.xtext.example.mydsl.Calculatrice");
	}

}