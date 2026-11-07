package y6;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.r;
import ph.g0;
import ph.j0;
import ph.l2;
import t6.s;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f34000a;

    static {
        String strF = s.f("WorkConstraintsTracker");
        r.d(strF, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f34000a = strF;
    }

    public static final l2 a(l lVar, WorkSpec workSpec, g0 dispatcher, h listener) {
        r.e(lVar, "<this>");
        r.e(dispatcher, "dispatcher");
        r.e(listener, "listener");
        return ph.h.c(j0.a(dispatcher), null, null, new m(lVar, workSpec, listener, null), 3);
    }
}
