package ad;

import ad.m;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final m f420a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.a f421b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public m f422a;

        /* renamed from: b, reason: collision with root package name */
        public hd.b f423b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f424c;

        public final j a() throws GeneralSecurityException {
            hd.b bVar;
            hd.a aVarA;
            m mVar = this.f422a;
            if (mVar == null || (bVar = this.f423b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (mVar.f426a != bVar.f12989a.f12988a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            m.c cVar = mVar.f428c;
            m.c cVar2 = m.c.f443e;
            if (cVar != cVar2 && this.f424c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (cVar == cVar2 && this.f424c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (cVar == cVar2) {
                aVarA = hd.a.a(new byte[0]);
            } else if (cVar == m.c.f442d || cVar == m.c.f441c) {
                aVarA = hd.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f424c.intValue()).array());
            } else {
                if (cVar != m.c.f440b) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f422a.f428c);
                }
                aVarA = hd.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f424c.intValue()).array());
            }
            return new j(this.f422a, aVarA);
        }
    }

    public j(m mVar, hd.a aVar) {
        this.f420a = mVar;
        this.f421b = aVar;
    }

    @Override // ad.q
    public final hd.a I() {
        return this.f421b;
    }

    @Override // ad.q
    public final r J() {
        return this.f420a;
    }
}
