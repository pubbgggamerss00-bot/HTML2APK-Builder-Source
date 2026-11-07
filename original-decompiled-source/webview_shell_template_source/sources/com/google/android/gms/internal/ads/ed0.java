package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.zzv;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ed0 implements q0, q1, z6, a1, om0, sa1, fy1 {
    public static v3.p A;
    public static n3.l B;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public static final fd0 f4227t = new fd0(0);

    /* renamed from: u, reason: collision with root package name */
    public static final fd0 f4228u = new fd0(3);

    /* renamed from: v, reason: collision with root package name */
    public static final fd0 f4229v = new fd0(5);

    /* renamed from: w, reason: collision with root package name */
    public static final fd0 f4230w = new fd0(6);

    /* renamed from: x, reason: collision with root package name */
    public static final fd0 f4231x = new fd0(7);

    /* renamed from: y, reason: collision with root package name */
    public static final fd0 f4232y = new fd0(8);

    /* renamed from: z, reason: collision with root package name */
    public static final fd0 f4233z = new fd0(10);
    public static final Object C = new Object();
    public static final fd0 D = new fd0(12);

    public /* synthetic */ ed0(int i6) {
        this.s = i6;
    }

    public static Bundle f(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue()) {
            for (int i6 = 0; i6 < 2; i6++) {
                Pair pair = pairArr[i6];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static zzs g(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ub1 ub1Var = (ub1) it.next();
            if (ub1Var.f9524c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(ub1Var.f9522a, ub1Var.f9523b));
            }
        }
        return new zzs(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static yd h(Context context, String str, String str2) {
        yd ydVar;
        try {
            ydVar = (yd) new bi1(context, str, str2).f3188d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            ydVar = null;
        }
        return ydVar == null ? bi1.a() : ydVar;
    }

    public static m72 i(Object obj) {
        j52 j52Var = (j52) obj;
        m72 m72Var = j52Var.zzt;
        if (m72Var != m72.f6958f) {
            return m72Var;
        }
        m72 m72Var2 = new m72();
        j52Var.zzt = m72Var2;
        return m72Var2;
    }

    public static Object j(np1 np1Var, String str) {
        mp1 mp1Var = new mp1(np1Var.s, np1Var.f7488t);
        return mp1Var.hasNext() ? mp1Var.next() : str;
    }

    public static String k(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i6);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (p(jSONArrayOptJSONArray2, str) && !p(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                }
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static int l(long j6) {
        int i6 = (int) j6;
        sl1.f(((long) i6) == j6, "Out of range: %s", j6);
        return i6;
    }

    public static long m(ex0 ex0Var, int i6, int i7) {
        ex0Var.j(i6);
        if (ex0Var.o() < 5) {
            return -9223372036854775807L;
        }
        int iQ = ex0Var.q();
        if ((8388608 & iQ) != 0 || ((iQ >> 8) & 8191) != i7 || (iQ & 32) == 0 || ex0Var.v() < 7 || ex0Var.o() < 7 || (ex0Var.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        ex0Var.f(0, 6, bArr);
        long j6 = bArr[0];
        long j7 = bArr[1];
        long j8 = bArr[2];
        long j9 = bArr[3] & 255;
        return ((j6 & 255) << 25) | ((j7 & 255) << 17) | ((j8 & 255) << 9) | (j9 + j9) | ((bArr[4] & 255) >> 7);
    }

    public static AbstractList n(List list, pl1 pl1Var) {
        return list != null ? new mo1(list, pl1Var) : new oo1(list, pl1Var);
    }

    public static void o(Context context, boolean z6) {
        synchronized (C) {
            try {
                if (B == null) {
                    B = new n3.l(context);
                }
                v3.p pVar = A;
                if (pVar == null || ((pVar.g() && !A.h()) || (z6 && A.g()))) {
                    n3.l lVar = B;
                    com.google.android.gms.common.internal.l.g("the appSetIdClient shouldn't be null", lVar);
                    A = lVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean p(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                String strOptString = jSONArray.optString(i6);
                try {
                } catch (PatternSyntaxException e6) {
                    zzv.zzp().h("RtbAdapterMap.hasAtleastOneRegexMatch", e6);
                }
                if ((((Boolean) zzbe.zzc().a(zn.Na)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int q(int i6, int i7) {
        int[] iArr = {i6, i7};
        int i8 = iArr[0];
        for (char c7 = 1; c7 < 2; c7 = 2) {
            int i9 = iArr[1];
            if (i9 > i8) {
                i8 = i9;
            }
        }
        int[] iArr2 = {i8, 1073741823};
        int i10 = iArr2[0];
        for (char c8 = 1; c8 < 2; c8 = 2) {
            int i11 = iArr2[1];
            if (i11 < i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    public static void r(List list, tl1 tl1Var, int i6, int i7) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i7) {
                break;
            } else if (tl1Var.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i7--;
            if (i7 < i6) {
                return;
            } else {
                list.remove(i7);
            }
        }
    }

    public static int s(byte[] bArr) {
        int length = bArr.length;
        if (length >= 4) {
            return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        throw new IllegalArgumentException(dm1.a("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    public static int t(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j6 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j6;
    }

    public static List u(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new mq1(0, length, iArr);
    }

    public static int[] v(go1 go1Var) {
        Object[] array = go1Var.toArray(wn1.s);
        int length = array.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = array[i6];
            obj.getClass();
            iArr[i6] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static boolean w(int i6, l42 l42Var, Object obj) throws u52 {
        k42 k42Var = (k42) l42Var.f6576d;
        int i7 = l42Var.f6573a;
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        if (i9 == 0) {
            l42Var.q(0);
            ((m72) obj).b(i8 << 3, Long.valueOf(k42Var.r()));
            return true;
        }
        if (i9 == 1) {
            l42Var.q(1);
            ((m72) obj).b((i8 << 3) | 1, Long.valueOf(k42Var.q()));
            return true;
        }
        if (i9 == 2) {
            ((m72) obj).b((i8 << 3) | 2, l42Var.F());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw new t52();
            }
            l42Var.q(5);
            ((m72) obj).b(5 | (i8 << 3), Integer.valueOf(k42Var.k()));
            return true;
        }
        m72 m72Var = new m72();
        int i10 = i8 << 3;
        int i11 = i6 + 1;
        if (i11 >= 100) {
            throw new u52("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (l42Var.v() != Integer.MAX_VALUE && w(i11, l42Var, m72Var)) {
        }
        if ((i10 | 4) != l42Var.f6573a) {
            throw new u52("Protocol message end-group tag did not match expected tag.");
        }
        if (m72Var.f6963e) {
            m72Var.f6963e = false;
        }
        ((m72) obj).b(i10 | 3, m72Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public boolean a(w wVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public Object b(ih1 ih1Var) {
        yt1 yt1Var = (yt1) ih1Var;
        byte[] bArrB = ((r32) yt1Var.f11075v.f10619t).b();
        fu1 fu1Var = yt1Var.f11074u;
        c32 c32Var = new c32(fu1Var.f4783c, bArrB);
        String strValueOf = String.valueOf(fu1Var.f4786f);
        o32 o32Var = new o32("HMAC".concat(strValueOf), new SecretKeySpec(((r32) yt1Var.f11076w.f10619t).b(), "HMAC"));
        int i6 = fu1Var.f4784d;
        return new h32(c32Var, new p32(o32Var, i6), i6, yt1Var.f11077x.b());
    }

    @Override // com.google.android.gms.internal.ads.z6
    public a7 c(w wVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // com.google.android.gms.internal.ads.a1
    public /* synthetic */ x0[] d(Uri uri, Map map) {
        int i6 = ja0.O;
        return new x0[]{new c6(), new z4()};
    }

    @Override // com.google.android.gms.internal.ads.z6
    public int e(w wVar) {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 16:
                ((sk0) obj).zzb();
                break;
            case 17:
                ((pl0) obj).zzg();
                break;
            case 18:
                ((zzr) obj).zzdr();
                break;
            case 19:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                break;
            case 20:
            case dn.zzm /* 21 */:
            default:
                ((u40) obj).zze();
                break;
            case 22:
                ((zzr) obj).zzdr();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.q0
    public Constructor zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(x0.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
