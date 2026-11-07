package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.np;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final zzcp f2318a;

    static {
        zzcp zzcnVar = null;
        try {
            Object objNewInstance = zzba.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                zzcnVar = iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcn(iBinder);
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate ClientApi class.");
        }
        f2318a = zzcnVar;
    }

    public abstract Object a();

    public abstract Object b(zzcp zzcpVar);

    public abstract Object c();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, boolean z6) {
        boolean z7;
        boolean z8;
        Object objC;
        if (!z6) {
            zzbc.zzb();
            if (com.google.android.gms.ads.internal.util.client.zzf.zzs(context, 12451000)) {
                z7 = z6;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Google Play Services is not available.");
                z7 = true;
            }
        }
        boolean z9 = false;
        boolean z10 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
        zn.a(context);
        if (((Boolean) np.f7485a.c()).booleanValue()) {
            z8 = false;
        } else if (((Boolean) np.f7486b.c()).booleanValue()) {
            z8 = true;
            z9 = true;
        } else {
            boolean z11 = z7 | z10;
            z8 = false;
            z9 = z11;
        }
        zzcp zzcpVar = f2318a;
        Object objB = null;
        if (z9) {
            if (zzcpVar != null) {
                try {
                    objC = b(zzcpVar);
                } catch (RemoteException e6) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke local loader using ClientApi class.", e6);
                }
                if (objC == null && !z8) {
                    try {
                        objB = c();
                    } catch (RemoteException e7) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke remote loader.", e7);
                    }
                    objC = objB;
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class cannot be loaded.");
            }
            objC = null;
            if (objC == null) {
                objB = c();
                objC = objB;
            }
        } else {
            try {
                objC = c();
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke remote loader.", e8);
                objC = null;
            }
            if (objC == null) {
                if (zzbc.zze().nextInt(((Long) aq.f2818a.c()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbc.zzb().zzn(context, zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            if (objC == null) {
                if (zzcpVar != null) {
                    try {
                        objB = b(zzcpVar);
                    } catch (RemoteException e9) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke local loader using ClientApi class.", e9);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class cannot be loaded.");
                }
                objC = objB;
            }
        }
        return objC == null ? a() : objC;
    }
}
