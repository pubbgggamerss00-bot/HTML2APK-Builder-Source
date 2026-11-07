package c3;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static n f2188a;

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f7, code lost:
    
        r6 = r10;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        p3.h hVar;
        p3.h hVar2;
        int i6;
        if (packageInfo != null) {
            boolean z6 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                hVar = z6 ? b0.f2172c : b0.f2171b;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        p3.c cVar = p3.f.f14089t;
                        Object[] objArr = {byteArray};
                        p3.g.a(objArr, 1);
                        hVar2 = new p3.h(objArr, 1);
                    } else {
                        p3.c cVar2 = p3.f.f14089t;
                        hVar2 = p3.h.f14090w;
                    }
                } else {
                    if (i7 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        p3.c cVar3 = p3.f.f14089t;
                        hVar2 = p3.h.f14090w;
                    } else {
                        p3.c cVar4 = p3.f.f14089t;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i8].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i10 = i9 + 1;
                            if (i10 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i10 <= length2) {
                                i6 = length2;
                            } else {
                                i6 = (length2 >> 1) + length2 + 1;
                                if (i6 < i10) {
                                    int iHighestOneBit = Integer.highestOneBit(i9);
                                    i6 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i6 < 0) {
                                    i6 = Integer.MAX_VALUE;
                                }
                            }
                            if (i6 > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                            }
                            objArrCopyOf[i9] = byteArray2;
                            i8++;
                            i9 = i10;
                        }
                        hVar2 = i9 == 0 ? p3.h.f14090w : new p3.h(objArrCopyOf, i9);
                    }
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z6 ? b(packageInfo, b0.f2170a) : b(packageInfo, b0.f2170a[0])) != null) {
                }
            }
            if (hVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            p3.f fVarG = hVar2.g();
            int size = fVarG.size();
            int i11 = 0;
            while (i11 < size) {
                byte[] bArr = (byte[]) fVarG.get(i11);
                p3.c cVarListIterator = hVar.listIterator(0);
                do {
                    int i12 = i11 + 1;
                    if (cVarListIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr, (byte[]) cVarListIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static y b(PackageInfo packageInfo, y... yVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            z zVar = new z(packageInfo.signatures[0].toByteArray());
            for (int i6 = 0; i6 < yVarArr.length; i6++) {
                if (yVarArr[i6].equals(zVar)) {
                    return yVarArr[i6];
                }
            }
        }
        return null;
    }
}
