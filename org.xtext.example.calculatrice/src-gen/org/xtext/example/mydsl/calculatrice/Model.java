/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.calculatrice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.Model#getFormule <em>Formule</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Formule</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formule</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formule</em>' attribute list.
   * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getModel_Formule()
   * @model unique="false"
   * @generated
   */
  EList<String> getFormule();

} // Model