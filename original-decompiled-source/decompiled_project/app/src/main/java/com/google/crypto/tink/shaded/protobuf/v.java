package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.w;

/* loaded from: classes2.dex */
public final class v implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v f6802a = new v();

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final boolean isSupported(Class<?> cls) {
        return w.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final n0 messageInfoFor(Class<?> cls) {
        if (!w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (n0) w.j(cls.asSubclass(w.class)).i(w.f.f6811c);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
