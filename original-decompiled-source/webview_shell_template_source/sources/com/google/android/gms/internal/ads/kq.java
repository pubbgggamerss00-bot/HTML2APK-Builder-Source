package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kq extends rq {
    public static final int A;
    public static final int B;
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f6465t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f6466u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6467v;

    /* renamed from: w, reason: collision with root package name */
    public final int f6468w;

    /* renamed from: x, reason: collision with root package name */
    public final int f6469x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6470y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6471z;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        A = Color.rgb(204, 204, 204);
        B = iRgb;
    }

    public kq(String str, List list, Integer num, Integer num2, Integer num3, int i6, int i7) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f6465t = new ArrayList();
        this.f6466u = new ArrayList();
        this.s = str;
        for (int i8 = 0; i8 < list.size(); i8++) {
            mq mqVar = (mq) list.get(i8);
            this.f6465t.add(mqVar);
            this.f6466u.add(mqVar);
        }
        this.f6467v = num != null ? num.intValue() : A;
        this.f6468w = num2 != null ? num2.intValue() : B;
        this.f6469x = num3 != null ? num3.intValue() : 12;
        this.f6470y = i6;
        this.f6471z = i7;
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final String zzg() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final ArrayList zzh() {
        return this.f6466u;
    }
}
