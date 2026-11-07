package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class di0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3939a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    public static final String f3940b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    public static final String f3941c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    public static final String f3942d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    public static final String f3943e = Integer.toString(4, 36);

    public static Bundle a(Spanned spanned, Object obj, int i6, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f3939a, spanned.getSpanStart(obj));
        bundle2.putInt(f3940b, spanned.getSpanEnd(obj));
        bundle2.putInt(f3941c, spanned.getSpanFlags(obj));
        bundle2.putInt(f3942d, i6);
        if (bundle != null) {
            bundle2.putBundle(f3943e, bundle);
        }
        return bundle2;
    }
}
