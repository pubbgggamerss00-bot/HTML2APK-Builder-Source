package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class b0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f1953a = new b0();

    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final u0 messageInfoFor(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (u0) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
