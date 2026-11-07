package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import p1.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xz0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10752a;

    public xz0(Context context) {
        this.f10752a = context;
    }

    public final c5.a a(boolean z6) {
        try {
            r1.a aVar = new r1.a(MobileAds.ERROR_DOMAIN, z6);
            a.C0084a c0084aA = p1.a.a(this.f10752a);
            return c0084aA != null ? c0084aA.b(aVar) : bs1.l(new IllegalStateException());
        } catch (Exception e6) {
            return bs1.l(e6);
        }
    }
}
