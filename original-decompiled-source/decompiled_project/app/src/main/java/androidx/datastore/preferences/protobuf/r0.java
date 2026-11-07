package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p0;

/* loaded from: classes.dex */
public interface r0 {
    q0 a();

    q0 forMapData(Object obj);

    p0.a<?, ?> forMapMetadata(Object obj);

    q0 forMutableMapData(Object obj);

    int getSerializedSize(int i10, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    q0 mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
