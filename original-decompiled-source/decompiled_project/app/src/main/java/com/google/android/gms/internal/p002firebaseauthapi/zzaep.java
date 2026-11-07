package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;
import m3.a;

/* loaded from: classes2.dex */
public class zzaep {
    private zzaep() {
    }

    public static Object zza(String str, Type type) throws zzaci {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzaer) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
                } catch (Exception e10) {
                    throw new zzaci(a.a("Json conversion failed! ", e10.getMessage()), e10);
                }
            } catch (Exception e11) {
                throw new zzaci("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e11);
            }
        }
        try {
            zzagl zzaglVar = (zzagl) new zzagl().zza(str);
            if (zzaglVar.zzb()) {
                return zzaglVar.zza();
            }
            throw new zzaci("No error message: " + str);
        } catch (Exception e12) {
            throw new zzaci(a.a("Json conversion failed! ", e12.getMessage()), e12);
        }
    }
}
