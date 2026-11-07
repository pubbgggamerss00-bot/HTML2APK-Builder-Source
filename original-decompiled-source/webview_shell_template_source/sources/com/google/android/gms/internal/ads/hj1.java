package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hj1 {

    /* renamed from: a, reason: collision with root package name */
    public final kj1 f5431a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5432b = true;

    public hj1(kj1 kj1Var) {
        this.f5431a = kj1Var;
    }

    public static hj1 a(Context context, String str) throws ni1 {
        kj1 ij1Var;
        try {
            try {
                try {
                    IBinder iBinderB = DynamiteModule.c(context, DynamiteModule.f2509b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        ij1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        ij1Var = iInterfaceQueryLocalInterface instanceof kj1 ? (kj1) iInterfaceQueryLocalInterface : new ij1(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    ij1Var.f0(new k3.b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new hj1(ij1Var);
                } catch (Exception e6) {
                    throw new ni1(e6);
                }
            } catch (RemoteException | ni1 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new hj1(new lj1());
            }
        } catch (Exception e7) {
            throw new ni1(e7);
        }
    }
}
