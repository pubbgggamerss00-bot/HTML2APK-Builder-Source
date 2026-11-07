package org.jf.dexlib2.builder;

import java.util.Set;
import org.jf.dexlib2.builder.debug.BuilderEndLocal;
import org.jf.dexlib2.builder.debug.BuilderEpilogueBegin;
import org.jf.dexlib2.builder.debug.BuilderLineNumber;
import org.jf.dexlib2.builder.debug.BuilderPrologueEnd;
import org.jf.dexlib2.builder.debug.BuilderRestartLocal;
import org.jf.dexlib2.builder.debug.BuilderSetSourceFile;
import org.jf.dexlib2.builder.debug.BuilderStartLocal;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public class MethodLocation {
    int codeAddress;
    int index;
    BuilderInstruction instruction;
    private final LocatedItems<BuilderDebugItem> debugItems = new LocatedDebugItems();
    private final LocatedItems<Label> labels = new LocatedLabels();

    public MethodLocation(BuilderInstruction builderInstruction, int i10, int i11) {
        this.instruction = builderInstruction;
        this.codeAddress = i10;
        this.index = i11;
    }

    public void addEndLocal(int i10) {
        getDebugItems().add(new BuilderEndLocal(i10));
    }

    public void addEpilogue() {
        getDebugItems().add(new BuilderEpilogueBegin());
    }

    public void addLineNumber(int i10) {
        getDebugItems().add(new BuilderLineNumber(i10));
    }

    public Label addNewLabel() {
        Label label = new Label();
        getLabels().add(label);
        return label;
    }

    public void addPrologue() {
        getDebugItems().add(new BuilderPrologueEnd());
    }

    public void addRestartLocal(int i10) {
        getDebugItems().add(new BuilderRestartLocal(i10));
    }

    public void addSetSourceFile(StringReference stringReference) {
        getDebugItems().add(new BuilderSetSourceFile(stringReference));
    }

    public void addStartLocal(int i10, StringReference stringReference, TypeReference typeReference, StringReference stringReference2) {
        getDebugItems().add(new BuilderStartLocal(i10, stringReference, typeReference, stringReference2));
    }

    public int getCodeAddress() {
        return this.codeAddress;
    }

    public Set<BuilderDebugItem> getDebugItems() {
        return this.debugItems.getModifiableItems(this);
    }

    public int getIndex() {
        return this.index;
    }

    public Instruction getInstruction() {
        return this.instruction;
    }

    public Set<Label> getLabels() {
        return this.labels.getModifiableItems(this);
    }

    public void mergeInto(MethodLocation methodLocation) {
        this.labels.mergeItemsIntoNext(methodLocation, methodLocation.labels);
        this.debugItems.mergeItemsIntoNext(methodLocation, methodLocation.debugItems);
    }
}
