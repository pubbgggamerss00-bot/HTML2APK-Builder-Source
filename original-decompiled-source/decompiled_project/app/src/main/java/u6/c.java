package u6;

import androidx.room.g0;

/* loaded from: classes.dex */
public final class c extends g0.b {

    /* renamed from: a, reason: collision with root package name */
    public final t6.b f29266a;

    public c(t6.b clock) {
        kotlin.jvm.internal.r.e(clock, "clock");
        this.f29266a = clock;
    }

    @Override // androidx.room.g0.b
    public final void a(i6.b db2) {
        kotlin.jvm.internal.r.e(db2, "db");
        db2.i();
        try {
            db2.n("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.f29266a.a() - f0.f29292a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db2.H();
        } finally {
            db2.U();
        }
    }
}
