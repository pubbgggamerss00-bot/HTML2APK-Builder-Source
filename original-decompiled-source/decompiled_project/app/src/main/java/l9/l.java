package l9;

import android.content.Context;
import android.os.PowerManager;
import android.util.Log;
import com.google.protobuf.DescriptorProtos;
import e9.s0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f16852a = new l();

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, String str, long j10, s0.e.a.C0086a c0086a, vg.c cVar) throws Throwable {
        k kVar;
        PowerManager.WakeLock wakeLock;
        String str2 = str;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f16851e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f16851e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(this, cVar);
            }
        }
        Object objInvoke = kVar.f16849c;
        Object obj = ug.a.f29706a;
        int i11 = kVar.f16851e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PowerManager.WakeLock wakeLock2 = kVar.f16848b;
            String str3 = kVar.f16847a;
            try {
                pg.q.b(objInvoke);
                wakeLock = wakeLock2;
                str2 = str3;
                Object obj2 = objInvoke;
                if (wakeLock != null) {
                    try {
                        if (wakeLock.isHeld()) {
                            wakeLock.release();
                            Log.d("BackgroundHelper", "Released WakeLock: " + str2);
                        }
                    } catch (Exception e10) {
                        Log.w("BackgroundHelper", "Failed to release WakeLock", e10);
                    }
                }
                return obj2;
            } catch (Throwable th2) {
                th = th2;
                wakeLock = wakeLock2;
                str2 = str3;
                Throwable th3 = th;
                if (wakeLock != null) {
                    throw th3;
                }
                try {
                    if (!wakeLock.isHeld()) {
                        throw th3;
                    }
                    wakeLock.release();
                    Log.d("BackgroundHelper", "Released WakeLock: " + str2);
                    throw th3;
                } catch (Exception e11) {
                    Log.w("BackgroundHelper", "Failed to release WakeLock", e11);
                    throw th3;
                }
            }
        }
        pg.q.b(objInvoke);
        Object systemService = context.getSystemService("power");
        wakeLock = null;
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager != null) {
            try {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, str2);
                if (wakeLockNewWakeLock != null) {
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    wakeLockNewWakeLock.acquire(j10);
                    Log.d("BackgroundHelper", "Acquired WakeLock: " + str2 + " (timeout: " + (j10 / DescriptorProtos.Edition.EDITION_2023_VALUE) + "s)");
                    wakeLock = wakeLockNewWakeLock;
                }
            } catch (Exception e12) {
                Log.w("BackgroundHelper", "Failed to acquire WakeLock", e12);
            }
        }
        try {
            kVar.f16847a = str2;
            kVar.f16848b = wakeLock;
            kVar.f16851e = 1;
            objInvoke = c0086a.invoke(kVar);
            if (objInvoke == obj) {
                return obj;
            }
            Object obj22 = objInvoke;
            if (wakeLock != null) {
            }
            return obj22;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            if (wakeLock != null) {
            }
        }
    }
}
