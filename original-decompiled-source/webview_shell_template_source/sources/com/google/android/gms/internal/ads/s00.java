package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s00 extends ni0 {
    public final String A;
    public final String B;

    /* renamed from: v, reason: collision with root package name */
    public final Map f8753v;

    /* renamed from: w, reason: collision with root package name */
    public final Activity f8754w;

    /* renamed from: x, reason: collision with root package name */
    public final String f8755x;

    /* renamed from: y, reason: collision with root package name */
    public final long f8756y;

    /* renamed from: z, reason: collision with root package name */
    public final long f8757z;

    public s00(xa0 xa0Var, Map map) throws NumberFormatException {
        long j6;
        super(5, xa0Var, "createCalendarEvent");
        this.f8753v = map;
        this.f8754w = xa0Var.zzi();
        this.f8755x = q("description");
        this.A = q("summary");
        String str = (String) map.get("start_ticks");
        long j7 = -1;
        if (str == null) {
            j6 = -1;
        } else {
            try {
                j6 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        this.f8756y = j6;
        String str2 = (String) this.f8753v.get("end_ticks");
        if (str2 != null) {
            try {
                j7 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f8757z = j7;
        this.B = q("location");
    }

    public final String q(String str) {
        Map map = this.f8753v;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : (String) map.get(str);
    }
}
