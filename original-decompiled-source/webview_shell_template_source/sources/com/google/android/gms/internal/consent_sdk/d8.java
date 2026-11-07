package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d8 implements t7 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f11683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11684b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f11685c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11686d;

    public d8(v7 v7Var, String str, Object[] objArr) {
        this.f11683a = v7Var;
        this.f11684b = str;
        this.f11685c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11686d = cCharAt;
            return;
        }
        int i6 = cCharAt & 8191;
        int i7 = 1;
        int i8 = 13;
        while (true) {
            int i9 = i7 + 1;
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 55296) {
                this.f11686d = i6 | (cCharAt2 << i8);
                return;
            } else {
                i6 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i7 = i9;
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.t7
    public final v7 zza() {
        return this.f11683a;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t7
    public final boolean zzb() {
        return (this.f11686d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t7
    public final int zzc() {
        int i6 = this.f11686d;
        if ((i6 & 1) != 0) {
            return 1;
        }
        return (i6 & 4) == 4 ? 3 : 2;
    }
}
