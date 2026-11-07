package org.jf.dexlib2.immutable;

import java.util.Collection;
import nc.v;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableDexFile implements DexFile {
    protected final v<? extends ImmutableClassDef> classes;
    private final Opcodes opcodes;

    public ImmutableDexFile(Opcodes opcodes, Collection<? extends ClassDef> collection) {
        this.classes = ImmutableClassDef.immutableSetOf(collection);
        this.opcodes = opcodes;
    }

    public static ImmutableDexFile of(DexFile dexFile) {
        return dexFile instanceof ImmutableDexFile ? (ImmutableDexFile) dexFile : new ImmutableDexFile(dexFile.getOpcodes(), dexFile.getClasses());
    }

    @Override // org.jf.dexlib2.iface.DexFile
    public Opcodes getOpcodes() {
        return this.opcodes;
    }

    @Override // org.jf.dexlib2.iface.DexFile
    public v<? extends ImmutableClassDef> getClasses() {
        return this.classes;
    }

    public ImmutableDexFile(Opcodes opcodes, v<? extends ImmutableClassDef> vVar) {
        this.classes = ImmutableUtils.nullToEmptySet(vVar);
        this.opcodes = opcodes;
    }
}
