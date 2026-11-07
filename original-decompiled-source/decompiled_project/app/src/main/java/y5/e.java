package y5;

import android.database.Cursor;
import i6.f;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class e implements h6.d {

    /* renamed from: a, reason: collision with root package name */
    public final i6.b f33948a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33949b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33950c;

    public static final class a extends e {

        /* renamed from: d, reason: collision with root package name */
        public int[] f33951d;

        /* renamed from: e, reason: collision with root package name */
        public long[] f33952e;

        /* renamed from: f, reason: collision with root package name */
        public double[] f33953f;

        /* renamed from: g, reason: collision with root package name */
        public String[] f33954g;

        /* renamed from: h, reason: collision with root package name */
        public byte[][] f33955h;

        /* renamed from: j, reason: collision with root package name */
        public Cursor f33956j;

        /* renamed from: y5.e$a$a, reason: collision with other inner class name */
        public static final class C0344a implements i6.e {
            public C0344a() {
            }

            @Override // i6.e
            public final void h(i6.d dVar) {
                a aVar = a.this;
                int length = aVar.f33951d.length;
                for (int i10 = 1; i10 < length; i10++) {
                    int i11 = aVar.f33951d[i10];
                    if (i11 == 1) {
                        dVar.d(i10, aVar.f33952e[i10]);
                    } else if (i11 == 2) {
                        dVar.t(i10, aVar.f33953f[i10]);
                    } else if (i11 == 3) {
                        String str = aVar.f33954g[i10];
                        r.b(str);
                        dVar.o(i10, str);
                    } else if (i11 == 4) {
                        byte[] bArr = aVar.f33955h[i10];
                        r.b(bArr);
                        dVar.L(i10, bArr);
                    } else if (i11 == 5) {
                        dVar.e(i10);
                    }
                }
            }

            @Override // i6.e
            public final String l() {
                return a.this.f33949b;
            }
        }

        public static void z(Cursor cursor, int i10) {
            if (i10 < 0 || i10 >= cursor.getColumnCount()) {
                h6.a.c(25, "column index out of range");
                throw null;
            }
        }

        @Override // h6.d
        public final void C(int i10, String value) {
            r.e(value, "value");
            h();
            l(3, i10);
            this.f33951d[i10] = 3;
            this.f33954g[i10] = value;
        }

        @Override // h6.d
        public final String W(int i10) {
            h();
            Cursor cursor = this.f33956j;
            if (cursor == null) {
                h6.a.c(21, "no row");
                throw null;
            }
            z(cursor, i10);
            String string = cursor.getString(i10);
            r.d(string, "getString(...)");
            return string;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (!this.f33950c) {
                h();
                this.f33951d = new int[0];
                this.f33952e = new long[0];
                this.f33953f = new double[0];
                this.f33954g = new String[0];
                this.f33955h = new byte[0][];
                reset();
            }
            this.f33950c = true;
        }

        @Override // h6.d
        public final void d(int i10, long j10) {
            h();
            l(1, i10);
            this.f33951d[i10] = 1;
            this.f33952e[i10] = j10;
        }

        @Override // h6.d
        public final void e(int i10) {
            h();
            l(5, i10);
            this.f33951d[i10] = 5;
        }

        @Override // h6.d
        public final int getColumnCount() {
            h();
            p();
            Cursor cursor = this.f33956j;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // h6.d
        public final String getColumnName(int i10) {
            h();
            p();
            Cursor cursor = this.f33956j;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            z(cursor, i10);
            String columnName = cursor.getColumnName(i10);
            r.d(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // h6.d
        public final long getLong(int i10) {
            h();
            Cursor cursor = this.f33956j;
            if (cursor != null) {
                z(cursor, i10);
                return cursor.getLong(i10);
            }
            h6.a.c(21, "no row");
            throw null;
        }

        @Override // h6.d
        public final boolean isNull(int i10) {
            h();
            Cursor cursor = this.f33956j;
            if (cursor != null) {
                z(cursor, i10);
                return cursor.isNull(i10);
            }
            h6.a.c(21, "no row");
            throw null;
        }

        public final void l(int i10, int i11) {
            int i12 = i11 + 1;
            int[] iArr = this.f33951d;
            if (iArr.length < i12) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
                r.d(iArrCopyOf, "copyOf(...)");
                this.f33951d = iArrCopyOf;
            }
            if (i10 == 1) {
                long[] jArr = this.f33952e;
                if (jArr.length < i12) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                    r.d(jArrCopyOf, "copyOf(...)");
                    this.f33952e = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                double[] dArr = this.f33953f;
                if (dArr.length < i12) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                    r.d(dArrCopyOf, "copyOf(...)");
                    this.f33953f = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 == 3) {
                String[] strArr = this.f33954g;
                if (strArr.length < i12) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                    r.d(objArrCopyOf, "copyOf(...)");
                    this.f33954g = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            byte[][] bArr = this.f33955h;
            if (bArr.length < i12) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
                r.d(objArrCopyOf2, "copyOf(...)");
                this.f33955h = (byte[][]) objArrCopyOf2;
            }
        }

        public final void p() {
            if (this.f33956j == null) {
                this.f33956j = this.f33948a.B(new C0344a());
            }
        }

        @Override // h6.d
        public final void reset() {
            h();
            Cursor cursor = this.f33956j;
            if (cursor != null) {
                cursor.close();
            }
            this.f33956j = null;
        }

        @Override // h6.d
        public final boolean t0() {
            h();
            p();
            Cursor cursor = this.f33956j;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final class b extends e {

        /* renamed from: d, reason: collision with root package name */
        public final f f33958d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i6.b db2, String sql) {
            super(db2, sql);
            r.e(db2, "db");
            r.e(sql, "sql");
            this.f33958d = db2.r(sql);
        }

        @Override // h6.d
        public final void C(int i10, String value) {
            r.e(value, "value");
            h();
            this.f33958d.o(i10, value);
        }

        @Override // h6.d
        public final String W(int i10) {
            h();
            h6.a.c(21, "no row");
            throw null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f33958d.close();
            this.f33950c = true;
        }

        @Override // h6.d
        public final void d(int i10, long j10) {
            h();
            this.f33958d.d(i10, j10);
        }

        @Override // h6.d
        public final void e(int i10) {
            h();
            this.f33958d.e(i10);
        }

        @Override // h6.d
        public final int getColumnCount() {
            h();
            return 0;
        }

        @Override // h6.d
        public final String getColumnName(int i10) {
            h();
            h6.a.c(21, "no row");
            throw null;
        }

        @Override // h6.d
        public final long getLong(int i10) {
            h();
            h6.a.c(21, "no row");
            throw null;
        }

        @Override // h6.d
        public final boolean isNull(int i10) {
            h();
            h6.a.c(21, "no row");
            throw null;
        }

        @Override // h6.d
        public final void reset() {
        }

        @Override // h6.d
        public final boolean t0() {
            h();
            this.f33958d.f();
            return false;
        }
    }

    public e(i6.b bVar, String str) {
        this.f33948a = bVar;
        this.f33949b = str;
    }

    public final void h() {
        if (this.f33950c) {
            h6.a.c(21, "statement is closed");
            throw null;
        }
    }
}
