package kotlinx.serialization.json;

@zh.g(with = JsonNullSerializer.class)
/* loaded from: classes2.dex */
public final class t extends x {
    public static final t INSTANCE = new t();

    /* renamed from: a, reason: collision with root package name */
    public static final String f16455a = "null";

    @Override // kotlinx.serialization.json.x
    public final String c() {
        return f16455a;
    }

    @Override // kotlinx.serialization.json.x
    public final boolean e() {
        return false;
    }

    public final zh.b<t> serializer() {
        return JsonNullSerializer.INSTANCE;
    }
}
