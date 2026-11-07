package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ep {

    /* renamed from: a, reason: collision with root package name */
    public final String f4364a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4365b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4366c;

    public ep(int i6, Object obj, String str) {
        this.f4364a = str;
        this.f4365b = obj;
        this.f4366c = i6;
    }

    public static ep a(String str, long j6) {
        return new ep(2, Long.valueOf(j6), str);
    }

    public static ep b(String str, boolean z6) {
        return new ep(1, Boolean.valueOf(z6), str);
    }

    public final Object c() {
        fq fqVar = (fq) hq.f5455a.get();
        Object obj = this.f4365b;
        if (fqVar == null) {
            if (hq.a() != null) {
                hq.a().zza();
            }
            return obj;
        }
        int i6 = this.f4366c - 1;
        String str = this.f4364a;
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? fqVar.a(str, (String) obj) : fqVar.b(str, ((Double) obj).doubleValue()) : fqVar.c(str, ((Long) obj).longValue()) : fqVar.d(str, ((Boolean) obj).booleanValue());
    }
}
