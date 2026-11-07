package ad;

import ad.a;
import ad.e;
import com.google.crypto.tink.shaded.protobuf.z;
import j2.y;
import java.security.GeneralSecurityException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import q1.b1;
import zc.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements b.a {
    public static ASN1EncodableVector b(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    public static void c(long j10, String str, StringBuilder sb) {
        sb.append((Object) b1.j(j10));
        sb.append(str);
    }

    @Override // zc.b.a
    public ci.a a(zc.s sVar) throws GeneralSecurityException {
        if (!sVar.f35031a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            ed.a aVarD = ed.a.D(sVar.f35033c, com.google.crypto.tink.shaded.protobuf.o.a());
            if (aVarD.B() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            e.a aVar = new e.a();
            aVar.f407a = null;
            aVar.f408b = null;
            aVar.f409c = e.b.f413e;
            aVar.b(aVarD.z().size());
            int iY = aVarD.A().y();
            if (iY < 10 || 16 < iY) {
                throw new GeneralSecurityException(y.a(iY, "Invalid tag size for AesCmacParameters: "));
            }
            aVar.f408b = Integer.valueOf(iY);
            aVar.f409c = g.a(sVar.f35035e);
            e eVarA = aVar.a();
            a.C0005a c0005a = new a.C0005a();
            c0005a.f401b = null;
            c0005a.f402c = null;
            c0005a.f400a = eVarA;
            c0005a.f401b = new hd.b(hd.a.a(aVarD.z().k()));
            c0005a.f402c = sVar.f35036f;
            return c0005a.a();
        } catch (z | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }
}
