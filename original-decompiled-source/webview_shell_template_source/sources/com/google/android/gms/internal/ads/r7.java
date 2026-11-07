package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8561b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f8562c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f8563d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8564e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8565f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8566g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8567i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8568j;

    public r7(String str, int i6, Integer num, Integer num2, float f6, boolean z6, boolean z7, boolean z8, boolean z9, int i7) {
        this.f8560a = str;
        this.f8561b = i6;
        this.f8562c = num;
        this.f8563d = num2;
        this.f8564e = f6;
        this.f8565f = z6;
        this.f8566g = z7;
        this.h = z8;
        this.f8567i = z9;
        this.f8568j = i7;
    }

    public static Integer a(String str) {
        try {
            long j6 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            y5.n(j6 <= 4294967295L);
            return Integer.valueOf(Color.argb(ed0.l(((j6 >> 24) & 255) ^ 255), ed0.l(j6 & 255), ed0.l((j6 >> 8) & 255), ed0.l((j6 >> 16) & 255)));
        } catch (IllegalArgumentException e6) {
            qs0.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e6);
            return null;
        }
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i6 = Integer.parseInt(str);
            return i6 == 1 || i6 == -1;
        } catch (NumberFormatException e6) {
            qs0.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e6);
            return false;
        }
    }
}
