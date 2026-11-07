package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w62 implements i62 {

    /* renamed from: a, reason: collision with root package name */
    public final m62 f10074a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10075b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f10076c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10077d;

    public w62(m62 m62Var, String str, Object[] objArr) {
        this.f10074a = m62Var;
        this.f10075b = str;
        this.f10076c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f10077d = cCharAt;
            return;
        }
        int i6 = cCharAt & 8191;
        int i7 = 1;
        int i8 = 13;
        while (true) {
            int i9 = i7 + 1;
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 55296) {
                this.f10077d = i6 | (cCharAt2 << i8);
                return;
            } else {
                i6 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i7 = i9;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i62
    public final m62 zza() {
        return this.f10074a;
    }

    @Override // com.google.android.gms.internal.ads.i62
    public final boolean zzb() {
        return (this.f10077d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.i62
    public final int zzc() {
        int i6 = this.f10077d;
        if ((i6 & 1) != 0) {
            return 1;
        }
        return (i6 & 4) == 4 ? 3 : 2;
    }
}
