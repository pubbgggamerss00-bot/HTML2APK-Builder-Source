package org.jf.dexlib2.base;

import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.TryBlock;

/* loaded from: classes3.dex */
public abstract class BaseTryBlock<EH extends ExceptionHandler> implements TryBlock<EH> {
    @Override // org.jf.dexlib2.iface.TryBlock
    public boolean equals(Object obj) {
        if (obj instanceof TryBlock) {
            TryBlock tryBlock = (TryBlock) obj;
            if (getStartCodeAddress() == tryBlock.getStartCodeAddress() && getCodeUnitCount() == tryBlock.getCodeUnitCount() && getExceptionHandlers().equals(tryBlock.getExceptionHandlers())) {
                return true;
            }
        }
        return false;
    }
}
