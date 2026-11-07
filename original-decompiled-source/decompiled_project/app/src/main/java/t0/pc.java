package t0;

@vg.e(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class pc extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic f26732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2.h f26733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(ic icVar, j2.h hVar, tg.e<? super pc> eVar) {
        super(2, eVar);
        this.f26732b = icVar;
        this.f26733c = hVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new pc(this.f26732b, this.f26733c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((pc) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        long jA;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26731a;
        ic icVar = this.f26732b;
        if (i10 == 0) {
            pg.q.b(obj);
            if (icVar != null) {
                jc duration = icVar.b().getDuration();
                boolean z10 = icVar.b().b() != null;
                int iOrdinal = duration.ordinal();
                if (iOrdinal == 0) {
                    jA = 4000;
                } else if (iOrdinal == 1) {
                    jA = 10000;
                } else {
                    if (iOrdinal != 2) {
                        throw new pg.l();
                    }
                    jA = Long.MAX_VALUE;
                }
                j2.h hVar = this.f26733c;
                if (hVar != null) {
                    jA = hVar.a(jA, z10);
                }
                this.f26731a = 1;
                if (ph.t0.b(jA, this) == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        icVar.dismiss();
        return pg.f0.f21461a;
    }
}
