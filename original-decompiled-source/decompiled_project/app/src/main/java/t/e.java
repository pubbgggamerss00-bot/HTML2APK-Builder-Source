package t;

import x.o;

@vg.e(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1", f = "Clickable.kt", l = {1119}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f25194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o.b f25195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, o.b bVar, tg.e<? super e> eVar) {
        super(2, eVar);
        this.f25194b = aVar;
        this.f25195c = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new e(this.f25194b, this.f25195c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25193a;
        if (i10 == 0) {
            pg.q.b(obj);
            x.m mVar = this.f25194b.f25142s;
            if (mVar != null) {
                o.a aVar2 = new o.a(this.f25195c);
                this.f25193a = 1;
                if (mVar.c(aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
