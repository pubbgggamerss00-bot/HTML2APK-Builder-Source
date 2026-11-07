package ad;

import cd.b;
import ed.o0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import sc.o;
import zc.g;

/* loaded from: classes2.dex */
public final class s implements sc.p<sc.n, sc.n> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f449a = Logger.getLogger(s.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f450b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final s f451c = new s();

    public static class a implements sc.n {

        /* renamed from: a, reason: collision with root package name */
        public final sc.o<sc.n> f452a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f453b;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f454c;

        public a(sc.o oVar) throws GeneralSecurityException {
            this.f452a = oVar;
            boolean zIsEmpty = oVar.f24817c.f5395a.isEmpty();
            g.a aVar = zc.g.f35009a;
            if (zIsEmpty) {
                this.f453b = aVar;
                this.f454c = aVar;
                return;
            }
            cd.b bVar = zc.h.f35010b.f35012a.get();
            bVar = bVar == null ? zc.h.f35011c : bVar;
            zc.g.a(oVar);
            bVar.getClass();
            this.f453b = aVar;
            this.f454c = aVar;
        }

        @Override // sc.n
        public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            b.a aVar = this.f454c;
            if (length <= 5) {
                aVar.getClass();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            sc.o<sc.n> oVar = this.f452a;
            for (o.b<sc.n> bVar : oVar.a(bArrCopyOf)) {
                try {
                    bVar.f24823b.a(bArrCopyOfRange, bVar.f24826e.equals(o0.LEGACY) ? gd.h.a(bArr2, s.f450b) : bArr2);
                    aVar.getClass();
                    return;
                } catch (GeneralSecurityException e10) {
                    s.f449a.info("tag prefix matches a key, but cannot verify: " + e10);
                }
            }
            Iterator<o.b<sc.n>> it = oVar.a(sc.b.f24795a).iterator();
            while (it.hasNext()) {
                try {
                    it.next().f24823b.a(bArr, bArr2);
                    aVar.getClass();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            aVar.getClass();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // sc.n
        public final byte[] b(byte[] bArr) throws GeneralSecurityException {
            b.a aVar = this.f453b;
            sc.o<sc.n> oVar = this.f452a;
            o.b<sc.n> bVar = oVar.f24816b;
            o.b<sc.n> bVar2 = oVar.f24816b;
            if (bVar.f24826e.equals(o0.LEGACY)) {
                bArr = gd.h.a(bArr, s.f450b);
            }
            try {
                byte[] bArr2 = bVar2.f24824c;
                byte[] bArrA = gd.h.a(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), bVar2.f24823b.b(bArr));
                int i10 = bVar2.f24827f;
                aVar.getClass();
                return bArrA;
            } catch (GeneralSecurityException e10) {
                aVar.getClass();
                throw e10;
            }
        }
    }

    @Override // sc.p
    public final Class<sc.n> a() {
        return sc.n.class;
    }

    @Override // sc.p
    public final sc.n b(sc.o<sc.n> oVar) throws GeneralSecurityException {
        Iterator<List<o.b<sc.n>>> it = oVar.f24815a.values().iterator();
        while (it.hasNext()) {
            for (o.b<sc.n> bVar : it.next()) {
                ci.a aVar = bVar.f24829h;
                if (aVar instanceof q) {
                    q qVar = (q) aVar;
                    byte[] bArr = bVar.f24824c;
                    hd.a aVarA = hd.a.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!aVarA.equals(qVar.I())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + qVar.J() + " has wrong output prefix (" + qVar.I() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
        return new a(oVar);
    }

    @Override // sc.p
    public final Class<sc.n> c() {
        return sc.n.class;
    }
}
