package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class me0 implements zzbd, u20, zr1, om0, td1, sa1 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public static final ee0 f7098t = new ee0(1);

    /* renamed from: u, reason: collision with root package name */
    public static final ee0 f7099u = new ee0(2);

    /* renamed from: v, reason: collision with root package name */
    public static final vo0 f7100v = new vo0();

    /* renamed from: w, reason: collision with root package name */
    public static final ee0 f7101w = new ee0(4);

    /* renamed from: x, reason: collision with root package name */
    public static final ee0 f7102x = new ee0(5);

    /* renamed from: y, reason: collision with root package name */
    public static final fd0 f7103y = new fd0(11);

    /* renamed from: z, reason: collision with root package name */
    public static final ee0 f7104z = new ee0(7);
    public static final ee0 A = new ee0(8);

    public /* synthetic */ me0(int i6) {
        this.s = i6;
    }

    public static long d(double d7) {
        sl1.e("not a normal value", m(d7));
        int exponent = Math.getExponent(d7);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d7) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static long e(int i6, long j6) {
        if (i6 == 1) {
            return j6;
        }
        int i7 = i6 >> 1;
        long j7 = (j6 * j6) % 1073807359;
        return (i6 & 1) == 0 ? e(i7, j7) % 1073807359 : ((e(i7, j7) % 1073807359) * j6) % 1073807359;
    }

    public static mx1 f(eu euVar) throws GeneralSecurityException {
        dt1 dt1Var;
        ArrayList arrayList = new ArrayList();
        jx1 jx1Var = jx1.f6188b;
        jx1 jx1Var2 = (jx1) euVar.f4397v;
        Iterator it = ((Map) euVar.f4395t).values().iterator();
        while (it.hasNext()) {
            for (my1 my1Var : (List) it.next()) {
                int i6 = my1Var.f7256e - 2;
                if (i6 == 1) {
                    dt1Var = dt1.f4020u;
                } else if (i6 == 2) {
                    dt1Var = dt1.f4021v;
                } else {
                    if (i6 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    dt1Var = dt1.f4022w;
                }
                int i7 = my1Var.f7254c;
                String strSubstring = my1Var.f7255d;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new lx1(dt1Var, i7, strSubstring, my1Var.f7253b.name()));
            }
        }
        my1 my1Var2 = (my1) euVar.f4396u;
        Integer numValueOf = my1Var2 != null ? Integer.valueOf(my1Var2.f7254c) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    int i9 = ((lx1) arrayList.get(i8)).f6873b;
                    i8++;
                    if (i9 == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
        return new mx1(jx1Var2, Collections.unmodifiableList(arrayList), numValueOf);
    }

    public static void g(x6 x6Var, c7 c7Var) {
        for (int i6 = 0; i6 < x6Var.zza(); i6++) {
            long jZzb = x6Var.zzb(i6);
            ArrayList arrayListA = x6Var.a(jZzb);
            if (!arrayListA.isEmpty()) {
                if (i6 == x6Var.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = x6Var.zzb(i6 + 1) - x6Var.zzb(i6);
                if (jZzb2 > 0) {
                    c7Var.mo6zza(new v6(arrayListA, jZzb, jZzb2));
                }
            }
        }
    }

    public static void h(String str) {
        if (((Boolean) zp.f11549a.c()).booleanValue()) {
            zzo.zze(str);
        }
    }

    public static void i(k3.a aVar, Throwable th, String str) {
        t20.a((Context) k3.b.i1(aVar)).c(th, str, ((Double) aq.f2824g.c()).floatValue());
    }

    public static String k(String[] strArr, int i6, int i7) {
        int i8 = i7 + i6;
        if (strArr.length < i8) {
            zzo.zzg("Unable to construct shingle");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i9 = i8 - 1;
            if (i6 >= i9) {
                sb.append(strArr[i9]);
                return sb.toString();
            }
            sb.append(strArr[i6]);
            sb.append(' ');
            i6++;
        }
    }

    public static void l(String str, boolean z6) throws rn {
        if (!z6) {
            throw rn.a(null, str);
        }
    }

    public static boolean m(double d7) {
        return Math.getExponent(d7) <= 1023;
    }

    public static void n(ArrayList arrayList, ep epVar) {
        String str = (String) epVar.c();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static void o(int i6, long j6, String str, int i7, PriorityQueue priorityQueue) {
        xi xiVar = new xi(i7, str, j6);
        if ((priorityQueue.size() != i6 || (((xi) priorityQueue.peek()).f10606c <= i7 && ((xi) priorityQueue.peek()).f10604a <= j6)) && !priorityQueue.contains(xiVar)) {
            priorityQueue.add(xiVar);
            if (priorityQueue.size() > i6) {
                priorityQueue.poll();
            }
        }
    }

    public static long p(String[] strArr, int i6) {
        long jA = (ui.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i7 = 1; i7 < i6; i7++) {
            jA = (((ui.a(strArr[i7]) + 2147483647L) % 1073807359) + ((jA * 16785407) % 1073807359)) % 1073807359;
        }
        return jA;
    }

    public static ArrayList q(byte[] bArr) {
        long j6 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j6 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static long r(byte b7, byte b8) {
        int i6;
        int i7 = b7 & 255;
        int i8 = b7 & 3;
        if (i8 != 0) {
            i6 = 2;
            if (i8 != 1 && i8 != 2) {
                i6 = b8 & 63;
            }
        } else {
            i6 = 1;
        }
        int i9 = i7 >> 3;
        return i6 * (i9 >= 16 ? 2500 << r6 : i9 >= 12 ? 10000 << (i9 & 1) : (i9 & 3) == 3 ? 60000 : 10000 << r6);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public /* synthetic */ void mo2a(Object obj) {
        ((ti0) obj).zzr();
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 20:
                ((zzr) obj).zzdE();
                break;
            case dn.zzm /* 21 */:
                ((lm0) obj).zzh();
                break;
            case 22:
                ((bn0) obj).zze();
                break;
            case 23:
                ((gn0) obj).zzb();
                break;
            case 24:
                ((on0) obj).O();
                break;
            case 25:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 26:
            default:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                break;
            case 27:
                ((pl0) obj).zzg();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zze.zza("Ad request signals:");
        zze.zza(jSONObject.toString(2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.u20
    public void b(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.u20
    public void c(Throwable th, String str, float f6) {
    }
}
