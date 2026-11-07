package b6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import y5.f1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f2047a;

    static {
        String property;
        int i6 = w.f2050a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new z5.a()).iterator();
            kotlin.jvm.internal.j.e("<this>", it);
            Iterator it2 = w5.g.o(new w5.a(new w5.h(it))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((o) next).getClass();
                    do {
                        ((o) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            o oVar = (o) next;
            if (oVar == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            f2047a = oVar.a();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
