package org.jf.dexlib2.dexbacked.raw;

import java.util.ArrayList;
import java.util.List;
import lc.g;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.VerificationError;
import org.jf.dexlib2.dexbacked.CDexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.instruction.DexBackedInstruction;
import org.jf.dexlib2.dexbacked.raw.util.DexAnnotator;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.instruction.FieldOffsetInstruction;
import org.jf.dexlib2.iface.instruction.InlineIndexInstruction;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.NarrowLiteralInstruction;
import org.jf.dexlib2.iface.instruction.OffsetInstruction;
import org.jf.dexlib2.iface.instruction.OneRegisterInstruction;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.dexlib2.iface.instruction.ThreeRegisterInstruction;
import org.jf.dexlib2.iface.instruction.TwoRegisterInstruction;
import org.jf.dexlib2.iface.instruction.VerificationErrorInstruction;
import org.jf.dexlib2.iface.instruction.VtableIndexInstruction;
import org.jf.dexlib2.iface.instruction.WideLiteralInstruction;
import org.jf.dexlib2.iface.instruction.formats.ArrayPayload;
import org.jf.dexlib2.iface.instruction.formats.Instruction35c;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rc;
import org.jf.dexlib2.iface.instruction.formats.PackedSwitchPayload;
import org.jf.dexlib2.iface.instruction.formats.SparseSwitchPayload;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.util.AnnotatedBytes;
import org.jf.util.ExceptionWithContext;
import org.jf.util.NumberUtils;

/* loaded from: classes3.dex */
public class CodeItem {
    public static int CDEX_INSTRUCTIONS_SIZE_AND_PREHEADER_FLAGS_OFFSET = 2;
    public static int CDEX_INSTRUCTIONS_SIZE_SHIFT = 5;
    public static int CDEX_INS_COUNT_SHIFT = 8;
    public static int CDEX_OUTS_COUNT_SHIFT = 4;
    public static int CDEX_PREHEADER_FLAGS_MASK = 31;
    public static int CDEX_PREHEADER_FLAG_INSTRUCTIONS_SIZE = 16;
    public static int CDEX_PREHEADER_FLAG_INS_COUNT = 2;
    public static int CDEX_PREHEADER_FLAG_OUTS_COUNT = 4;
    public static int CDEX_PREHEADER_FLAG_REGISTER_COUNT = 1;
    public static int CDEX_PREHEADER_FLAG_TRIES_COUNT = 8;
    public static int CDEX_REGISTER_COUNT_SHIFT = 12;
    public static int CDEX_TRIES_SIZE_SHIFT = 0;
    public static final int DEBUG_INFO_OFFSET = 8;
    public static final int INSTRUCTION_COUNT_OFFSET = 12;
    public static final int INSTRUCTION_START_OFFSET = 16;
    public static final int INS_OFFSET = 2;
    public static final int OUTS_OFFSET = 4;
    public static final int REGISTERS_OFFSET = 0;
    public static final int TRIES_SIZE_OFFSET = 6;

