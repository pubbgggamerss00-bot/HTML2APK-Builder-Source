package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c52 {
    public static u42 b() {
        String str;
        ClassLoader classLoader = c52.class.getClassLoader();
        if (u42.class.equals(u42.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!u42.class.getPackage().equals(c52.class.getPackage())) {
                throw new IllegalArgumentException(u42.class.getName());
            }
            str = u42.class.getPackage().getName() + ".BlazeGenerated" + u42.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    return (u42) u42.class.cast(((c52) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(e7);
                }
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException(e9);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new c52[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        arrayList.add((u42) u42.class.cast(((c52) it.next()).a()));
                    } catch (ServiceConfigurationError e10) {
                        Logger.getLogger(p42.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(u42.class.getSimpleName()), (Throwable) e10);
                    }
                }
                if (arrayList.size() == 1) {
                    return (u42) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (u42) u42.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(e11);
                } catch (NoSuchMethodException e12) {
                    throw new IllegalStateException(e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(e13);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public abstract u42 a();
}
