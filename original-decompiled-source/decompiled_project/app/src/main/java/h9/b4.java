package h9;

import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class b4 extends androidx.lifecycle.w0 {

    /* renamed from: b, reason: collision with root package name */
    public final n8.m1 f12538b;

    /* renamed from: c, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f12539c;

    /* renamed from: d, reason: collision with root package name */
    public final n8.c1 f12540d;

    /* renamed from: e, reason: collision with root package name */
    public final n8.f1 f12541e;

    /* renamed from: f, reason: collision with root package name */
    public final n8.a1 f12542f;

    /* renamed from: g, reason: collision with root package name */
    public final sh.z0 f12543g;

    /* renamed from: h, reason: collision with root package name */
    public final sh.z0 f12544h;

    /* renamed from: i, reason: collision with root package name */
    public final sh.z0 f12545i;

    /* renamed from: j, reason: collision with root package name */
    public final sh.z0 f12546j;

    public b4(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, n8.m1 settingsRepository) {
        kotlin.jvm.internal.r.e(settingsRepository, "settingsRepository");
        this.f12538b = settingsRepository;
        this.f12539c = hilt_HtmlToApkApplication;
        this.f12540d = settingsRepository.f18528d;
        this.f12541e = settingsRepository.f18529e;
        this.f12542f = settingsRepository.f18542r;
        sh.z0 z0VarA = sh.a1.a(0L);
        this.f12543g = z0VarA;
        this.f12544h = z0VarA;
        sh.z0 z0VarA2 = sh.a1.a(null);
        this.f12545i = z0VarA2;
        this.f12546j = z0VarA2;
        l5.a aVarA = androidx.lifecycle.x0.a(this);
        wh.c cVar = ph.z0.f21632a;
        ph.h.c(aVarA, wh.b.f31563c, null, new x3(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, vg.c cVar) {
        z3 z3Var;
        b4 b4Var;
        if (cVar instanceof z3) {
            z3Var = (z3) cVar;
            int i10 = z3Var.f12924e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                z3Var.f12924e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                z3Var = new z3(this, cVar);
            }
        }
        Object obj = z3Var.f12922c;
        ug.a aVar = ug.a.f29706a;
        int i11 = z3Var.f12924e;
        if (i11 == 0) {
            pg.q.b(obj);
            z3Var.f12920a = this;
            z3Var.f12921b = str;
            z3Var.f12924e = 1;
            if (this.f12538b.c(str, z3Var) == aVar) {
                return aVar;
            }
            b4Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = z3Var.f12921b;
            b4Var = z3Var.f12920a;
            pg.q.b(obj);
        }
        b4Var.f12545i.setValue(str);
        return pg.f0.f21461a;
    }
}
