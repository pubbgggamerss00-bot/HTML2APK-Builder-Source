package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class x60 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10391b;

    public /* synthetic */ x60(int i6, Object obj) {
        this.f10390a = i6;
        this.f10391b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws gc1 {
        switch (this.f10390a) {
            case 0:
                Context contextA = z30.a(((b70) this.f10391b).f2950e);
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo packageInfoB = j3.d.a(contextA).b(4096, contextA.getApplicationInfo().packageName);
                    if (packageInfoB.requestedPermissions != null && packageInfoB.requestedPermissionsFlags != null) {
                        int i6 = 0;
                        while (true) {
                            String[] strArr = packageInfoB.requestedPermissions;
                            if (i6 < strArr.length) {
                                if ((packageInfoB.requestedPermissionsFlags[i6] & 2) != 0) {
                                    arrayList.add(strArr[i6]);
                                }
                                i6++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return arrayList;
            case 1:
                return ((fy0) this.f10391b).getWritableDatabase();
            case 2:
                l51 l51Var = (l51) this.f10391b;
                List<String> listAsList = Arrays.asList(((String) zzbe.zzc().a(zn.f11517z1)).split(";"));
                Bundle bundle = new Bundle();
                for (String str : listAsList) {
                    try {
                        rc1 rc1VarB = l51Var.f6580b.b(str, new JSONObject());
                        rc1VarB.a();
                        boolean z6 = l51Var.f6581c.f4788b;
                        Bundle bundle2 = new Bundle();
                        if (!((Boolean) zzbe.zzc().a(zn.xb)).booleanValue() || z6) {
                            try {
                                n00 n00VarZzm = rc1VarB.f8609a.zzm();
                                if (n00VarZzm != null) {
                                    try {
                                        bundle2.putString("sdk_version", n00VarZzm.toString());
                                    } catch (gc1 unused2) {
                                    }
                                }
                            } catch (Throwable th) {
                                throw new gc1(th);
                                break;
                            }
                        }
                        try {
                            n00 n00VarZzl = rc1VarB.f8609a.zzl();
                            if (n00VarZzl != null) {
                                try {
                                    bundle2.putString("adapter_version", n00VarZzl.toString());
                                } catch (gc1 unused3) {
                                }
                            }
                            bundle.putBundle(str, bundle2);
                        } catch (Throwable th2) {
                            throw new gc1(th2);
                            break;
                        }
                    } catch (gc1 unused4) {
                    }
                }
                m51 m51Var = new m51(bundle, 0);
                if (((Boolean) zzbe.zzc().a(zn.xb)).booleanValue()) {
                    l51Var.f6582d.f7316b = m51Var;
                }
                return m51Var;
            case 3:
                VersionInfoParcel versionInfoParcel = ((a61) this.f10391b).f2591b;
                if (!((Boolean) zzbe.zzc().a(zn.T9)).booleanValue()) {
                    return new c61(null);
                }
                zzv.zzq();
                int extensionVersion = 0;
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                        if (((Boolean) zzbe.zzc().a(zn.W9)).booleanValue()) {
                            if (versionInfoParcel.clientJarVersion >= ((Integer) zzbe.zzc().a(zn.V9)).intValue() && i7 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                                extensionVersion = SdkExtensions.getExtensionVersion(31);
                            }
                        }
                    } else {
                        extensionVersion = SdkExtensions.getExtensionVersion(1000000);
                    }
                } catch (Exception e6) {
                    zzv.zzp().h("AdUtil.getAdServicesExtensionVersion", e6);
                }
                return new c61(Integer.valueOf(extensionVersion));
            default:
                return new d71(0, "requester_type_2".equals(zzaa.zzc(((b71) this.f10391b).f2961b.f4209d)));
        }
    }
}
