package ad;

import ad.m;
import ed.a0;
import ed.o0;
import java.security.GeneralSecurityException;
import zc.w;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final zc.m f445a;

    /* renamed from: b, reason: collision with root package name */
    public static final zc.k f446b;

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f447c;

    /* renamed from: d, reason: collision with root package name */
    public static final zc.a f448d;

    static {
        hd.a aVarB = w.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f445a = new zc.m(m.class);
        f446b = new zc.k(aVarB);
        f447c = new zc.c(j.class);
        f448d = new zc.a(aVarB, new n());
    }

    public static m.b a(a0 a0Var) throws GeneralSecurityException {
        int iOrdinal = a0Var.ordinal();
        if (iOrdinal == 1) {
            return m.b.f434b;
        }
        if (iOrdinal == 2) {
            return m.b.f437e;
        }
        if (iOrdinal == 3) {
            return m.b.f436d;
        }
        if (iOrdinal == 4) {
            return m.b.f438f;
        }
        if (iOrdinal == 5) {
            return m.b.f435c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + a0Var.getNumber());
    }

    public static m.c b(o0 o0Var) throws GeneralSecurityException {
        int iOrdinal = o0Var.ordinal();
        if (iOrdinal == 1) {
            return m.c.f440b;
        }
        if (iOrdinal == 2) {
            return m.c.f442d;
        }
        if (iOrdinal == 3) {
            return m.c.f443e;
        }
        if (iOrdinal == 4) {
            return m.c.f441c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o0Var.getNumber());
    }
}
