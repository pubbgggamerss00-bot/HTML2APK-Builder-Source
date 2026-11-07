package androidx.room;

import androidx.room.m;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final m.a f3092a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3093b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3094c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<String> f3095d;

    public v(m.a observer, int[] tableIds, String[] tableNames) {
        kotlin.jvm.internal.r.e(observer, "observer");
        kotlin.jvm.internal.r.e(tableIds, "tableIds");
        kotlin.jvm.internal.r.e(tableNames, "tableNames");
        this.f3092a = observer;
        this.f3093b = tableIds;
        this.f3094c = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3095d = !(tableNames.length == 0) ? qg.n0.g(tableNames[0]) : qg.b0.f22711a;
    }
}
