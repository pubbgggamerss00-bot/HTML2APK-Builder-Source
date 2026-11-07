package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a42 extends wj1 {

    /* renamed from: e, reason: collision with root package name */
    public final Context f2568e;

    /* renamed from: f, reason: collision with root package name */
    public os1 f2569f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f2570g;
    public FileInputStream h;

    /* renamed from: i, reason: collision with root package name */
    public long f2571i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2572j;

    public a42(Context context) {
        super(false);
        this.f2568e = context.getApplicationContext();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws Resources.NotFoundException, dp1, PackageManager.NameNotFoundException, NumberFormatException {
        Resources resourcesForApplication;
        int identifier;
        Resources resources;
        long size;
        this.f2569f = os1Var;
        l(os1Var);
        Uri uri = os1Var.f7851a;
        long j6 = os1Var.f7854d;
        long j7 = os1Var.f7853c;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f2568e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new k32(androidx.camera.camera2.internal.compat.workaround.c.d(pathSegments.size(), "rawresource:// URI must have exactly one path element, found "), null, 2000);
            }
            try {
                identifier = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new k32("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new k32(androidx.camera.camera2.internal.v0.b("Unsupported URI scheme (", uriNormalizeScheme.getScheme(), "). Only android.resource is supported."), null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new k32("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e6, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new k32("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(androidx.activity.m.d(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new k32("Resource not found.", null, 2005);
                }
            }
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new k32("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
            }
            this.f2570g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f2570g.getFileDescriptor());
            this.h = fileInputStream;
            try {
                if (length != -1 && j7 > length) {
                    throw new k32(null, null, 2008);
                }
                long startOffset = this.f2570g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j7) - startOffset;
                if (jSkip != j7) {
                    throw new k32(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f2571i = -1L;
                        size = -1;
                    } else {
                        size = channel.size() - channel.position();
                        this.f2571i = size;
                        if (size < 0) {
                            throw new k32(null, null, 2008);
                        }
                    }
                } else {
                    size = length - jSkip;
                    this.f2571i = size;
                    if (size < 0) {
                        throw new dp1();
                    }
                }
                if (j6 != -1) {
                    this.f2571i = size == -1 ? j6 : Math.min(size, j6);
                }
                this.f2572j = true;
                m(os1Var);
                return j6 != -1 ? j6 : this.f2571i;
            } catch (k32 e7) {
                throw e7;
            } catch (IOException e8) {
                throw new k32(null, e8, 2000);
            }
        } catch (Resources.NotFoundException e9) {
            throw new k32(null, e9, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        if (i7 == 0) {
            return 0;
        }
        long j6 = this.f2571i;
        if (j6 != 0) {
            if (j6 != -1) {
                try {
                    i7 = (int) Math.min(j6, i7);
                } catch (IOException e6) {
                    throw new k32(null, e6, 2000);
                }
            }
            FileInputStream fileInputStream = this.h;
            int i8 = j31.f5914a;
            int i9 = fileInputStream.read(bArr, i6, i7);
            if (i9 != -1) {
                long j7 = this.f2571i;
                if (j7 != -1) {
                    this.f2571i = j7 - i9;
                }
                a(i9);
                return i9;
            }
            if (this.f2571i != -1) {
                throw new k32("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        os1 os1Var = this.f2569f;
        if (os1Var != null) {
            return os1Var.f7851a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        this.f2569f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f2570g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f2570g = null;
                        if (this.f2572j) {
                            this.f2572j = false;
                            k();
                        }
                    } catch (IOException e6) {
                        throw new k32(null, e6, 2000);
                    }
                } catch (IOException e7) {
                    throw new k32(null, e7, 2000);
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f2570g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f2570g = null;
                    if (this.f2572j) {
                        this.f2572j = false;
                        k();
                    }
                    throw th;
                } catch (IOException e8) {
                    throw new k32(null, e8, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f2570g = null;
            if (this.f2572j) {
                this.f2572j = false;
                k();
            }
            throw th2;
        }
    }
}
