package n8;

import android.content.SharedPreferences;
import android.os.Build;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import v4.e;

/* loaded from: classes.dex */
public final class m1 {
    public static final e.a<Boolean> B;
    public static final e.a<Integer> C;
    public static final e.a<Boolean> D;
    public static final e.a<Long> E;
    public static final e.a<Boolean> F;
    public static final e.a<Integer> G;
    public static final e.a<Integer> H;
    public static final e.a<Boolean> I;
    public static final e.a<Integer> J;
    public static final e.a<Boolean> K;
    public static final e.a<Boolean> L;
    public static final e.a<Boolean> M;
    public static final e.a<String> N;
    public static final e.a<Boolean> O;
    public static final e.a<Boolean> P;
    public static final e.a<Boolean> Q;
    public static final e.a<Boolean> R;
    public static final e.a<Boolean> S;
    public static final e.a<Boolean> T;
    public static final boolean U;

    /* renamed from: a, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f18525a;

    /* renamed from: b, reason: collision with root package name */
    public final v4.c f18526b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f18527c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f18528d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f18529e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f18530f;

    /* renamed from: g, reason: collision with root package name */
    public final h1 f18531g;

    /* renamed from: h, reason: collision with root package name */
    public final i1 f18532h;

    /* renamed from: i, reason: collision with root package name */
    public final j1 f18533i;

    /* renamed from: j, reason: collision with root package name */
    public final k1 f18534j;

    /* renamed from: k, reason: collision with root package name */
    public final t0 f18535k;

    /* renamed from: l, reason: collision with root package name */
    public final u0 f18536l;

    /* renamed from: m, reason: collision with root package name */
    public final v0 f18537m;

    /* renamed from: n, reason: collision with root package name */
    public final w0 f18538n;

    /* renamed from: o, reason: collision with root package name */
    public final x0 f18539o;

    /* renamed from: p, reason: collision with root package name */
    public final y0 f18540p;

    /* renamed from: q, reason: collision with root package name */
    public final z0 f18541q;

    /* renamed from: r, reason: collision with root package name */
    public final a1 f18542r;

    /* renamed from: s, reason: collision with root package name */
    public final b1 f18543s;

    /* renamed from: t, reason: collision with root package name */
    public final d1 f18544t;

    /* renamed from: u, reason: collision with root package name */
    public final e1 f18545u;

    /* renamed from: v, reason: collision with root package name */
    public static final e.a<String> f18520v = new e.a<>("project_order");

    /* renamed from: w, reason: collision with root package name */
    public static final e.a<String> f18521w = new e.a<>("language");

    /* renamed from: x, reason: collision with root package name */
    public static final e.a<String> f18522x = new e.a<>("app_theme");

    /* renamed from: y, reason: collision with root package name */
    public static final e.a<Boolean> f18523y = new e.a<>("is_premium");

    /* renamed from: z, reason: collision with root package name */
    public static final e.a<String> f18524z = new e.a<>("premium_token");
    public static final e.a<Boolean> A = new e.a<>("onboarding_completed");

    static {
        new e.a("terms_accepted");
        B = new e.a<>("third_launch_pro_shown");
        C = new e.a<>("app_launch_count");
        D = new e.a<>("offer_accepted");
        E = new e.a<>("offer_last_dismissed_at");
        F = new e.a<>("rating_completed");
        G = new e.a<>("rating_target_launch_count");
        H = new e.a<>("rating_interval");
        I = new e.a<>("is_subscription_active");
        J = new e.a<>("update_last_prompted_launch_count");
        K = new e.a<>("has_dismissed_create_project_hint");
        L = new e.a<>("pro_watermark_reset_v1");
        M = new e.a<>("has_seen_folder_intro");
        N = new e.a<>("primary_use_case");
        O = new e.a<>("show_kind_filters");
        P = new e.a<>("sideload_banner_dismissed");
        Q = new e.a<>("sideload_banner_haptic_done");
        R = new e.a<>("rich_animations");
        S = new e.a<>("rich_animations_auto_off_v2");
        T = new e.a<>("rich_animations_auto_off");
        U = Build.VERSION.SDK_INT >= 30;
    }

