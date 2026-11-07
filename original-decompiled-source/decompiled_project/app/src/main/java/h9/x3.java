package h9;

import com.basitce.htmltoapk.data.apkgenerator.CacheManager;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.SettingsViewModel$refreshCacheSize$1", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4 f12883a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(b4 b4Var, tg.e<? super x3> eVar) {
        super(2, eVar);
        this.f12883a = b4Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new x3(this.f12883a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((x3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        b4 b4Var = this.f12883a;
        sh.z0 z0Var = b4Var.f12543g;
        Long l10 = new Long(CacheManager.INSTANCE.getCacheSize(b4Var.f12539c));
        z0Var.getClass();
        z0Var.j(null, l10);
        return pg.f0.f21461a;
    }
}
