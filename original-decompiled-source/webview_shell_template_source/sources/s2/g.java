package s2;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f14359a;

    public g(WorkDatabase workDatabase) {
        this.f14359a = workDatabase;
    }

    public final int a(String str) {
        WorkDatabase workDatabase = this.f14359a;
        workDatabase.c();
        try {
            Long lA = workDatabase.j().a(str);
            int i6 = 0;
            int iIntValue = lA != null ? lA.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i6 = iIntValue + 1;
            }
            workDatabase.j().b(new r2.c(str, i6));
            workDatabase.h();
            workDatabase.f();
            return iIntValue;
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
