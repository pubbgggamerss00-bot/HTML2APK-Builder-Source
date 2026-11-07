package j6;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public class j implements i6.d {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f15202a;

    public j(SQLiteProgram delegate) {
        r.e(delegate, "delegate");
        this.f15202a = delegate;
    }

    @Override // i6.d
    public final void L(int i10, byte[] bArr) {
        this.f15202a.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15202a.close();
    }

    @Override // i6.d
    public final void d(int i10, long j10) {
        this.f15202a.bindLong(i10, j10);
    }

    @Override // i6.d
    public final void e(int i10) {
        this.f15202a.bindNull(i10);
    }

    @Override // i6.d
    public final void o(int i10, String value) {
        r.e(value, "value");
        this.f15202a.bindString(i10, value);
    }

    @Override // i6.d
    public final void t(int i10, double d10) {
        this.f15202a.bindDouble(i10, d10);
    }
}
