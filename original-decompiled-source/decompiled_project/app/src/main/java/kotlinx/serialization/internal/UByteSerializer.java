package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class UByteSerializer implements zh.b<pg.v> {
    public static final UByteSerializer INSTANCE = new UByteSerializer();
    private static final bi.f descriptor = v.a("kotlin.UByte", ai.a.serializer(kotlin.jvm.internal.d.f16321a));

    private UByteSerializer() {
    }

    @Override // zh.a
    public /* synthetic */ Object deserialize(ci.d dVar) {
        return new pg.v(m95deserializeWa3L5BU(dVar));
    }

    /* renamed from: deserialize-Wa3L5BU, reason: not valid java name */
    public byte m95deserializeWa3L5BU(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return decoder.e(getDescriptor()).B();
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* synthetic */ void serialize(ci.e eVar, Object obj) {
        m96serializeEK6454(eVar, ((pg.v) obj).f21483a);
    }

    /* renamed from: serialize-EK-6454, reason: not valid java name */
    public void m96serializeEK6454(ci.e encoder, byte b10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.f(getDescriptor()).n(b10);
    }
}
