package org.jf.dexlib2.builder.debug;

import org.jf.dexlib2.builder.BuilderDebugItem;
import org.jf.dexlib2.iface.debug.SetSourceFile;
import org.jf.dexlib2.iface.reference.StringReference;

/* loaded from: classes3.dex */
public class BuilderSetSourceFile extends BuilderDebugItem implements SetSourceFile {
    private final StringReference sourceFile;

    public BuilderSetSourceFile(StringReference stringReference) {
        this.sourceFile = stringReference;
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 9;
    }

    @Override // org.jf.dexlib2.iface.debug.SetSourceFile
    public String getSourceFile() {
        StringReference stringReference = this.sourceFile;
        if (stringReference == null) {
            return null;
        }
        return stringReference.getString();
    }

    @Override // org.jf.dexlib2.iface.debug.SetSourceFile
    public StringReference getSourceFileReference() {
        return this.sourceFile;
    }
}
