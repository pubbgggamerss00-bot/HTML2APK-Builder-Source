package com.basitce.htmltoapk;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.l;
import androidx.lifecycle.u;
import b.w;
import com.basitce.htmltoapk.MainActivity;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import eh.p;
import f8.n;
import f8.s;
import h9.c3;
import i8.j;
import j8.a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.r;
import l9.d0;
import l9.v;
import m9.v1;
import mh.t;
import n8.a1;
import n8.b1;
import n8.f1;
import n8.l1;
import n8.m1;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import pg.f0;
import pg.p;
import pg.q;
import ph.i0;
import ph.j0;
import ph.z0;
import q8.p2;
import qg.o;
import qg.x;
import s8.e2;
import sh.g0;
import sh.h0;
import sh.k0;
import t0.uc;
import vg.i;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class MainActivity extends f8.h {
    public static final int $stable = 8;
    public static final String EXTRA_OPEN_ROUTE = "open_route";
    private Context activityServiceContext;
    public cg.a<h8.a> aiBackgroundTurns;
    public j billingManager;
    public cg.a<j8.a> creditsRepository;
    public m1 settingsRepository;
    private boolean watchForJank;
    public static final a Companion = new a();
    private static final Set<String> jankExemptRoutes = o.C(new String[]{e2.t.f24650c.f24627a, e2.h.f24638c.f24627a, e2.l.f24642c.f24627a, e2.f.f24636c.f24627a, e2.g.f24637c.f24627a});
    private final n1 backgroundAi$delegate = bg.b.h(null);
    private final n1 showLaunchPremium$delegate = bg.b.h(Boolean.FALSE);
    private final n1 incomingHtml$delegate = bg.b.h(null);
    private final n1 debugIntentRoute$delegate = bg.b.h(null);
    private final n1 pendingRoute$delegate = bg.b.h(null);
    private final v jankMonitor = new v(this, new n(this, 0));

    public static final class a {
    }

    @vg.e(c = "com.basitce.htmltoapk.MainActivity$jankMonitor$1$1", f = "MainActivity.kt", l = {68}, m = "invokeSuspend")
    public static final class b extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5636a;

        public b(tg.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return MainActivity.this.new b(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ug.a.f29706a;
            int i10 = this.f5636a;
            if (i10 == 0) {
                q.b(obj);
                m1 settingsRepository = MainActivity.this.getSettingsRepository();
                this.f5636a = 1;
                Object objA = v4.g.a(settingsRepository.f18526b, new l1(2, null), this);
                if (objA != obj2) {
                    objA = f0.f21461a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return f0.f21461a;
        }
    }

    public static final class c extends w {
        public c() {
            super(true);
        }

        @Override // b.w
        public final void b() {
            List<String> list = com.basitce.htmltoapk.util.a.f5832a;
            if (com.basitce.htmltoapk.util.a.f5835d) {
                MainActivity.this.finish();
                return;
            }
            f(false);
            MainActivity.this.getOnBackPressedDispatcher().c();
            f(true);
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.MainActivity$onCreate$2", f = "MainActivity.kt", l = {112, 115}, m = "invokeSuspend")
    public static final class d extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5639a;

        @vg.e(c = "com.basitce.htmltoapk.MainActivity$onCreate$2$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends i implements eh.q<Boolean, Boolean, tg.e<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ boolean f5641a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f5642b;

            @Override // eh.q
            public final Object b(Boolean bool, Boolean bool2, tg.e<? super Boolean> eVar) {
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = bool2.booleanValue();
                a aVar = new a(3, eVar);
                aVar.f5641a = zBooleanValue;
                aVar.f5642b = zBooleanValue2;
                return aVar.invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                q.b(obj);
                return Boolean.valueOf(this.f5641a && !this.f5642b);
            }
        }

        public static final class b<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MainActivity f5643a;

            public b(MainActivity mainActivity) {
                this.f5643a = mainActivity;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MainActivity mainActivity = this.f5643a;
                mainActivity.watchForJank = zBooleanValue;
                if (!zBooleanValue) {
                    mainActivity.jankMonitor.b();
                } else if (mainActivity.getLifecycle().b().compareTo(l.b.f2323e) >= 0) {
                    mainActivity.jankMonitor.a();
                }
                return f0.f21461a;
            }
        }

        public d(tg.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return MainActivity.this.new d(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        
            if (r9 == r0) goto L21;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ug.a.f29706a;
            int i10 = this.f5639a;
            MainActivity mainActivity = MainActivity.this;
            if (i10 == 0) {
                q.b(obj);
                m1 settingsRepository = mainActivity.getSettingsRepository();
                this.f5639a = 1;
                Object objA = v4.g.a(settingsRepository.f18526b, new n8.v(2, null), this);
                if (objA != obj2) {
                    objA = f0.f21461a;
                }
                if (objA != obj2) {
                }
                return obj2;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
                return f0.f21461a;
            }
            q.b(obj);
            a1 a1Var = mainActivity.getSettingsRepository().f18542r;
            b1 b1Var = mainActivity.getSettingsRepository().f18543s;
            a aVar = new a(3, null);
            b bVar = new b(mainActivity);
            this.f5639a = 2;
            Object objA2 = th.n.a(h0.f24986a, new g0(aVar, null), bVar, this, new sh.f[]{a1Var, b1Var});
            if (objA2 != obj2) {
                objA2 = f0.f21461a;
            }
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.MainActivity$onCreate$3", f = "MainActivity.kt", l = {CdexHeaderItem.DEBUG_INFO_BASE}, m = "invokeSuspend")
    public static final class e extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public MainActivity f5644a;

        /* renamed from: b, reason: collision with root package name */
        public int f5645b;

        @vg.e(c = "com.basitce.htmltoapk.MainActivity$onCreate$3$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends i implements p<i0, tg.e<? super h8.a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MainActivity f5647a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f5647a = mainActivity;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f5647a, eVar);
            }

            @Override // eh.p
            public final Object invoke(i0 i0Var, tg.e<? super h8.a> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                q.b(obj);
                h8.a aVar2 = this.f5647a.getAiBackgroundTurns().get();
                aVar2.f();
                return aVar2;
            }
        }

        public e(tg.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return MainActivity.this.new e(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            MainActivity mainActivity;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5645b;
            if (i10 == 0) {
                q.b(obj);
                wh.c cVar = z0.f21632a;
                MainActivity mainActivity2 = MainActivity.this;
                a aVar2 = new a(mainActivity2, null);
                this.f5644a = mainActivity2;
                this.f5645b = 1;
                obj = ph.h.e(cVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
                mainActivity = mainActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mainActivity = this.f5644a;
                q.b(obj);
            }
            mainActivity.setBackgroundAi((h8.a) obj);
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.MainActivity$onCreate$4", f = "MainActivity.kt", l = {131, 132}, m = "invokeSuspend")
    public static final class f extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5648a;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MainActivity f5650a;

            public a(MainActivity mainActivity) {
                this.f5650a = mainActivity;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                String string;
                a.b bVar = (a.b) obj;
                boolean z10 = bVar instanceof a.b.C0149b;
                MainActivity mainActivity = this.f5650a;
                if (z10) {
                    string = mainActivity.getString(R.string.credits_granted, new Integer(((a.b.C0149b) bVar).f15274a));
                } else {
                    if (!(bVar instanceof a.b.C0148a)) {
                        throw new pg.l();
                    }
                    string = mainActivity.getString(g8.w.a(((a.b.C0148a) bVar).f15273a));
                }
                r.b(string);
                Toast.makeText(mainActivity, string, 1).show();
                return f0.f21461a;
            }
        }

        @vg.e(c = "com.basitce.htmltoapk.MainActivity$onCreate$4$credits$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends i implements p<i0, tg.e<? super j8.a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MainActivity f5651a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MainActivity mainActivity, tg.e<? super b> eVar) {
                super(2, eVar);
                this.f5651a = mainActivity;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                return new b(this.f5651a, eVar);
            }

            @Override // eh.p
            public final Object invoke(i0 i0Var, tg.e<? super j8.a> eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                q.b(obj);
                return this.f5651a.getCreditsRepository().get();
            }
        }

        public f(tg.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return MainActivity.this.new f(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) throws Throwable {
            ((f) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
            return ug.a.f29706a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r7.f25017a.b(r1, r6) == r0) goto L15;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5648a;
            MainActivity mainActivity = MainActivity.this;
            if (i10 == 0) {
                q.b(obj);
                wh.c cVar = z0.f21632a;
                b bVar = new b(mainActivity, null);
                this.f5648a = 1;
                obj = ph.h.e(cVar, bVar, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
                throw new pg.g();
            }
            q.b(obj);
            k0 k0Var = ((j8.a) obj).f15267f;
            a aVar2 = new a(mainActivity);
            this.f5648a = 2;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.MainActivity$onCreate$5", f = "MainActivity.kt", l = {146, 148}, m = "invokeSuspend")
    public static final class g extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public MainActivity f5652a;

        /* renamed from: b, reason: collision with root package name */
        public int f5653b;

        public g(tg.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return MainActivity.this.new g(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            if (r6 == r0) goto L20;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5653b;
            MainActivity mainActivity = MainActivity.this;
            if (i10 == 0) {
                q.b(obj);
                m1 settingsRepository = mainActivity.getSettingsRepository();
                this.f5653b = 1;
                Object objA = v4.g.a(settingsRepository.f18526b, new n8.w(2, null), this);
                if (objA != aVar) {
                    objA = f0.f21461a;
                }
                if (objA != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mainActivity = this.f5652a;
                q.b(obj);
                mainActivity.setShowLaunchPremium(((Boolean) obj).booleanValue());
                return f0.f21461a;
            }
            q.b(obj);
            if (r.a(mainActivity.getIntent().getAction(), "android.intent.action.MAIN")) {
                m1 settingsRepository2 = mainActivity.getSettingsRepository();
                this.f5652a = mainActivity;
                this.f5653b = 2;
                obj = settingsRepository2.a(this);
            }
            return f0.f21461a;
        }
    }

    public static final class h implements p<x0.j, Integer, f0> {
        public h() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                MainActivity mainActivity = MainActivity.this;
                f1 f1Var = mainActivity.getSettingsRepository().f18529e;
                k9.a.f16171c.getClass();
                n1 n1VarA = bg.b.a(f1Var, k9.a.f16172d, null, jVar2, 0, 2);
                n1 n1VarA2 = bg.b.a(mainActivity.getSettingsRepository().f18532h, 0, null, jVar2, 48, 2);
                n1 n1VarA3 = bg.b.a(mainActivity.getSettingsRepository().f18531g, null, null, jVar2, 48, 2);
                jVar2.L(888547226);
                Object objG = jVar2.g();
                if (objG == j.a.f31715a) {
                    s sVar = new s(mainActivity.getSettingsRepository().f18542r);
                    jVar2.C(sVar);
                    objG = sVar;
                }
                jVar2.B();
                k9.j.a((k9.a) n1VarA.getValue(), false, f1.c.b(-476526790, new com.basitce.htmltoapk.c(mainActivity, bg.b.a((sh.f) objG, null, null, jVar2, 48, 2), n1VarA3, n1VarA2), jVar2), jVar2, 384);
            }
            return f0.f21461a;
        }
    }

    private final void checkDebugIntent(Intent intent) {
    }

    private final void checkHtmlIntent(Intent intent) {
        Uri data;
        Object objA;
        String lastPathSegment;
        if (intent == null || (data = intent.getData()) == null || !r.a(intent.getAction(), "android.intent.action.VIEW") || !x.w(qg.p.j("content", "file"), data.getScheme())) {
            return;
        }
        String type = intent.getType();
        if (type == null) {
            try {
                objA = getContentResolver().getType(data);
            } catch (Throwable th2) {
                objA = q.a(th2);
            }
            if (objA instanceof p.a) {
                objA = null;
            }
            type = (String) objA;
        }
        if (!r.a(type, "application/pdf") && ((lastPathSegment = data.getLastPathSegment()) == null || !t.i(lastPathSegment, ".pdf", true))) {
            setIncomingHtml(data);
            return;
        }
        String strDisplayName = displayName(data);
        if (strDisplayName == null) {
            strDisplayName = getString(R.string.pdf_source);
            r.d(strDisplayName, "getString(...)");
        }
        String str = strDisplayName;
        PdfPreviewActivity.a.c(this, data, str, new v1(str, 4095), "external", 0L, false);
        intent.setData(null);
    }

    private final void checkRouteIntent(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra(EXTRA_OPEN_ROUTE)) == null) {
            return;
        }
        setPendingRoute(stringExtra);
        intent.removeExtra(EXTRA_OPEN_ROUTE);
    }

    private final String displayName(Uri uri) {
        Object objA;
        if (!r.a(uri.getScheme(), "content")) {
            return uri.getLastPathSegment();
        }
        try {
            Cursor cursorQuery = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    objA = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                    cursorQuery.close();
                } finally {
                }
            } else {
                objA = null;
            }
        } catch (Throwable th2) {
            objA = q.a(th2);
        }
        return (String) (objA instanceof p.a ? null : objA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final h8.a getBackgroundAi() {
        return (h8.a) this.backgroundAi$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getDebugIntentRoute() {
        return (String) this.debugIntentRoute$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Uri getIncomingHtml() {
        return (Uri) this.incomingHtml$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getPendingRoute() {
        return (String) this.pendingRoute$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowLaunchPremium() {
        return ((Boolean) this.showLaunchPremium$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 jankMonitor$lambda$0(MainActivity mainActivity) {
        ph.h.c(u.a(mainActivity), null, null, mainActivity.new b(null), 3);
        Toast.makeText(mainActivity, R.string.animations_auto_off_toast, 0).show();
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundAi(h8.a aVar) {
        this.backgroundAi$delegate.setValue(aVar);
    }

    private final void setDebugIntentRoute(String str) {
        this.debugIntentRoute$delegate.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIncomingHtml(Uri uri) {
        this.incomingHtml$delegate.setValue(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPendingRoute(String str) {
        this.pendingRoute$delegate.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowLaunchPremium(boolean z10) {
        this.showLaunchPremium$delegate.setValue(Boolean.valueOf(z10));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        r.e(newBase, "newBase");
        this.activityServiceContext = newBase;
        HtmlToApkApplication.Companion.getClass();
        String str = HtmlToApkApplication.currentLanguage;
        d0.f16789a.getClass();
        super.attachBaseContext(d0.i(newBase, str));
    }

    public final cg.a<h8.a> getAiBackgroundTurns() {
        cg.a<h8.a> aVar = this.aiBackgroundTurns;
        if (aVar != null) {
            return aVar;
        }
        r.h("aiBackgroundTurns");
        throw null;
    }

    public final i8.j getBillingManager() {
        i8.j jVar = this.billingManager;
        if (jVar != null) {
            return jVar;
        }
        r.h("billingManager");
        throw null;
    }

    public final cg.a<j8.a> getCreditsRepository() {
        cg.a<j8.a> aVar = this.creditsRepository;
        if (aVar != null) {
            return aVar;
        }
        r.h("creditsRepository");
        throw null;
    }

    public final m1 getSettingsRepository() {
        m1 m1Var = this.settingsRepository;
        if (m1Var != null) {
            return m1Var;
        }
        r.h("settingsRepository");
        throw null;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        Context context;
        r.e(name, "name");
        return (!name.equals("print") || (context = this.activityServiceContext) == null) ? super.getSystemService(name) : context.getSystemService(name);
    }

    @Override // b.k, android.app.Activity
    @pg.d
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 1204 || i11 == -1) {
            return;
        }
        Log.d("MainActivity", "User dismissed flexible in-app update");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [l9.c] */
    @Override // f8.h, b.k, o3.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        cc.v vVar;
        super.onCreate(bundle);
        setShowLaunchPremium(bundle != null ? bundle.getBoolean("showLaunchPremium") : false);
        checkDebugIntent(getIntent());
        if (bundle == null) {
            checkHtmlIntent(getIntent());
            checkRouteIntent(getIntent());
        }
        k9.g.a(this);
        getOnBackPressedDispatcher().a(this, new c());
        ph.h.c(u.a(this), null, null, new d(null), 3);
        ph.h.c(u.a(this), null, null, new e(null), 3);
        ph.h.c(u.a(this), null, null, new f(null), 3);
        if (bundle == null) {
            m1 settingsRepository = getSettingsRepository();
            r.e(settingsRepository, "settingsRepository");
            synchronized (cc.d.class) {
                try {
                    if (cc.d.f5361b == null) {
                        Context applicationContext = getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = this;
                        }
                        cc.d.f5361b = new cc.v(new cc.i(applicationContext));
                    }
                    vVar = cc.d.f5361b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final cc.b bVar = (cc.b) vVar.f5393a.zza();
            r.d(bVar, "create(...)");
            ?? r12 = new gc.a() { // from class: l9.c
                @Override // gc.a
                public final void a(ec.b bVar2) {
                    if (bVar2.c() == 11) {
                        uc ucVar = p2.f22362a;
                        MainActivity mainActivity = this.f16785a;
                        String string = mainActivity.getString(R.string.update_downloaded_snack);
                        kotlin.jvm.internal.r.d(string, "getString(...)");
                        p2.a(string, mainActivity.getString(R.string.update_btn_restart), new c3(bVar, 1));
                    }
                }
            };
            bVar.c(r12);
            getLifecycle().a(new l9.f(bVar, this, r12));
            wh.c cVar = z0.f21632a;
            ph.h.c(j0.a(uh.o.f29764a), null, null, new l9.j(settingsRepository, bVar, this, null), 3);
            ph.h.c(u.a(this), null, null, new g(null), 3);
        }
        c.g.a(this, new f1.b(-2102726244, true, new h()));
    }

    @Override // b.k, android.app.Activity
    public void onNewIntent(Intent intent) {
        r.e(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        checkDebugIntent(intent);
        checkHtmlIntent(intent);
        checkRouteIntent(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        this.jankMonitor.b();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        getBillingManager().g();
        if (this.watchForJank) {
            this.jankMonitor.a();
        }
    }

    @Override // b.k, o3.d, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        r.e(outState, "outState");
        outState.putBoolean("showLaunchPremium", getShowLaunchPremium());
        super.onSaveInstanceState(outState);
    }

    public final void setAiBackgroundTurns(cg.a<h8.a> aVar) {
        r.e(aVar, "<set-?>");
        this.aiBackgroundTurns = aVar;
    }

    public final void setBillingManager(i8.j jVar) {
        r.e(jVar, "<set-?>");
        this.billingManager = jVar;
    }

    public final void setCreditsRepository(cg.a<j8.a> aVar) {
        r.e(aVar, "<set-?>");
        this.creditsRepository = aVar;
    }

    public final void setSettingsRepository(m1 m1Var) {
        r.e(m1Var, "<set-?>");
        this.settingsRepository = m1Var;
    }
}
