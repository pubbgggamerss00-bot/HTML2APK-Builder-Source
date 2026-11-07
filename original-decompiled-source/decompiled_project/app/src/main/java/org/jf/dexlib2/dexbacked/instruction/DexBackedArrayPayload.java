package org.jf.dexlib2.dexbacked.instruction;

import java.util.List;
import nc.r;
import nc.u0;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.util.FixedSizeList;
import org.jf.dexlib2.iface.instruction.formats.ArrayPayload;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class DexBackedArrayPayload extends DexBackedInstruction implements ArrayPayload {
    private static final int ELEMENTS_OFFSET = 8;
    private static final int ELEMENT_COUNT_OFFSET = 4;
    private static final int ELEMENT_WIDTH_OFFSET = 2;
    public static final Opcode OPCODE = Opcode.ARRAY_PAYLOAD;
    public final int elementCount;
    public final int elementWidth;

    /* renamed from: org.jf.dexlib2.dexbacked.instruction.DexBackedArrayPayload$1ReturnedList, reason: invalid class name */
    public abstract class C1ReturnedList extends FixedSizeList<Number> {
        public C1ReturnedList() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return DexBackedArrayPayload.this.elementCount;
        }
    }

    public DexBackedArrayPayload(DexBackedDexFile dexBackedDexFile, int i10) {
        super(dexBackedDexFile, OPCODE, i10);
        int ushort = dexBackedDexFile.getDataBuffer().readUshort(i10 + 2);
        if (ushort == 0) {
            this.elementWidth = 1;
            this.elementCount = 0;
            return;
        }
        this.elementWidth = ushort;
        int smallUint = dexBackedDexFile.getDataBuffer().readSmallUint(i10 + 4);
        this.elementCount = smallUint;
        if (ushort * smallUint > 2147483647L) {
            throw new ExceptionWithContext("Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.ArrayPayload
    public List<Number> getArrayElements() {
        final int i10 = this.instructionStart + 8;
        if (this.elementCount == 0) {
            r.a aVar = r.f18735b;
            return u0.f18756e;
        }
        int i11 = this.elementWidth;
        if (i11 == 1) {
            return new C1ReturnedList() { // from class: org.jf.dexlib2.dexbacked.instruction.DexBackedArrayPayload.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.jf.dexlib2.dexbacked.util.FixedSizeList
                public Number readItem(int i12) {
                    return Integer.valueOf(DexBackedArrayPayload.this.dexFile.getDataBuffer().readByte(i10 + i12));
                }
            };
        }
        if (i11 == 2) {
            return new C1ReturnedList() { // from class: org.jf.dexlib2.dexbacked.instruction.DexBackedArrayPayload.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.jf.dexlib2.dexbacked.util.FixedSizeList
                public Number readItem(int i12) {
                    return Integer.valueOf(DexBackedArrayPayload.this.dexFile.getDataBuffer().readShort((i12 * 2) + i10));
                }
            };
        }
        if (i11 == 4) {
            return new C1ReturnedList() { // from class: org.jf.dexlib2.dexbacked.instruction.DexBackedArrayPayload.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.jf.dexlib2.dexbacked.util.FixedSizeList
                public Number readItem(int i12) {
                    return Integer.valueOf(DexBackedArrayPayload.this.dexFile.getDataBuffer().readInt((i12 * 4) + i10));
                }
            };
        }
        if (i11 == 8) {
            return new C1ReturnedList() { // from class: org.jf.dexlib2.dexbacked.instruction.DexBackedArrayPayload.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.jf.dexlib2.dexbacked.util.FixedSizeList
                public Number readItem(int i12) {
                    return Long.valueOf(DexBackedArrayPayload.this.dexFile.getDataBuffer().readLong((i12 * 8) + i10));
                }
            };
        }
        throw new ExceptionWithContext("Invalid element width: %d", Integer.valueOf(this.elementWidth));
    }

    @Override // org.jf.dexlib2.dexbacked.instruction.DexBackedInstruction, org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return (((this.elementWidth * this.elementCount) + 1) / 2) + 4;
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.ArrayPayload
    public int getElementWidth() {
        return this.elementWidth;
    }
}
