package org.jf.dexlib2.immutable;

import java.util.List;
import java.util.Map;
import nc.r;
import nc.s;
import org.jf.dexlib2.iface.MultiDexContainer;

/* loaded from: classes3.dex */
public class ImmutableMultiDexContainer implements MultiDexContainer<ImmutableDexFile> {
    private final s<String, ImmutableDexEntry> entries;

    public class ImmutableDexEntry implements MultiDexContainer.DexEntry<ImmutableDexFile> {
        private final ImmutableDexFile dexFile;
        private final String entryName;

        public ImmutableDexEntry(String str, ImmutableDexFile immutableDexFile) {
            this.entryName = str;
            this.dexFile = immutableDexFile;
        }

        @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
        public MultiDexContainer<? extends ImmutableDexFile> getContainer() {
            return ImmutableMultiDexContainer.this;
        }

        @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
        public String getEntryName() {
            return this.entryName;
        }

        @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
        public ImmutableDexFile getDexFile() {
            return this.dexFile;
        }
    }

    public ImmutableMultiDexContainer(Map<String, ImmutableDexFile> map) {
        s.a aVar = new s.a(4);
        for (Map.Entry<String, ImmutableDexFile> entry : map.entrySet()) {
            ImmutableDexEntry immutableDexEntry = new ImmutableDexEntry(entry.getKey(), entry.getValue());
            aVar.b(immutableDexEntry.getEntryName(), immutableDexEntry);
        }
        this.entries = aVar.a();
    }

    @Override // org.jf.dexlib2.iface.MultiDexContainer
    public List<String> getDexEntryNames() {
        return r.k(this.entries.keySet());
    }

    @Override // org.jf.dexlib2.iface.MultiDexContainer
    public ImmutableDexEntry getEntry(String str) {
        return this.entries.get(str);
    }
}
