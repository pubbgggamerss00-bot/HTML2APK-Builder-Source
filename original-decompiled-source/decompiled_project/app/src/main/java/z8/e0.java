package z8;

import androidx.lifecycle.w0;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import java.util.List;
import n8.h0;
import n8.m1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class e0 extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public final m1 f34803b;

    /* renamed from: c, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f34804c;

    public e0(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, m1 settingsRepository) {
        kotlin.jvm.internal.r.e(settingsRepository, "settingsRepository");
        this.f34803b = settingsRepository;
        this.f34804c = hilt_HtmlToApkApplication;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r7 != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, boolean z10, vg.c cVar) {
        d0 d0Var;
        e0 e0Var;
        Object objA;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i10 = d0Var.f34799f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                d0Var.f34799f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                d0Var = new d0(this, cVar);
            }
        }
        Object obj = d0Var.f34797d;
        Object obj2 = ug.a.f29706a;
        int i11 = d0Var.f34799f;
        if (i11 == 0) {
            pg.q.b(obj);
            if (str != null) {
                d0Var.f34794a = this;
                d0Var.f34795b = str;
                d0Var.f34796c = z10;
                d0Var.f34799f = 1;
                Object objA2 = v4.g.a(this.f34803b.f18526b, new h0(str, null), d0Var);
                if (objA2 != obj2) {
                    objA2 = pg.f0.f21461a;
                }
                if (objA2 != obj2) {
                    e0Var = this;
                }
                return obj2;
            }
            e0Var = this;
            m1 m1Var = e0Var.f34803b;
            d0Var.f34794a = null;
            d0Var.f34795b = null;
            d0Var.f34799f = 2;
            objA = v4.g.a(m1Var.f18526b, new n8.f0(2, null), d0Var);
            if (objA != obj2) {
                objA = pg.f0.f21461a;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            z10 = d0Var.f34796c;
            str = d0Var.f34795b;
            e0Var = d0Var.f34794a;
            pg.q.b(obj);
        }
        if (z10) {
            List<String> list = com.basitce.htmltoapk.util.a.f5832a;
            com.basitce.htmltoapk.util.a.b(e0Var.f34804c, str);
        }
        m1 m1Var2 = e0Var.f34803b;
        d0Var.f34794a = null;
        d0Var.f34795b = null;
        d0Var.f34799f = 2;
        objA = v4.g.a(m1Var2.f18526b, new n8.f0(2, null), d0Var);
        if (objA != obj2) {
        }
    }
}
