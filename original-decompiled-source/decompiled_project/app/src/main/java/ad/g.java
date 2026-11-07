package ad;

import ad.e;
import ed.o0;
import java.security.GeneralSecurityException;
import zc.w;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final zc.m f415a;

    /* renamed from: b, reason: collision with root package name */
    public static final zc.k f416b;

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f417c;

    /* renamed from: d, reason: collision with root package name */
    public static final zc.a f418d;

    static {
        hd.a aVarB = w.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f415a = new zc.m(e.class);
        f416b = new zc.k(aVarB);
        f417c = new zc.c(a.class);
        f418d = new zc.a(aVarB, new f());
    }

    public static e.b a(o0 o0Var) throws GeneralSecurityException {
        int iOrdinal = o0Var.ordinal();
        if (iOrdinal == 1) {
            return e.b.f410b;
        }
        if (iOrdinal == 2) {
            return e.b.f412d;
        }
        if (iOrdinal == 3) {
            return e.b.f413e;
        }
        if (iOrdinal == 4) {
            return e.b.f411c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o0Var.getNumber());
    }
}
