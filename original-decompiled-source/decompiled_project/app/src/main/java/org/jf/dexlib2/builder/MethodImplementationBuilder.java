package org.jf.dexlib2.builder;

import java.util.HashMap;
import l.b;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public class MethodImplementationBuilder {
    private MethodLocation currentLocation;
    private final MutableMethodImplementation impl;
    private final HashMap<String, Label> labels = new HashMap<>();

    public MethodImplementationBuilder(int i10) {
        MutableMethodImplementation mutableMethodImplementation = new MutableMethodImplementation(i10);
        this.impl = mutableMethodImplementation;
        this.currentLocation = mutableMethodImplementation.instructionList.get(0);
    }

    public void addCatch(TypeReference typeReference, Label label, Label label2, Label label3) {
        this.impl.addCatch(typeReference, label, label2, label3);
    }

    public void addEndLocal(int i10) {
        this.currentLocation.addEndLocal(i10);
    }

    public void addEpilogue() {
        this.currentLocation.addEpilogue();
    }

    public void addInstruction(BuilderInstruction builderInstruction) {
        this.impl.addInstruction(builderInstruction);
        this.currentLocation = (MethodLocation) b.b(this.impl.instructionList, 1);
    }

    public Label addLabel(String str) {
        Label label = this.labels.get(str);
        if (label == null) {
            Label labelAddNewLabel = this.currentLocation.addNewLabel();
            this.labels.put(str, labelAddNewLabel);
            return labelAddNewLabel;
        }
        if (label.isPlaced()) {
            throw new IllegalArgumentException("There is already a label with that name.");
        }
        this.currentLocation.getLabels().add(label);
        return label;
    }

    public void addLineNumber(int i10) {
        this.currentLocation.addLineNumber(i10);
    }

    public void addPrologue() {
        this.currentLocation.addPrologue();
    }

    public void addRestartLocal(int i10) {
        this.currentLocation.addRestartLocal(i10);
    }

    public void addSetSourceFile(StringReference stringReference) {
        this.currentLocation.addSetSourceFile(stringReference);
    }

    public void addStartLocal(int i10, StringReference stringReference, TypeReference typeReference, StringReference stringReference2) {
        this.currentLocation.addStartLocal(i10, stringReference, typeReference, stringReference2);
    }

    public Label getLabel(String str) {
        Label label = this.labels.get(str);
        if (label != null) {
            return label;
        }
        Label label2 = new Label();
        this.labels.put(str, label2);
        return label2;
    }

    public MethodImplementation getMethodImplementation() {
        return this.impl;
    }

    public void addCatch(String str, Label label, Label label2, Label label3) {
        this.impl.addCatch(str, label, label2, label3);
    }

    public void addCatch(Label label, Label label2, Label label3) {
        this.impl.addCatch(label, label2, label3);
    }
}
