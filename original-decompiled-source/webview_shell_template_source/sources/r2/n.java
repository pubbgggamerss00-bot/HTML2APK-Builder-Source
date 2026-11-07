package r2;

import android.os.Build;
import androidx.work.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends v1.b<l> {
    @Override // v1.k
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:58|(2:105|59)|(5:110|60|(2:63|61)|112|69)|101|73|84) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01aa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ab, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01a3 -> B:101:0x01a6). Please report as a decompilation issue!!! */
    @Override // v1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(a2.e eVar, l lVar) throws Throwable {
        int i6;
        int i7;
        Throwable th;
        ObjectOutputStream objectOutputStream;
        l lVar2 = lVar;
        String str = lVar2.f14280a;
        int i8 = 1;
        if (str == null) {
            eVar.c(1);
        } else {
            eVar.d(1, str);
        }
        eVar.b(2, u.f(lVar2.f14281b));
        String str2 = lVar2.f14282c;
        if (str2 == null) {
            eVar.c(3);
        } else {
            eVar.d(3, str2);
        }
        String str3 = lVar2.f14283d;
        if (str3 == null) {
            eVar.c(4);
        } else {
            eVar.d(4, str3);
        }
        byte[] bArrC = androidx.work.f.c(lVar2.f14284e);
        if (bArrC == null) {
            eVar.c(5);
        } else {
            eVar.a(5, bArrC);
        }
        byte[] bArrC2 = androidx.work.f.c(lVar2.f14285f);
        if (bArrC2 == null) {
            eVar.c(6);
        } else {
            eVar.a(6, bArrC2);
        }
        eVar.b(7, lVar2.f14286g);
        eVar.b(8, lVar2.h);
        eVar.b(9, lVar2.f14287i);
        eVar.b(10, lVar2.f14289k);
        androidx.work.a aVar = lVar2.f14290l;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            i6 = 0;
        } else {
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
            }
            i6 = 1;
        }
        eVar.b(11, i6);
        eVar.b(12, lVar2.f14291m);
        eVar.b(13, lVar2.f14292n);
        eVar.b(14, lVar2.f14293o);
        eVar.b(15, lVar2.f14294p);
        eVar.b(16, lVar2.f14295q ? 1L : 0L);
        androidx.work.o oVar = lVar2.f14296r;
        int iOrdinal2 = oVar.ordinal();
        if (iOrdinal2 == 0) {
            i7 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new IllegalArgumentException("Could not convert " + oVar + " to int");
            }
            i7 = 1;
        }
        eVar.b(17, i7);
        androidx.work.d dVar = lVar2.f14288j;
        if (dVar == null) {
            eVar.c(18);
            eVar.c(19);
            eVar.c(20);
            eVar.c(21);
            eVar.c(22);
            eVar.c(23);
            eVar.c(24);
            eVar.c(25);
            return;
        }
        androidx.work.l lVar3 = dVar.f1764a;
        int iOrdinal3 = lVar3.ordinal();
        if (iOrdinal3 == 0) {
            i8 = 0;
        } else if (iOrdinal3 != 1) {
            if (iOrdinal3 == 2) {
                i8 = 2;
            } else if (iOrdinal3 == 3) {
                i8 = 3;
            } else if (iOrdinal3 == 4) {
                i8 = 4;
            } else {
                if (Build.VERSION.SDK_INT < 30 || lVar3 != androidx.work.l.f1836x) {
                    throw new IllegalArgumentException("Could not convert " + lVar3 + " to int");
                }
                i8 = 5;
            }
        }
        eVar.b(18, i8);
        eVar.b(19, dVar.f1765b ? 1L : 0L);
        eVar.b(20, dVar.f1766c ? 1L : 0L);
        eVar.b(21, dVar.f1767d ? 1L : 0L);
        eVar.b(22, dVar.f1768e ? 1L : 0L);
        eVar.b(23, dVar.f1769f);
        eVar.b(24, dVar.f1770g);
        androidx.work.e eVar2 = dVar.h;
        HashSet hashSet = eVar2.f1771a;
        HashSet hashSet2 = eVar2.f1771a;
        byte[] byteArray = null;
        objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;
        if (hashSet.size() != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                objectOutputStream.writeInt(hashSet2.size());
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    e.a aVar2 = (e.a) it.next();
                    objectOutputStream.writeUTF(aVar2.f1772a.toString());
                    objectOutputStream.writeBoolean(aVar2.f1773b);
                }
                objectOutputStream.close();
            } catch (IOException e8) {
                e = e8;
                objectOutputStream2 = objectOutputStream;
                e.printStackTrace();
                if (objectOutputStream2 != null) {
                    objectOutputStream2.close();
                }
                byteArrayOutputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null) {
                }
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    throw th;
                }
            }
            byteArrayOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (byteArray != null) {
            eVar.c(25);
        } else {
            eVar.a(25, byteArray);
        }
    }
}
