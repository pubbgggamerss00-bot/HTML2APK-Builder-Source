package w9;

import android.content.Context;
import x9.w;

/* loaded from: classes.dex */
public final class g implements t9.b<w> {

    /* renamed from: a, reason: collision with root package name */
    public final og.a<Context> f31476a;

    /* renamed from: b, reason: collision with root package name */
    public final og.a<y9.d> f31477b;

    /* renamed from: c, reason: collision with root package name */
    public final f f31478c;

    public g(og.a aVar, og.a aVar2, f fVar) {
        this.f31476a = aVar;
        this.f31477b = aVar2;
        this.f31478c = fVar;
    }

    @Override // og.a
    public final Object get() {
        return new x9.d(this.f31476a.get(), this.f31477b.get(), (x9.e) this.f31478c.get());
    }
}
