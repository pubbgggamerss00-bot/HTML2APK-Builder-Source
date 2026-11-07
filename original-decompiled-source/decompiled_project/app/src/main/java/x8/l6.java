package x8;

import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.CacheManager;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$checkAndAutoCleanCache$1", f = "HomeViewModel.kt", l = {1299}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f32912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j6 f32913c;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$checkAndAutoCleanCache$1$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f32914a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j6 f32915b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, tg.e eVar, j6 j6Var) {
            super(2, eVar);
            this.f32914a = context;
            this.f32915b = j6Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f32914a, eVar, this.f32915b);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            Toast.makeText(this.f32914a, this.f32915b.F().getString(R.string.home_cache_cleared_auto), 1).show();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(Context context, tg.e eVar, j6 j6Var) {
        super(2, eVar);
        this.f32912b = context;
        this.f32913c = j6Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new l6(this.f32912b, eVar, this.f32913c);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((l6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32911a;
        if (i10 == 0) {
            pg.q.b(obj);
            CacheManager cacheManager = CacheManager.INSTANCE;
            Context context = this.f32912b;
            if (cacheManager.getCacheSize(context) > 104857600) {
                cacheManager.clearAppCache(context);
                wh.c cVar = ph.z0.f21632a;
                qh.g gVar = uh.o.f29764a;
                a aVar2 = new a(context, null, this.f32913c);
                this.f32911a = 1;
                if (ph.h.e(gVar, aVar2, this) == aVar) {
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
