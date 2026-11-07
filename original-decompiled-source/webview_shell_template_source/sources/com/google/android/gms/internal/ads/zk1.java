package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.overlay.zzz;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class zk1 {

    /* renamed from: c, reason: collision with root package name */
    public static final il1 f11326c = new il1("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f11327d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final hl1 f11328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11329b;

    public zk1(Context context) {
        if (jl1.a(context)) {
            this.f11328a = new hl1(context.getApplicationContext(), f11326c, f11327d);
        } else {
            this.f11328a = null;
        }
        this.f11329b = context.getPackageName();
    }

    public static void b(String str, Consumer consumer) {
        if ((str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str).trim().isEmpty()) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    public static boolean c(dl1 dl1Var, String str, List list) {
        if (list.stream().anyMatch(new xk1())) {
            return true;
        }
        f11326c.a(str, new Object[0]);
        ((zzz) ((com.google.android.gms.ads.internal.overlay.i) dl1Var).f2343t).zzi(new nk1(8160, null));
        return false;
    }

    public final void a(final el1 el1Var, final dl1 dl1Var, final int i6) {
        hl1 hl1Var = this.f11328a;
        if (hl1Var == null) {
            f11326c.a("error: %s", "Play Store not found.");
        } else if (c(dl1Var, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(el1Var.b(), el1Var.a()))) {
            hl1Var.a(new o30(4, hl1Var, new Runnable() { // from class: com.google.android.gms.internal.ads.wk1
                @Override // java.lang.Runnable
                public final void run() {
                    el1 el1Var2 = el1Var;
                    int i7 = i6;
                    dl1 dl1Var2 = dl1Var;
                    zk1 zk1Var = this.s;
                    String str = zk1Var.f11329b;
                    try {
                        hl1 hl1Var2 = zk1Var.f11328a;
                        if (hl1Var2 == null) {
                            throw null;
                        }
                        ik1 ik1Var = hl1Var2.f5445j;
                        if (ik1Var == null) {
                            return;
                        }
                        final Bundle bundle = new Bundle();
                        bundle.putString("callerPackage", str);
                        bundle.putInt("displayMode", i7);
                        zk1.b(el1Var2.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.rk1
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                il1 il1Var = zk1.f11326c;
                                bundle.putString("sessionToken", (String) obj);
                            }
                        });
                        zk1.b(el1Var2.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.vk1
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                il1 il1Var = zk1.f11326c;
                                bundle.putString("appId", (String) obj);
                            }
                        });
                        ik1Var.L(bundle, new yk1(zk1Var, dl1Var2));
                    } catch (RemoteException e6) {
                        zk1.f11326c.b(e6, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i7), str);
                    }
                }
            }));
        }
    }
}
