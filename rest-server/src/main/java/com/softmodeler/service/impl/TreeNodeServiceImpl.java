package com.softmodeler.service.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.softmodeler.common.service.TreeNodeService;
import com.softmodeler.model.ObjectRef;
import com.softmodeler.model.ObjectState;
import com.softmodeler.model.SoftmodelerFactory;
import com.softmodeler.model.TreeNode;
import com.softmodeler.model.TreeNodeChild;
import com.softmodeler.model.type.LabelsType;

public class TreeNodeServiceImpl implements TreeNodeService {

	@Override
	public TreeNode getNode() {
		TreeNode node = SoftmodelerFactory.eINSTANCE.createTreeNode();
		node.setId("node_id_1");
		node.setName("Node 1");
		node.setDomain(1);

		ObjectRef objectRef = SoftmodelerFactory.eINSTANCE.createObjectRef();
		objectRef.setId(EcoreUtil.generateUUID());

		LabelsType labels = new LabelsType();
		labels.setLabel(0, "de", "label DE", true);
		labels.setLabel(0, "en", "label EN", false);
		objectRef.setLabels(labels);
		objectRef.setState(ObjectState.PRODUCTION);
		node.setObject(objectRef);
		
		TreeNodeChild child = SoftmodelerFactory.eINSTANCE.createTreeNodeChild();
		child.setNodeId("node_child_id_1");
		child.setParent(node);
		return node;
	}

	@Override
	public TreeNodeChild getChild() {
		TreeNode node = SoftmodelerFactory.eINSTANCE.createTreeNode();
		node.setId("node_id_2");
		node.setName("Node 2");
		node.setDomain(1);

		TreeNodeChild child = SoftmodelerFactory.eINSTANCE.createTreeNodeChild();
		child.setNodeId("node_child_id_2");
		child.setParent(node);
		return child;
	}
	

	@Override
	public void set(TreeNode object) {

	}
}
