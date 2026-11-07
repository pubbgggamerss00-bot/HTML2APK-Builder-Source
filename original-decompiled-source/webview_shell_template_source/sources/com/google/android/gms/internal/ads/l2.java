package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class l2 implements j0, ra, r70, om0, zb0, nx0, eq0, em1 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f6565t;

    public /* synthetic */ l2(int i6, Object obj) {
        this.s = i6;
        this.f6565t = obj;
    }

    @Override // com.google.android.gms.internal.ads.ra
    public void a(MessageDigest[] messageDigestArr, long j6, int i6) {
        ByteBuffer byteBufferSlice;
        synchronized (((ByteBuffer) this.f6565t)) {
            int i7 = (int) j6;
            ((ByteBuffer) this.f6565t).position(i7);
            ((ByteBuffer) this.f6565t).limit(i7 + i6);
            byteBufferSlice = ((ByteBuffer) this.f6565t).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx0
    public c5.a b(r30 r30Var) {
        dx0 dx0Var = (dx0) this.f6565t;
        synchronized (dx0Var.f3318b) {
            try {
                int i6 = dx0Var.h;
                if (i6 != 1 && i6 != 2) {
                    return bs1.l(new ix0(2));
                }
                if (dx0Var.f3319c) {
                    return dx0Var.f3317a;
                }
                dx0Var.h = 2;
                dx0Var.f3319c = true;
                dx0Var.f3321e = r30Var;
                dx0Var.f3322f.checkAvailabilityAndConnect();
                o70 o70Var = dx0Var.f3317a;
                o70Var.s.addListener(new x(13, dx0Var), i70.f5592g);
                return dx0Var.f3317a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j0
    public long c(long j6) {
        d1 d1Var = (d1) this.f6565t;
        return Math.max(0L, Math.min((j6 * d1Var.f3713e) / 1000000, d1Var.f3717j - 1));
    }

    public int d() {
        int iOptInt = ((JSONObject) this.f6565t).optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        return Boolean.valueOf(((AtomicBoolean) this.f6565t).get());
    }

    public l2(ByteBuffer byteBuffer) {
        this.s = 3;
        this.f6565t = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.ra
    public long zza() {
        return ((ByteBuffer) this.f6565t).capacity();
    }

    public l2(byte[] bArr) {
        this.s = 4;
        this.f6565t = new byte[256];
        for (int i6 = 0; i6 < 256; i6++) {
            ((byte[]) this.f6565t)[i6] = (byte) i6;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            byte[] bArr2 = (byte[]) this.f6565t;
            byte b7 = bArr2[i8];
            i7 = (i7 + b7 + bArr[i8 % bArr.length]) & 255;
            bArr2[i8] = bArr2[i7];
            bArr2[i7] = b7;
        }
    }

    @Override // com.google.android.gms.internal.ads.r70, com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 6:
                zze.zza("Getting a new session for JS Engine.");
                ((o70) ((zw) this.f6565t).f8823t).a(((nw) obj).zzj());
                break;
            case 7:
                ((o70) this.f6565t).a((dx) obj);
                break;
            case 8:
                ((rk0) obj).k0((com.google.android.gms.ads.internal.client.zze) this.f6565t);
                break;
            case 13:
                vd1 vd1Var = (vd1) this.f6565t;
                ((be1) obj).n((yd1) vd1Var.s, vd1Var.f9833t);
                break;
            default:
                ((bs) obj).l((n90) this.f6565t);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public void zza(boolean z6, int i6, String str, String str2) {
        n70 n70Var = (n70) this.f6565t;
        if (z6) {
            n70Var.c();
            return;
        }
        n70Var.b(new p21(1, "Image Web View failed to load. Error code: " + i6 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
