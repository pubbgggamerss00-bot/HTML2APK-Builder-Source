package org.jf.dexlib2.iface;

import java.util.Set;
import org.jf.dexlib2.Opcodes;

/* loaded from: classes3.dex */
public interface DexFile {
    Set<? extends ClassDef> getClasses();

    Opcodes getOpcodes();
}
