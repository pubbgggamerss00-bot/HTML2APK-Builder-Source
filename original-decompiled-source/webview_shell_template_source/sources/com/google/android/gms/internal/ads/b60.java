package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b60 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2935a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f2936b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public String f2937c = null;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2938d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f2939e = new AtomicInteger(-1);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f2940f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f2941g = new AtomicReference(null);
    public final ConcurrentHashMap h = new ConcurrentHashMap(9);

    /* renamed from: i, reason: collision with root package name */
    public final Object f2942i;

    public b60() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.f2942i = new Object();
    }

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean g(Context context) throws ClassNotFoundException {
        if (((Boolean) zzbe.zzc().a(zn.f11490v0)).booleanValue()) {
            if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) >= ((Integer) zzbe.zzc().a(zn.f11496w0)).intValue()) {
                if (!((Boolean) zzbe.zzc().a(zn.f11503x0)).booleanValue()) {
                    return true;
                }
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String a(Context context) {
        Object objH;
        if (e(context) && (objH = h(context, "generateEventId")) != null) {
            return objH.toString();
        }
        return null;
    }

    public final String b(Context context) {
        if (e(context)) {
            long jLongValue = ((Long) zzbe.zzc().a(zn.f11477t0)).longValue();
            if (jLongValue < 0) {
                return (String) h(context, "getAppInstanceId");
            }
            AtomicReference atomicReference = this.f2935a;
            if (atomicReference.get() == null) {
                on onVar = zn.f11484u0;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzbe.zzc().a(onVar)).intValue(), ((Integer) zzbe.zzc().a(onVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new a60());
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && (atomicReference.get() == null || atomicReference.get() == null)) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new oe(this, context, 2)).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String c(Context context) {
        if (!e(context)) {
            return null;
        }
        synchronized (this.f2936b) {
            try {
                String str = this.f2937c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) h(context, "getGmpAppId");
                this.f2937c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Context context, String str, String str2, String str3, int i6) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (e(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i6);
            k(context, "_ar", str, bundle);
            zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i6);
        }
    }

    public final boolean e(Context context) {
        if (((Boolean) zzbe.zzc().a(zn.f11441n0)).booleanValue() && !this.f2938d.get()) {
            if (!((Boolean) zzbe.zzc().a(zn.f11510y0)).booleanValue()) {
                AtomicInteger atomicInteger = this.f2939e;
                if (atomicInteger.get() == -1) {
                    zzbc.zzb();
                    if (!zzf.zzs(context, 12451000)) {
                        zzbc.zzb();
                        if (zzf.zzt(context)) {
                            zzo.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                            atomicInteger.set(0);
                        }
                    }
                    atomicInteger.set(1);
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object h(Context context, String str) throws NoSuchMethodException, SecurityException {
        AtomicReference atomicReference = this.f2940f;
        if (!m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            l(str, true);
            return null;
        }
    }

    public final Method i(Context context, String str) throws NoSuchMethodException, SecurityException {
        ConcurrentHashMap concurrentHashMap = this.h;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            l(str, false);
            return null;
        }
    }

    public final void j(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AtomicReference atomicReference = this.f2940f;
        if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.h;
            Method declaredMethod = (Method) concurrentHashMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    l(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(atomicReference.get(), str);
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                l(str2, false);
            }
        }
    }

    public final void k(Context context, String str, String str2, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (e(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e6) {
                zzo.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e6);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f2940f;
            if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.h;
                Method declaredMethod = (Method) concurrentHashMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        l("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    l("logEventInternal", true);
                }
            }
        }
    }

    public final void l(String str, boolean z6) {
        AtomicBoolean atomicBoolean = this.f2938d;
        if (atomicBoolean.get()) {
            return;
        }
        zzo.zzj("Invoke Firebase method " + str + " error.");
        if (z6) {
            zzo.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    public final boolean m(Context context, String str, AtomicReference atomicReference, boolean z6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Object objInvoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
            while (!atomicReference.compareAndSet(null, objInvoke)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    return true;
                }
            }
            return true;
        } catch (Exception unused) {
            l("getInstance", z6);
            return false;
        }
    }
}
