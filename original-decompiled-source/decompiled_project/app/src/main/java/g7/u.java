package g7;

import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends vg.i implements eh.p<ph.i0, tg.e<? super w7.i>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f11536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w7.f f11537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, tg.e eVar, w7.f fVar) {
        super(2, eVar);
        this.f11536b = tVar;
        this.f11537c = fVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u(this.f11536b, eVar, this.f11537c);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super w7.i> eVar) {
        return ((u) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11535a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        this.f11535a = 1;
        int i11 = t.f11524f;
        Object objB = this.f11536b.b(this.f11537c, 0, this);
        return objB == aVar ? aVar : objB;
    }
}
