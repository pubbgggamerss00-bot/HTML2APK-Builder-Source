package h9;

import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.data.apkgenerator.CacheManager;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.SettingsViewModel$clearCache$2", f = "SettingsViewModel.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4 f12853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f12854c;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.SettingsViewModel$clearCache$2$1", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2 f12855a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f12856b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x2 x2Var, float f10, tg.e eVar) {
            super(2, eVar);
            this.f12855a = x2Var;
            this.f12856b = f10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f12855a, this.f12856b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            this.f12855a.invoke(new Float(this.f12856b));
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(b4 b4Var, x2 x2Var, tg.e eVar) {
        super(2, eVar);
        this.f12853b = b4Var;
        this.f12854c = x2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new w3(this.f12853b, this.f12854c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((w3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        b4 b4Var = this.f12853b;
        Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = b4Var.f12539c;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12852a;
        if (i10 == 0) {
            pg.q.b(obj);
            CacheManager cacheManager = CacheManager.INSTANCE;
            long cacheSize = cacheManager.getCacheSize(hilt_HtmlToApkApplication);
            cacheManager.clearAppCache(hilt_HtmlToApkApplication);
            long cacheSize2 = cacheManager.getCacheSize(hilt_HtmlToApkApplication);
            sh.z0 z0Var = b4Var.f12543g;
            Long l10 = new Long(cacheSize2);
            z0Var.getClass();
            z0Var.j(null, l10);
            wh.c cVar = ph.z0.f21632a;
            qh.g gVar = uh.o.f29764a;
            a aVar2 = new a(this.f12854c, (cacheSize - cacheSize2) / 1048576.0f, null);
            this.f12852a = 1;
            if (ph.h.e(gVar, aVar2, this) == aVar) {
                return aVar;
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
