package tc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import tc.b0;

/* loaded from: classes2.dex */
public final class y extends b {
    public static y I(b0.a aVar, hd.b bVar, Integer num) throws GeneralSecurityException {
        hd.a aVar2 = bVar.f12989a;
        b0.a aVar3 = b0.a.f28628d;
        if (aVar != aVar3 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar3 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar2.f12988a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar2.f12988a.length);
        }
        if (aVar == aVar3) {
            hd.a.a(new byte[0]);
        } else if (aVar == b0.a.f28627c) {
            hd.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (aVar != b0.a.f28626b) {
                throw new IllegalStateException("Unknown Variant: " + aVar);
            }
            hd.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new y();
    }
}
