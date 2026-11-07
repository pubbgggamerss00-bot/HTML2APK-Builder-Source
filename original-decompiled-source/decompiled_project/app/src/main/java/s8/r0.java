package s8;

import f9.fg;

@vg.e(c = "com.basitce.htmltoapk.ui.navigation.AppNavigationKt$AppNavigation$10$1$2$1$6$1$25$1$1", f = "AppNavigation.kt", l = {449}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg f24722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(long j10, fg fgVar, tg.e<? super r0> eVar) {
        super(2, eVar);
        this.f24721b = j10;
        this.f24722c = fgVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r0(this.f24721b, this.f24722c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24720a;
        if (i10 == 0) {
            pg.q.b(obj);
            long j10 = this.f24721b;
            if (j10 != 0) {
                this.f24720a = 1;
                if (this.f24722c.n(j10, this) == aVar) {
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
