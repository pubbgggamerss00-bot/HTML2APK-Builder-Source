package tc;

import java.security.GeneralSecurityException;
import tc.b0;
import zc.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements b.a {
    @Override // zc.b.a
    public final ci.a a(zc.s sVar) throws GeneralSecurityException {
        b0.a aVar;
        if (!sVar.f35031a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            ed.x xVarB = ed.x.B(sVar.f35033c, com.google.crypto.tink.shaded.protobuf.o.a());
            if (xVarB.z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ed.o0 o0Var = sVar.f35035e;
            int iOrdinal = o0Var.ordinal();
            if (iOrdinal == 1) {
                aVar = b0.a.f28626b;
            } else if (iOrdinal == 2) {
                aVar = b0.a.f28627c;
            } else if (iOrdinal == 3) {
                aVar = b0.a.f28628d;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o0Var.getNumber());
                }
                aVar = b0.a.f28627c;
            }
            return y.I(aVar, new hd.b(hd.a.a(xVarB.y().k())), sVar.f35036f);
        } catch (com.google.crypto.tink.shaded.protobuf.z unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }
}
