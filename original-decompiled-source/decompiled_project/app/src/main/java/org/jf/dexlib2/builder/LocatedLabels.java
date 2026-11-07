package org.jf.dexlib2.builder;

/* loaded from: classes3.dex */
public class LocatedLabels extends LocatedItems<Label> {
    @Override // org.jf.dexlib2.builder.LocatedItems
    public String getAddLocatedItemError() {
        return "Cannot add a label that is already placed.You must remove it from its current location first.";
    }
}
