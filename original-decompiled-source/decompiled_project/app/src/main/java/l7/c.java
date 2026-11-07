package l7;

import g7.t;
import j7.r;
import l7.k;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16740a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16741b;

    public static final class a implements k.a<byte[]> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            return new c((byte[]) obj, mVar);
        }
    }

    public c(byte[] bArr, w7.m mVar) {
        this.f16740a = bArr;
        this.f16741b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) {
        hi.g gVar = new hi.g();
        gVar.m86write(this.f16740a);
        return new p(r.b(gVar, this.f16741b.f31406f), null, j7.f.f15221b);
    }
}
