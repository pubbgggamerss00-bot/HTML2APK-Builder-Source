package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fj1 {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f4704f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4705a;

    /* renamed from: b, reason: collision with root package name */
    public final yf f4706b;

    /* renamed from: c, reason: collision with root package name */
    public final xh1 f4707c;

    /* renamed from: d, reason: collision with root package name */
    public h20 f4708d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4709e = new Object();

    public fj1(Context context, yf yfVar, xh1 xh1Var, bq bqVar) {
        this.f4705a = context;
        this.f4706b = yfVar;
        this.f4707c = xh1Var;
    }

    public final h20 a() {
        h20 h20Var;
        synchronized (this.f4709e) {
            h20Var = this.f4708d;
        }
        return h20Var;
    }

    public final boolean b(zd0 zd0Var) throws IllegalAccessException, InstantiationException, IllegalArgumentException, ej1, InvocationTargetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                h20 h20Var = new h20(c(zd0Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f4705a, "msa-r", zd0Var.d(), null, new Bundle(), 2), zd0Var, this.f4706b, this.f4707c);
                if (!h20Var.f()) {
                    throw new ej1(4000, "init failed");
                }
                int iD = h20Var.d();
                if (iD != 0) {
                    throw new ej1(4001, "ci: " + iD);
                }
                synchronized (this.f4709e) {
                    h20 h20Var2 = this.f4708d;
                    if (h20Var2 != null) {
                        try {
                            h20Var2.e();
                        } catch (ej1 e6) {
                            this.f4707c.b(e6.s, -1L, e6);
                        }
                        this.f4708d = h20Var;
                    } else {
                        this.f4708d = h20Var;
                    }
                }
                this.f4707c.c(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e7) {
                throw new ej1(2004, e7);
            }
        } catch (ej1 e8) {
            this.f4707c.b(e8.s, System.currentTimeMillis() - jCurrentTimeMillis, e8);
            return false;
        } catch (Exception e9) {
            this.f4707c.b(4010, System.currentTimeMillis() - jCurrentTimeMillis, e9);
            return false;
        }
    }

    public final synchronized Class c(zd0 zd0Var) {
        try {
            String strJ = ((ph) zd0Var.s).J();
            HashMap map = f4704f;
            Class cls = (Class) map.get(strJ);
            if (cls != null) {
                return cls;
            }
            try {
                if (!bq.g((File) zd0Var.f11264t)) {
                    throw new ej1(2026, "VM did not pass signature verification");
                }
                try {
                    File file = (File) zd0Var.f11265u;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(((File) zd0Var.f11264t).getAbsolutePath(), file.getAbsolutePath(), null, this.f4705a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strJ, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e6) {
                    e = e6;
                    throw new ej1(2008, e);
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    throw new ej1(2008, e);
                } catch (SecurityException e8) {
                    e = e8;
                    throw new ej1(2008, e);
                }
            } catch (GeneralSecurityException e9) {
                throw new ej1(2026, e9);
            }
        } finally {
        }
    }
}
