package d7;

import androidx.work.impl.WorkDatabase;
import c9.t1;
import java.util.UUID;
import pg.f0;
import u6.t0;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.s implements eh.a<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f7384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f7385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t0 t0Var, UUID uuid) {
        super(0);
        this.f7384a = t0Var;
        this.f7385b = uuid;
    }

    @Override // eh.a
    public final f0 invoke() {
        final t0 t0Var = this.f7384a;
        WorkDatabase workDatabase = t0Var.f29338c;
        kotlin.jvm.internal.r.d(workDatabase, "workManagerImpl.workDatabase");
        final UUID uuid = this.f7385b;
        workDatabase.runInTransaction(new Runnable() { // from class: d7.b
            @Override // java.lang.Runnable
            public final void run() {
                String string = uuid.toString();
                kotlin.jvm.internal.r.d(string, "id.toString()");
                t1.a(t0Var, string);
            }
        });
        u6.w.b(t0Var.f29337b, t0Var.f29338c, t0Var.f29340e);
        return f0.f21461a;
    }
}
