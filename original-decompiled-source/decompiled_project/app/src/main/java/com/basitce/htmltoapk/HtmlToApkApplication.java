package com.basitce.htmltoapk;

import android.content.Context;
import android.content.SharedPreferences;
import com.basitce.htmltoapk.HtmlToApkApplication;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.apkgenerator.CacheManager;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreHelper;
import com.basitce.htmltoapk.util.LauncherNameJob;
import eh.p;
import java.util.List;
import kotlin.jvm.internal.r;
import l9.b0;
import l9.d0;
import n8.n1;
import pg.f0;
import pg.q;
import ph.h;
import ph.i0;
import ph.j0;
import ph.z0;
import sh.f;
import v4.e;
import vg.i;

/* loaded from: classes.dex */
public class HtmlToApkApplication extends Hilt_HtmlToApkApplication {
    public static final int $stable = 8;
    public static final a Companion = new a();
    private static String currentLanguage = "en";
    private static Context localizedContext;
    private final i0 applicationScope;

    public static final class a {
    }

    @vg.e(c = "com.basitce.htmltoapk.HtmlToApkApplication$onCreate$1", f = "HtmlToApkApplication.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<i0, tg.e<? super f0>, Object> {
        public b(tg.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return HtmlToApkApplication.this.new b(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            CacheManager.cleanOldTempFiles$default(CacheManager.INSTANCE, HtmlToApkApplication.this, 3600000L, 0L, 4, null);
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.HtmlToApkApplication$onCreate$2", f = "HtmlToApkApplication.kt", l = {}, m = "invokeSuspend")
    public static final class c extends i implements p<i0, tg.e<? super f0>, Object> {
        public c(tg.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return HtmlToApkApplication.this.new c(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            KeystoreHelper.INSTANCE.migrateFromLegacyDefaultPassword(HtmlToApkApplication.this);
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.HtmlToApkApplication$onCreate$saved$1", f = "HtmlToApkApplication.kt", l = {52}, m = "invokeSuspend")
    public static final class d extends i implements p<i0, tg.e<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5633a;

        public d(tg.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return HtmlToApkApplication.this.new d(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super String> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5633a;
            if (i10 == 0) {
                q.b(obj);
                f<v4.e> data = n1.a(HtmlToApkApplication.this).f30610a.getData();
                this.f5633a = 1;
                obj = gg.a.f(data, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return ((v4.e) obj).b(new e.a("language"));
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.HtmlToApkApplication$onTrimMemory$1", f = "HtmlToApkApplication.kt", l = {}, m = "invokeSuspend")
    public static final class e extends i implements p<i0, tg.e<? super f0>, Object> {
        public e(tg.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return HtmlToApkApplication.this.new e(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            CacheManager.cleanOldTempFiles$default(CacheManager.INSTANCE, HtmlToApkApplication.this, 300000L, 0L, 4, null);
            return f0.f21461a;
        }
    }

    public HtmlToApkApplication() {
        wh.c cVar = z0.f21632a;
        this.applicationScope = j0.a(wh.b.f31563c);
    }

    @Override // com.basitce.htmltoapk.Hilt_HtmlToApkApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        List<String> list = com.basitce.htmltoapk.util.a.f5832a;
        registerActivityLifecycleCallbacks(new b0(this));
        new Thread(new Runnable() { // from class: l9.a0
            @Override // java.lang.Runnable
            public final void run() {
                HtmlToApkApplication htmlToApkApplication = this.f16780a;
                com.basitce.htmltoapk.util.a.f5835d = com.basitce.htmltoapk.util.a.e(htmlToApkApplication);
                if (com.basitce.htmltoapk.util.a.f5835d) {
                    int i10 = LauncherNameJob.f5831a;
                    LauncherNameJob.a.a(htmlToApkApplication);
                }
            }
        }).start();
        d0.f16789a.getClass();
        String string = getSharedPreferences("locale_boot", 0).getString("language", null);
        if (string == null) {
            string = (String) h.d(tg.i.f28768a, new d(null));
            String str = string == null ? "" : string;
            SharedPreferences.Editor editorEdit = getSharedPreferences("locale_boot", 0).edit();
            editorEdit.putString("language", str);
            editorEdit.apply();
        } else if (string.length() <= 0) {
            string = null;
        }
        String strH = d0.h(this, string);
        currentLanguage = strH;
        localizedContext = d0.i(this, strH);
        BuildLogger buildLogger = BuildLogger.INSTANCE;
        Context context = localizedContext;
        r.b(context);
        buildLogger.attach(context);
        h.c(this.applicationScope, null, null, new b(null), 3);
        h.c(this.applicationScope, null, null, new c(null), 3);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        h.c(this.applicationScope, null, null, new e(null), 3);
    }
}
