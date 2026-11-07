package tc;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import tc.g;
import tc.j;
import zc.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements b.a {
    @Override // zc.b.a
    public final ci.a a(zc.s sVar) throws GeneralSecurityException {
        if (!sVar.f35031a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            ed.l lVarD = ed.l.D(sVar.f35033c, com.google.crypto.tink.shaded.protobuf.o.a());
            if (lVarD.B() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            j.a aVar = j.a.f28651d;
            int size = lVarD.z().size();
            if (size != 16 && size != 24 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
            }
            int iY = lVarD.A().y();
            if (iY != 12 && iY != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iY)));
            }
            ed.o0 o0Var = sVar.f35035e;
            int iOrdinal = o0Var.ordinal();
            if (iOrdinal == 1) {
                aVar = j.a.f28649b;
            } else if (iOrdinal == 2) {
                aVar = j.a.f28650c;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o0Var.getNumber());
                }
                aVar = j.a.f28650c;
            }
            j jVar = new j(size, iY, 16, aVar);
            g.a aVar2 = new g.a();
            aVar2.f28640b = null;
            aVar2.f28641c = null;
            aVar2.f28639a = jVar;
            aVar2.f28640b = new hd.b(hd.a.a(lVarD.z().k()));
            aVar2.f28641c = sVar.f35036f;
            return aVar2.a();
        } catch (com.google.crypto.tink.shaded.protobuf.z unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }
}
