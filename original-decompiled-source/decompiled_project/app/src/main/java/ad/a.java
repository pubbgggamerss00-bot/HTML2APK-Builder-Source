package ad;

import ad.e;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    public final e f398a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.a f399b;

    /* renamed from: ad.a$a, reason: collision with other inner class name */
    public static class C0005a {

        /* renamed from: a, reason: collision with root package name */
        public e f400a;

        /* renamed from: b, reason: collision with root package name */
        public hd.b f401b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f402c;

        public final a a() throws GeneralSecurityException {
            hd.b bVar;
            hd.a aVarA;
            e eVar = this.f400a;
            if (eVar == null || (bVar = this.f401b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (eVar.f404a != bVar.f12989a.f12988a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            e.b bVar2 = eVar.f406c;
            e.b bVar3 = e.b.f413e;
            if (bVar2 != bVar3 && this.f402c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (bVar2 == bVar3 && this.f402c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (bVar2 == bVar3) {
                aVarA = hd.a.a(new byte[0]);
            } else if (bVar2 == e.b.f412d || bVar2 == e.b.f411c) {
                aVarA = hd.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f402c.intValue()).array());
            } else {
                if (bVar2 != e.b.f410b) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f400a.f406c);
                }
                aVarA = hd.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f402c.intValue()).array());
            }
            return new a(this.f400a, aVarA);
        }
    }

    public a(e eVar, hd.a aVar) {
        this.f398a = eVar;
        this.f399b = aVar;
    }

    @Override // ad.q
    public final hd.a I() {
        return this.f399b;
    }

    @Override // ad.q
    public final r J() {
        return this.f398a;
    }
}
