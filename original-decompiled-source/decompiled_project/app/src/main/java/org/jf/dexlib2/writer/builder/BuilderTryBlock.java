package org.jf.dexlib2.writer.builder;

import java.util.List;
import org.jf.dexlib2.base.BaseTryBlock;

/* loaded from: classes3.dex */
public class BuilderTryBlock extends BaseTryBlock<BuilderExceptionHandler> {
    private final int codeUnitCount;
    private final List<? extends BuilderExceptionHandler> exceptionHandlers;
    private final int startCodeAddress;

    public BuilderTryBlock(int i10, int i11, List<? extends BuilderExceptionHandler> list) {
        this.startCodeAddress = i10;
        this.codeUnitCount = i11;
        this.exceptionHandlers = list;
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public int getCodeUnitCount() {
        return this.codeUnitCount;
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public List<? extends BuilderExceptionHandler> getExceptionHandlers() {
        return this.exceptionHandlers;
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public int getStartCodeAddress() {
        return this.startCodeAddress;
    }
}
