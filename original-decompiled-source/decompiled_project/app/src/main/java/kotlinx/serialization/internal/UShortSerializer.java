package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class UShortSerializer implements zh.b<pg.c0> {
    public static final UShortSerializer INSTANCE = new UShortSerializer();
    private static final bi.f descriptor = v.a("kotlin.UShort", ai.a.serializer(kotlin.jvm.internal.j0.f16335a));

    private UShortSerializer() {
    }

    @Override // zh.a
    public /* synthetic */ Object deserialize(ci.d dVar) {
        return new pg.c0(m113deserializeBwKQO78(dVar));
    }

    /* renamed from: deserialize-BwKQO78, reason: not valid java name */
    public short m113deserializeBwKQO78(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return decoder.e(getDescriptor()).C();
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* synthetic */ void serialize(ci.e eVar, Object obj) {
        m114serializei8woANY(eVar, ((pg.c0) obj).f21455a);
    }

    /* renamed from: serialize-i8woANY, reason: not valid java name */
    public void m114serializei8woANY(ci.e encoder, short s10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.f(getDescriptor()).l(s10);
    }
}
