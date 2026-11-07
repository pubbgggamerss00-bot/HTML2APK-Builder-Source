package org.jf.dexlib2.dexbacked.raw;

import java.util.HashMap;
import java.util.Map;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AlignmentUtils;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public abstract class SectionAnnotator {
    public final DexAnnotator annotator;
    public final DexBackedDexFile dexFile;
    public final int itemCount;
    protected Map<Integer, String> itemIdentities = new HashMap();
    public final int itemType;
    public final int sectionOffset;

    public SectionAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        this.annotator = dexAnnotator;
        DexBackedDexFile dexBackedDexFile = dexAnnotator.dexFile;
        this.dexFile = dexBackedDexFile;
        this.itemType = mapItem.getType();
        if (mapItem.getType() >= 4096) {
            this.sectionOffset = dexBackedDexFile.getBaseDataOffset() + mapItem.getOffset();
        } else {
            this.sectionOffset = mapItem.getOffset();
        }
        this.itemCount = mapItem.getItemCount();
    }

    private String getItemIdentity(int i10) {
        return this.itemIdentities.get(Integer.valueOf(i10));
    }

    public abstract void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str);

    public void annotateSection(AnnotatedBytes annotatedBytes) {
        annotatedBytes.moveTo(this.sectionOffset);
        annotateSectionInner(annotatedBytes, this.itemCount);
    }

    public void annotateSectionInner(AnnotatedBytes annotatedBytes, int i10) {
        String itemName = getItemName();
        if (i10 > 0) {
            annotatedBytes.annotate(0, "", new Object[0]);
            annotatedBytes.annotate(0, "-----------------------------", new Object[0]);
            annotatedBytes.annotate(0, "%s section", itemName);
            annotatedBytes.annotate(0, "-----------------------------", new Object[0]);
            annotatedBytes.annotate(0, "", new Object[0]);
            for (int i11 = 0; i11 < i10; i11++) {
                annotatedBytes.moveTo(getItemOffset(i11, annotatedBytes.getCursor()));
                String itemIdentity = getItemIdentity(annotatedBytes.getCursor());
                if (itemIdentity != null) {
                    annotatedBytes.annotate(0, "[%d] %s: %s", Integer.valueOf(i11), itemName, itemIdentity);
                } else {
                    annotatedBytes.annotate(0, "[%d] %s", Integer.valueOf(i11), itemName);
                }
                annotatedBytes.indent();
                annotateItem(annotatedBytes, i11, itemIdentity);
                annotatedBytes.deindent();
            }
        }
    }

    public int getItemAlignment() {
        return 1;
    }

    public abstract String getItemName();

    public int getItemOffset(int i10, int i11) {
        return AlignmentUtils.alignOffset(i11, getItemAlignment());
    }

    public void setItemIdentity(int i10, String str) {
        this.itemIdentities.put(Integer.valueOf(this.dexFile.getBaseDataOffset() + i10), str);
    }
}
