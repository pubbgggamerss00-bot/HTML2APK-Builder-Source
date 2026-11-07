package org.jf.dexlib2.immutable;

import java.util.List;
import nc.r;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.immutable.debug.ImmutableDebugItem;
import org.jf.dexlib2.immutable.instruction.ImmutableInstruction;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableMethodImplementation implements MethodImplementation {
    protected final r<? extends ImmutableDebugItem> debugItems;
    protected final r<? extends ImmutableInstruction> instructions;
    protected final int registerCount;
    protected final r<? extends ImmutableTryBlock> tryBlocks;

    public ImmutableMethodImplementation(int i10, Iterable<? extends Instruction> iterable, List<? extends TryBlock<? extends ExceptionHandler>> list, Iterable<? extends DebugItem> iterable2) {
        this.registerCount = i10;
        this.instructions = ImmutableInstruction.immutableListOf(iterable);
        this.tryBlocks = ImmutableTryBlock.immutableListOf(list);
        this.debugItems = ImmutableDebugItem.immutableListOf(iterable2);
    }

    public static ImmutableMethodImplementation of(MethodImplementation methodImplementation) {
        if (methodImplementation == null) {
            return null;
        }
        return methodImplementation instanceof ImmutableMethodImplementation ? (ImmutableMethodImplementation) methodImplementation : new ImmutableMethodImplementation(methodImplementation.getRegisterCount(), methodImplementation.getInstructions(), methodImplementation.getTryBlocks(), methodImplementation.getDebugItems());
    }

    @Override // org.jf.dexlib2.iface.MethodImplementation
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // org.jf.dexlib2.iface.MethodImplementation
    public r<? extends ImmutableDebugItem> getDebugItems() {
        return this.debugItems;
    }

    @Override // org.jf.dexlib2.iface.MethodImplementation
    public r<? extends ImmutableInstruction> getInstructions() {
        return this.instructions;
    }

    @Override // org.jf.dexlib2.iface.MethodImplementation
    public r<? extends ImmutableTryBlock> getTryBlocks() {
        return this.tryBlocks;
    }

    public ImmutableMethodImplementation(int i10, r<? extends ImmutableInstruction> rVar, r<? extends ImmutableTryBlock> rVar2, r<? extends ImmutableDebugItem> rVar3) {
        this.registerCount = i10;
        this.instructions = ImmutableUtils.nullToEmptyList(rVar);
        this.tryBlocks = ImmutableUtils.nullToEmptyList(rVar2);
        this.debugItems = ImmutableUtils.nullToEmptyList(rVar3);
    }
}
