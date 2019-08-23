package com.softmodeler.common.communication.ser;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import com.softmodeler.model.SoftmodelerPackage;

public class EcoreJsonUtil {

	public static EClass getEClass(String type) {
		return (EClass) SoftmodelerPackage.eINSTANCE.getEClassifier(type);
//		Registry registry = EPackage.Registry.INSTANCE;
//		for (Object o : registry.values()) {
//			EPackage ePackage = null;
//			if (o instanceof EPackage.Descriptor) {
//				ePackage = ((EPackage.Descriptor) o).getEPackage();
//			} else if (o instanceof EPackage) {
//				ePackage = (EPackage) o;
//			}
//			EClassifier classifier = ePackage.getEClassifier(type);
//			if (classifier != null) {
//				return (EClass) classifier;
//			}
//		}
//		return null;
	}
	
	public static EClassifier getClassifier(String type) {
		return SoftmodelerPackage.eINSTANCE.getEClassifier(type);
//		Registry registry = EPackage.Registry.INSTANCE;
//		for (Object o : registry.values()) {
//			EPackage ePackage = null;
//			if (o instanceof EPackage.Descriptor) {
//				ePackage = ((EPackage.Descriptor) o).getEPackage();
//			} else if (o instanceof EPackage) {
//				ePackage = (EPackage) o;
//			}
//			EClassifier classifier = ePackage.getEClassifier(type);
//			if (classifier != null) {
//				return classifier;
//			}
//		}
//		return null;
	}

}