    /* renamed from: org.jf.dexlib2.dexbacked.raw.CodeItem$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$jf$dexlib2$Format;

        static {
            int[] iArr = new int[Format.values().length];
            $SwitchMap$org$jf$dexlib2$Format = iArr;
            try {
                iArr[Format.Format10x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rc.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.ArrayPayload.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.PackedSwitchPayload.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.SparseSwitchPayload.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class CodeItemAnnotator extends SectionAnnotator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private SectionAnnotator debugInfoAnnotator;

        public class PreInstructionInfo {
            public int instructionSize;
            public int triesCount;

            public PreInstructionInfo(int i10, int i11) {
                this.triesCount = i10;
                this.instructionSize = i11;
            }
        }

        public CodeItemAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
            super(dexAnnotator, mapItem);
        }

        private void addDebugInfoIdentity(int i10, String str) {
            SectionAnnotator sectionAnnotator = this.debugInfoAnnotator;
            if (sectionAnnotator != null) {
                sectionAnnotator.setItemIdentity(i10, str);
            }
        }

        private void annotateArrayPayload(AnnotatedBytes annotatedBytes, ArrayPayload arrayPayload) {
            List<Number> arrayElements = arrayPayload.getArrayElements();
            int elementWidth = arrayPayload.getElementWidth();
            annotatedBytes.annotate(2, arrayPayload.getOpcode().name, new Object[0]);
            annotatedBytes.indent();
            annotatedBytes.annotate(2, "element_width = %d", Integer.valueOf(elementWidth));
            annotatedBytes.annotate(4, "size = %d", Integer.valueOf(arrayElements.size()));
            if (arrayElements.size() > 0) {
                annotatedBytes.annotate(0, "elements:", new Object[0]);
            }
            annotatedBytes.indent();
            if (arrayElements.size() > 0) {
                for (int i10 = 0; i10 < arrayElements.size(); i10++) {
                    if (elementWidth == 8) {
                        long jLongValue = arrayElements.get(i10).longValue();
                        if (NumberUtils.isLikelyDouble(jLongValue)) {
                            annotatedBytes.annotate(elementWidth, "element[%d] = %d # %f", Integer.valueOf(i10), Long.valueOf(jLongValue), Double.valueOf(Double.longBitsToDouble(jLongValue)));
                        } else {
                            annotatedBytes.annotate(elementWidth, "element[%d] = %d", Integer.valueOf(i10), Long.valueOf(jLongValue));
                        }
                    } else {
                        int iIntValue = arrayElements.get(i10).intValue();
                        if (NumberUtils.isLikelyFloat(iIntValue)) {
                            annotatedBytes.annotate(elementWidth, "element[%d] = %d # %f", Integer.valueOf(i10), Integer.valueOf(iIntValue), Float.valueOf(Float.intBitsToFloat(iIntValue)));
                        } else {
                            annotatedBytes.annotate(elementWidth, "element[%d] = %d", Integer.valueOf(i10), Integer.valueOf(iIntValue));
                        }
                    }
                }
            }
            if (annotatedBytes.getCursor() % 2 != 0) {
                annotatedBytes.annotate(1, "padding", new Object[0]);
            }
            annotatedBytes.deindent();
            annotatedBytes.deindent();
        }

        private void annotateDefaultInstruction(AnnotatedBytes annotatedBytes, Instruction instruction) {
            ArrayList arrayList = new ArrayList();
            if (instruction instanceof OneRegisterInstruction) {
                arrayList.add(formatRegister(((OneRegisterInstruction) instruction).getRegisterA()));
                if (instruction instanceof TwoRegisterInstruction) {
                    arrayList.add(formatRegister(((TwoRegisterInstruction) instruction).getRegisterB()));
                    if (instruction instanceof ThreeRegisterInstruction) {
                        arrayList.add(formatRegister(((ThreeRegisterInstruction) instruction).getRegisterC()));
                    }
                }
            } else if (instruction instanceof VerificationErrorInstruction) {
                String verificationErrorName = VerificationError.getVerificationErrorName(((VerificationErrorInstruction) instruction).getVerificationError());
                if (verificationErrorName != null) {
                    arrayList.add(verificationErrorName);
                } else {
                    arrayList.add("invalid verification error type");
                }
            }
            if (instruction instanceof ReferenceInstruction) {
                ReferenceInstruction referenceInstruction = (ReferenceInstruction) instruction;
                arrayList.add(referenceInstruction.getReferenceType() == 0 ? DexFormatter.INSTANCE.getQuotedString((StringReference) referenceInstruction.getReference()) : referenceInstruction.getReference().toString());
            } else if (instruction instanceof OffsetInstruction) {
                int codeOffset = ((OffsetInstruction) instruction).getCodeOffset();
                arrayList.add(String.format("%s0x%x", codeOffset >= 0 ? "+" : "-", Integer.valueOf(Math.abs(codeOffset))));
            } else if (instruction instanceof NarrowLiteralInstruction) {
                int narrowLiteral = ((NarrowLiteralInstruction) instruction).getNarrowLiteral();
                if (NumberUtils.isLikelyFloat(narrowLiteral)) {
                    arrayList.add(String.format("%d # %f", Integer.valueOf(narrowLiteral), Float.valueOf(Float.intBitsToFloat(narrowLiteral))));
                } else {
                    arrayList.add(String.format("%d", Integer.valueOf(narrowLiteral)));
                }
            } else if (instruction instanceof WideLiteralInstruction) {
                long wideLiteral = ((WideLiteralInstruction) instruction).getWideLiteral();
                if (NumberUtils.isLikelyDouble(wideLiteral)) {
                    arrayList.add(String.format("%d # %f", Long.valueOf(wideLiteral), Double.valueOf(Double.longBitsToDouble(wideLiteral))));
                } else {
                    arrayList.add(String.format("%d", Long.valueOf(wideLiteral)));
                }
            } else if (instruction instanceof FieldOffsetInstruction) {
                arrayList.add(String.format("field@0x%x", Integer.valueOf(((FieldOffsetInstruction) instruction).getFieldOffset())));
            } else if (instruction instanceof VtableIndexInstruction) {
                arrayList.add(String.format("vtable@%d", Integer.valueOf(((VtableIndexInstruction) instruction).getVtableIndex())));
            } else if (instruction instanceof InlineIndexInstruction) {
                arrayList.add(String.format("inline@%d", Integer.valueOf(((InlineIndexInstruction) instruction).getInlineIndex())));
            }
            annotatedBytes.annotate(instruction.getCodeUnits() * 2, "%s %s", instruction.getOpcode().name, new g(", ").b(arrayList));
        }

        private void annotateInstruction10x(AnnotatedBytes annotatedBytes, Instruction instruction) {
            annotatedBytes.annotate(2, instruction.getOpcode().name, new Object[0]);
        }

        private void annotateInstruction35c(AnnotatedBytes annotatedBytes, Instruction35c instruction35c) {
            ArrayList arrayList = new ArrayList();
            int registerCount = instruction35c.getRegisterCount();
            if (registerCount == 1) {
                arrayList.add(formatRegister(instruction35c.getRegisterC()));
            } else if (registerCount == 2) {
                arrayList.add(formatRegister(instruction35c.getRegisterC()));
                arrayList.add(formatRegister(instruction35c.getRegisterD()));
            } else if (registerCount == 3) {
                arrayList.add(formatRegister(instruction35c.getRegisterC()));
                arrayList.add(formatRegister(instruction35c.getRegisterD()));
                arrayList.add(formatRegister(instruction35c.getRegisterE()));
            } else if (registerCount == 4) {
                arrayList.add(formatRegister(instruction35c.getRegisterC()));
                arrayList.add(formatRegister(instruction35c.getRegisterD()));
                arrayList.add(formatRegister(instruction35c.getRegisterE()));
                arrayList.add(formatRegister(instruction35c.getRegisterF()));
            } else if (registerCount == 5) {
                arrayList.add(formatRegister(instruction35c.getRegisterC()));
                arrayList.add(formatRegister(instruction35c.getRegisterD()));
                arrayList.add(formatRegister(instruction35c.getRegisterE()));
                arrayList.add(formatRegister(instruction35c.getRegisterF()));
                arrayList.add(formatRegister(instruction35c.getRegisterG()));
            }
            annotatedBytes.annotate(6, String.format("%s {%s}, %s", instruction35c.getOpcode().name, new g(", ").b(arrayList), instruction35c.getReference()), new Object[0]);
        }

        private void annotateInstruction3rc(AnnotatedBytes annotatedBytes, Instruction3rc instruction3rc) {
            annotatedBytes.annotate(6, String.format("%s {%s .. %s}, %s", instruction3rc.getOpcode().name, formatRegister(instruction3rc.getStartRegister()), formatRegister((instruction3rc.getRegisterCount() + r0) - 1), instruction3rc.getReference()), new Object[0]);
        }

        private void annotatePackedSwitchPayload(AnnotatedBytes annotatedBytes, PackedSwitchPayload packedSwitchPayload) {
            List<? extends SwitchElement> switchElements = packedSwitchPayload.getSwitchElements();
            annotatedBytes.annotate(2, packedSwitchPayload.getOpcode().name, new Object[0]);
            annotatedBytes.indent();
            annotatedBytes.annotate(2, "size = %d", Integer.valueOf(switchElements.size()));
            if (switchElements.size() == 0) {
                annotatedBytes.annotate(4, "first_key", new Object[0]);
            } else {
                annotatedBytes.annotate(4, "first_key = %d", Integer.valueOf(switchElements.get(0).getKey()));
                annotatedBytes.annotate(0, "targets:", new Object[0]);
                annotatedBytes.indent();
                for (int i10 = 0; i10 < switchElements.size(); i10++) {
                    annotatedBytes.annotate(4, "target[%d] = %d", Integer.valueOf(i10), Integer.valueOf(switchElements.get(i10).getOffset()));
                }
                annotatedBytes.deindent();
            }
            annotatedBytes.deindent();
        }

        private void annotateSparseSwitchPayload(AnnotatedBytes annotatedBytes, SparseSwitchPayload sparseSwitchPayload) {
            List<? extends SwitchElement> switchElements = sparseSwitchPayload.getSwitchElements();
            annotatedBytes.annotate(2, sparseSwitchPayload.getOpcode().name, new Object[0]);
            annotatedBytes.indent();
            annotatedBytes.annotate(2, "size = %d", Integer.valueOf(switchElements.size()));
            if (switchElements.size() > 0) {
                annotatedBytes.annotate(0, "keys:", new Object[0]);
                annotatedBytes.indent();
                for (int i10 = 0; i10 < switchElements.size(); i10++) {
                    annotatedBytes.annotate(4, "key[%d] = %d", Integer.valueOf(i10), Integer.valueOf(switchElements.get(i10).getKey()));
                }
                annotatedBytes.deindent();
                annotatedBytes.annotate(0, "targets:", new Object[0]);
                annotatedBytes.indent();
                for (int i11 = 0; i11 < switchElements.size(); i11++) {
                    annotatedBytes.annotate(4, "target[%d] = %d", Integer.valueOf(i11), Integer.valueOf(switchElements.get(i11).getOffset()));
                }
                annotatedBytes.deindent();
            }
            annotatedBytes.deindent();
        }

        private String formatRegister(int i10) {
            return String.format("v%d", Integer.valueOf(i10));
        }

        public void annotateInstructions(AnnotatedBytes annotatedBytes, DexReader dexReader, int i10) {
            annotatedBytes.annotate(0, "instructions:", new Object[0]);
            annotatedBytes.indent();
            int i11 = i10 * 2;
            annotatedBytes.setLimit(annotatedBytes.getCursor(), annotatedBytes.getCursor() + i11);
            int offset = dexReader.getOffset() + i11;
            while (dexReader.getOffset() < offset) {
                try {
                    try {
                        Instruction from = DexBackedInstruction.readFrom(this.dexFile, dexReader);
                        if (dexReader.getOffset() <= offset) {
                            switch (AnonymousClass2.$SwitchMap$org$jf$dexlib2$Format[from.getOpcode().format.ordinal()]) {
                                case 1:
                                    annotateInstruction10x(annotatedBytes, from);
                                    break;
                                case 2:
                                    annotateInstruction35c(annotatedBytes, (Instruction35c) from);
                                    break;
                                case 3:
                                    annotateInstruction3rc(annotatedBytes, (Instruction3rc) from);
                                    break;
                                case 4:
                                    annotateArrayPayload(annotatedBytes, (ArrayPayload) from);
                                    break;
                                case 5:
                                    annotatePackedSwitchPayload(annotatedBytes, (PackedSwitchPayload) from);
                                    break;
                                case 6:
                                    annotateSparseSwitchPayload(annotatedBytes, (SparseSwitchPayload) from);
                                    break;
                                default:
                                    annotateDefaultInstruction(annotatedBytes, from);
                                    break;
                            }
                        } else {
                            annotatedBytes.annotateTo(offset, "truncated instruction", new Object[0]);
                            dexReader.setOffset(offset);
                        }
                    } catch (ExceptionWithContext e10) {
                        e10.printStackTrace(System.err);
                        annotatedBytes.annotate(0, "annotation error: %s", e10.getMessage());
                        annotatedBytes.moveTo(offset);
                        dexReader.setOffset(offset);
                    }
                } catch (Throwable th2) {
                    annotatedBytes.clearLimit();
                    annotatedBytes.deindent();
                    throw th2;
                }
            }
            annotatedBytes.clearLimit();
            annotatedBytes.deindent();
        }

        @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
        public void annotateItem(AnnotatedBytes annotatedBytes, int i10, String str) {
            try {
                DexReader<? extends DexBuffer> dexReader = this.dexFile.getBuffer().readerAt(annotatedBytes.getCursor());
                PreInstructionInfo preInstructionInfoAnnotatePreInstructionFields = annotatePreInstructionFields(annotatedBytes, dexReader, str);
                annotateInstructions(annotatedBytes, dexReader, preInstructionInfoAnnotatePreInstructionFields.instructionSize);
                annotatePostInstructionFields(annotatedBytes, dexReader, preInstructionInfoAnnotatePreInstructionFields.triesCount);
            } catch (ExceptionWithContext e10) {
                annotatedBytes.annotate(0, "annotation error: %s", e10.getMessage());
            }
        }

        public void annotatePostInstructionFields(AnnotatedBytes annotatedBytes, DexReader dexReader, int i10) {
            if (i10 > 0) {
                if (dexReader.getOffset() % 4 != 0) {
                    dexReader.readUshort();
                    annotatedBytes.annotate(2, "padding", new Object[0]);
                }
                annotatedBytes.annotate(0, "try_items:", new Object[0]);
                annotatedBytes.indent();
                for (int i11 = 0; i11 < i10; i11++) {
                    try {
                        annotatedBytes.annotate(0, "try_item[%d]:", Integer.valueOf(i11));
                        annotatedBytes.indent();
                        try {
                            annotatedBytes.annotate(4, "start_addr = 0x%x", Integer.valueOf(dexReader.readSmallUint()));
                            annotatedBytes.annotate(2, "insn_count = 0x%x", Integer.valueOf(dexReader.readUshort()));
                            annotatedBytes.annotate(2, "handler_off = 0x%x", Integer.valueOf(dexReader.readUshort()));
                            annotatedBytes.deindent();
                        } catch (Throwable th2) {
                            annotatedBytes.deindent();
                            throw th2;
                        }
                    } finally {
                    }
                }
                annotatedBytes.deindent();
                int smallUleb128 = dexReader.readSmallUleb128();
                annotatedBytes.annotate(0, "encoded_catch_handler_list:", new Object[0]);
                annotatedBytes.annotateTo(dexReader.getOffset(), "size = %d", Integer.valueOf(smallUleb128));
                annotatedBytes.indent();
                for (int i12 = 0; i12 < smallUleb128; i12++) {
                    try {
                        annotatedBytes.annotate(0, "encoded_catch_handler[%d]", Integer.valueOf(i12));
                        annotatedBytes.indent();
                        try {
                            int sleb128 = dexReader.readSleb128();
                            annotatedBytes.annotateTo(dexReader.getOffset(), "size = %d", Integer.valueOf(sleb128));
                            boolean z10 = sleb128 <= 0;
                            int iAbs = Math.abs(sleb128);
                            if (iAbs != 0) {
                                annotatedBytes.annotate(0, "handlers:", new Object[0]);
                                annotatedBytes.indent();
                                for (int i13 = 0; i13 < iAbs; i13++) {
                                    try {
                                        annotatedBytes.annotate(0, "encoded_type_addr_pair[%d]", Integer.valueOf(i12));
                                        annotatedBytes.indent();
                                        try {
                                            annotatedBytes.annotateTo(dexReader.getOffset(), TypeIdItem.getReferenceAnnotation(this.dexFile, dexReader.readSmallUleb128()), new Object[0]);
                                            annotatedBytes.annotateTo(dexReader.getOffset(), "addr = 0x%x", Integer.valueOf(dexReader.readSmallUleb128()));
                                            annotatedBytes.deindent();
                                        } catch (Throwable th3) {
                                            annotatedBytes.deindent();
                                            throw th3;
                                        }
                                    } finally {
                                    }
                                }
                                annotatedBytes.deindent();
                            }
                            if (z10) {
                                annotatedBytes.annotateTo(dexReader.getOffset(), "catch_all_addr = 0x%x", Integer.valueOf(dexReader.readSmallUleb128()));
                            }
                            annotatedBytes.deindent();
                        } catch (Throwable th4) {
                            annotatedBytes.deindent();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        annotatedBytes.deindent();
                        throw th5;
                    }
                }
                annotatedBytes.deindent();
            }
        }

        public PreInstructionInfo annotatePreInstructionFields(AnnotatedBytes annotatedBytes, DexReader dexReader, String str) {
            annotatedBytes.annotate(2, "registers_size = %d", Integer.valueOf(dexReader.readUshort()));
            annotatedBytes.annotate(2, "ins_size = %d", Integer.valueOf(dexReader.readUshort()));
            annotatedBytes.annotate(2, "outs_size = %d", Integer.valueOf(dexReader.readUshort()));
            int ushort = dexReader.readUshort();
            annotatedBytes.annotate(2, "tries_size = %d", Integer.valueOf(ushort));
            int i10 = dexReader.readInt();
            annotatedBytes.annotate(4, "debug_info_off = 0x%x", Integer.valueOf(i10));
            if (i10 > 0) {
                addDebugInfoIdentity(i10, str);
            }
            int smallUint = dexReader.readSmallUint();
            annotatedBytes.annotate(4, "insns_size = 0x%x", Integer.valueOf(smallUint));
            return new PreInstructionInfo(ushort, smallUint);
        }

        @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
        public int getItemAlignment() {
            return 4;
        }

        @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
        public String getItemName() {
            return "code_item";
        }
    }

    public static class TryItem {
        public static final int CODE_UNIT_COUNT_OFFSET = 4;
        public static final int HANDLER_OFFSET = 6;
        public static final int ITEM_SIZE = 8;
        public static final int START_ADDRESS_OFFSET = 0;
    }

    public static SectionAnnotator makeAnnotator(DexAnnotator dexAnnotator, MapItem mapItem) {
        return dexAnnotator.dexFile instanceof CDexBackedDexFile ? makeAnnotatorForCDex(dexAnnotator, mapItem) : makeAnnotatorForDex(dexAnnotator, mapItem);
    }

    private static SectionAnnotator makeAnnotatorForCDex(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new CodeItemAnnotator(dexAnnotator, mapItem) { // from class: org.jf.dexlib2.dexbacked.raw.CodeItem.1
            private List<Integer> sortedItems;

            @Override // org.jf.dexlib2.dexbacked.raw.CodeItem.CodeItemAnnotator
            public CodeItemAnnotator.PreInstructionInfo annotatePreInstructionFields(AnnotatedBytes annotatedBytes, DexReader dexReader, String str) {
                int ushort = dexReader.readUshort();
                int i10 = (ushort >> CodeItem.CDEX_TRIES_SIZE_SHIFT) & 15;
                int i11 = (ushort >> CodeItem.CDEX_OUTS_COUNT_SHIFT) & 15;
                int i12 = (ushort >> CodeItem.CDEX_INS_COUNT_SHIFT) & 15;
                int i13 = (ushort >> CodeItem.CDEX_REGISTER_COUNT_SHIFT) & 15;
                int cursor = annotatedBytes.getCursor();
                annotatedBytes.annotate(2, "tries_size = %d", Integer.valueOf(i10));
                annotatedBytes.annotate(0, "outs_size = %d", Integer.valueOf(i11));
                annotatedBytes.annotate(0, "ins_size = %d", Integer.valueOf(i12));
                annotatedBytes.annotate(0, "registers_size = %d", Integer.valueOf(i13));
                int ushort2 = dexReader.readUshort();
                int i14 = ushort2 >> CodeItem.CDEX_INSTRUCTIONS_SIZE_SHIFT;
                annotatedBytes.annotate(2, "insns_size = %d", Integer.valueOf(i14));
                int cursor2 = annotatedBytes.getCursor();
                int i15 = CodeItem.CDEX_PREHEADER_FLAGS_MASK;
                if ((ushort2 & i15) != 0) {
                    int iBitCount = Integer.bitCount(i15 & ushort2);
                    if ((CodeItem.CDEX_PREHEADER_FLAG_INSTRUCTIONS_SIZE & ushort2) != 0) {
                        iBitCount++;
                    }
                    annotatedBytes.moveTo(cursor - (iBitCount * 2));
                    annotatedBytes.deindent();
                    annotatedBytes.annotate(0, "[preheader for next code_item]", new Object[0]);
                    annotatedBytes.indent();
                    annotatedBytes.moveTo(cursor2);
                }
                if ((CodeItem.CDEX_PREHEADER_FLAG_INSTRUCTIONS_SIZE & ushort2) != 0) {
                    annotatedBytes.annotate(0, "insns_size_preheader_flag=1", new Object[0]);
                    dexReader.setOffset(cursor - 2);
                    int ushort3 = dexReader.readUshort();
                    cursor -= 4;
                    dexReader.setOffset(cursor);
                    int ushort4 = dexReader.readUshort() + ushort3;
                    annotatedBytes.moveTo(cursor);
                    int i16 = i14 + ushort4;
                    annotatedBytes.annotate(2, "insns_size = %d + %d = %d", Integer.valueOf(i14), Integer.valueOf(ushort4), Integer.valueOf(i16));
                    annotatedBytes.moveTo(cursor2);
                    i14 = i16;
                }
                if ((CodeItem.CDEX_PREHEADER_FLAG_REGISTER_COUNT & ushort2) != 0) {
                    annotatedBytes.annotate(0, "registers_size_preheader_flag=1", new Object[0]);
                    cursor -= 2;
                    annotatedBytes.moveTo(cursor);
                    dexReader.setOffset(cursor);
                    int ushort5 = dexReader.readUshort();
                    annotatedBytes.annotate(2, "registers_size = %d + %d = %d", Integer.valueOf(i13), Integer.valueOf(ushort5), Integer.valueOf(i13 + ushort5));
                    annotatedBytes.moveTo(cursor2);
                }
                if ((CodeItem.CDEX_PREHEADER_FLAG_INS_COUNT & ushort2) != 0) {
                    annotatedBytes.annotate(0, "ins_size_preheader_flag=1", new Object[0]);
                    cursor -= 2;
                    annotatedBytes.moveTo(cursor);
                    dexReader.setOffset(cursor);
                    int ushort6 = dexReader.readUshort();
                    annotatedBytes.annotate(2, "ins_size = %d + %d = %d", Integer.valueOf(i12), Integer.valueOf(ushort6), Integer.valueOf(i12 + ushort6));
                    annotatedBytes.moveTo(cursor2);
                }
                if ((CodeItem.CDEX_PREHEADER_FLAG_OUTS_COUNT & ushort2) != 0) {
                    annotatedBytes.annotate(0, "outs_size_preheader_flag=1", new Object[0]);
                    cursor -= 2;
                    annotatedBytes.moveTo(cursor);
                    dexReader.setOffset(cursor);
                    int ushort7 = dexReader.readUshort();
                    annotatedBytes.annotate(2, "outs_size = %d + %d = %d", Integer.valueOf(i11), Integer.valueOf(ushort7), Integer.valueOf(i11 + ushort7));
                    annotatedBytes.moveTo(cursor2);
                }
                if ((CodeItem.CDEX_PREHEADER_FLAG_TRIES_COUNT & ushort2) != 0) {
                    annotatedBytes.annotate(0, "tries_size_preheader_flag=1", new Object[0]);
                    int i17 = cursor - 2;
                    annotatedBytes.moveTo(i17);
                    dexReader.setOffset(i17);
                    int ushort8 = dexReader.readUshort();
                    int i18 = i10 + ushort8;
                    annotatedBytes.annotate(2, "tries_size = %d + %d = %d", Integer.valueOf(i10), Integer.valueOf(ushort8), Integer.valueOf(i18));
                    annotatedBytes.moveTo(cursor2);
                    i10 = i18;
                }
                dexReader.setOffset(cursor2);
                return new CodeItemAnnotator.PreInstructionInfo(i10, i14);
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public void annotateSection(AnnotatedBytes annotatedBytes) {
                ArrayList arrayList = new ArrayList(this.itemIdentities.keySet());
                this.sortedItems = arrayList;
                arrayList.sort(new a(0));
                annotatedBytes.moveTo(this.sectionOffset);
                annotateSectionInner(annotatedBytes, this.itemIdentities.size());
            }

            @Override // org.jf.dexlib2.dexbacked.raw.SectionAnnotator
            public int getItemOffset(int i10, int i11) {
                return this.sortedItems.get(i10).intValue();
            }
        };
    }

    private static SectionAnnotator makeAnnotatorForDex(DexAnnotator dexAnnotator, MapItem mapItem) {
        return new CodeItemAnnotator(dexAnnotator, mapItem);
    }
}
