package org.jf.dexlib2.dexbacked.raw.util;

import i0.u2;
import java.io.IOException;
import java.io.Writer;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import nc.o0;
import nc.r;
import nc.u0;
import org.jf.dexlib2.dexbacked.CDexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.raw.AnnotationDirectoryItem;
import org.jf.dexlib2.dexbacked.raw.AnnotationItem;
import org.jf.dexlib2.dexbacked.raw.AnnotationSetItem;
import org.jf.dexlib2.dexbacked.raw.AnnotationSetRefList;
import org.jf.dexlib2.dexbacked.raw.CallSiteIdItem;
import org.jf.dexlib2.dexbacked.raw.CdexDebugOffsetTable;
import org.jf.dexlib2.dexbacked.raw.ClassDataItem;
import org.jf.dexlib2.dexbacked.raw.ClassDefItem;
import org.jf.dexlib2.dexbacked.raw.CodeItem;
import org.jf.dexlib2.dexbacked.raw.DebugInfoItem;
import org.jf.dexlib2.dexbacked.raw.EncodedArrayItem;
import org.jf.dexlib2.dexbacked.raw.FieldIdItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import org.jf.dexlib2.dexbacked.raw.HiddenApiClassDataItem;
import org.jf.dexlib2.dexbacked.raw.ItemType;
import org.jf.dexlib2.dexbacked.raw.MapItem;
import org.jf.dexlib2.dexbacked.raw.MethodHandleItem;
import org.jf.dexlib2.dexbacked.raw.MethodIdItem;
import org.jf.dexlib2.dexbacked.raw.ProtoIdItem;
import org.jf.dexlib2.dexbacked.raw.SectionAnnotator;
import org.jf.dexlib2.dexbacked.raw.StringDataItem;
import org.jf.dexlib2.dexbacked.raw.StringIdItem;
import org.jf.dexlib2.dexbacked.raw.TypeIdItem;
import org.jf.dexlib2.dexbacked.raw.TypeListItem;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class DexAnnotator extends AnnotatedBytes {
    private static final Map<Integer, Integer> sectionAnnotationOrder = new HashMap();
    private final Map<Integer, SectionAnnotator> annotators;
    public final DexBackedDexFile dexFile;

    static {
        int[] iArr = {4096, 0, 1, 2, 3, 4, 5, 7, 8, 6, 8192, ItemType.CODE_ITEM, ItemType.DEBUG_INFO_ITEM, ItemType.TYPE_LIST, ItemType.ANNOTATION_SET_REF_LIST, ItemType.ANNOTATION_SET_ITEM, ItemType.STRING_DATA_ITEM, ItemType.ANNOTATION_ITEM, ItemType.ENCODED_ARRAY_ITEM, ItemType.ANNOTATION_DIRECTORY_ITEM, ItemType.HIDDENAPI_CLASS_DATA_ITEM};
        for (int i10 = 0; i10 < 21; i10++) {
            sectionAnnotationOrder.put(Integer.valueOf(iArr[i10]), Integer.valueOf(i10));
        }
    }

    public DexAnnotator(DexBackedDexFile dexBackedDexFile, int i10) {
        super(i10);
        this.annotators = new HashMap();
        this.dexFile = dexBackedDexFile;
        for (MapItem mapItem : dexBackedDexFile.getMapItems()) {
            int type = mapItem.getType();
            if (type != 61440) {
                switch (type) {
                    case 0:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), HeaderItem.makeAnnotator(this, mapItem));
                        break;
                    case 1:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), StringIdItem.makeAnnotator(this, mapItem));
                        break;
                    case 2:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), TypeIdItem.makeAnnotator(this, mapItem));
                        break;
                    case 3:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), ProtoIdItem.makeAnnotator(this, mapItem));
                        break;
                    case 4:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), FieldIdItem.makeAnnotator(this, mapItem));
                        break;
                    case 5:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), MethodIdItem.makeAnnotator(this, mapItem));
                        break;
                    case 6:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), ClassDefItem.makeAnnotator(this, mapItem));
                        break;
                    case 7:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), CallSiteIdItem.makeAnnotator(this, mapItem));
                        break;
                    case 8:
                        this.annotators.put(Integer.valueOf(mapItem.getType()), MethodHandleItem.makeAnnotator(this, mapItem));
                        break;
                    default:
                        switch (type) {
                            case 4096:
                                this.annotators.put(Integer.valueOf(mapItem.getType()), MapItem.makeAnnotator(this, mapItem));
                                break;
                            case ItemType.TYPE_LIST /* 4097 */:
                                this.annotators.put(Integer.valueOf(mapItem.getType()), TypeListItem.makeAnnotator(this, mapItem));
                                break;
                            case ItemType.ANNOTATION_SET_REF_LIST /* 4098 */:
                                this.annotators.put(Integer.valueOf(mapItem.getType()), AnnotationSetRefList.makeAnnotator(this, mapItem));
                                break;
                            case ItemType.ANNOTATION_SET_ITEM /* 4099 */:
                                this.annotators.put(Integer.valueOf(mapItem.getType()), AnnotationSetItem.makeAnnotator(this, mapItem));
                                break;
                            default:
                                switch (type) {
                                    case 8192:
                                        this.annotators.put(Integer.valueOf(mapItem.getType()), ClassDataItem.makeAnnotator(this, mapItem));
                                        break;
                                    case ItemType.CODE_ITEM /* 8193 */:
                                        this.annotators.put(Integer.valueOf(mapItem.getType()), CodeItem.makeAnnotator(this, mapItem));
                                        break;
                                    case ItemType.STRING_DATA_ITEM /* 8194 */:
                                        this.annotators.put(Integer.valueOf(mapItem.getType()), StringDataItem.makeAnnotator(this, mapItem));
                                        break;
                                    case ItemType.DEBUG_INFO_ITEM /* 8195 */:
                                        this.annotators.put(Integer.valueOf(mapItem.getType()), DebugInfoItem.makeAnnotator(this, mapItem));
                                        break;
                                    case ItemType.ANNOTATION_ITEM /* 8196 */:
                                        this.annotators.put(Integer.valueOf(mapItem.getType()), AnnotationItem.makeAnnotator(this, mapItem));
                                        break;
                                    case ItemType.ENCODED_ARRAY_ITEM /* 8197 */:
                                        this.annotators.put(Integer.valueOf(mapItem.getType()), EncodedArrayItem.makeAnnotator(this, mapItem));
                                        break;
                                    case ItemType.ANNOTATION_DIRECTORY_ITEM /* 8198 */:
                                        this.annotators.put(Integer.valueOf(mapItem.getType()), AnnotationDirectoryItem.makeAnnotator(this, mapItem));
                                        break;
                                    default:
                                        throw new RuntimeException(String.format("Unrecognized item type: 0x%x", Integer.valueOf(mapItem.getType())));
                                }
                        }
                }
            } else {
                this.annotators.put(Integer.valueOf(mapItem.getType()), HiddenApiClassDataItem.makeAnnotator(this, mapItem));
            }
        }
    }

    public SectionAnnotator getAnnotator(int i10) {
        return this.annotators.get(Integer.valueOf(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeAnnotations(Writer writer) throws IOException {
        u0 u0VarB = o0.a(new Comparator<MapItem>() { // from class: org.jf.dexlib2.dexbacked.raw.util.DexAnnotator.1
            @Override // java.util.Comparator
            public int compare(MapItem mapItem, MapItem mapItem2) {
                return u2.c(((Integer) DexAnnotator.sectionAnnotationOrder.get(Integer.valueOf(mapItem.getType()))).intValue(), ((Integer) DexAnnotator.sectionAnnotationOrder.get(Integer.valueOf(mapItem2.getType()))).intValue());
            }
        }).b(this.dexFile.getMapItems());
        try {
            DexBackedDexFile dexBackedDexFile = this.dexFile;
            if (dexBackedDexFile instanceof CDexBackedDexFile) {
                moveTo(dexBackedDexFile.getBaseDataOffset() + ((CDexBackedDexFile) this.dexFile).getDebugInfoOffsetsPos());
                CdexDebugOffsetTable.annotate(this, this.dexFile.getBuffer());
            }
            r.a aVarListIterator = u0VarB.listIterator(0);
            while (aVarListIterator.hasNext()) {
                MapItem mapItem = (MapItem) aVarListIterator.next();
                try {
                    this.annotators.get(Integer.valueOf(mapItem.getType())).annotateSection(this);
                } catch (Exception e10) {
                    System.err.println("There was an error while dumping the " + ItemType.getItemTypeName(mapItem.getType()) + " section");
                    e10.printStackTrace(System.err);
                }
            }
            writeAnnotations(writer, this.dexFile.getBuffer().getBuf(), this.dexFile.getBuffer().getBaseOffset());
        } catch (Throwable th2) {
            writeAnnotations(writer, this.dexFile.getBuffer().getBuf(), this.dexFile.getBuffer().getBaseOffset());
            throw th2;
        }
    }
}
