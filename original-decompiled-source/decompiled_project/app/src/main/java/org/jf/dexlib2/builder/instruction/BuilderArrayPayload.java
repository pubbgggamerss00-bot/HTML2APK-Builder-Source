package org.jf.dexlib2.builder.instruction;

import java.util.List;
import nc.r;
import nc.u0;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.ArrayPayload;

/* loaded from: classes3.dex */
public class BuilderArrayPayload extends BuilderInstruction implements ArrayPayload {
    public static final Opcode OPCODE = Opcode.ARRAY_PAYLOAD;
    protected final List<Number> arrayElements;
    protected final int elementWidth;

    public BuilderArrayPayload(int i10, List<Number> list) {
        super(OPCODE);
        this.elementWidth = i10;
        if (list == null) {
            r.a aVar = r.f18735b;
            list = u0.f18756e;
        }
        this.arrayElements = list;
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.ArrayPayload
    public List<Number> getArrayElements() {
        return this.arrayElements;
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction, org.jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return (((this.arrayElements.size() * this.elementWidth) + 1) / 2) + 4;
    }

    @Override // org.jf.dexlib2.iface.instruction.formats.ArrayPayload
    public int getElementWidth() {
        return this.elementWidth;
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return OPCODE.format;
    }
}
