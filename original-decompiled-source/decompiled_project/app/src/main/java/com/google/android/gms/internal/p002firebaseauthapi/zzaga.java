package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaga {
    public static String zza(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke != null && String.class.isAssignableFrom(objInvoke.getClass())) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
