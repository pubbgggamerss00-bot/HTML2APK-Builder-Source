package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class rj1 implements em1, fy1, zx1, dx1, cy1, l32, eq0 {

    /* renamed from: t, reason: collision with root package name */
    public static String f8654t;
    public final /* synthetic */ int s;

    public static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static lt1 c(byte[] bArr) throws GeneralSecurityException {
        try {
            u42 u42Var = u42.f9458b;
            u62 u62Var = u62.f9474c;
            x12 x12VarE = x12.E(bArr, u42.f9459c);
            wx1 wx1Var = wx1.f10304b;
            r32 r32VarA = zy1.a(x12VarE.H());
            py1 py1Var = new py1(x12VarE, r32VarA);
            xy1 xy1Var = (xy1) wx1Var.f10305a.get();
            xy1Var.getClass();
            return !xy1Var.f10751d.containsKey(new vy1(py1.class, r32VarA)) ? new ix1(py1Var) : wx1Var.b(py1Var);
        } catch (IOException e6) {
            throw new GeneralSecurityException("Failed to parse proto", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[EDGE_INSN: B:66:0x00c5->B:44:0x00c5 BREAK  A[LOOP:1: B:29:0x0094->B:67:0x0094]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        String str = f8654t;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities2) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f8654t = null;
        } else if (arrayList.size() == 1) {
            f8654t = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            } catch (RuntimeException unused) {
                Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
            }
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
                for (ResolveInfo resolveInfo2 : listQueryIntentActivities) {
                    IntentFilter intentFilter = resolveInfo2.filter;
                    if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                        break;
                    }
                }
                if (!arrayList.contains(str2)) {
                }
            } else if (!arrayList.contains(str2)) {
                f8654t = str2;
            } else if (arrayList.contains("com.android.chrome")) {
                f8654t = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f8654t = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f8654t = "com.chrome.dev";
            }
        }
        return f8654t;
    }

    public static String g(String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            if (r(str.charAt(i6))) {
                char[] charArray = str.toCharArray();
                while (i6 < length) {
                    char c7 = charArray[i6];
                    if (r(c7)) {
                        charArray[i6] = (char) (c7 ^ ' ');
                    }
                    i6++;
                }
                return String.valueOf(charArray);
            }
            i6++;
        }
        return str;
    }

    public static boolean i(int i6, boolean z6) {
        int i7 = i6 & 7;
        if (i7 != 4) {
            return z6 && i7 == 3;
        }
        return true;
    }

    public static boolean j(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] k(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 + i6;
            int iDigit = Character.digit(str.charAt(i7), 16);
            int iDigit2 = Character.digit(str.charAt(i7 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i6] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static np1 l(Set set, go1 go1Var) {
        sl1.c("set1", set);
        sl1.c("set2", go1Var);
        return new np1(set, go1Var);
    }

    public static String m(String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            char cCharAt = str.charAt(i6);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i6 < length) {
                    char c7 = charArray[i6];
                    if (c7 >= 'a' && c7 <= 'z') {
                        charArray[i6] = (char) (c7 ^ ' ');
                    }
                    i6++;
                }
                return String.valueOf(charArray);
            }
            i6++;
        }
        return str;
    }

    public static byte[] n(lt1 lt1Var) {
        return ((py1) wx1.f10304b.d(lt1Var)).f8181b.i();
    }

    public static op1 o(Set set, tl1 tl1Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof op1)) {
                return new pp1(set2, tl1Var);
            }
            op1 op1Var = (op1) set2;
            tl1 tl1Var2 = op1Var.f7837t;
            tl1Var2.getClass();
            return new pp1((SortedSet) op1Var.s, new ul1(Arrays.asList(tl1Var2, tl1Var)));
        }
        if (!(set instanceof op1)) {
            set.getClass();
            return new op1(set, tl1Var);
        }
        op1 op1Var2 = (op1) set;
        tl1 tl1Var3 = op1Var2.f7837t;
        tl1Var3.getClass();
        return new op1(op1Var2.s, new ul1(Arrays.asList(tl1Var3, tl1Var)));
    }

    public static boolean p(CharSequence charSequence, CharSequence charSequence2) {
        char c7;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i6 = 0; i6 < length; i6++) {
                if (charSequence.charAt(i6) == charSequence2.charAt(i6) || ((c7 = (char) ((r3 | ' ') - 97)) < 26 && c7 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean q(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean r(char c7) {
        return c7 >= 'A' && c7 <= 'Z';
    }

    public static boolean s(qp1 qp1Var, Collection collection) {
        collection.getClass();
        if (collection instanceof yo1) {
            collection = ((yo1) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= qp1Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= qp1Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = qp1Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public oy1 b(ih1 ih1Var) {
        switch (this.s) {
            case 9:
                mv1 mv1Var = (mv1) ih1Var;
                m22 m22VarC = n22.C();
                p22 p22VarB = pv1.b(mv1Var.f7225u);
                m22VarC.i();
                n22.G((n22) m22VarC.f4126t, p22VarB);
                return oy1.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((n22) m22VarC.g()).g(), 5, pv1.c(mv1Var.f7225u.f7523a), mv1Var.f7227w);
            case 10:
            default:
                oy1 oy1Var = ((hx1) ih1Var).f5513u;
                int i6 = gx1.f5186b[s1.b.a(oy1Var.f7888d)];
                return oy1Var;
            case 11:
                ou1 ou1Var = (ou1) ih1Var;
                c12 c12VarC = d12.C();
                byte[] bArrB = ((r32) ou1Var.f7864v.f10619t).b();
                e42 e42VarS = g42.s(0, bArrB.length, bArrB);
                c12VarC.i();
                ((d12) c12VarC.f4126t).zzd = e42VarS;
                return oy1.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((d12) c12VarC.g()).g(), 2, dw1.b(ou1Var.f7863u.f9635b), ou1Var.f7866x);
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.cy1
    public py1 f(lt1 lt1Var) {
        switch (this.s) {
            case 10:
                mu1 mu1Var = (mu1) lt1Var;
                w12 w12VarB = x12.B();
                w12VarB.k("type.googleapis.com/google.crypto.tink.AesEaxKey");
                y02 y02VarC = z02.C();
                a12 a12VarC = b12.C();
                int i6 = mu1Var.f7223b;
                a12VarC.i();
                ((b12) a12VarC.f4126t).zzc = i6;
                b12 b12Var = (b12) a12VarC.g();
                y02VarC.i();
                z02.G((z02) y02VarC.f4126t, b12Var);
                int i7 = mu1Var.f7222a;
                y02VarC.i();
                ((z02) y02VarC.f4126t).zze = i7;
                w12VarB.l(((z02) y02VarC.g()).g());
                w12VarB.j(aw1.b(mu1Var.f7224c));
                return py1.a((x12) w12VarB.g());
            default:
                w12 w12VarB2 = x12.B();
                w12VarB2.k("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                w12VarB2.l(m12.B().g());
                w12VarB2.j(hw1.b(((cv1) lt1Var).f3674a));
                return py1.a((x12) w12VarB2.g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zx1
    public lt1 h(py1 py1Var) throws GeneralSecurityException {
        x12 x12Var = py1Var.f8181b;
        if (!x12Var.H().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var.H())));
        }
        try {
            g42 g42VarG = x12Var.G();
            u42 u42Var = u42.f9458b;
            u62 u62Var = u62.f9474c;
            return new kv1(l22.D(g42VarG, u42.f9459c).E(), lv1.a(x12Var.F()));
        } catch (u52 e6) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        switch (this.s) {
            case 19:
                int i6 = gb2.f4973n0;
                ((bs) obj).zzs();
                break;
            case 20:
                ((bs) obj).zza();
                break;
            case dn.zzm /* 21 */:
            default:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
        }
    }

    public /* synthetic */ rj1(int i6) {
        this.s = i6;
    }

    public /* synthetic */ rj1(gb2 gb2Var) {
        this.s = 20;
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        switch (this.s) {
            case 0:
                return -1;
            case 3:
                throw new IllegalStateException();
            default:
                byte[] bArr = new byte[12];
                dd2.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public Object b(ih1 ih1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 6:
                wu1 wu1Var = (wu1) ih1Var;
                return new uw1(((r32) wu1Var.f10275v.f10619t).b(), wu1Var.f10276w.b());
            case 7:
                iv1 iv1Var = (iv1) ih1Var;
                ey1 ey1Var = dv1.f4045a;
                return new pw1(jt1.a(iv1Var.f5871u.f6503a).zzb(), iv1Var.f5872v.b());
            default:
                oy1 oy1Var = ((hx1) ih1Var).f5513u;
                int[] iArr = gx1.f5186b;
                int i6 = oy1Var.f7888d;
                Integer num = oy1Var.f7890f;
                int i7 = iArr[s1.b.a(i6)];
                u12 u12VarB = v12.B();
                String str = oy1Var.f7885a;
                u12VarB.i();
                v12.H((v12) u12VarB.f4126t, str);
                g42 g42Var = oy1Var.f7887c;
                u12VarB.i();
                v12.I((v12) u12VarB.f4126t, g42Var);
                int i8 = oy1Var.f7888d;
                u12VarB.i();
                v12.G((v12) u12VarB.f4126t, i8);
                int iOrdinal = oy1Var.f7889e.ordinal();
                if (iOrdinal == 1) {
                    xx1.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    xx1.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    xx1.f10742a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    xx1.a(num.intValue()).b();
                }
                return new d02();
        }
    }
}
