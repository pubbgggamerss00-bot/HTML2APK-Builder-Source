package y6;

import android.net.ConnectivityManager;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class f implements z6.e {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f33976a;

    public f(ConnectivityManager connectivityManager) {
        this.f33976a = connectivityManager;
    }

    @Override // z6.e
    public final boolean a(WorkSpec workSpec) {
        r.e(workSpec, "workSpec");
        return workSpec.f3176j.a() != null;
    }

    @Override // z6.e
    public final sh.b b(t6.e constraints) {
        r.e(constraints, "constraints");
        return new sh.b(new e(constraints, this, null), tg.i.f28768a, -2, rh.a.f23576a);
    }

    @Override // z6.e
    public final boolean c(WorkSpec workSpec) {
        if (a(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
