/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.calculatrice.Calc
import org.xtext.example.mydsl.calculatrice.Calculatrice
import org.xtext.example.mydsl.calculatrice.Expr
import org.xtext.example.mydsl.calculatrice.Number
import org.xtext.example.mydsl.calculatrice.VarCall

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CalculatriceGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		for (c : resource.allContents.toIterable.filter(Calculatrice)) {
			fsa.generateFile("calculatrice/Calc.java", c.compile);
		}
	}
	
	def CharSequence compile(EObject o) {
		switch o {
			Calculatrice : '''
		package calculatrice;
		
		public class Calc {
			public static void main(String [] args)
			{
				int r1, r2, r3, res, tmp;
				r1 = r2 = r3 = res = tmp = 0;
				«FOR calcs:o.calculs»
					«calcs.compile»
				«ENDFOR»
					System.out.println(res);
			}
		}
		'''
		Calc : '''«IF o.varName == null»tmp«ELSE»«IF o.decl»int «ENDIF»«o.varName»«ENDIF» = «o.e.compile»;«IF o.varName == null»
							r3 = r2;
							r2 = r1;
							r1 = res;
							res = tmp;«ENDIF»'''
		Number : '''«IF o.neg»-«ENDIF»«o.value»'''
		VarCall : '''«o.varCall»'''
		Expr : '''(«o.left.compile») «o.op» («o.right.compile»)'''
	}
	}
}
