package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import t5.f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2414a = new a();

    public class a implements InterfaceC0035c {
        @Override // androidx.profileinstaller.c.InterfaceC0035c
        public final void a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0035c
        public final void b(int i10, Object obj) {
        }
    }

    public class b implements InterfaceC0035c {
        @Override // androidx.profileinstaller.c.InterfaceC0035c
        public final void a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.c.InterfaceC0035c
        public final void b(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0035c {
        void a();

        void b(int i10, Object obj);
    }

    public static void a(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, Executor executor, InterfaceC0035c interfaceC0035c, boolean z10) throws PackageManager.NameNotFoundException, IOException {
        boolean z11;
        ?? A;
        byte[] bArr;
        t5.b[] bVarArrG;
        t5.b[] bVarArr;
        t5.b[] bVarArr2;
        byte[] bArr2;
        boolean z12;
        boolean z13;
        Throwable th2;
        Throwable th3;
        FileLock fileLockTryLock;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ?? byteArrayOutputStream;
        androidx.profileinstaller.b bVar;
        String str;
        String str2;
        FileInputStream fileInputStreamA;
        boolean z18;
        boolean z19;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            z19 = j10 == packageInfo.lastUpdateTime;
                            if (z19) {
                                interfaceC0035c.b(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z19) {
                    }
                } else {
                    z19 = false;
                    if (z19) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        d.c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.b bVar2 = new androidx.profileinstaller.b(assets, executor, interfaceC0035c, name, file2);
            byte[] bArr3 = bVar2.f2408c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f2411f = true;
                    try {
                        try {
                            A = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e10) {
                            interfaceC0035c.b(6, e10);
                            A = 0;
                            bArr = f.f27974a;
                            if (A != 0) {
                            }
                            bVarArr = bVar2.f2412g;
                            if (bVarArr != null) {
                            }
                            InterfaceC0035c interfaceC0035c2 = bVar2.f2407b;
                            bVarArr2 = bVar2.f2412g;
                            byte[] bArr4 = bVar2.f2408c;
                            boolean z20 = A;
                            z20 = A;
                            if (bVarArr2 != null) {
                            }
                            bArr2 = bVar2.f2413h;
                            if (bArr2 != null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z18 = z14;
                            d.c(context, (z15 || !z10) ? false : z18);
                        } catch (IOException e11) {
                            interfaceC0035c.b(7, e11);
                            A = 0;
                            bArr = f.f27974a;
                            if (A != 0) {
                            }
                            bVarArr = bVar2.f2412g;
                            if (bVarArr != null) {
                            }
                            InterfaceC0035c interfaceC0035c22 = bVar2.f2407b;
                            bVarArr2 = bVar2.f2412g;
                            byte[] bArr42 = bVar2.f2408c;
                            boolean z202 = A;
                            z202 = A;
                            if (bVarArr2 != null) {
                            }
                            bArr2 = bVar2.f2413h;
                            if (bArr2 != null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z18 = z14;
                            d.c(context, (z15 || !z10) ? false : z18);
                        }
                        if (A != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e12) {
                                    interfaceC0035c.b(8, e12);
                                    try {
                                        A.close();
                                    } catch (IOException e13) {
                                        interfaceC0035c.b(7, e13);
                                    }
                                    bVarArrG = null;
                                    bVar2.f2412g = bVarArrG;
                                    bVarArr = bVar2.f2412g;
                                    if (bVarArr != null) {
                                    }
                                    InterfaceC0035c interfaceC0035c222 = bVar2.f2407b;
                                    bVarArr2 = bVar2.f2412g;
                                    byte[] bArr422 = bVar2.f2408c;
                                    boolean z2022 = A;
                                    z2022 = A;
                                    if (bVarArr2 != null) {
                                    }
                                    bArr2 = bVar2.f2413h;
                                    if (bArr2 != null) {
                                    }
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    d.c(context, (z15 || !z10) ? false : z18);
                                }
                            } catch (IOException e14) {
                                interfaceC0035c.b(7, e14);
                                A.close();
                                bVarArrG = null;
                                bVar2.f2412g = bVarArrG;
                                bVarArr = bVar2.f2412g;
                                if (bVarArr != null) {
                                }
                                InterfaceC0035c interfaceC0035c2222 = bVar2.f2407b;
                                bVarArr2 = bVar2.f2412g;
                                byte[] bArr4222 = bVar2.f2408c;
                                boolean z20222 = A;
                                z20222 = A;
                                if (bVarArr2 != null) {
                                }
                                bArr2 = bVar2.f2413h;
                                if (bArr2 != null) {
                                }
                                if (z13) {
                                }
                                z15 = z13;
                                z18 = z14;
                                d.c(context, (z15 || !z10) ? false : z18);
                            }
                            if (!Arrays.equals(bArr, t5.c.b(4, A))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            bVarArrG = f.g(A, t5.c.b(4, A), bVar2.f2410e);
                            try {
                                A.close();
                            } catch (IOException e15) {
                                interfaceC0035c.b(7, e15);
                            }
                            bVar2.f2412g = bVarArrG;
                        }
                        bVarArr = bVar2.f2412g;
                        if (bVarArr != null && (A = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e16) {
                                interfaceC0035c.b(9, e16);
                                str = A;
                            } catch (IOException e17) {
                                interfaceC0035c.b(7, e17);
                                str = A;
                            } catch (IllegalStateException e18) {
                                bVar2.f2412g = null;
                                interfaceC0035c.b(8, e18);
                                str = A;
                            }
                            if (fileInputStreamA == null) {
                                try {
                                    if (!Arrays.equals(f.f27975b, t5.c.b(4, fileInputStreamA))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrB = t5.c.b(4, fileInputStreamA);
                                    bVar2.f2412g = f.d(fileInputStreamA, bArrB, bArr3, bVarArr);
                                    fileInputStreamA.close();
                                    bVar = bVar2;
                                    A = bArrB;
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamA != null) {
                                    fileInputStreamA.close();
                                    str = str2;
                                }
                                bVar = null;
                                A = str;
                                if (bVar != null) {
                                }
                            }
                        }
                        InterfaceC0035c interfaceC0035c22222 = bVar2.f2407b;
                        bVarArr2 = bVar2.f2412g;
                        byte[] bArr42222 = bVar2.f2408c;
                        boolean z202222 = A;
                        z202222 = A;
                        if (bVarArr2 != null && bArr42222 != null) {
                            z16 = bVar2.f2411f;
                            if (z16) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e19) {
                                interfaceC0035c22222.b(7, e19);
                                z17 = z16;
                            } catch (IllegalStateException e20) {
                                interfaceC0035c22222.b(8, e20);
                                z17 = z16;
                            }
                            if (f.i(byteArrayOutputStream, bArr42222, bVarArr2)) {
                                bVar2.f2413h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z17 = byteArrayOutputStream;
                                bVar2.f2412g = null;
                                z202222 = z17;
                            } else {
                                interfaceC0035c22222.b(5, null);
                                bVar2.f2412g = null;
                                byteArrayOutputStream.close();
                                z202222 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = bVar2.f2413h;
                        if (bArr2 != null) {
                            z13 = false;
                            z14 = true;
                        } else {
                            try {
                                if (!bVar2.f2411f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(bVar2.f2409d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                        try {
                                                            try {
                                                                if (fileLockTryLock != null) {
                                                                    try {
                                                                        if (fileLockTryLock.isValid()) {
                                                                            byte[] bArr5 = new byte[512];
                                                                            while (true) {
                                                                                int i10 = byteArrayInputStream.read(bArr5);
                                                                                if (i10 <= 0) {
                                                                                    break;
                                                                                } else {
                                                                                    fileOutputStream.write(bArr5, 0, i10);
                                                                                }
                                                                            }
                                                                            z14 = true;
                                                                            bVar2.b(1, null);
                                                                            fileLockTryLock.close();
                                                                            channel.close();
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            bVar2.f2413h = null;
                                                                            bVar2.f2412g = null;
                                                                            z13 = true;
                                                                        }
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        Throwable th6 = th;
                                                                        if (fileLockTryLock == null) {
                                                                            throw th6;
                                                                        }
                                                                        try {
                                                                            fileLockTryLock.close();
                                                                            throw th6;
                                                                        } catch (Throwable th7) {
                                                                            th6.addSuppressed(th7);
                                                                            throw th6;
                                                                        }
                                                                    }
                                                                }
                                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            Throwable th10 = th;
                                                            if (channel == null) {
                                                                throw th10;
                                                            }
                                                            try {
                                                                channel.close();
                                                                throw th10;
                                                            } catch (Throwable th11) {
                                                                th10.addSuppressed(th11);
                                                                throw th10;
                                                            }
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th3 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th3;
                                                        } catch (Throwable th13) {
                                                            th3.addSuppressed(th13);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    th3 = th;
                                                    fileOutputStream.close();
                                                    throw th3;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                                th2 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th16) {
                                                    th2.addSuppressed(th16);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            th2 = th;
                                            byteArrayInputStream.close();
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e21) {
                                        e = e21;
                                        z202222 = true;
                                        bVar2.b(6, e);
                                        z12 = z202222;
                                        z13 = false;
                                        z14 = z12;
                                        if (z13) {
                                        }
                                        z15 = z13;
                                        z18 = z14;
                                        d.c(context, (z15 || !z10) ? false : z18);
                                    } catch (IOException e22) {
                                        e = e22;
                                        z202222 = true;
                                        bVar2.b(7, e);
                                        z12 = z202222;
                                        z13 = false;
                                        z14 = z12;
                                        if (z13) {
                                        }
                                        z15 = z13;
                                        z18 = z14;
                                        d.c(context, (z15 || !z10) ? false : z18);
                                    }
                                } catch (FileNotFoundException e23) {
                                    e = e23;
                                    bVar2.b(6, e);
                                    z12 = z202222;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    d.c(context, (z15 || !z10) ? false : z18);
                                } catch (IOException e24) {
                                    e = e24;
                                    bVar2.b(7, e);
                                    z12 = z202222;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    d.c(context, (z15 || !z10) ? false : z18);
                                }
                            } finally {
                                bVar2.f2413h = null;
                                bVar2.f2412g = null;
                            }
                        }
                        if (z13) {
                            a(packageInfo, filesDir);
                        }
                        z15 = z13;
                        z18 = z14;
                    } finally {
                    }
                    bArr = f.f27974a;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f2411f = true;
                        A = bVar2.a(assets, "dexopt/baseline.prof");
                        bArr = f.f27974a;
                        if (A != 0) {
                        }
                        bVarArr = bVar2.f2412g;
                        if (bVarArr != null) {
                            str2 = "dexopt/baseline.profm";
                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (fileInputStreamA == null) {
                            }
                        }
                        InterfaceC0035c interfaceC0035c222222 = bVar2.f2407b;
                        bVarArr2 = bVar2.f2412g;
                        byte[] bArr422222 = bVar2.f2408c;
                        boolean z2022222 = A;
                        z2022222 = A;
                        if (bVarArr2 != null) {
                            z16 = bVar2.f2411f;
                            if (z16) {
                            }
                        }
                        bArr2 = bVar2.f2413h;
                        if (bArr2 != null) {
                        }
                        if (z13) {
                        }
                        z15 = z13;
                        z18 = z14;
                    } catch (IOException unused2) {
                        z11 = true;
                        bVar2.b(4, null);
                    }
                }
                d.c(context, (z15 || !z10) ? false : z18);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z11 = true;
            z15 = false;
            z18 = z11;
            d.c(context, (z15 || !z10) ? false : z18);
        } catch (PackageManager.NameNotFoundException e25) {
            interfaceC0035c.b(7, e25);
            d.c(context, false);
        }
    }
}
