package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk1 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9319b;

    public /* synthetic */ tk1(int i6, Object obj) {
        this.f9318a = i6;
        this.f9319b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f9318a;
        Object obj2 = this.f9319b;
        switch (i6) {
            case 0:
                il1 il1Var = zk1.f11326c;
                ((Bundle) obj2).putString("sessionToken", (String) obj);
                break;
            case 1:
                il1 il1Var2 = zk1.f11326c;
                ((Bundle) obj2).putString("appId", (String) obj);
                break;
            default:
                ((bu0) obj2).a("plaay_ts", Long.toString(((Long) obj).longValue()));
                break;
        }
    }
}
