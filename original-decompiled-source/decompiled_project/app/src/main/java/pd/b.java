package pd;

import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import qd.c0;
import qd.f0;
import qd.r;
import qd.s;
import qd.w0;

/* loaded from: classes2.dex */
public final class b {
    public static zzait a(qd.c cVar, String str) {
        if (s.class.isAssignableFrom(cVar.getClass())) {
            s sVar = (s) cVar;
            return new zzait(sVar.f22694a, sVar.f22695b, "google.com", null, null, null, str, null, null);
        }
        if (qd.e.class.isAssignableFrom(cVar.getClass())) {
            return new zzait(null, ((qd.e) cVar).f22670a, "facebook.com", null, null, null, str, null, null);
        }
        if (f0.class.isAssignableFrom(cVar.getClass())) {
            f0 f0Var = (f0) cVar;
            return new zzait(null, f0Var.f22675a, "twitter.com", null, f0Var.f22676b, null, str, null, null);
        }
        if (r.class.isAssignableFrom(cVar.getClass())) {
            return new zzait(null, ((r) cVar).f22693a, "github.com", null, null, null, str, null, null);
        }
        if (c0.class.isAssignableFrom(cVar.getClass())) {
            return new zzait(null, null, "playgames.google.com", null, null, ((c0) cVar).f22664a, str, null, null);
        }
        if (!w0.class.isAssignableFrom(cVar.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        w0 w0Var = (w0) cVar;
        zzait zzaitVar = w0Var.f22699d;
        return zzaitVar != null ? zzaitVar : new zzait(w0Var.f22697b, w0Var.f22698c, w0Var.f22696a, null, w0Var.f22701f, null, str, w0Var.f22700e, w0Var.f22702g);
    }
}
