package org.jf.dexlib2.analysis;

import java.util.HashMap;
import java.util.Map;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;

/* loaded from: classes3.dex */
public class DexClassProvider implements ClassProvider {
    private Map<String, ClassDef> classMap = new HashMap();
    private final DexFile dexFile;

    public DexClassProvider(DexFile dexFile) {
        this.dexFile = dexFile;
        for (ClassDef classDef : dexFile.getClasses()) {
            this.classMap.put(classDef.getType(), classDef);
        }
    }

    @Override // org.jf.dexlib2.analysis.ClassProvider
    public ClassDef getClassDef(String str) {
        return this.classMap.get(str);
    }
}
