package uh;

import java.util.Iterator;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final qh.g f29764a;

    static {
        String property;
        int i10 = x.f29772a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        Iterator it = lh.j.k(lh.l.g(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator())).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                ((MainDispatcherFactory) next).getClass();
                do {
                    ((MainDispatcherFactory) it.next()).getClass();
                } while (it.hasNext());
            }
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        f29764a = mainDispatcherFactory.a();
    }
}
