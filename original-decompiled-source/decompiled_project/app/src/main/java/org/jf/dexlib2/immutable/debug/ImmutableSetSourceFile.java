package org.jf.dexlib2.immutable.debug;

import org.jf.dexlib2.base.reference.BaseStringReference;
import org.jf.dexlib2.iface.debug.SetSourceFile;
import org.jf.dexlib2.iface.reference.StringReference;

/* loaded from: classes3.dex */
public class ImmutableSetSourceFile extends ImmutableDebugItem implements SetSourceFile {
    protected final String sourceFile;

    public ImmutableSetSourceFile(int i10, String str) {
        super(i10);
        this.sourceFile = str;
    }

    public static ImmutableSetSourceFile of(SetSourceFile setSourceFile) {
        return setSourceFile instanceof ImmutableSetSourceFile ? (ImmutableSetSourceFile) setSourceFile : new ImmutableSetSourceFile(setSourceFile.getCodeAddress(), setSourceFile.getSourceFile());
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 9;
    }

    @Override // org.jf.dexlib2.iface.debug.SetSourceFile
    public String getSourceFile() {
        return this.sourceFile;
    }

    @Override // org.jf.dexlib2.iface.debug.SetSourceFile
    public StringReference getSourceFileReference() {
        if (this.sourceFile == null) {
            return null;
        }
        return new BaseStringReference() { // from class: org.jf.dexlib2.immutable.debug.ImmutableSetSourceFile.1
            @Override // org.jf.dexlib2.iface.reference.StringReference
            public String getString() {
                return ImmutableSetSourceFile.this.sourceFile;
            }
        };
    }
}
