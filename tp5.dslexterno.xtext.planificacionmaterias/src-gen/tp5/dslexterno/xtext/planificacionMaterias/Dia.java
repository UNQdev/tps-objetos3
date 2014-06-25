/**
 */
package tp5.dslexterno.xtext.planificacionMaterias;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dia</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tp5.dslexterno.xtext.planificacionMaterias.PlanificacionMateriasPackage#getDia()
 * @model
 * @generated
 */
public enum Dia implements Enumerator
{
  /**
   * The '<em><b>Lunes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LUNES_VALUE
   * @generated
   * @ordered
   */
  LUNES(0, "Lunes", "Lunes"),

  /**
   * The '<em><b>Martes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MARTES_VALUE
   * @generated
   * @ordered
   */
  MARTES(1, "Martes", "Martes"),

  /**
   * The '<em><b>Miercoles</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIERCOLES_VALUE
   * @generated
   * @ordered
   */
  MIERCOLES(2, "Miercoles", "Miercoles"),

  /**
   * The '<em><b>Jueves</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JUEVES_VALUE
   * @generated
   * @ordered
   */
  JUEVES(3, "Jueves", "Jueves"),

  /**
   * The '<em><b>Viernes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VIERNES_VALUE
   * @generated
   * @ordered
   */
  VIERNES(4, "Viernes", "Viernes");

  /**
   * The '<em><b>Lunes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lunes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LUNES
   * @model name="Lunes"
   * @generated
   * @ordered
   */
  public static final int LUNES_VALUE = 0;

  /**
   * The '<em><b>Martes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Martes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MARTES
   * @model name="Martes"
   * @generated
   * @ordered
   */
  public static final int MARTES_VALUE = 1;

  /**
   * The '<em><b>Miercoles</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Miercoles</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIERCOLES
   * @model name="Miercoles"
   * @generated
   * @ordered
   */
  public static final int MIERCOLES_VALUE = 2;

  /**
   * The '<em><b>Jueves</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Jueves</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JUEVES
   * @model name="Jueves"
   * @generated
   * @ordered
   */
  public static final int JUEVES_VALUE = 3;

  /**
   * The '<em><b>Viernes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Viernes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VIERNES
   * @model name="Viernes"
   * @generated
   * @ordered
   */
  public static final int VIERNES_VALUE = 4;

  /**
   * An array of all the '<em><b>Dia</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Dia[] VALUES_ARRAY =
    new Dia[]
    {
      LUNES,
      MARTES,
      MIERCOLES,
      JUEVES,
      VIERNES,
    };

  /**
   * A public read-only list of all the '<em><b>Dia</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Dia> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dia</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Dia get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Dia result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dia</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Dia getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Dia result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dia</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Dia get(int value)
  {
    switch (value)
    {
      case LUNES_VALUE: return LUNES;
      case MARTES_VALUE: return MARTES;
      case MIERCOLES_VALUE: return MIERCOLES;
      case JUEVES_VALUE: return JUEVES;
      case VIERNES_VALUE: return VIERNES;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Dia(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Dia
