/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.calculatrice;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getElseBlock <em>Else Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getBoolExpr()
 * @model
 * @generated
 */
public interface BoolExpr extends Condition
{
  /**
   * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Block</em>' containment reference.
   * @see #setThenBlock(Calc)
   * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getBoolExpr_ThenBlock()
   * @model containment="true"
   * @generated
   */
  Calc getThenBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getThenBlock <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Block</em>' containment reference.
   * @see #getThenBlock()
   * @generated
   */
  void setThenBlock(Calc value);

  /**
   * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Block</em>' containment reference.
   * @see #setElseBlock(Calc)
   * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getBoolExpr_ElseBlock()
   * @model containment="true"
   * @generated
   */
  Calc getElseBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getElseBlock <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Block</em>' containment reference.
   * @see #getElseBlock()
   * @generated
   */
  void setElseBlock(Calc value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BoolExpr)
   * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getBoolExpr_Left()
   * @model containment="true"
   * @generated
   */
  BoolExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BoolExpr value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getBoolExpr_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BoolExpr)
   * @see org.xtext.example.mydsl.calculatrice.CalculatricePackage#getBoolExpr_Right()
   * @model containment="true"
   * @generated
   */
  BoolExpr getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.calculatrice.BoolExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BoolExpr value);

} // BoolExpr