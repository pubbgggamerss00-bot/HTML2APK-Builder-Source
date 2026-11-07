package j2;

import androidx.work.impl.WorkDatabase;
import v1.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends g.b {
    @Override // v1.g.b
    public final void a(a2.a aVar) {
        aVar.a();
        try {
            int i6 = WorkDatabase.f1786k;
            aVar.c("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f1785j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.f();
        } finally {
            aVar.b();
        }
    }
}
