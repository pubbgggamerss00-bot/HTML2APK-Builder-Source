package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ti implements zr1, v3.a {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f9287t;

    public ti(int i6, int i7) {
        switch (i7) {
            case 3:
                if (i6 <= 0) {
                    throw new IllegalArgumentException("The max pool size must be > 0");
                }
                this.f9287t = new Object[i6];
                return;
            default:
                this.f9287t = new vi(2);
                this.s = i6;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        String str = (String) obj;
        int i6 = this.s;
        kc1 kc1Var = (kc1) this.f9287t;
        tb1 tb1Var = kc1Var.f6324a;
        if (!tb1Var.f9187i0) {
            kc1Var.f6326c.a(str, tb1Var.f9215x0, kc1Var.f6328e);
            return;
        }
        ze1 ze1Var = kc1Var.f6327d;
        String str2 = kc1Var.f6325b.f9774b;
        ze1Var.getClass();
        fz0 fz0Var = new fz0(zzv.zzC().a(), str2, str, i6);
        dz0 dz0Var = ze1Var.f11270a;
        dz0Var.getClass();
        dz0Var.b(new ni0(13, dz0Var, fz0Var));
    }

    @Override // v3.a
    public Object b(v3.p pVar) {
        if (!pVar.h()) {
            return Boolean.FALSE;
        }
        int i6 = this.s;
        ad adVar = (ad) this.f9287t;
        hj1 hj1Var = (hj1) pVar.e();
        byte[] bArrI = ((ed) adVar.g()).i();
        hj1Var.getClass();
        gj1 gj1Var = new gj1(hj1Var, bArrI);
        gj1Var.f5076c = i6;
        gj1Var.a();
        return Boolean.TRUE;
    }

    public Object c() {
        Object[] objArr = (Object[]) this.f9287t;
        int i6 = this.s;
        if (i6 <= 0) {
            return null;
        }
        int i7 = i6 - 1;
        Object obj = objArr[i7];
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i7] = null;
        this.s--;
        return obj;
    }

    public boolean d(Object obj) {
        boolean z6;
        Object[] objArr = (Object[]) this.f9287t;
        kotlin.jvm.internal.j.e("instance", obj);
        int i6 = this.s;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                z6 = false;
                break;
            }
            if (objArr[i7] == obj) {
                z6 = true;
                break;
            }
            i7++;
        }
        if (z6) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i8 = this.s;
        if (i8 >= objArr.length) {
            return false;
        }
        objArr[i8] = obj;
        this.s = i8 + 1;
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String e(ArrayList arrayList) throws IOException {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r32 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            sb.append(((String) arrayList.get(i6)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        PriorityQueue priorityQueue = new PriorityQueue(this.s, new o8(1));
        int i7 = 0;
        while (i7 < strArrSplit.length) {
            String[] strArrB = ui.b(strArrSplit[i7], r32);
            if (strArrB.length != 0) {
                int i8 = this.s;
                int length = strArrB.length;
                if (length < 6) {
                    me0.o(i8, me0.p(strArrB, length), me0.k(strArrB, r32, length), length, priorityQueue);
                } else {
                    long jP = me0.p(strArrB, 6);
                    me0.o(i8, jP, me0.k(strArrB, r32, 6), 6, priorityQueue);
                    int i9 = 1;
                    while (true) {
                        int length2 = strArrB.length;
                        if (i9 < length2 - 5) {
                            int iA = ui.a(strArrB[i9 - 1]);
                            int iA2 = ui.a(strArrB[i9 + 5]);
                            int i10 = i9;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String strK = me0.k(strArrB, i10, 6);
                            jP = (((iA2 + 2147483647L) % 1073807359) + (((((jP + 1073807359) - ((((iA + 2147483647L) % 1073807359) * me0.e(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            me0.o(i8, jP, strK, length2, priorityQueue);
                            i9 = i10 + 1;
                            strArrSplit = strArrSplit;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i7++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r32 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((vi) this.f9287t).A(((xi) it.next()).f10605b));
            } catch (IOException e6) {
                zzo.zzh("Error while writing hash to byteStream", e6);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e7) {
            zzo.zzh("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e8) {
            zzo.zzh("HashManager: Unable to convert to Base64.", e8);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        zzv.zzp().h("BufferingUrlPinger.attributionReportingManager", th);
    }

    public /* synthetic */ ti(int i6, Object obj) {
        this.s = i6;
        this.f9287t = obj;
    }
}
