package tc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import tc.j;

/* loaded from: classes2.dex */
public final class g extends b {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public j f28639a;

        /* renamed from: b, reason: collision with root package name */
        public hd.b f28640b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f28641c;

        public final g a() throws GeneralSecurityException {
            hd.b bVar;
            j jVar = this.f28639a;
            if (jVar == null || (bVar = this.f28640b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (jVar.f28645a != bVar.f12989a.f12988a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            j.a aVar = jVar.f28648d;
            j.a aVar2 = j.a.f28651d;
            if (aVar != aVar2 && this.f28641c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (aVar == aVar2 && this.f28641c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (aVar == aVar2) {
                hd.a.a(new byte[0]);
            } else if (aVar == j.a.f28650c) {
                hd.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f28641c.intValue()).array());
            } else {
                if (aVar != j.a.f28649b) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f28639a.f28648d);
                }
                hd.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f28641c.intValue()).array());
            }
            return new g();
        }
    }
}
