package x8;

import android.content.Context;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$6$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o4 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, tg.e eVar, j6 j6Var) {
        super(2, eVar);
        this.f33047a = context;
        this.f33048b = j6Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o4(this.f33047a, eVar, this.f33048b);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o4) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        sh.z0 z0Var = k8.j.f16136a;
        Context context = this.f33047a;
        k8.j.a(context);
        j6 j6Var = this.f33048b;
        l5.a aVarA = androidx.lifecycle.x0.a(j6Var);
        wh.c cVar = ph.z0.f21632a;
        ph.h.c(aVarA, wh.b.f31563c, null, new l6(context, null, j6Var), 2);
        return pg.f0.f21461a;
    }
}
