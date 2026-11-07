package org.jf.dexlib2.immutable;

import java.util.List;
import nc.r;
import org.jf.dexlib2.base.BaseTryBlock;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.util.ImmutableConverter;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableTryBlock extends BaseTryBlock<ImmutableExceptionHandler> {
    private static final ImmutableConverter<ImmutableTryBlock, TryBlock<? extends ExceptionHandler>> CONVERTER = new ImmutableConverter<ImmutableTryBlock, TryBlock<? extends ExceptionHandler>>() { // from class: org.jf.dexlib2.immutable.ImmutableTryBlock.1
        @Override // org.jf.util.ImmutableConverter
        public /* bridge */ /* synthetic */ boolean isImmutable(TryBlock<? extends ExceptionHandler> tryBlock) {
            return isImmutable2((TryBlock) tryBlock);
        }

        /* renamed from: isImmutable, reason: avoid collision after fix types in other method */
        public boolean isImmutable2(TryBlock tryBlock) {
            return tryBlock instanceof ImmutableTryBlock;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableTryBlock makeImmutable(TryBlock<? extends ExceptionHandler> tryBlock) {
            return ImmutableTryBlock.of(tryBlock);
        }
    };
    protected final int codeUnitCount;
    protected final r<? extends ImmutableExceptionHandler> exceptionHandlers;
    protected final int startCodeAddress;

    public ImmutableTryBlock(int i10, int i11, List<? extends ExceptionHandler> list) {
        this.startCodeAddress = i10;
        this.codeUnitCount = i11;
        this.exceptionHandlers = ImmutableExceptionHandler.immutableListOf(list);
    }

    public static r<ImmutableTryBlock> immutableListOf(List<? extends TryBlock<? extends ExceptionHandler>> list) {
        return CONVERTER.toList(list);
    }

    public static ImmutableTryBlock of(TryBlock<? extends ExceptionHandler> tryBlock) {
        return tryBlock instanceof ImmutableTryBlock ? (ImmutableTryBlock) tryBlock : new ImmutableTryBlock(tryBlock.getStartCodeAddress(), tryBlock.getCodeUnitCount(), tryBlock.getExceptionHandlers());
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public int getCodeUnitCount() {
        return this.codeUnitCount;
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public int getStartCodeAddress() {
        return this.startCodeAddress;
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public r<? extends ImmutableExceptionHandler> getExceptionHandlers() {
        return this.exceptionHandlers;
    }

    public ImmutableTryBlock(int i10, int i11, r<? extends ImmutableExceptionHandler> rVar) {
        this.startCodeAddress = i10;
        this.codeUnitCount = i11;
        this.exceptionHandlers = ImmutableUtils.nullToEmptyList(rVar);
    }
}
