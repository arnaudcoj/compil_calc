/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.calculatrice.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.calculatrice.Calc;
import org.xtext.example.mydsl.calculatrice.Calculatrice;
import org.xtext.example.mydsl.calculatrice.CalculatricePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculatrice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.calculatrice.impl.CalculatriceImpl#getCalculs <em>Calculs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatriceImpl extends MinimalEObjectImpl.Container implements Calculatrice
{
  /**
   * The cached value of the '{@link #getCalculs() <em>Calculs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalculs()
   * @generated
   * @ordered
   */
  protected EList<Calc> calculs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CalculatriceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CalculatricePackage.Literals.CALCULATRICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Calc> getCalculs()
  {
    if (calculs == null)
    {
      calculs = new EObjectContainmentEList<Calc>(Calc.class, this, CalculatricePackage.CALCULATRICE__CALCULS);
    }
    return calculs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CalculatricePackage.CALCULATRICE__CALCULS:
        return ((InternalEList<?>)getCalculs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CalculatricePackage.CALCULATRICE__CALCULS:
        return getCalculs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CalculatricePackage.CALCULATRICE__CALCULS:
        getCalculs().clear();
        getCalculs().addAll((Collection<? extends Calc>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CalculatricePackage.CALCULATRICE__CALCULS:
        getCalculs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CalculatricePackage.CALCULATRICE__CALCULS:
        return calculs != null && !calculs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CalculatriceImpl
