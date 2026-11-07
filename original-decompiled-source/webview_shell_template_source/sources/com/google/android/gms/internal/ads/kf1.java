package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class kf1 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6394b;

    public /* synthetic */ kf1(int i6, Object obj) {
        this.f6393a = i6;
        this.f6394b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f6393a;
        Object obj2 = this.f6394b;
        switch (i6) {
            case 0:
                ((bu0) obj2).a("gqi", (String) obj);
                break;
            default:
                il1 il1Var = zk1.f11326c;
                ((Bundle) obj2).putString("appId", (String) obj);
                break;
        }
    }
}
