package u6;

import android.content.Context;
import android.database.SQLException;

/* loaded from: classes.dex */
public final class s extends z5.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context mContext, int i10, int i11) {
        super(i10, i11);
        kotlin.jvm.internal.r.e(mContext, "mContext");
        this.f29330a = mContext;
    }

    @Override // z5.a
    public final void migrate(i6.b db2) throws SQLException {
        kotlin.jvm.internal.r.e(db2, "db");
        if (this.endVersion >= 10) {
            db2.G(new Object[]{"reschedule_needed", 1});
        } else {
            this.f29330a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
