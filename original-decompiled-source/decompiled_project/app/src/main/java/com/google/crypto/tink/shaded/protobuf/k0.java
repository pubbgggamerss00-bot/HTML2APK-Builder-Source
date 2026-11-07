package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public interface k0 {
    j0 a();

    j0 forMapData(Object obj);

    void forMapMetadata(Object obj);

    j0 forMutableMapData(Object obj);

    int getSerializedSize(int i10, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    j0 mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
