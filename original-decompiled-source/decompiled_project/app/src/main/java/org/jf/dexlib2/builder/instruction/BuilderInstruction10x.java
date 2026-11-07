package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction10x;

/* loaded from: classes3.dex */
public class BuilderInstruction10x extends BuilderInstruction implements Instruction10x {
    public static final Format FORMAT = Format.Format10x;

    public BuilderInstruction10x(Opcode opcode) {
        super(opcode);
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return FORMAT;
    }
}
