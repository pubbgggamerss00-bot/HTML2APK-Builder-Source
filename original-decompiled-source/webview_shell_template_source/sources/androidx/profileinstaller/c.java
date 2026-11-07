package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
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

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1356a = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements InterfaceC0016c {
        @Override // androidx.profileinstaller.c.InterfaceC0016c
        public final void a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.c.InterfaceC0016c
        public final void b(int i6, Object obj) {
            String str;
            switch (i6) {
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
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i6 == 6 || i6 == 7 || i6 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0016c {
        void a();

        void b(int i6, Object obj);
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
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, Executor executor, InterfaceC0016c interfaceC0016c, boolean z6) {
        boolean z7;
        ?? A;
        byte[] bArr;
        s1.a[] aVarArrG;
        s1.a[] aVarArr;
        s1.a[] aVarArr2;
        byte[] bArr2;
        boolean z8;
        boolean z9;
        Throwable th;
        Throwable th2;
        boolean z10;
        boolean z11;
        ?? byteArrayOutputStream;
        boolean z12;
        androidx.profileinstaller.b bVar;
        boolean z13;
        FileInputStream fileInputStreamA;
        boolean z14;
        boolean z15;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z6) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j6 = dataInputStream.readLong();
                            dataInputStream.close();
                            z15 = j6 == packageInfo.lastUpdateTime;
                            if (z15) {
                                interfaceC0016c.b(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z15) {
                    }
                } else {
                    z15 = false;
                    if (z15) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        d.c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.b bVar2 = new androidx.profileinstaller.b(assets, executor, interfaceC0016c, name, file2);
            byte[] bArr3 = bVar2.f1351c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f1354f = true;
                    try {
                        try {
                            A = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e6) {
                            interfaceC0016c.b(6, e6);
                            A = 0;
                            bArr = s1.d.f14341a;
                            if (A != 0) {
                            }
                            aVarArr = bVar2.f1355g;
                            if (aVarArr != null) {
                            }
                            InterfaceC0016c interfaceC0016c2 = bVar2.f1350b;
                            aVarArr2 = bVar2.f1355g;
                            byte[] bArr4 = bVar2.f1351c;
                            boolean z16 = A;
                            z16 = A;
                            if (aVarArr2 != null) {
                            }
                            bArr2 = bVar2.h;
                            if (bArr2 != null) {
                            }
                            if (z9) {
                            }
                            z11 = z9;
                            z14 = z10;
                            d.c(context, (z11 || !z6) ? false : z14);
                        } catch (IOException e7) {
                            interfaceC0016c.b(7, e7);
                            A = 0;
                            bArr = s1.d.f14341a;
                            if (A != 0) {
                            }
                            aVarArr = bVar2.f1355g;
                            if (aVarArr != null) {
                            }
                            InterfaceC0016c interfaceC0016c22 = bVar2.f1350b;
                            aVarArr2 = bVar2.f1355g;
                            byte[] bArr42 = bVar2.f1351c;
                            boolean z162 = A;
                            z162 = A;
                            if (aVarArr2 != null) {
                            }
                            bArr2 = bVar2.h;
                            if (bArr2 != null) {
                            }
                            if (z9) {
                            }
                            z11 = z9;
                            z14 = z10;
                            d.c(context, (z11 || !z6) ? false : z14);
                        }
                        if (A != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e8) {
                                    interfaceC0016c.b(8, e8);
                                    try {
                                        A.close();
                                    } catch (IOException e9) {
                                        interfaceC0016c.b(7, e9);
                                    }
                                    aVarArrG = null;
                                    bVar2.f1355g = aVarArrG;
                                    aVarArr = bVar2.f1355g;
                                    if (aVarArr != null) {
                                    }
                                    InterfaceC0016c interfaceC0016c222 = bVar2.f1350b;
                                    aVarArr2 = bVar2.f1355g;
                                    byte[] bArr422 = bVar2.f1351c;
                                    boolean z1622 = A;
                                    z1622 = A;
                                    if (aVarArr2 != null) {
                                    }
                                    bArr2 = bVar2.h;
                                    if (bArr2 != null) {
                                    }
                                    if (z9) {
                                    }
                                    z11 = z9;
                                    z14 = z10;
                                    d.c(context, (z11 || !z6) ? false : z14);
                                }
                            } catch (IOException e10) {
                                interfaceC0016c.b(7, e10);
                                A.close();
                                aVarArrG = null;
                                bVar2.f1355g = aVarArrG;
                                aVarArr = bVar2.f1355g;
                                if (aVarArr != null) {
                                }
                                InterfaceC0016c interfaceC0016c2222 = bVar2.f1350b;
                                aVarArr2 = bVar2.f1355g;
                                byte[] bArr4222 = bVar2.f1351c;
                                boolean z16222 = A;
                                z16222 = A;
                                if (aVarArr2 != null) {
                                }
                                bArr2 = bVar2.h;
                                if (bArr2 != null) {
                                }
                                if (z9) {
                                }
                                z11 = z9;
                                z14 = z10;
                                d.c(context, (z11 || !z6) ? false : z14);
                            }
                            if (!Arrays.equals(bArr, f5.b.i(A, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            aVarArrG = s1.d.g(A, f5.b.i(A, 4), bVar2.f1353e);
                            try {
                                A.close();
                            } catch (IOException e11) {
                                interfaceC0016c.b(7, e11);
                            }
                            bVar2.f1355g = aVarArrG;
                        }
                        aVarArr = bVar2.f1355g;
                        if (aVarArr != null && ((A = Build.VERSION.SDK_INT) >= 31 || A == 24 || A == 25)) {
                            try {
                                A = "dexopt/baseline.profm";
                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                z13 = A;
                            } catch (FileNotFoundException e12) {
                                interfaceC0016c.b(9, e12);
                                z13 = A;
                            } catch (IOException e13) {
                                interfaceC0016c.b(7, e13);
                                z13 = A;
                            } catch (IllegalStateException e14) {
                                bVar2.f1355g = null;
                                interfaceC0016c.b(8, e14);
                                z13 = A;
                            }
                            if (fileInputStreamA == null) {
                                try {
                                    if (!Arrays.equals(s1.d.f14342b, f5.b.i(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrI = f5.b.i(fileInputStreamA, 4);
                                    bVar2.f1355g = s1.d.d(fileInputStreamA, bArrI, bArr3, aVarArr);
                                    fileInputStreamA.close();
                                    bVar = bVar2;
                                    A = bArrI;
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamA != null) {
                                    fileInputStreamA.close();
                                    z13 = A;
                                }
                                bVar = null;
                                A = z13;
                                if (bVar != null) {
                                }
                            }
                        }
                        InterfaceC0016c interfaceC0016c22222 = bVar2.f1350b;
                        aVarArr2 = bVar2.f1355g;
                        byte[] bArr42222 = bVar2.f1351c;
                        boolean z162222 = A;
                        z162222 = A;
                        if (aVarArr2 != null && bArr42222 != null) {
                            byteArrayOutputStream = bVar2.f1354f;
                            if (byteArrayOutputStream != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e15) {
                                interfaceC0016c22222.b(7, e15);
                                z12 = byteArrayOutputStream;
                            } catch (IllegalStateException e16) {
                                interfaceC0016c22222.b(8, e16);
                                z12 = byteArrayOutputStream;
                            }
                            if (s1.d.i(byteArrayOutputStream, bArr42222, aVarArr2)) {
                                bVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z12 = byteArrayOutputStream;
                                bVar2.f1355g = null;
                                z162222 = z12;
                            } else {
                                interfaceC0016c22222.b(5, null);
                                bVar2.f1355g = null;
                                byteArrayOutputStream.close();
                                z162222 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = bVar2.h;
                        if (bArr2 != null) {
                            z9 = false;
                            z10 = true;
                        } else {
                            try {
                                if (!bVar2.f1354f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(bVar2.f1352d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
                                                                                while (true) {
                                                                                    int i6 = byteArrayInputStream.read(bArr5);
                                                                                    if (i6 <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i6);
                                                                                    }
                                                                                }
                                                                                z10 = true;
                                                                                bVar2.b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                bVar2.h = null;
                                                                                bVar2.f1355g = null;
                                                                                z9 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e17) {
                                        e = e17;
                                        bVar2.b(6, e);
                                        z8 = z162222;
                                        z9 = false;
                                        z10 = z8;
                                        if (z9) {
                                        }
                                        z11 = z9;
                                        z14 = z10;
                                        d.c(context, (z11 || !z6) ? false : z14);
                                    } catch (IOException e18) {
                                        e = e18;
                                        bVar2.b(7, e);
                                        z8 = z162222;
                                        z9 = false;
                                        z10 = z8;
                                        if (z9) {
                                        }
                                        z11 = z9;
                                        z14 = z10;
                                        d.c(context, (z11 || !z6) ? false : z14);
                                    }
                                } catch (FileNotFoundException e19) {
                                    e = e19;
                                    z162222 = true;
                                    bVar2.b(6, e);
                                    z8 = z162222;
                                    z9 = false;
                                    z10 = z8;
                                    if (z9) {
                                    }
                                    z11 = z9;
                                    z14 = z10;
                                    d.c(context, (z11 || !z6) ? false : z14);
                                } catch (IOException e20) {
                                    e = e20;
                                    z162222 = true;
                                    bVar2.b(7, e);
                                    z8 = z162222;
                                    z9 = false;
                                    z10 = z8;
                                    if (z9) {
                                    }
                                    z11 = z9;
                                    z14 = z10;
                                    d.c(context, (z11 || !z6) ? false : z14);
                                }
                            } finally {
                                bVar2.h = null;
                                bVar2.f1355g = null;
                            }
                        }
                        if (z9) {
                            a(packageInfo, filesDir);
                        }
                        z11 = z9;
                        z14 = z10;
                    } finally {
                    }
                    bArr = s1.d.f14341a;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f1354f = true;
                        A = bVar2.a(assets, "dexopt/baseline.prof");
                        bArr = s1.d.f14341a;
                        if (A != 0) {
                        }
                        aVarArr = bVar2.f1355g;
                        if (aVarArr != null) {
                            A = "dexopt/baseline.profm";
                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                            z13 = A;
                            if (fileInputStreamA == null) {
                            }
                        }
                        InterfaceC0016c interfaceC0016c222222 = bVar2.f1350b;
                        aVarArr2 = bVar2.f1355g;
                        byte[] bArr422222 = bVar2.f1351c;
                        boolean z1622222 = A;
                        z1622222 = A;
                        if (aVarArr2 != null) {
                            byteArrayOutputStream = bVar2.f1354f;
                            if (byteArrayOutputStream != 0) {
                            }
                        }
                        bArr2 = bVar2.h;
                        if (bArr2 != null) {
                        }
                        if (z9) {
                        }
                        z11 = z9;
                        z14 = z10;
                    } catch (IOException unused2) {
                        z7 = true;
                        bVar2.b(4, null);
                    }
                }
                d.c(context, (z11 || !z6) ? false : z14);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z7 = true;
            z11 = false;
            z14 = z7;
            d.c(context, (z11 || !z6) ? false : z14);
        } catch (PackageManager.NameNotFoundException e21) {
            interfaceC0016c.b(7, e21);
            d.c(context, false);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements InterfaceC0016c {
        @Override // androidx.profileinstaller.c.InterfaceC0016c
        public final void a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0016c
        public final void b(int i6, Object obj) {
        }
    }
}
