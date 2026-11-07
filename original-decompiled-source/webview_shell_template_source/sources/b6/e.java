package b6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2018a;

    static {
        try {
            Iterator it = Arrays.asList(new z5.b()).iterator();
            kotlin.jvm.internal.j.e("<this>", it);
            f2018a = w5.g.o(new w5.a(new w5.h(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
