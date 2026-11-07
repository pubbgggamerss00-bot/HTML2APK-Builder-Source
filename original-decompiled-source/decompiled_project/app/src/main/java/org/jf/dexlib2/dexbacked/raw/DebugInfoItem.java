package org.jf.dexlib2.dexbacked.raw;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class DebugInfoItem {
    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new SectionAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.DebugInfoItem.1
            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
                DexReader<? extends DexBuffer> dexReader = this.dexFile.getBuffer().readerAt(annotatedBytes.getCursor());
                int bigUleb128 = dexReader.readBigUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "line_start = %d", Long.valueOf(bigUleb128 & BodyPartID.bodyIdMax));
                int smallUleb128 = dexReader.readSmallUleb128();
                annotatedBytes.annotateTo(dexReader.getOffset(), "parameters_size = %d", Integer.valueOf(smallUleb128));
                if (smallUleb128 > 0) {
                    annotatedBytes.annotate(0, "parameters:", new Object[0]);
                    annotatedBytes.indent();
                    for (int i11 = 0; i11 < smallUleb128; i11++) {
                        annotatedBytes.annotateTo(dexReader.getOffset(), "%s", StringIdItem.getOptionalReferenceAnnotation(this.dexFile, dexReader.readSmallUleb128() - 1, true));
                    }
                    annotatedBytes.deindent();
                }
                annotatedBytes.annotate(0, "debug opcodes:", new Object[0]);
                annotatedBytes.indent();
                int i12 = 0;
                while (true) {
                    int ubyte = dexReader.readUbyte();
                    switch (ubyte) {
                        case 0:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_END_SEQUENCE", new Object[0]);
                            annotatedBytes.deindent();
                            return;
                        case 1:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_ADVANCE_PC", new Object[0]);
                            annotatedBytes.indent();
                            int smallUleb1282 = dexReader.readSmallUleb128();
                            i12 += smallUleb1282;
                            annotatedBytes.annotateTo(dexReader.getOffset(), "addr_diff = +0x%x: 0x%x", Integer.valueOf(smallUleb1282), Integer.valueOf(i12));
                            annotatedBytes.deindent();
                            break;
                        case 2:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_ADVANCE_LINE", new Object[0]);
                            annotatedBytes.indent();
                            int sleb128 = dexReader.readSleb128();
                            bigUleb128 += sleb128;
                            annotatedBytes.annotateTo(dexReader.getOffset(), "line_diff = +%d: %d", Integer.valueOf(Math.abs(sleb128)), Integer.valueOf(bigUleb128));
                            annotatedBytes.deindent();
                            break;
                        case 3:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_START_LOCAL", new Object[0]);
                            annotatedBytes.indent();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "register_num = v%d", Integer.valueOf(dexReader.readSmallUleb128()));
                            annotatedBytes.annotateTo(dexReader.getOffset(), "name_idx = %s", StringIdItem.getOptionalReferenceAnnotation(this.dexFile, dexReader.readSmallUleb128() - 1, true));
                            annotatedBytes.annotateTo(dexReader.getOffset(), "type_idx = %s", TypeIdItem.getOptionalReferenceAnnotation(this.dexFile, dexReader.readSmallUleb128() - 1));
                            annotatedBytes.deindent();
                            break;
                        case 4:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_START_LOCAL_EXTENDED", new Object[0]);
                            annotatedBytes.indent();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "register_num = v%d", Integer.valueOf(dexReader.readSmallUleb128()));
                            annotatedBytes.annotateTo(dexReader.getOffset(), "name_idx = %s", StringIdItem.getOptionalReferenceAnnotation(this.dexFile, dexReader.readSmallUleb128() - 1, true));
                            annotatedBytes.annotateTo(dexReader.getOffset(), "type_idx = %s", TypeIdItem.getOptionalReferenceAnnotation(this.dexFile, dexReader.readSmallUleb128() - 1));
                            annotatedBytes.annotateTo(dexReader.getOffset(), "sig_idx = %s", StringIdItem.getOptionalReferenceAnnotation(this.dexFile, dexReader.readSmallUleb128() - 1, true));
                            annotatedBytes.deindent();
                            break;
                        case 5:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_END_LOCAL", new Object[0]);
                            annotatedBytes.indent();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "register_num = v%d", Integer.valueOf(dexReader.readSmallUleb128()));
                            annotatedBytes.deindent();
                            break;
                        case 6:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_RESTART_LOCAL", new Object[0]);
                            annotatedBytes.indent();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "register_num = v%d", Integer.valueOf(dexReader.readSmallUleb128()));
                            annotatedBytes.deindent();
                            break;
                        case 7:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_SET_PROLOGUE_END", new Object[0]);
                            break;
                        case 8:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_SET_EPILOGUE_BEGIN", new Object[0]);
                            break;
                        case 9:
                            annotatedBytes.annotateTo(dexReader.getOffset(), "DBG_SET_FILE", new Object[0]);
                            annotatedBytes.indent();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "name_idx = %s", StringIdItem.getOptionalReferenceAnnotation(this.dexFile, dexReader.readSmallUleb128() - 1));
                            annotatedBytes.deindent();
                            break;
                        default:
                            int i13 = ubyte - 10;
                            int i14 = i13 / 15;
                            int i15 = (i13 % 15) - 4;
                            i12 += i14;
                            bigUleb128 += i15;
                            annotatedBytes.annotateTo(dexReader.getOffset(), "address_diff = +0x%x:0x%x, line_diff = +%d:%d, ", Integer.valueOf(i14), Integer.valueOf(i12), Integer.valueOf(i15), Integer.valueOf(bigUleb128));
                            break;
                    }
                }
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public String getItemName() {
                return "debug_info_item";
            }
        };
    }
}
