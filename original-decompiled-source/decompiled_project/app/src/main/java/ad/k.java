package ad;

import java.security.GeneralSecurityException;
import wc.a;
import zc.p;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements p.a {
    public static int b(int i10, int i11, int i12, int i13) {
        return (i10 * i11) + i12 + i13;
    }

    @Override // zc.p.a
    public Object a(ci.a aVar) throws GeneralSecurityException {
        bd.b bVar = new bd.b();
        if (a.EnumC0318a.f31491b.a()) {
            return bVar;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
