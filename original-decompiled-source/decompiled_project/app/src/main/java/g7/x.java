package g7;

import java.util.List;

@vg.e(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x extends vg.i implements eh.p<ph.i0, tg.e<? super w7.i>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w7.f f11554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f11555c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x7.h f11556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f11557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f11558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w7.f fVar, t tVar, x7.h hVar, h hVar2, l lVar, tg.e<? super x> eVar) {
        super(2, eVar);
        this.f11554b = fVar;
        this.f11555c = tVar;
        this.f11556d = hVar;
        this.f11557e = hVar2;
        this.f11558f = lVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new x(this.f11554b, this.f11555c, this.f11556d, this.f11557e, this.f11558f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super w7.i> eVar) {
        return ((x) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11553a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        List<o7.j> list = this.f11555c.f11528d.f11487a;
        boolean z10 = this.f11558f != null;
        w7.f fVar = this.f11554b;
        o7.l lVar = new o7.l(fVar, list, 0, fVar, this.f11556d, this.f11557e, z10);
        this.f11553a = 1;
        Object objB = lVar.b(this);
        return objB == aVar ? aVar : objB;
    }
}
