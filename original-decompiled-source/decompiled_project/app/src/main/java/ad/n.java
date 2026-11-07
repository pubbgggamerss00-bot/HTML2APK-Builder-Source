package ad;

import ad.j;
import ad.m;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.b0;
import java.security.GeneralSecurityException;
import zc.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements b.a {
    @Override // zc.b.a
    public final ci.a a(zc.s sVar) throws GeneralSecurityException {
        if (!sVar.f35031a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            b0 b0VarE = b0.E(sVar.f35033c, com.google.crypto.tink.shaded.protobuf.o.a());
            if (b0VarE.C() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            m.a aVar = new m.a();
            aVar.f430a = null;
            aVar.f431b = null;
            aVar.f432c = null;
            aVar.f433d = m.c.f443e;
            aVar.f430a = Integer.valueOf(b0VarE.A().size());
            aVar.f431b = Integer.valueOf(b0VarE.B().A());
            aVar.f432c = o.a(b0VarE.B().z());
            aVar.f433d = o.b(sVar.f35035e);
            m mVarA = aVar.a();
            j.a aVar2 = new j.a();
            aVar2.f423b = null;
            aVar2.f424c = null;
            aVar2.f422a = mVarA;
            aVar2.f423b = new hd.b(hd.a.a(b0VarE.A().k()));
            aVar2.f424c = sVar.f35036f;
            return aVar2.a();
        } catch (z | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }
}
