package d7;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpecDao;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final e7.c f7417a;

    /* renamed from: b, reason: collision with root package name */
    public final u6.r f7418b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkSpecDao f7419c;

    static {
        t6.s.f("WMFgUpdater");
    }

    public z(WorkDatabase workDatabase, u6.r rVar, e7.c cVar) {
        this.f7418b = rVar;
        this.f7417a = cVar;
        this.f7419c = workDatabase.workSpecDao();
    }
}
