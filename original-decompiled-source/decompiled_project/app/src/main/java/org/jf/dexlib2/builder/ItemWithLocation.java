package org.jf.dexlib2.builder;

/* loaded from: classes3.dex */
public abstract class ItemWithLocation {
    MethodLocation location;

    public boolean isPlaced() {
        return this.location != null;
    }

    public void setLocation(MethodLocation methodLocation) {
        this.location = methodLocation;
    }
}
