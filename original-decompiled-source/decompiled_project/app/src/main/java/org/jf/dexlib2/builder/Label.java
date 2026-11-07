package org.jf.dexlib2.builder;

/* loaded from: classes3.dex */
public class Label extends ItemWithLocation {
    public Label() {
    }

    public int getCodeAddress() {
        return getLocation().getCodeAddress();
    }

    public MethodLocation getLocation() {
        MethodLocation methodLocation = this.location;
        if (methodLocation != null) {
            return methodLocation;
        }
        throw new IllegalStateException("Cannot get the location of a label that hasn't been placed yet.");
    }

    public Label(MethodLocation methodLocation) {
        this.location = methodLocation;
    }
}
