package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.k;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final f f6665b = new f(y.f6819b);

    /* renamed from: c, reason: collision with root package name */
    public static final d f6666c;

    /* renamed from: a, reason: collision with root package name */
    public int f6667a = 0;

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            com.google.crypto.tink.shaded.protobuf.g gVar = (com.google.crypto.tink.shaded.protobuf.g) this;
            int i10 = gVar.f6660a;
            if (i10 >= gVar.f6661b) {
                throw new NoSuchElementException();
            }
            gVar.f6660a = i10 + 1;
            return Byte.valueOf(gVar.f6662c.e(i10));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements d {
        @Override // com.google.crypto.tink.shaded.protobuf.h.d
        public final byte[] copyFrom(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public static final class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public final int f6668e;

        /* renamed from: f, reason: collision with root package name */
        public final int f6669f;

        public c(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.b(i10, i10 + i11, bArr.length);
            this.f6668e = i10;
            this.f6669f = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f, com.google.crypto.tink.shaded.protobuf.h
        public final byte a(int i10) {
            int i11 = this.f6669f;
            if (((i11 - (i10 + 1)) | i10) >= 0) {
                return this.f6670d[this.f6668e + i10];
            }
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(j2.y.a(i10, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(e1.c.a(i10, i11, "Index > length: ", ", "));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f, com.google.crypto.tink.shaded.protobuf.h
        public final void d(int i10, byte[] bArr) {
            System.arraycopy(this.f6670d, this.f6668e, bArr, 0, i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f, com.google.crypto.tink.shaded.protobuf.h
        public final byte e(int i10) {
            return this.f6670d[this.f6668e + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public final int o() {
            return this.f6668e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f, com.google.crypto.tink.shaded.protobuf.h
        public final int size() {
            return this.f6669f;
        }
    }

    public interface d {
        byte[] copyFrom(byte[] bArr, int i10, int i11);
    }

    public static abstract class e extends h {
        @Override // com.google.crypto.tink.shaded.protobuf.h, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new com.google.crypto.tink.shaded.protobuf.g(this);
        }
    }

    public static class f extends e {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f6670d;

        public f(byte[] bArr) {
            bArr.getClass();
            this.f6670d = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public byte a(int i10) {
            return this.f6670d[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public void d(int i10, byte[] bArr) {
            System.arraycopy(this.f6670d, 0, bArr, 0, i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public byte e(int i10) {
            return this.f6670d[i10];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int i10 = this.f6667a;
            int i11 = fVar.f6667a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > fVar.size()) {
                StringBuilder sbB = p.i0.b(size, "Ran off end of other: 0, ", ", ");
                sbB.append(fVar.size());
                throw new IllegalArgumentException(sbB.toString());
            }
            byte[] bArr = fVar.f6670d;
            int iO = o() + size;
            int iO2 = o();
            int iO3 = fVar.o();
            while (iO2 < iO) {
                if (this.f6670d[iO2] != bArr[iO3]) {
                    return false;
                }
                iO2++;
                iO3++;
            }
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean f() {
            int iO = o();
            return s1.f6761a.c(this.f6670d, iO, size() + iO);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final i.a g() {
            return i.f(this.f6670d, o(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final int i(int i10, int i11) {
            int iO = o();
            Charset charset = y.f6818a;
            for (int i12 = iO; i12 < iO + i11; i12++) {
                i10 = (i10 * 31) + this.f6670d[i12];
            }
            return i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final f j(int i10) {
            int iB = h.b(0, i10, size());
            return iB == 0 ? h.f6665b : new c(this.f6670d, o(), iB);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final String m(Charset charset) {
            return new String(this.f6670d, o(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final void n(k.a aVar) throws IOException {
            aVar.n0(this.f6670d, o(), size());
        }

        public int o() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f6670d.length;
        }
    }

    public static final class g implements d {
        @Override // com.google.crypto.tink.shaded.protobuf.h.d
        public final byte[] copyFrom(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f6666c = com.google.crypto.tink.shaded.protobuf.d.a() ? new g() : new b();
    }

    public static int b(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(ad.b.b(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(e1.c.a(i11, i12, "End index: ", " >= "));
    }

    public static f c(int i10, int i11, byte[] bArr) {
        b(i10, i10 + i11, bArr.length);
        return new f(f6666c.copyFrom(bArr, i10, i11));
    }

    public abstract byte a(int i10);

    public abstract void d(int i10, byte[] bArr);

    public abstract byte e(int i10);

    public abstract boolean f();

    public abstract i.a g();

    public final int hashCode() {
        int i10 = this.f6667a;
        if (i10 == 0) {
            int size = size();
            i10 = i(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f6667a = i10;
        }
        return i10;
    }

    public abstract int i(int i10, int i11);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new com.google.crypto.tink.shaded.protobuf.g(this);
    }

    public abstract f j(int i10);

    public final byte[] k() {
        int size = size();
        if (size == 0) {
            return y.f6819b;
        }
        byte[] bArr = new byte[size];
        d(size, bArr);
        return bArr;
    }

    public abstract String m(Charset charset);

    public abstract void n(k.a aVar) throws IOException;

    public abstract int size();

    public final String toString() {
        String strA;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strA = l1.a(this);
        } else {
            strA = l1.a(j(47)) + "...";
        }
        return b.o.a(androidx.datastore.preferences.protobuf.h.a(size, "<ByteString@", hexString, " size=", " contents=\""), strA, "\">");
    }
}
