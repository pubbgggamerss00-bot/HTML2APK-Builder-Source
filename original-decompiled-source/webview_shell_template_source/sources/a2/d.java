package a2;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class d implements Closeable {
    public final SQLiteProgram s;

    public d(SQLiteProgram sQLiteProgram) {
        this.s = sQLiteProgram;
    }

    public final void a(int i6, byte[] bArr) {
        this.s.bindBlob(i6, bArr);
    }

    public final void b(int i6, long j6) {
        this.s.bindLong(i6, j6);
    }

    public final void c(int i6) {
        this.s.bindNull(i6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
    }

    public final void d(int i6, String str) {
        this.s.bindString(i6, str);
    }
}
