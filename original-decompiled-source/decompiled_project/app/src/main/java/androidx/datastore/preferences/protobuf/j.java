package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class j implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final f f2038b = new f(d0.f2006b);

    /* renamed from: c, reason: collision with root package name */
    public static final d f2039c;

    /* renamed from: a, reason: collision with root package name */
    public int f2040a = 0;

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            i iVar = (i) this;
            int i10 = iVar.f2033a;
            if (i10 >= iVar.f2034b) {
                throw new NoSuchElementException();
            }
            iVar.f2033a = i10 + 1;
            return Byte.valueOf(iVar.f2035c.f(i10));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements d {
        @Override // androidx.datastore.preferences.protobuf.j.d
        public final byte[] copyFrom(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public static final class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public final int f2041e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2042f;

        public c(byte[] bArr, int i10, int i11) {
            super(bArr);
            j.b(i10, i10 + i11, bArr.length);
            this.f2041e = i10;
            this.f2042f = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.j.f, androidx.datastore.preferences.protobuf.j
        public final byte a(int i10) {
            int i11 = this.f2042f;
            if (((i11 - (i10 + 1)) | i10) >= 0) {
                return this.f2043d[this.f2041e + i10];
            }
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(j2.y.a(i10, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(e1.c.a(i10, i11, "Index > length: ", ", "));
        }

        @Override // androidx.datastore.preferences.protobuf.j.f, androidx.datastore.preferences.protobuf.j
        public final void e(int i10, byte[] bArr) {
            System.arraycopy(this.f2043d, this.f2041e, bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.j.f, androidx.datastore.preferences.protobuf.j
        public final byte f(int i10) {
            return this.f2043d[this.f2041e + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.j.f
        public final int q() {
            return this.f2041e;
        }

        @Override // androidx.datastore.preferences.protobuf.j.f, androidx.datastore.preferences.protobuf.j
        public final int size() {
            return this.f2042f;
        }
    }

    public interface d {
        byte[] copyFrom(byte[] bArr, int i10, int i11);
    }

    public static abstract class e extends j {
        @Override // androidx.datastore.preferences.protobuf.j, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new i(this);
        }
    }

    public static class f extends e {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f2043d;

        public f(byte[] bArr) {
            bArr.getClass();
            this.f2043d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public byte a(int i10) {
            return this.f2043d[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void e(int i10, byte[] bArr) {
            System.arraycopy(this.f2043d, 0, bArr, 0, i10);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j) || size() != ((j) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int i10 = this.f2040a;
            int i11 = fVar.f2040a;
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
            byte[] bArr = fVar.f2043d;
            int iQ = q() + size;
            int iQ2 = q();
            int iQ3 = fVar.q();
            while (iQ2 < iQ) {
                if (this.f2043d[iQ2] != bArr[iQ3]) {
                    return false;
                }
                iQ2++;
                iQ3++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public byte f(int i10) {
            return this.f2043d[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final boolean g() {
            int iQ = q();
            return a2.f1951a.e(this.f2043d, iQ, size() + iQ) == 0;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final k i() {
            return k.h(this.f2043d, q(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final int j(int i10, int i11) {
            int iQ = q();
            Charset charset = d0.f2005a;
            for (int i12 = iQ; i12 < iQ + i11; i12++) {
                i10 = (i10 * 31) + this.f2043d[i12];
            }
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final j k(int i10) {
            int iB = j.b(0, i10, size());
            return iB == 0 ? j.f2038b : new c(this.f2043d, q(), iB);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final String m(Charset charset) {
            return new String(this.f2043d, q(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void o(m mVar) throws IOException {
            mVar.a(this.f2043d, q(), size());
        }

        public int q() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public int size() {
            return this.f2043d.length;
        }
    }

    public static final class g implements d {
        @Override // androidx.datastore.preferences.protobuf.j.d
        public final byte[] copyFrom(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f2039c = androidx.datastore.preferences.protobuf.c.a() ? new g() : new b();
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
        return new f(f2039c.copyFrom(bArr, i10, i11));
    }

    public static f d(String str) {
        return new f(str.getBytes(d0.f2005a));
    }

    public abstract byte a(int i10);

    public abstract void e(int i10, byte[] bArr);

    public abstract byte f(int i10);

    public abstract boolean g();

    public final int hashCode() {
        int iJ = this.f2040a;
        if (iJ == 0) {
            int size = size();
            iJ = j(size, size);
            if (iJ == 0) {
                iJ = 1;
            }
            this.f2040a = iJ;
        }
        return iJ;
    }

    public abstract k i();

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new i(this);
    }

    public abstract int j(int i10, int i11);

    public abstract j k(int i10);

    public abstract String m(Charset charset);

    public final String n() {
        return size() == 0 ? "" : m(d0.f2005a);
    }

    public abstract void o(m mVar) throws IOException;

    public abstract int size();

    public final String toString() {
        String strB;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strB = u1.b(this);
        } else {
            strB = u1.b(k(47)) + "...";
        }
        return b.o.a(h.a(size, "<ByteString@", hexString, " size=", " contents=\""), strB, "\">");
    }
}
