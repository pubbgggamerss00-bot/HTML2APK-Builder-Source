package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import k3.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final h<c> f2415a = new h<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2416b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f2417c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2418a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2419b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2420c;

        /* renamed from: d, reason: collision with root package name */
        public final long f2421d;

        public b(int i10, int i11, long j10, long j11) {
            this.f2418a = i10;
            this.f2419b = i11;
            this.f2420c = j10;
            this.f2421d = j11;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public final void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2418a);
                dataOutputStream.writeInt(this.f2419b);
                dataOutputStream.writeLong(this.f2420c);
                dataOutputStream.writeLong(this.f2421d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f2419b == bVar.f2419b && this.f2420c == bVar.f2420c && this.f2418a == bVar.f2418a && this.f2421d == bVar.f2421d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f2419b), Long.valueOf(this.f2420c), Integer.valueOf(this.f2418a), Long.valueOf(this.f2421d));
        }
    }

    public static class c {
    }

    public static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b() {
        c cVar = new c();
        f2417c = cVar;
        f2415a.j(cVar);
        return f2417c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047 A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z10) {
        boolean z11;
        b bVarA;
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z10 || f2417c == null) {
            synchronized (f2416b) {
                if (!z10) {
                    if (f2417c != null) {
                        return;
                    }
                    int i11 = 0;
                    try {
                        assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                        try {
                            z11 = assetFileDescriptorOpenFd.getLength() <= 0;
                            assetFileDescriptorOpenFd.close();
                        } finally {
                        }
                    } catch (IOException unused) {
                        z11 = false;
                    }
                    if (Build.VERSION.SDK_INT != 30) {
                        b();
                        return;
                    }
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z12 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z13 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                bVarA = b.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            bVarA = null;
                        }
                        if (bVarA != null && bVarA.f2420c == jA && (i10 = bVarA.f2419b) != 2) {
                            i11 = i10;
                        } else if (!z11) {
                            i11 = 327680;
                        } else if (z12) {
                            i11 = 1;
                        } else if (z13) {
                            i11 = 2;
                        }
                        if (z10 && z13 && i11 != 1) {
                            i11 = 2;
                        }
                        if (bVarA != null && bVarA.f2419b == 2 && i11 == 1 && length < bVarA.f2421d) {
                            i11 = 3;
                        }
                        b bVar = new b(1, i11, jA, length2);
                        if (bVarA == null || !bVarA.equals(bVar)) {
                            try {
                                bVar.b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                int i112 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() <= 0) {
                }
                assetFileDescriptorOpenFd.close();
                if (Build.VERSION.SDK_INT != 30) {
                }
            }
        }
    }
}
