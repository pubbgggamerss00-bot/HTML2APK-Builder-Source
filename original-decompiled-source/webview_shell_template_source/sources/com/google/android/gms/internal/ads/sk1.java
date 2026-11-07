package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class sk1 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f8971b;

    public /* synthetic */ sk1(Bundle bundle, int i6) {
        this.f8970a = i6;
        this.f8971b = bundle;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f8970a;
        Bundle bundle = this.f8971b;
        String str = (String) obj;
        switch (i6) {
            case 0:
                il1 il1Var = zk1.f11326c;
                bundle.putString("deeplinkUrl", str);
                break;
            default:
                il1 il1Var2 = zk1.f11326c;
                bundle.putString("sessionToken", str);
                break;
        }
    }
}
