package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class UIntSerializer implements zh.b<pg.x> {
    public static final UIntSerializer INSTANCE = new UIntSerializer();
    private static final bi.f descriptor = v.a("kotlin.UInt", ai.a.serializer(kotlin.jvm.internal.q.f16340a));

    private UIntSerializer() {
    }

    @Override // zh.a
    public /* synthetic */ Object deserialize(ci.d dVar) {
        return new pg.x(m101deserializeOGnWXxg(dVar));
    }

    /* renamed from: deserialize-OGnWXxg, reason: not valid java name */
    public int m101deserializeOGnWXxg(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return decoder.e(getDescriptor()).m();
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.i
    public /* synthetic */ void serialize(ci.e eVar, Object obj) {
        m102serializeQn1smSk(eVar, ((pg.x) obj).f21488a);
    }

    /* renamed from: serialize-Qn1smSk, reason: not valid java name */
    public void m102serializeQn1smSk(ci.e encoder, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        encoder.f(getDescriptor()).H(i10);
    }
}
