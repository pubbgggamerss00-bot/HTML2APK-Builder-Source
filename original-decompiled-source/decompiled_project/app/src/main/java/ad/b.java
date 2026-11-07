package ad;

import java.security.GeneralSecurityException;
import wc.a;
import zc.p;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements p.a {
    public static String b(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    @Override // zc.p.a
    public Object a(ci.a aVar) throws GeneralSecurityException {
        bd.a aVar2 = new bd.a();
        if (a.EnumC0318a.f31490a.a()) {
            return aVar2;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
