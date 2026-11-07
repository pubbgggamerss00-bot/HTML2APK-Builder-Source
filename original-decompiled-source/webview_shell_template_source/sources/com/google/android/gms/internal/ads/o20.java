package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o20 {

    /* renamed from: a, reason: collision with root package name */
    public final View f7580a;

    /* renamed from: b, reason: collision with root package name */
    public final l60 f7581b;

    public o20(n20 n20Var) {
        View view = n20Var.f7295a;
        this.f7580a = view;
        HashMap map = n20Var.f7296b;
        l60 l60VarA = h20.a(view.getContext());
        this.f7581b = l60VarA;
        if (l60VarA == null || map.isEmpty()) {
            return;
        }
        try {
            l60VarA.zzg(new p20(new k3.b(view), new k3.b(map)));
        } catch (RemoteException unused) {
            zzo.zzg("Failed to call remote method.");
        }
    }
}