    public m1(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication) {
        this.f18525a = hilt_HtmlToApkApplication;
        v4.c cVarA = n1.a(hilt_HtmlToApkApplication);
        this.f18526b = cVarA;
        s4.i<v4.e> iVar = cVarA.f30610a;
        this.f18527c = new s0(iVar.getData());
        this.f18528d = new c1(iVar.getData());
        this.f18529e = new f1(iVar.getData());
        this.f18530f = new g1(iVar.getData(), this);
        this.f18531g = new h1(iVar.getData());
        iVar.getData();
        this.f18532h = new i1(iVar.getData());
        this.f18533i = new j1(iVar.getData());
        this.f18534j = new k1(iVar.getData());
        this.f18535k = new t0(iVar.getData());
        this.f18536l = new u0(iVar.getData());
        this.f18537m = new v0(iVar.getData());
        this.f18538n = new w0(iVar.getData());
        this.f18539o = new x0(iVar.getData());
        this.f18540p = new y0(iVar.getData());
        iVar.getData();
        this.f18541q = new z0(iVar.getData());
        this.f18542r = new a1(iVar.getData());
        this.f18543s = new b1(iVar.getData());
        this.f18544t = new d1(iVar.getData());
        this.f18545u = new e1(iVar.getData());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vg.c cVar) {
        t tVar;
        m1 m1Var;
        kotlin.jvm.internal.b0 b0Var;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f18592d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                tVar.f18592d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                tVar = new t(this, cVar);
            }
        }
        Object objF = tVar.f18590b;
        ug.a aVar = ug.a.f29706a;
        int i11 = tVar.f18592d;
        if (i11 == 0) {
            pg.q.b(objF);
            tVar.f18589a = this;
            tVar.f18592d = 1;
            objF = gg.a.f(this.f18530f, tVar);
            if (objF != aVar) {
                m1Var = this;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = (kotlin.jvm.internal.b0) tVar.f18589a;
            pg.q.b(objF);
            return Boolean.valueOf(b0Var.f16318a);
        }
        m1Var = (m1) tVar.f18589a;
        pg.q.b(objF);
        if (((Boolean) objF).booleanValue()) {
            return Boolean.FALSE;
        }
        kotlin.jvm.internal.b0 b0Var2 = new kotlin.jvm.internal.b0();
        v4.c cVar2 = m1Var.f18526b;
        u uVar = new u(b0Var2, null);
        tVar.f18589a = b0Var2;
        tVar.f18592d = 2;
        if (v4.g.a(cVar2, uVar, tVar) != aVar) {
            b0Var = b0Var2;
            return Boolean.valueOf(b0Var.f16318a);
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vg.c cVar) {
        x xVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i10 = xVar.f18619c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                xVar.f18619c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                xVar = new x(this, cVar);
            }
        }
        Object objF = xVar.f18617a;
        ug.a aVar = ug.a.f29706a;
        int i11 = xVar.f18619c;
        if (i11 == 0) {
            pg.q.b(objF);
            sh.f<v4.e> data = this.f18526b.f30610a.getData();
            xVar.f18619c = 1;
            objF = gg.a.f(data, xVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objF);
        }
        Boolean bool = (Boolean) ((v4.e) objF).b(L);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, vg.c cVar) {
        b0 b0Var;
        m1 m1Var;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i10 = b0Var.f18386e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                b0Var.f18386e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                b0Var = new b0(this, cVar);
            }
        }
        Object obj = b0Var.f18384c;
        ug.a aVar = ug.a.f29706a;
        int i11 = b0Var.f18386e;
        if (i11 == 0) {
            pg.q.b(obj);
            c0 c0Var = new c0(str, null);
            b0Var.f18382a = this;
            b0Var.f18383b = str;
            b0Var.f18386e = 1;
            if (v4.g.a(this.f18526b, c0Var, b0Var) == aVar) {
                return aVar;
            }
            m1Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = b0Var.f18383b;
            m1Var = b0Var.f18382a;
            pg.q.b(obj);
        }
        l9.d0 d0Var = l9.d0.f16789a;
        Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = m1Var.f18525a;
        d0Var.getClass();
        SharedPreferences.Editor editorEdit = hilt_HtmlToApkApplication.getSharedPreferences("locale_boot", 0).edit();
        if (str == null) {
            editorEdit.remove("language");
        } else {
            editorEdit.putString("language", str);
        }
        editorEdit.apply();
        return pg.f0.f21461a;
    }

    public final Object d(boolean z10, vg.i iVar) {
        Object objA = v4.g.a(this.f18526b, new g0(z10, this, null), iVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }

    public final Object e(boolean z10, vg.i iVar) {
        Object objA = v4.g.a(this.f18526b, new q0(z10, null), iVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }
}
