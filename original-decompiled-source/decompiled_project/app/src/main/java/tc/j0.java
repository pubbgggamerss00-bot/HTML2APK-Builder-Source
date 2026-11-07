package tc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import tc.m0;

/* loaded from: classes2.dex */
public final class j0 extends b {
    public static j0 I(m0.a aVar, hd.b bVar, Integer num) throws GeneralSecurityException {
        hd.a aVar2 = bVar.f12989a;
        m0.a aVar3 = m0.a.f28662d;
        if (aVar != aVar3 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar3 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar2.f12988a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar2.f12988a.length);
        }
        if (aVar == aVar3) {
            hd.a.a(new byte[0]);
        } else if (aVar == m0.a.f28661c) {
            hd.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (aVar != m0.a.f28660b) {
                throw new IllegalStateException("Unknown Variant: " + aVar);
            }
            hd.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new j0();
    }
}
