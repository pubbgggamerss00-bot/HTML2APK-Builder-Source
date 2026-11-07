package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderOffsetInstruction;
import org.jf.dexlib2.builder.Label;
import org.jf.dexlib2.iface.instruction.formats.Instruction30t;

/* loaded from: classes3.dex */
public class BuilderInstruction30t extends BuilderOffsetInstruction implements Instruction30t {
    public static final Format FORMAT = Format.Format30t;

    public BuilderInstruction30t(Opcode opcode, Label label) {
        super(opcode, label);
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return FORMAT;
    }
}
