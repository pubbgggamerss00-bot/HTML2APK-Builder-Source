package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ug extends lh {
    @Override // com.google.android.gms.internal.ads.lh
    public final void a() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f6724a.f3909n) {
            c();
            return;
        }
        synchronized (this.f6727d) {
            kd kdVar = this.f6727d;
            String str = (String) this.f6728e.invoke(null, this.f6724a.f3897a);
            kdVar.i();
            yd.B((yd) kdVar.f4126t, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void b() throws ExecutionException, InterruptedException, TimeoutException {
        dg dgVar = this.f6724a;
        if (dgVar.f3912q) {
            super.b();
        } else if (dgVar.f3909n) {
            c();
        }
    }

    public final void c() throws ExecutionException, InterruptedException, TimeoutException {
        Future future;
        dg dgVar = this.f6724a;
        AdvertisingIdClient advertisingIdClient = null;
        if (dgVar.f3903g) {
            if (dgVar.f3902f == null && (future = dgVar.h) != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    dgVar.h = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    dgVar.h.cancel(true);
                }
            }
            advertisingIdClient = dgVar.f3902f;
        }
        if (advertisingIdClient == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
            String id = info.getId();
            char[] cArr = gg.f5032a;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                id = Base64.encodeToString(bArr, 11);
            }
            if (id != null) {
                synchronized (this.f6727d) {
                    kd kdVar = this.f6727d;
                    kdVar.i();
                    yd.B((yd) kdVar.f4126t, id);
                    kd kdVar2 = this.f6727d;
                    boolean zIsLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                    kdVar2.i();
                    yd.R0((yd) kdVar2.f4126t, zIsLimitAdTrackingEnabled);
                    kd kdVar3 = this.f6727d;
                    kdVar3.i();
                    yd.p0((yd) kdVar3.f4126t);
                }
            }
        } catch (IOException unused3) {
        }
    }

    @Override // com.google.android.gms.internal.ads.lh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException, TimeoutException {
        b();
        return null;
    }
}
