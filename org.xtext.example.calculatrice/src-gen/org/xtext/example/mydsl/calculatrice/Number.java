/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.calculatrice;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.Number#isNeg <em>Neg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.Number#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends CalcExpr
{
  /**
   * Returns the value of the '<em><b>Neg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Neg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neg</em>' attribute.
   * @see #setNeg(boolean)
   * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getNumber_Neg()
   * @model
   * @generated
   */
  boolean isNeg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.calculatrice.Number#isNeg <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Neg</em>' attribute.
   * @see #isNeg()
   * @generated
   */
  void setNeg(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getNumber_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.calculatrice.Number#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Number