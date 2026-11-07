package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hi {

    /* renamed from: a, reason: collision with root package name */
    public final int f5399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5401c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5402d;

    /* renamed from: e, reason: collision with root package name */
    public final ti f5403e;

    /* renamed from: f, reason: collision with root package name */
    public final zi f5404f;

    /* renamed from: n, reason: collision with root package name */
    public int f5411n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5405g = new Object();
    public final ArrayList h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5406i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f5407j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f5408k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f5409l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f5410m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f5412o = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: p, reason: collision with root package name */
    public String f5413p = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: q, reason: collision with root package name */
    public String f5414q = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public hi(int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z6) {
        this.f5399a = i6;
        this.f5400b = i7;
        this.f5401c = i8;
        this.f5402d = z6;
        this.f5403e = new ti(i9, 0);
        this.f5404f = new zi(i10, i11, i12);
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            sb.append((String) arrayList.get(i6));
            sb.append(' ');
            i6++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final void a(String str, boolean z6, float f6, float f7, float f8, float f9) {
        c(str, z6, f6, f7, f8, f9);
        synchronized (this.f5405g) {
            try {
                if (this.f5410m < 0) {
                    zzo.zze("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f5405g) {
            try {
                int i6 = this.f5408k;
                int i7 = this.f5409l;
                int i8 = this.f5400b;
                if (!this.f5402d) {
                    i8 = (i7 * i8) + (i6 * this.f5399a);
                }
                if (i8 > this.f5411n) {
                    this.f5411n = i8;
                    if (!zzv.zzp().d().zzK()) {
                        this.f5412o = this.f5403e.e(this.h);
                        this.f5413p = this.f5403e.e(this.f5406i);
                    }
                    if (!zzv.zzp().d().zzL()) {
                        this.f5414q = this.f5404f.a(this.f5406i, this.f5407j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z6, float f6, float f7, float f8, float f9) {
        if (str != null) {
            if (str.length() < this.f5401c) {
                return;
            }
            synchronized (this.f5405g) {
                try {
                    this.h.add(str);
                    this.f5408k += str.length();
                    if (z6) {
                        this.f5406i.add(str);
                        this.f5407j.add(new si(f6, f7, f8, f9, this.f5406i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hi)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((hi) obj).f5412o;
        return str != null && str.equals(this.f5412o);
    }

    public final int hashCode() {
        return this.f5412o.hashCode();
    }

    public final String toString() {
        int i6 = this.f5409l;
        int i7 = this.f5411n;
        int i8 = this.f5408k;
        String strD = d(this.h);
        String strD2 = d(this.f5406i);
        String str = this.f5412o;
        String str2 = this.f5413p;
        String str3 = this.f5414q;
        StringBuilder sbA = androidx.camera.camera2.internal.g0.a("ActivityContent fetchId: ", i6, " score:", i7, " total_length:");
        sbA.append(i8);
        sbA.append("\n text: ");
        sbA.append(strD);
        sbA.append("\n viewableText");
        sbA.append(strD2);
        sbA.append("\n signture: ");
        sbA.append(str);
        sbA.append("\n viewableSignture: ");
        sbA.append(str2);
        sbA.append("\n viewableSignatureForVertical: ");
        sbA.append(str3);
        return sbA.toString();
    }
}
