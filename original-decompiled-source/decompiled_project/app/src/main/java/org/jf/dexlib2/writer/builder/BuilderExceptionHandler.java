package org.jf.dexlib2.writer.builder;

import org.jf.dexlib2.base.BaseExceptionHandler;

/* loaded from: classes3.dex */
public class BuilderExceptionHandler extends BaseExceptionHandler {
    final BuilderTypeReference exceptionType;
    final int handlerCodeAddress;

    public BuilderExceptionHandler(BuilderTypeReference builderTypeReference, int i10) {
        this.exceptionType = builderTypeReference;
        this.handlerCodeAddress = i10;
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public String getExceptionType() {
        BuilderTypeReference builderTypeReference = this.exceptionType;
        if (builderTypeReference == null) {
            return null;
        }
        return builderTypeReference.getType();
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public int getHandlerCodeAddress() {
        return this.handlerCodeAddress;
    }
}
