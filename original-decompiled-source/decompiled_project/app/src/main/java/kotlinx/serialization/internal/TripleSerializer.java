package kotlinx.serialization.internal;

import bi.m;

/* loaded from: classes2.dex */
public final class TripleSerializer<A, B, C> implements zh.b<pg.t<? extends A, ? extends B, ? extends C>> {
    private final zh.b<A> aSerializer;
    private final zh.b<B> bSerializer;
    private final zh.b<C> cSerializer;
    private final bi.f descriptor;

    public TripleSerializer(zh.b<A> aSerializer, zh.b<B> bSerializer, zh.b<C> cSerializer) {
        kotlin.jvm.internal.r.e(aSerializer, "aSerializer");
        kotlin.jvm.internal.r.e(bSerializer, "bSerializer");
        kotlin.jvm.internal.r.e(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        bi.f[] fVarArr = new bi.f[0];
        if (mh.x.A("kotlin.Triple")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        bi.a aVar = new bi.a("kotlin.Triple");
        descriptor$lambda$0(this, aVar);
        this.descriptor = new bi.g("kotlin.Triple", m.a.f4278a, aVar.f4242c.size(), qg.o.B(fVarArr), aVar);
    }

    private final pg.t<A, B, C> decodeSequentially(ci.b bVar) {
        Object objU = bVar.u(getDescriptor(), 0, this.aSerializer, null);
        Object objU2 = bVar.u(getDescriptor(), 1, this.bSerializer, null);
        Object objU3 = bVar.u(getDescriptor(), 2, this.cSerializer, null);
        bVar.b(getDescriptor());
        return new pg.t<>(objU, objU2, objU3);
    }

    private final pg.t<A, B, C> decodeStructure(ci.b bVar) {
        Object obj = y0.f16423a;
        Object objU = obj;
        Object objU2 = objU;
        Object objU3 = objU2;
        while (true) {
            int iG = bVar.g(getDescriptor());
            if (iG == -1) {
                bVar.b(getDescriptor());
                if (objU == obj) {
                    throw new zh.h("Element 'first' is missing");
                }
                if (objU2 == obj) {
                    throw new zh.h("Element 'second' is missing");
                }
                if (objU3 != obj) {
                    return new pg.t<>(objU, objU2, objU3);
                }
                throw new zh.h("Element 'third' is missing");
            }
            if (iG == 0) {
                objU = bVar.u(getDescriptor(), 0, this.aSerializer, null);
            } else if (iG == 1) {
                objU2 = bVar.u(getDescriptor(), 1, this.bSerializer, null);
            } else {
                if (iG != 2) {
                    throw new zh.h(j2.y.a(iG, "Unexpected index "));
                }
                objU3 = bVar.u(getDescriptor(), 2, this.cSerializer, null);
            }
        }
    }

    private static final pg.f0 descriptor$lambda$0(TripleSerializer tripleSerializer, bi.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.r.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        bi.a.a(buildClassSerialDescriptor, "first", tripleSerializer.aSerializer.getDescriptor());
        bi.a.a(buildClassSerialDescriptor, "second", tripleSerializer.bSerializer.getDescriptor());
        bi.a.a(buildClassSerialDescriptor, "third", tripleSerializer.cSerializer.getDescriptor());
        return pg.f0.f21461a;
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.a
    public pg.t<A, B, C> deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        return decodeStructure(decoder.c(getDescriptor()));
    }

    @Override // zh.i
    public void serialize(ci.e encoder, pg.t<? extends A, ? extends B, ? extends C> value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        ci.c cVarC = encoder.c(getDescriptor());
        cVarC.y(getDescriptor(), 0, this.aSerializer, value.f21479a);
        cVarC.y(getDescriptor(), 1, this.bSerializer, value.f21480b);
        cVarC.y(getDescriptor(), 2, this.cSerializer, value.f21481c);
        cVarC.b(getDescriptor());
    }
}
