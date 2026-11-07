package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class um1 extends wj1 {

    /* renamed from: e, reason: collision with root package name */
    public os1 f9584e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f9585f;

    /* renamed from: g, reason: collision with root package name */
    public int f9586g;
    public int h;

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws dp1, rn {
        l(os1Var);
        this.f9584e = os1Var;
        Uri uri = os1Var.f7851a;
        long j6 = os1Var.f7854d;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        y5.p("Unsupported scheme: ".concat(String.valueOf(scheme)), "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i6 = j31.f5914a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new rn("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f9585f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e6) {
                throw new rn("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e6, true, 0);
            }
        } else {
            this.f9585f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j7 = os1Var.f7853c;
        int length = this.f9585f.length;
        if (j7 > length) {
            this.f9585f = null;
            throw new dp1();
        }
        int i7 = (int) j7;
        this.f9586g = i7;
        int i8 = length - i7;
        this.h = i8;
        if (j6 != -1) {
            this.h = (int) Math.min(i8, j6);
        }
        m(os1Var);
        return j6 != -1 ? j6 : this.h;
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) {
        if (i7 == 0) {
            return 0;
        }
        int i8 = this.h;
        if (i8 == 0) {
            return -1;
        }
        int iMin = Math.min(i7, i8);
        byte[] bArr2 = this.f9585f;
        int i9 = j31.f5914a;
        System.arraycopy(bArr2, this.f9586g, bArr, i6, iMin);
        this.f9586g += iMin;
        this.h -= iMin;
        a(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        os1 os1Var = this.f9584e;
        if (os1Var != null) {
            return os1Var.f7851a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        if (this.f9585f != null) {
            this.f9585f = null;
            k();
        }
        this.f9584e = null;
    }
}
