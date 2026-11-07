package j6;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class k extends j implements i6.f {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f15203b;

    public k(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f15203b = sQLiteStatement;
    }

    @Override // i6.f
    public final void f() {
        this.f15203b.execute();
    }

    @Override // i6.f
    public final int q() {
        return this.f15203b.executeUpdateDelete();
    }

    @Override // i6.f
    public final long x0() {
        return this.f15203b.executeInsert();
    }
}
