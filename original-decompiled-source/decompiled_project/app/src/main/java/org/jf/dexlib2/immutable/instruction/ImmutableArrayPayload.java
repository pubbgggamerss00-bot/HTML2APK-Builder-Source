package org.jf.dexlib2.immutable.instruction;

import java.util.List;
import nc.r;
import nc.u0;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.iface.instruction.formats.ArrayPayload;
import org.jf.dexlib2.util.Preconditions;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableArrayPayload extends ImmutableInstruction implements ArrayPayload {
    public static final Opcode OPCODE = Opcode.ARRAY_PAYLOAD;
    protected final r<Number> arrayElements;
    protected final int elementWidth;

    public ImmutableArrayPayload(int i10, List<Number> list) {
        List listK;
        super(OPCODE);
        this.elementWidth = Preconditions.checkArrayPayloadElementWidth(i10);
        if (list == null) {
            r.a aVar = r.f18735b;
            listK = u0.f18756e;
        } else {
            listK = r.k(list);
        }
        this.arrayElements = (r) Preconditions.checkArrayPayloadElements(i10, listK);
    }

    public static ImmutableArrayPayload of(ArrayPayload arrayPayload) {
        return arrayPayload instanceof ImmutableArrayPayload ? (ImmutableArrayPayload) arrayPayload : new ImmutableArrayPayload(arrayPayload.getElementWidth(), arrayPayload.getArrayElements());
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.ArrayPayload
    public List<Number> getArrayElements() {
        return this.arrayElements;
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction, org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return (((this.arrayElements.size() * this.elementWidth) + 1) / 2) + 4;
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.ArrayPayload
    public int getElementWidth() {
        return this.elementWidth;
    }

    @Override // org.jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return OPCODE.format;
    }

    public ImmutableArrayPayload(int i10, r<Number> rVar) {
        super(OPCODE);
        this.elementWidth = Preconditions.checkArrayPayloadElementWidth(i10);
        this.arrayElements = (r) Preconditions.checkArrayPayloadElements(i10, ImmutableUtils.nullToEmptyList(rVar));
    }
}
