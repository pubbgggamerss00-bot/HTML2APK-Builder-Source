package org.jf.dexlib2.dexbacked;

/* loaded from: classes3.dex */
public class DexBackedCatchAllExceptionHandler extends DexBackedExceptionHandler {
    private final int handlerCodeAddress;

    public DexBackedCatchAllExceptionHandler(DexReader dexReader) {
        this.handlerCodeAddress = dexReader.readSmallUleb128();
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public String getExceptionType() {
        return null;
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public int getHandlerCodeAddress() {
        return this.handlerCodeAddress;
    }
}
