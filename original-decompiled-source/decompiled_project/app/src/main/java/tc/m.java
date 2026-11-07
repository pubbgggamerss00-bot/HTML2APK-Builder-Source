package tc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import tc.p;

/* loaded from: classes2.dex */
public final class m extends b {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public p f28657a;

        /* renamed from: b, reason: collision with root package name */
        public hd.b f28658b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f28659c;

        public final m a() throws GeneralSecurityException {
            hd.b bVar;
            p pVar = this.f28657a;
            if (pVar == null || (bVar = this.f28658b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (pVar.f28668a != bVar.f12989a.f12988a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            p.a aVar = pVar.f28671d;
            p.a aVar2 = p.a.f28674d;
            if (aVar != aVar2 && this.f28659c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (aVar == aVar2 && this.f28659c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (aVar == aVar2) {
                hd.a.a(new byte[0]);
            } else if (aVar == p.a.f28673c) {
                hd.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f28659c.intValue()).array());
            } else {
                if (aVar != p.a.f28672b) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f28657a.f28671d);
                }
                hd.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f28659c.intValue()).array());
            }
            return new m();
        }
    }
}
