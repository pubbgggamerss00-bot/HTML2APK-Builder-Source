package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.CDexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;

/* loaded from: classes3.dex */
public class CdexDebugOffsetTable {
    public static void annotate(DexAnnotator dexAnnotator, DexBuffer dexBuffer) {
        DexReader<? extends DexBuffer> dexReader = dexBuffer.readerAt(dexAnnotator.getCursor());
        SectionAnnotator annotator = dexAnnotator.getAnnotator(ItemType.DEBUG_INFO_ITEM);
        int size = dexAnnotator.dexFile.getMethodSection().size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 16;
            dexAnnotator.annotate(0, "Offset chuck for methods %d-%d", Integer.valueOf(i10), Integer.valueOf(Math.min(i11, size)));
            dexAnnotator.indent();
            int ubyte = (dexReader.readUbyte() << 8) | dexReader.readUbyte();
            StringBuilder sb = new StringBuilder();
            for (int i12 = 0; i12 < 16; i12++) {
                sb.append((ubyte >> i12) & 1);
            }
            dexAnnotator.annotate(2, "bitmask: 0b%s", sb.reverse());
            int debugInfoBase = ((CDexBackedDexFile) dexAnnotator.dexFile).getDebugInfoBase();
            for (int i13 = 0; i13 < 16; i13++) {
                if ((ubyte & 1) != 0) {
                    int bigUleb128 = dexReader.readBigUleb128();
                    debugInfoBase += bigUleb128;
                    int i14 = i10 + i13;
                    dexAnnotator.annotateTo(dexReader.getOffset(), "[method_id: %d]: offset_delta: %d  (offset=0x%x)", Integer.valueOf(i14), Integer.valueOf(bigUleb128), Integer.valueOf(debugInfoBase));
                    annotator.setItemIdentity(debugInfoBase, dexAnnotator.dexFile.getMethodSection().get(i14).toString());
                }
                ubyte >>= 1;
            }
            dexAnnotator.deindent();
            i10 = i11;
        }
    }
}
