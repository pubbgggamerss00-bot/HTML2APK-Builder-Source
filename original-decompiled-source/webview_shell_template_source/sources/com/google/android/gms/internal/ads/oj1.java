package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oj1 extends wj1 {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f7790e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f7791f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f7792g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7793i;

    public oj1(Context context) {
        super(false);
        this.f7790e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws IOException {
        try {
            Uri uri = os1Var.f7851a;
            long j6 = os1Var.f7853c;
            this.f7791f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            l(os1Var);
            InputStream inputStreamOpen = this.f7790e.open(path, 1);
            this.f7792g = inputStreamOpen;
            if (inputStreamOpen.skip(j6) < j6) {
                throw new zi1(2008, null);
            }
            long j7 = os1Var.f7854d;
            if (j7 != -1) {
                this.h = j7;
            } else {
                long jAvailable = this.f7792g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.f7793i = true;
            m(os1Var);
            return this.h;
        } catch (zi1 e6) {
            throw e6;
        } catch (IOException e7) {
            throw new zi1(true != (e7 instanceof FileNotFoundException) ? 2000 : 2005, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        if (i7 == 0) {
            return 0;
        }
        long j6 = this.h;
        if (j6 != 0) {
            if (j6 != -1) {
                try {
                    i7 = (int) Math.min(j6, i7);
                } catch (IOException e6) {
                    throw new zi1(2000, e6);
                }
            }
            InputStream inputStream = this.f7792g;
            int i8 = j31.f5914a;
            int i9 = inputStream.read(bArr, i6, i7);
            if (i9 != -1) {
                long j7 = this.h;
                if (j7 != -1) {
                    this.h = j7 - i9;
                }
                a(i9);
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f7791f;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        this.f7791f = null;
        try {
            try {
                InputStream inputStream = this.f7792g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f7792g = null;
                if (this.f7793i) {
                    this.f7793i = false;
                    k();
                }
            } catch (IOException e6) {
                throw new zi1(2000, e6);
            }
        } catch (Throwable th) {
            this.f7792g = null;
            if (this.f7793i) {
                this.f7793i = false;
                k();
            }
            throw th;
        }
    }
}
