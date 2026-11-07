package tc;

import cd.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import sc.o;
import zc.g;

/* loaded from: classes2.dex */
public final class c implements sc.p<sc.a, sc.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f28630a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final c f28631b = new c();

    public static class a implements sc.a {

        /* renamed from: a, reason: collision with root package name */
        public final sc.o<sc.a> f28632a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f28633b;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f28634c;

        public a(sc.o oVar) throws GeneralSecurityException {
            this.f28632a = oVar;
            boolean zIsEmpty = oVar.f24817c.f5395a.isEmpty();
            g.a aVar = zc.g.f35009a;
            if (zIsEmpty) {
                this.f28633b = aVar;
                this.f28634c = aVar;
                return;
            }
            cd.b bVar = zc.h.f35010b.f35012a.get();
            bVar = bVar == null ? zc.h.f35011c : bVar;
            zc.g.a(oVar);
            bVar.getClass();
            this.f28633b = aVar;
            this.f28634c = aVar;
        }

        @Override // sc.a
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            b.a aVar = this.f28633b;
            sc.o<sc.a> oVar = this.f28632a;
            try {
                o.b<sc.a> bVar = oVar.f24816b;
                o.b<sc.a> bVar2 = oVar.f24816b;
                byte[] bArr3 = bVar.f24824c;
                byte[] bArrA = gd.h.a(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), bVar2.f24823b.a(bArr, bArr2));
                int i10 = bVar2.f24827f;
                int length = bArr.length;
                aVar.getClass();
                return bArrA;
            } catch (GeneralSecurityException e10) {
                aVar.getClass();
                throw e10;
            }
        }

        @Override // sc.a
        public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            sc.o<sc.a> oVar = this.f28632a;
            b.a aVar = this.f28634c;
            if (length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<o.b<sc.a>> it = oVar.a(bArrCopyOf).iterator();
                while (it.hasNext()) {
                    try {
                        byte[] bArrDecrypt = it.next().f24823b.decrypt(bArrCopyOfRange, bArr2);
                        aVar.getClass();
                        return bArrDecrypt;
                    } catch (GeneralSecurityException e10) {
                        c.f28630a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            Iterator<o.b<sc.a>> it2 = oVar.a(sc.b.f24795a).iterator();
            while (it2.hasNext()) {
                try {
                    byte[] bArrDecrypt2 = it2.next().f24823b.decrypt(bArr, bArr2);
                    aVar.getClass();
                    return bArrDecrypt2;
                } catch (GeneralSecurityException unused) {
                }
            }
            aVar.getClass();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    @Override // sc.p
    public final Class<sc.a> a() {
        return sc.a.class;
    }

    @Override // sc.p
    public final sc.a b(sc.o<sc.a> oVar) throws GeneralSecurityException {
        return new a(oVar);
    }

    @Override // sc.p
    public final Class<sc.a> c() {
        return sc.a.class;
    }
}
