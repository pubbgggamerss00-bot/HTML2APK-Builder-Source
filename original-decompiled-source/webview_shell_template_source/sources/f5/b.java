package f5;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import b6.x;
import e3.h;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ConcurrentModificationException;
import java.util.Objects;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.jvm.internal.j;
import u0.o0;
import y5.n1;
import y5.s;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class b implements h, o0 {
    public static int d(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, i0.g.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static byte[] e(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final long f(InputStream inputStream, OutputStream outputStream, int i6) throws IOException {
        byte[] bArr = new byte[i6];
        int i7 = inputStream.read(bArr);
        long j6 = 0;
        while (i7 >= 0) {
            outputStream.write(bArr, 0, i7);
            j6 += i7;
            i7 = inputStream.read(bArr);
        }
        return j6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class g(v5.c cVar) {
        j.e("<this>", cVar);
        Class<?> clsA = ((kotlin.jvm.internal.c) cVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final int h(w.b bVar, Object obj, int i6) {
        int i7 = bVar.f14835u;
        if (i7 == 0) {
            return -1;
        }
        try {
            int iA = x.a.a(i7, i6, bVar.s);
            if (iA < 0 || j.a(obj, bVar.f14834t[iA])) {
                return iA;
            }
            int i8 = iA + 1;
            while (i8 < i7 && bVar.s[i8] == i6) {
                if (j.a(obj, bVar.f14834t[i8])) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = iA - 1; i9 >= 0 && bVar.s[i9] == i6; i9--) {
                if (j.a(obj, bVar.f14834t[i9])) {
                    return i9;
                }
            }
            return ~i8;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static byte[] i(InputStream inputStream, int i6) throws IOException {
        byte[] bArr = new byte[i6];
        int i7 = 0;
        while (i7 < i6) {
            int i8 = inputStream.read(bArr, i7, i6 - i7);
            if (i8 < 0) {
                throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Not enough bytes to read: "));
            }
            i7 += i8;
        }
        return bArr;
    }

    public static byte[] j(FileInputStream fileInputStream, int i6, int i7) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i7];
            byte[] bArr2 = new byte[2048];
            int i8 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i8 < i6) {
                int i9 = fileInputStream.read(bArr2);
                if (i9 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i6 + " bytes");
                }
                inflater.setInput(bArr2, 0, i9);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i7 - iInflate);
                    i8 += i9;
                } catch (DataFormatException e6) {
                    throw new IllegalStateException(e6.getMessage());
                }
            }
            if (i8 == i6) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i6 + " actual=" + i8);
        } finally {
            inflater.end();
        }
    }

    public static long k(InputStream inputStream, int i6) throws IOException {
        byte[] bArrI = i(inputStream, i6);
        long j6 = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            j6 += (bArrI[i7] & 255) << (i7 * 8);
        }
        return j6;
    }

    public static final void l(Object[] objArr, int i6, int i7) {
        j.e("<this>", objArr);
        while (i6 < i7) {
            objArr[i6] = null;
            i6++;
        }
    }

    public static final void m(y5.f fVar, g5.d dVar, boolean z6) {
        Object obj = y5.f.f15341y.get(fVar);
        Throwable thD = fVar.d(obj);
        Object objA = thD != null ? d5.e.a(thD) : fVar.e(obj);
        if (!z6) {
            dVar.g(objA);
            return;
        }
        j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", dVar);
        b6.g gVar = (b6.g) dVar;
        i5.c cVar = gVar.f2021w;
        Object obj2 = gVar.f2023y;
        g5.f fVar2 = cVar.f13373t;
        j.b(fVar2);
        Object objC = x.c(fVar2, obj2);
        n1 n1VarA = objC != x.f2051a ? s.a(cVar, fVar2) : null;
        try {
            cVar.g(objA);
            if (n1VarA == null) {
                x.a(fVar2, objC);
            } else {
                n1VarA.P();
                throw null;
            }
        } catch (Throwable th) {
            if (n1VarA != null) {
                n1VarA.P();
                throw null;
            }
            x.a(fVar2, objC);
            throw th;
        }
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, long j6, int i6) throws IOException {
        byte[] bArr = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i7] = (byte) ((j6 >> (i7 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, int i6) throws IOException {
        n(byteArrayOutputStream, i6, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e3.h
    public void accept(Object obj, Object obj2) {
        n3.e eVar = (n3.e) ((n3.c) obj).getService();
        z2.c cVar = new z2.c(null, null);
        n3.j jVar = new n3.j((v3.f) obj2);
        eVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i6 = n3.b.f13921a;
        parcelObtain.writeInt(1);
        cVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(jVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            eVar.s.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    public void b() {
    }

    public void c() {
    }
}
