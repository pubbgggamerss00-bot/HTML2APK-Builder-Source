package xc;

import cd.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import sc.o;
import sc.p;
import zc.g;
import zc.h;

/* loaded from: classes2.dex */
public final class d implements p<sc.c, sc.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f33540a = Logger.getLogger(d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final d f33541b = new d();

    public static class a implements sc.c {

        /* renamed from: a, reason: collision with root package name */
        public final o<sc.c> f33542a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f33543b;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f33544c;

        public a(o<sc.c> oVar) throws GeneralSecurityException {
            this.f33542a = oVar;
            boolean zIsEmpty = oVar.f24817c.f5395a.isEmpty();
            g.a aVar = g.f35009a;
            if (zIsEmpty) {
                this.f33543b = aVar;
                this.f33544c = aVar;
                return;
            }
            cd.b bVar = h.f35010b.f35012a.get();
            bVar = bVar == null ? h.f35011c : bVar;
            g.a(oVar);
            bVar.getClass();
            this.f33543b = aVar;
            this.f33544c = aVar;
        }

        @Override // sc.c
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            b.a aVar = this.f33543b;
            o.b<sc.c> bVar = this.f33542a.f24816b;
            try {
                byte[] bArr3 = bVar.f24824c;
                byte[] bArrA = gd.h.a(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), bVar.f24823b.a(bArr, bArr2));
                int i10 = bVar.f24827f;
                aVar.getClass();
                return bArrA;
            } catch (GeneralSecurityException e10) {
                aVar.getClass();
                throw e10;
            }
        }

        @Override // sc.c
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            o<sc.c> oVar = this.f33542a;
            b.a aVar = this.f33544c;
            if (length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<o.b<sc.c>> it = oVar.a(bArrCopyOf).iterator();
                while (it.hasNext()) {
                    try {
                        byte[] bArrB = it.next().f24823b.b(bArrCopyOfRange, bArr2);
                        aVar.getClass();
                        return bArrB;
                    } catch (GeneralSecurityException e10) {
                        d.f33540a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            Iterator<o.b<sc.c>> it2 = oVar.a(sc.b.f24795a).iterator();
            while (it2.hasNext()) {
                try {
                    byte[] bArrB2 = it2.next().f24823b.b(bArr, bArr2);
                    aVar.getClass();
                    return bArrB2;
                } catch (GeneralSecurityException unused) {
                }
            }
            aVar.getClass();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    @Override // sc.p
    public final Class<sc.c> a() {
        return sc.c.class;
    }

    @Override // sc.p
    public final sc.c b(o<sc.c> oVar) throws GeneralSecurityException {
        return new a(oVar);
    }

    @Override // sc.p
    public final Class<sc.c> c() {
        return sc.c.class;
    }
}
