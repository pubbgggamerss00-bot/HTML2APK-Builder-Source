package ff;

import cf.l;
import cf.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h extends ff.a {

    /* renamed from: e, reason: collision with root package name */
    public final k f11220e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11221f;

    /* renamed from: g, reason: collision with root package name */
    public a f11222g;

    public static class a implements Iterator<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f11223a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f11224b;

        /* renamed from: c, reason: collision with root package name */
        public int f11225c = 0;

        /* renamed from: d, reason: collision with root package name */
        public long f11226d;

        /* renamed from: e, reason: collision with root package name */
        public long f11227e;

        /* renamed from: f, reason: collision with root package name */
        public final long f11228f;

        public a(cf.a aVar) throws IOException {
            this.f11226d = 0L;
            this.f11227e = 0L;
            this.f11228f = 0L;
            ArrayList arrayList = aVar.f5416b;
            int size = arrayList.size() / 2;
            this.f11223a = new long[size];
            this.f11224b = new long[size];
            Iterator it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                cf.b bVar = (cf.b) it.next();
                if (!(bVar instanceof cf.i)) {
                    throw new IOException("Xref stream must have integer in /Index array");
                }
                long j10 = ((cf.i) bVar).f5445b;
                if (!it.hasNext()) {
                    break;
                }
                cf.b bVar2 = (cf.b) it.next();
                if (!(bVar2 instanceof cf.i)) {
                    throw new IOException("Xref stream must have integer in /Index array");
                }
                long j11 = ((cf.i) bVar2).f5445b;
                this.f11223a[i10] = j10;
                this.f11224b[i10] = j10 + j11;
                i10++;
            }
            this.f11227e = this.f11223a[0];
            long[] jArr = this.f11224b;
            this.f11226d = jArr[0];
            this.f11228f = jArr[i10 - 1];
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f11227e < this.f11228f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Long next() {
            long j10 = this.f11227e;
            if (j10 >= this.f11228f) {
                throw new NoSuchElementException();
            }
            if (j10 < this.f11226d) {
                this.f11227e = 1 + j10;
                return Long.valueOf(j10);
            }
            int i10 = this.f11225c + 1;
            this.f11225c = i10;
            long j11 = this.f11223a[i10];
            this.f11227e = j11;
            this.f11226d = this.f11224b[i10];
            this.f11227e = 1 + j11;
            return Long.valueOf(j11);
        }
    }

    public h(t tVar, cf.e eVar, k kVar) throws IOException {
        super(new d(tVar.U0()));
        this.f11221f = new int[3];
        this.f11222g = null;
        this.f11184c = eVar;
        this.f11220e = kVar;
        try {
            v(tVar);
        } catch (IOException e10) {
            j jVar = this.f11183b;
            if (jVar != null) {
                jVar.close();
            }
            this.f11184c = null;
            throw e10;
        }
    }

    public static long w(int i10, int i11, byte[] bArr) {
        long j10 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j10 += (bArr[i12 + i10] & 255) << (((i11 - i12) - 1) * 8);
        }
        return j10;
    }

    public final void v(t tVar) throws IOException {
        cf.a aVarK0 = tVar.k0(l.C2);
        if (aVarK0 == null) {
            throw new IOException("/W array is missing in Xref stream");
        }
        int size = aVarK0.f5416b.size();
        int[] iArr = this.f11221f;
        if (size != 3) {
            throw new IOException("Wrong number of values for /W array in XRef: " + Arrays.toString(iArr));
        }
        for (int i10 = 0; i10 < 3; i10++) {
            iArr[i10] = aVarK0.k0(i10, 0);
        }
        if (iArr[0] < 0 || iArr[1] < 0 || iArr[2] < 0) {
            throw new IOException("Incorrect /W array in XRef: " + Arrays.toString(iArr));
        }
        cf.a aVarK02 = tVar.k0(l.f5454c1);
        if (aVarK02 == null) {
            aVarK02 = new cf.a();
            aVarK02.g0(cf.i.f5441e);
            aVarK02.g0(cf.i.q0(tVar.G0(l.f5475h2, null, 0)));
        }
        ArrayList arrayList = aVarK02.f5416b;
        if (arrayList.size() == 0 || arrayList.size() % 2 == 1) {
            throw new IOException("Wrong number of values for /Index array in XRef: " + Arrays.toString(iArr));
        }
        this.f11222g = new a(aVarK02);
    }
}
