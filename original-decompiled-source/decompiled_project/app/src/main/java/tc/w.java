package tc;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import tc.s;
import tc.v;
import zc.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements b.a {
    @Override // zc.b.a
    public final ci.a a(zc.s sVar) throws GeneralSecurityException {
        if (!sVar.f35031a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            ed.t tVarB = ed.t.B(sVar.f35033c, com.google.crypto.tink.shaded.protobuf.o.a());
            if (tVarB.z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            v.a aVar = v.a.f28687d;
            int size = tVarB.y().size();
            if (size != 16 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
            }
            ed.o0 o0Var = sVar.f35035e;
            int iOrdinal = o0Var.ordinal();
            if (iOrdinal == 1) {
                aVar = v.a.f28685b;
            } else if (iOrdinal == 2) {
                aVar = v.a.f28686c;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o0Var.getNumber());
                }
                aVar = v.a.f28686c;
            }
            v vVar = new v(size, aVar);
            s.a aVar2 = new s.a();
            aVar2.f28681b = null;
            aVar2.f28682c = null;
            aVar2.f28680a = vVar;
            aVar2.f28681b = new hd.b(hd.a.a(tVarB.y().k()));
            aVar2.f28682c = sVar.f35036f;
            return aVar2.a();
        } catch (com.google.crypto.tink.shaded.protobuf.z unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }
}
