package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zl1 extends wj1 {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f11339e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f11340f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f11341g;
    public FileInputStream h;

    /* renamed from: i, reason: collision with root package name */
    public long f11342i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11343j;

    public zl1(Context context) {
        super(false);
        this.f11339e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws IOException {
        int i6;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uri = os1Var.f7851a;
                long j6 = os1Var.f7854d;
                long j7 = os1Var.f7853c;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f11340f = uriNormalizeScheme;
                l(os1Var);
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f11339e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f11341g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i6 = 2000;
                    try {
                        throw new ol1(2000, new IOException("Could not open file descriptor for: ".concat(String.valueOf(uriNormalizeScheme))));
                    } catch (IOException e6) {
                        e = e6;
                        if (true == (e instanceof FileNotFoundException)) {
                            i6 = 2005;
                        }
                        throw new ol1(i6, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && j7 > length) {
                    throw new ol1(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j7) - startOffset;
                if (jSkip != j7) {
                    throw new ol1(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f11342i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f11342i = jPosition;
                        if (jPosition < 0) {
                            throw new ol1(2008, null);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f11342i = jPosition;
                    if (jPosition < 0) {
                        throw new ol1(2008, null);
                    }
                }
                if (j6 != -1) {
                    this.f11342i = jPosition == -1 ? j6 : Math.min(jPosition, j6);
                }
                this.f11343j = true;
                m(os1Var);
                return j6 != -1 ? j6 : this.f11342i;
            } catch (IOException e7) {
                e = e7;
                i6 = 2000;
            }
        } catch (ol1 e8) {
            throw e8;
        }
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        if (i7 == 0) {
            return 0;
        }
        long j6 = this.f11342i;
        if (j6 != 0) {
            if (j6 != -1) {
                try {
                    i7 = (int) Math.min(j6, i7);
                } catch (IOException e6) {
                    throw new ol1(2000, e6);
                }
            }
            FileInputStream fileInputStream = this.h;
            int i8 = j31.f5914a;
            int i9 = fileInputStream.read(bArr, i6, i7);
            if (i9 != -1) {
                long j7 = this.f11342i;
                if (j7 != -1) {
                    this.f11342i = j7 - i9;
                }
                a(i9);
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f11340f;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        this.f11340f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f11341g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f11341g = null;
                        if (this.f11343j) {
                            this.f11343j = false;
                            k();
                        }
                    } catch (IOException e6) {
                        throw new ol1(2000, e6);
                    }
                } catch (IOException e7) {
                    throw new ol1(2000, e7);
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f11341g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f11341g = null;
                    if (this.f11343j) {
                        this.f11343j = false;
                        k();
                    }
                    throw th;
                } catch (IOException e8) {
                    throw new ol1(2000, e8);
                }
            }
        } catch (Throwable th2) {
            this.f11341g = null;
            if (this.f11343j) {
                this.f11343j = false;
                k();
            }
            throw th2;
        }
    }
}
