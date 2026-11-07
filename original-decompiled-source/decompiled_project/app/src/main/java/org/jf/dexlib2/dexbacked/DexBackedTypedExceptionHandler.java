package org.jf.dexlib2.dexbacked;

/* loaded from: classes3.dex */
public class DexBackedTypedExceptionHandler extends DexBackedExceptionHandler {
    private final DexBackedDexFile dexFile;
    private final int handlerCodeAddress;
    private final int typeId;

    public DexBackedTypedExceptionHandler(DexBackedDexFile dexBackedDexFile, DexReader dexReader) {
        this.dexFile = dexBackedDexFile;
        this.typeId = dexReader.readSmallUleb128();
        this.handlerCodeAddress = dexReader.readSmallUleb128();
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public String getExceptionType() {
        return this.dexFile.getTypeSection().get(this.typeId);
    }

    @Override // org.jf.dexlib2.iface.ExceptionHandler
    public int getHandlerCodeAddress() {
        return this.handlerCodeAddress;
    }
}
