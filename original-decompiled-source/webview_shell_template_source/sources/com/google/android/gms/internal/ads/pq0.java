package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pq0 {

    /* renamed from: a, reason: collision with root package name */
    public final zzbo f8132a;

    /* renamed from: b, reason: collision with root package name */
    public final i3.a f8133b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f8134c;

    public pq0(zzbo zzboVar, i3.a aVar, h70 h70Var) {
        this.f8132a = zzboVar;
        this.f8133b = aVar;
        this.f8134c = h70Var;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        i3.a aVar = this.f8133b;
        long jB = aVar.b();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jB2 = aVar.b();
        if (bitmapDecodeByteArray != null) {
            long j6 = jB2 - jB;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z6 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sbA = androidx.camera.camera2.internal.g0.a("Decoded image w: ", width, " h:", height, " bytes: ");
            sbA.append(allocationByteCount);
            sbA.append(" time: ");
            sbA.append(j6);
            sbA.append(" on ui thread: ");
            sbA.append(z6);
            zze.zza(sbA.toString());
        }
        return bitmapDecodeByteArray;
    }
}
