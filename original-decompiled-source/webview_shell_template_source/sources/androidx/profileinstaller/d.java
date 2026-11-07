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

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final y.d<c> f1357a = new y.d<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1358b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f1359c = null;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1360a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1361b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1362c;

        /* renamed from: d, reason: collision with root package name */
        public final long f1363d;

        public b(int i6, int i7, long j6, long j7) {
            this.f1360a = i6;
            this.f1361b = i7;
            this.f1362c = j6;
            this.f1363d = j7;
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
                dataOutputStream.writeInt(this.f1360a);
                dataOutputStream.writeInt(this.f1361b);
                dataOutputStream.writeLong(this.f1362c);
                dataOutputStream.writeLong(this.f1363d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f1361b == bVar.f1361b && this.f1362c == bVar.f1362c && this.f1360a == bVar.f1360a && this.f1363d == bVar.f1363d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f1361b), Long.valueOf(this.f1362c), Integer.valueOf(this.f1360a), Long.valueOf(this.f1363d));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b() {
        c cVar = new c();
        f1359c = cVar;
        f1357a.i(cVar);
        return f1359c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z6) {
        int i6;
        boolean z7;
        int i7;
        long length;
        File file;
        b bVarA;
        b bVar;
        int i8;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z6 || f1359c == null) {
            synchronized (f1358b) {
                if (z6) {
                    i6 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file3.length();
                            if (file3.exists()) {
                                long jA = a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (bVarA == null) {
                                    if (z7) {
                                    }
                                }
                                if (z6) {
                                    i6 = 2;
                                }
                                if (bVarA != null) {
                                    i6 = 3;
                                }
                                bVar = new b(1, i6, jA, length);
                                if (bVarA != null) {
                                    bVar.b(file);
                                }
                                b();
                                return;
                            }
                        }
                    }
                    b();
                    return;
                }
                if (f1359c != null) {
                    return;
                }
                i6 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z7 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z7 = false;
                }
                i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28 && i7 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length22 = file22.length();
                    boolean z8 = !file22.exists() && length22 > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file32.length();
                    boolean z9 = !file32.exists() && length > 0;
                    try {
                        long jA2 = a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            bVarA = null;
                        } else {
                            try {
                                bVarA = b.a(file);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        }
                        if (bVarA == null && bVarA.f1362c == jA2 && (i8 = bVarA.f1361b) != 2) {
                            i6 = i8;
                        } else if (z7) {
                            i6 = 327680;
                        } else if (z8) {
                            i6 = 1;
                        } else if (z9) {
                            i6 = 2;
                        }
                        if (z6 && z9 && i6 != 1) {
                            i6 = 2;
                        }
                        if (bVarA != null && bVarA.f1361b == 2 && i6 == 1 && length22 < bVarA.f1363d) {
                            i6 = 3;
                        }
                        bVar = new b(1, i6, jA2, length);
                        if (bVarA != null || !bVarA.equals(bVar)) {
                            try {
                                bVar.b(file);
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
                b();
                return;
            }
        }
    }
}
