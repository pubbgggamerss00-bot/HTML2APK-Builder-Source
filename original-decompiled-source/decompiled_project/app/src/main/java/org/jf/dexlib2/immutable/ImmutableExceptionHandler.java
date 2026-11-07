package org.jf.dexlib2.immutable;

import nc.r;
import org.jf.dexlib2.base.BaseExceptionHandler;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.util.ImmutableConverter;

/* loaded from: classes3.dex */
public class ImmutableExceptionHandler extends BaseExceptionHandler implements ExceptionHandler {
    private static final ImmutableConverter<ImmutableExceptionHandler, ExceptionHandler> CONVERTER = new ImmutableConverter<ImmutableExceptionHandler, ExceptionHandler>() { // from class: org.jf.dexlib2.immutable.ImmutableExceptionHandler.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(ExceptionHandler exceptionHandler) {
            return exceptionHandler instanceof ImmutableExceptionHandler;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableExceptionHandler makeImmutable(ExceptionHandler exceptionHandler) {
            return ImmutableExceptionHandler.of(exceptionHandler);
        }
    };
    protected final String exceptionType;
    protected final int handlerCodeAddress;

    public ImmutableExceptionHandler(String str, int i10) {
        this.exceptionType = str;
        this.handlerCodeAddress = i10;
    }

    public static r<ImmutableExceptionHandler> immutableListOf(Iterable<? extends ExceptionHandler> iterable) {
        return CONVERTER.toList(iterable);
    }

    public static ImmutableExceptionHandler of(ExceptionHandler exceptionHandler) {
        return exceptionHandler instanceof ImmutableExceptionHandler ? (ImmutableExceptionHandler) exceptionHandler : new ImmutableExceptionHandler(exceptionHandler.getExceptionType(), exceptionHandler.getHandlerCodeAddress());
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public String getExceptionType() {
        return this.exceptionType;
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public int getHandlerCodeAddress() {
        return this.handlerCodeAddress;
    }
}
