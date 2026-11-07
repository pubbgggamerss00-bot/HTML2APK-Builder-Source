package tc;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import tc.m;
import tc.p;
import zc.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements b.a {
    @Override // zc.b.a
    public final ci.a a(zc.s sVar) throws GeneralSecurityException {
        if (!sVar.f35031a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            ed.r rVarB = ed.r.B(sVar.f35033c, com.google.crypto.tink.shaded.protobuf.o.a());
            if (rVarB.z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            p.a aVar = p.a.f28674d;
            int size = rVarB.y().size();
            if (size != 16 && size != 24 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
            }
            ed.o0 o0Var = sVar.f35035e;
            int iOrdinal = o0Var.ordinal();
            if (iOrdinal == 1) {
                aVar = p.a.f28672b;
            } else if (iOrdinal == 2) {
                aVar = p.a.f28673c;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o0Var.getNumber());
                }
                aVar = p.a.f28673c;
            }
            p pVar = new p(size, 12, 16, aVar);
            m.a aVar2 = new m.a();
            aVar2.f28658b = null;
            aVar2.f28659c = null;
            aVar2.f28657a = pVar;
            aVar2.f28658b = new hd.b(hd.a.a(rVarB.y().k()));
            aVar2.f28659c = sVar.f35036f;
            return aVar2.a();
        } catch (com.google.crypto.tink.shaded.protobuf.z unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }
}
