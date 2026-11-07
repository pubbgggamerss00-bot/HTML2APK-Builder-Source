package tc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import tc.v;

/* loaded from: classes2.dex */
public final class s extends b {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public v f28680a;

        /* renamed from: b, reason: collision with root package name */
        public hd.b f28681b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f28682c;

        public final s a() throws GeneralSecurityException {
            hd.b bVar;
            v vVar = this.f28680a;
            if (vVar == null || (bVar = this.f28681b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.f28683a != bVar.f12989a.f12988a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            v.a aVar = vVar.f28684b;
            v.a aVar2 = v.a.f28687d;
            if (aVar != aVar2 && this.f28682c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (aVar == aVar2 && this.f28682c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (aVar == aVar2) {
                hd.a.a(new byte[0]);
            } else if (aVar == v.a.f28686c) {
                hd.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f28682c.intValue()).array());
            } else {
                if (aVar != v.a.f28685b) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f28680a.f28684b);
                }
                hd.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f28682c.intValue()).array());
            }
            return new s();
        }
    }
}
