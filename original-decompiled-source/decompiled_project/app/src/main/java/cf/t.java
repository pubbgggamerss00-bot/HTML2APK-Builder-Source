package cf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class t extends d implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public ef.h f5561c;

    /* renamed from: d, reason: collision with root package name */
    public final ef.g f5562d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5563e;

    public t() {
        this(ef.g.p());
    }

    public final void T0() throws IOException {
        ef.h hVar = this.f5561c;
        if (hVar != null && hVar.f8729b == null) {
            throw new IOException("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
        }
    }

    public final h U0() throws IOException {
        T0();
        if (this.f5563e) {
            throw new IllegalStateException("Cannot read while there is an open stream writer");
        }
        ef.h hVar = this.f5561c;
        ef.g gVar = this.f5562d;
        if (hVar == null) {
            gVar.getClass();
            this.f5561c = new ef.h(gVar);
        }
        InputStream dVar = new ef.d(this.f5561c);
        ArrayList arrayListY0 = Y0();
        int i10 = h.f5438b;
        if (arrayListY0.isEmpty()) {
            return new h(dVar, Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList(arrayListY0.size());
        if (arrayListY0.size() > 1 && new HashSet(arrayListY0).size() != arrayListY0.size()) {
            throw new IOException("Duplicate");
        }
        for (int i11 = 0; i11 < arrayListY0.size(); i11++) {
            if (gVar != null) {
                ef.h hVar2 = new ef.h(gVar);
                arrayList.add(((df.k) arrayListY0.get(i11)).b(dVar, new ef.e(hVar2), this, i11));
                dVar = new g(hVar2, hVar2);
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                arrayList.add(((df.k) arrayListY0.get(i11)).b(dVar, byteArrayOutputStream, this, i11));
                dVar = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        }
        return new h(dVar, arrayList);
    }

    public final r V0(b bVar) throws IOException {
        T0();
        if (this.f5563e) {
            throw new IllegalStateException("Cannot have more than one open stream writer.");
        }
        if (bVar != null) {
            O0(l.B0, bVar);
        }
        ef.a.b(this.f5561c);
        ef.g gVar = this.f5562d;
        gVar.getClass();
        this.f5561c = new ef.h(gVar);
        q qVar = new q(Y0(), this, new ef.e(this.f5561c), gVar);
        this.f5563e = true;
        return new r(this, qVar);
    }

    public final ef.d W0() throws IOException {
        T0();
        if (this.f5563e) {
            throw new IllegalStateException("Cannot read while there is an open stream writer");
        }
        if (this.f5561c == null) {
            ef.g gVar = this.f5562d;
            gVar.getClass();
            this.f5561c = new ef.h(gVar);
        }
        return new ef.d(this.f5561c);
    }

    public final s X0() throws IOException {
        T0();
        if (this.f5563e) {
            throw new IllegalStateException("Cannot have more than one open stream writer.");
        }
        ef.a.b(this.f5561c);
        ef.g gVar = this.f5562d;
        gVar.getClass();
        this.f5561c = new ef.h(gVar);
        ef.e eVar = new ef.e(this.f5561c);
        this.f5563e = true;
        return new s(this, eVar);
    }

    public final ArrayList Y0() throws IOException {
        b bVarV0 = v0(l.B0);
        if (bVarV0 instanceof l) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(df.l.f7969b.a((l) bVarV0));
            return arrayList;
        }
        if (!(bVarV0 instanceof a)) {
            return new ArrayList();
        }
        a aVar = (a) bVarV0;
        ArrayList arrayList2 = aVar.f5416b;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            b bVarI0 = aVar.i0(i10);
            if (!(bVarI0 instanceof l)) {
                throw new IOException("Forbidden type in filter array: ".concat(bVarI0 == null ? "null" : bVarI0.getClass().getName()));
            }
            arrayList3.add(df.l.f7969b.a((l) bVarI0));
        }
        return arrayList3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ef.h hVar = this.f5561c;
        if (hVar != null) {
            hVar.close();
        }
    }

    @Override // cf.d, cf.b
    public final Object f0(gf.b bVar) throws Throwable {
        Throwable th2;
        byte[] bArr;
        ef.d dVarW0;
        if (bVar.f12068r) {
            lf.l lVarC = bVar.f12067q.l().c();
            p pVar = bVar.f12066p;
            long j10 = pVar.f5553a;
            int i10 = pVar.f5554b;
            ef.d dVarW02 = W0();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ef.a.c(dVarW02, byteArrayOutputStream);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            s sVarX0 = X0();
            try {
                lVarC.d(j10, i10, byteArrayInputStream, sVarX0, false);
            } finally {
                sVarX0.close();
            }
        }
        ef.d dVar = null;
        try {
            bVar.M(this);
            bVar.f12056d.write(gf.b.L);
            gf.a aVar = bVar.f12056d;
            bArr = gf.a.f12043c;
            aVar.write(bArr);
            dVarW0 = W0();
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            ef.a.c(dVarW0, bVar.f12056d);
            bVar.f12056d.write(bArr);
            bVar.f12056d.write(gf.b.M);
            bVar.f12056d.h();
            dVarW0.close();
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            dVar = dVarW0;
            if (dVar == null) {
                throw th2;
            }
            dVar.close();
            throw th2;
        }
    }

    public t(ef.g gVar) {
        N0(l.f5485k1, 0);
        this.f5562d = gVar == null ? ef.g.p() : gVar;
    }
}
