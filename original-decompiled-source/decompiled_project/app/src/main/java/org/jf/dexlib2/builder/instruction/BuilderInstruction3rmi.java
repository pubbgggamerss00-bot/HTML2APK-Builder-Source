package org.jf.dexlib2.builder.instruction;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.builder.BuilderInstruction;
import org.jf.dexlib2.iface.instruction.formats.Instruction3rmi;
import org.jf.dexlib2.util.Preconditions;

/* loaded from: classes3.dex */
public class BuilderInstruction3rmi extends BuilderInstruction implements Instruction3rmi {
    public static final Format FORMAT = Format.Format3rmi;
    protected final int inlineIndex;
    protected final int registerCount;
    protected final int startRegister;

    public BuilderInstruction3rmi(Opcode opcode, int i10, int i11, int i12) {
        super(opcode);
        this.startRegister = Preconditions.checkShortRegister(i10);
        this.registerCount = Preconditions.checkRegisterRangeCount(i11);
        this.inlineIndex = i12;
    }

    @Override // org.jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.jf.dexlib2.iface.instruction.InlineIndexInstruction
    public int getInlineIndex() {
        return this.inlineIndex;
    }

    @Override // org.jf.dexlib2.iface.instruction.VariableRegisterInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // org.jf.dexlib2.iface.instruction.RegisterRangeInstruction
    public int getStartRegister() {
        return this.startRegister;
    }
}
