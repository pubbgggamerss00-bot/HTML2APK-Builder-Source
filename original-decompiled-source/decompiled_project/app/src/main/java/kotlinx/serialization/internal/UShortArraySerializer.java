package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class UShortArraySerializer extends PrimitiveArraySerializer<pg.c0, pg.d0, c1> {
    public static final UShortArraySerializer INSTANCE = new UShortArraySerializer();

    private UShortArraySerializer() {
        super(ai.a.serializer(pg.c0.f21454b));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m109collectionSizerL5Bavg(((pg.d0) obj).f21456a);
    }

    /* renamed from: collectionSize-rL5Bavg, reason: not valid java name */
    public int m109collectionSizerL5Bavg(short[] collectionSize) {
        kotlin.jvm.internal.r.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ pg.d0 empty() {
        return new pg.d0(m110emptyamswpOA());
    }

    /* renamed from: empty-amswpOA, reason: not valid java name */
    public short[] m110emptyamswpOA() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m111toBuilderrL5Bavg(((pg.d0) obj).f21456a);
    }

    /* renamed from: toBuilder-rL5Bavg, reason: not valid java name */
    public c1 m111toBuilderrL5Bavg(short[] toBuilder) {
        kotlin.jvm.internal.r.e(toBuilder, "$this$toBuilder");
        c1 c1Var = new c1();
        c1Var.f16358a = toBuilder;
        c1Var.f16359b = toBuilder.length;
        c1Var.b(10);
        return c1Var;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(ci.c cVar, pg.d0 d0Var, int i10) {
        m112writeContenteny0XGE(cVar, d0Var.f21456a, i10);
    }

    /* renamed from: writeContent-eny0XGE, reason: not valid java name */
    public void m112writeContenteny0XGE(ci.c encoder, short[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.I(getDescriptor(), i11).l(content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, c1 builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        short sC = decoder.p(getDescriptor(), i10).C();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f16358a;
        int i11 = builder.f16359b;
        builder.f16359b = i11 + 1;
        sArr[i11] = sC;
    }
}
