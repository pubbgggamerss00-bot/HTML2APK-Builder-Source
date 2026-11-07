package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jy1 extends wj1 {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f6192e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f6193f;

    /* renamed from: g, reason: collision with root package name */
    public long f6194g;
    public boolean h;

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws IOException {
        Uri uri = os1Var.f7851a;
        long j6 = os1Var.f7853c;
        this.f6193f = uri;
        l(os1Var);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f6192e = randomAccessFile;
            try {
                randomAccessFile.seek(j6);
                long length = os1Var.f7854d;
                if (length == -1) {
                    length = this.f6192e.length() - j6;
                }
                this.f6194g = length;
                if (length < 0) {
                    throw new ox1(null, null, 2008);
                }
                this.h = true;
                m(os1Var);
                return this.f6194g;
            } catch (IOException e6) {
                throw new ox1(2000, e6);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new ox1(((e7.getCause() instanceof ErrnoException) && ((ErrnoException) e7.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e7);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbA = androidx.camera.camera2.internal.i0.a("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbA.append(fragment);
            throw new ox1(sbA.toString(), e7, 1004);
        } catch (SecurityException e8) {
            throw new ox1(2006, e8);
        } catch (RuntimeException e9) {
            throw new ox1(2000, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        if (i7 == 0) {
            return 0;
        }
        long j6 = this.f6194g;
        if (j6 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6192e;
            int i8 = j31.f5914a;
            int i9 = randomAccessFile.read(bArr, i6, (int) Math.min(j6, i7));
            if (i9 > 0) {
                this.f6194g -= i9;
                a(i9);
            }
            return i9;
        } catch (IOException e6) {
            throw new ox1(2000, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f6193f;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        this.f6193f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6192e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f6192e = null;
                if (this.h) {
                    this.h = false;
                    k();
                }
            } catch (IOException e6) {
                throw new ox1(2000, e6);
            }
        } catch (Throwable th) {
            this.f6192e = null;
            if (this.h) {
                this.h = false;
                k();
            }
            throw th;
        }
    }
}
