package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k31 implements a01 {

    /* renamed from: a, reason: collision with root package name */
    public final z31 f6233a;

    /* renamed from: b, reason: collision with root package name */
    public final mt0 f6234b;

    public k31(z31 z31Var, mt0 mt0Var) {
        this.f6233a = z31Var;
        this.f6234b = mt0Var;
    }

    @Override // com.google.android.gms.internal.ads.a01
    public final b01 a(String str, JSONObject jSONObject) {
        e00 e00VarA;
        if (((Boolean) zzbe.zzc().a(zn.M1)).booleanValue()) {
            try {
                e00VarA = this.f6234b.a(str);
            } catch (RemoteException e6) {
                zzo.zzh("Coundn't create RTB adapter: ", e6);
            }
        } else {
            ConcurrentHashMap concurrentHashMap = this.f6233a.f11133a;
            e00VarA = concurrentHashMap.containsKey(str) ? (e00) concurrentHashMap.get(str) : null;
        }
        if (e00VarA == null) {
            return null;
        }
        return new b01(e00VarA, new e11(), str);
    }
}
