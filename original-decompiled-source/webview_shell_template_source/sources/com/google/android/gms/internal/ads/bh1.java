package com.google.android.gms.internal.ads;

import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bh1 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3181a = new int[2];

    public final JSONObject a(View view) {
        if (view == null) {
            return gh1.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.f3181a;
        view.getLocationOnScreen(iArr);
        return gh1.a(iArr[0], iArr[1], width, height);
    }
}
