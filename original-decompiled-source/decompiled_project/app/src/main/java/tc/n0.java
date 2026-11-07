package tc;

import ed.q0;
import java.security.GeneralSecurityException;
import tc.m0;
import zc.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class n0 implements b.a {
    @Override // zc.b.a
    public final ci.a a(zc.s sVar) throws GeneralSecurityException {
        m0.a aVar;
        if (!sVar.f35031a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            q0 q0VarB = q0.B(sVar.f35033c, com.google.crypto.tink.shaded.protobuf.o.a());
            if (q0VarB.z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ed.o0 o0Var = sVar.f35035e;
            int iOrdinal = o0Var.ordinal();
            if (iOrdinal == 1) {
                aVar = m0.a.f28660b;
            } else if (iOrdinal == 2) {
                aVar = m0.a.f28661c;
            } else if (iOrdinal == 3) {
                aVar = m0.a.f28662d;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o0Var.getNumber());
                }
                aVar = m0.a.f28661c;
            }
            return j0.I(aVar, new hd.b(hd.a.a(q0VarB.y().k())), sVar.f35036f);
        } catch (com.google.crypto.tink.shaded.protobuf.z unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }
}
