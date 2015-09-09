/**
 */
package REA_EML.REA_EML_BPM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Economic Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getEconomicEventType()
 * @model
 * @generated
 */
public enum EconomicEventType implements Enumerator {
	/**
	 * The '<em><b>Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER(0, "transfer", "transfer"),

	/**
	 * The '<em><b>Transformation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMATION(1, "transformation", "transformation");

	/**
	 * The '<em><b>Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transfer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFER
	 * @model name="transfer"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_VALUE = 0;

	/**
	 * The '<em><b>Transformation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transformation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMATION
	 * @model name="transformation"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Economic Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EconomicEventType[] VALUES_ARRAY =
		new EconomicEventType[] {
			TRANSFER,
			TRANSFORMATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Economic Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EconomicEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Economic Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EconomicEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EconomicEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Economic Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EconomicEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EconomicEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Economic Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EconomicEventType get(int value) {
		switch (value) {
			case TRANSFER_VALUE: return TRANSFER;
			case TRANSFORMATION_VALUE: return TRANSFORMATION;
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
	private EconomicEventType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EconomicEventType
