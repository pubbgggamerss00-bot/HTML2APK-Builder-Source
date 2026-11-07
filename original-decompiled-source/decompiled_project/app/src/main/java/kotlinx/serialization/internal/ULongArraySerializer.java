package kotlinx.serialization.internal;

/* loaded from: classes2.dex */
public final class ULongArraySerializer extends PrimitiveArraySerializer<pg.z, pg.a0, b1> {
    public static final ULongArraySerializer INSTANCE = new ULongArraySerializer();

    private ULongArraySerializer() {
        super(ai.a.serializer(pg.z.f21492b));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m103collectionSizeQwZRm1k(((pg.a0) obj).f21446a);
    }

    /* renamed from: collectionSize-QwZRm1k, reason: not valid java name */
    public int m103collectionSizeQwZRm1k(long[] collectionSize) {
        kotlin.jvm.internal.r.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ pg.a0 empty() {
        return new pg.a0(m104emptyY2RjT0g());
    }

    /* renamed from: empty-Y2RjT0g, reason: not valid java name */
    public long[] m104emptyY2RjT0g() {
        return new long[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m105toBuilderQwZRm1k(((pg.a0) obj).f21446a);
    }

    /* renamed from: toBuilder-QwZRm1k, reason: not valid java name */
    public b1 m105toBuilderQwZRm1k(long[] toBuilder) {
        kotlin.jvm.internal.r.e(toBuilder, "$this$toBuilder");
        b1 b1Var = new b1();
        b1Var.f16351a = toBuilder;
        b1Var.f16352b = toBuilder.length;
        b1Var.b(10);
        return b1Var;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(ci.c cVar, pg.a0 a0Var, int i10) {
        m106writeContent0q3Fkuo(cVar, a0Var.f21446a, i10);
    }

    /* renamed from: writeContent-0q3Fkuo, reason: not valid java name */
    public void m106writeContent0q3Fkuo(ci.c encoder, long[] content, int i10) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.I(getDescriptor(), i11).K(content[i11]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(ci.b decoder, int i10, b1 builder, boolean z10) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        kotlin.jvm.internal.r.e(builder, "builder");
        long jV = decoder.p(getDescriptor(), i10).v();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f16351a;
        int i11 = builder.f16352b;
        builder.f16352b = i11 + 1;
        jArr[i11] = jV;
    }
}
