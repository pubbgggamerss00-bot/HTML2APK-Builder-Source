package a2;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: t, reason: collision with root package name */
    public final SQLiteStatement f19t;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f19t = sQLiteStatement;
    }

    public final void e() {
        this.f19t.executeUpdateDelete();
    }
}
