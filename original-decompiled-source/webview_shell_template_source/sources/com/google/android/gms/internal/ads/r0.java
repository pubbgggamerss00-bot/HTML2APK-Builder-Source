package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r0 implements a7, zb0, zr1, om0 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public Object f8494t;

    public r0(Context context) {
        this.s = context;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        Bundle bundle;
        k30 k30Var = (k30) this.f8494t;
        r30 r30Var = (r30) this.s;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue()) {
                k30Var.G0(parcelFileDescriptor);
                return;
            }
            if (((Boolean) zzbe.zzc().a(zn.f11431l2)).booleanValue() && (bundle = r30Var.E) != null) {
                bundle.putLong("binder-call-start", zzv.zzC().a());
            }
            k30Var.Q1(parcelFileDescriptor, r30Var);
        } catch (RemoteException e6) {
            zze.zzb("Service can't call client", e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0383, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4 A[PHI: r10
      0x01c4: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v11 int) binds: [B:91:0x01b2, B:93:0x01c2, B:96:0x01d2, B:126:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(byte[] bArr, int i6, int i7, c7 c7Var) throws rn {
        int i8;
        g8 g8VarC;
        String strTrim;
        String string;
        int i9;
        r0 r0Var = this;
        ex0 ex0Var = (ex0) r0Var.s;
        ex0Var.h(i6 + i7, bArr);
        ex0Var.j(i6);
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = ex0Var.f4417b;
            Charset charset = StandardCharsets.UTF_8;
            String strH = ex0Var.H(charset);
            if (strH == null || !strH.startsWith("WEBVTT")) {
                ex0Var.j(i10);
                throw rn.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(ex0Var.H(charset))));
            }
            while (!TextUtils.isEmpty(ex0Var.H(StandardCharsets.UTF_8))) {
                r0Var = this;
            }
            ArrayList arrayList2 = new ArrayList();
            loop1: while (true) {
                int i11 = -1;
                int i12 = 0;
                char c7 = 65535;
                int i13 = 0;
                while (true) {
                    i8 = 1;
                    if (c7 != 65535) {
                        break;
                    }
                    i13 = ex0Var.f4417b;
                    String strH2 = ex0Var.H(StandardCharsets.UTF_8);
                    c7 = strH2 == null ? (char) 0 : "STYLE".equals(strH2) ? (char) 2 : strH2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                ex0Var.j(i13);
                if (c7 == 0) {
                    me0.g(new p8(arrayList2), c7Var);
                    return;
                }
                if (c7 == 1) {
                    while (!TextUtils.isEmpty(ex0Var.H(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (c7 != 2) {
                        Pattern pattern = m8.f6964a;
                        Charset charset2 = StandardCharsets.UTF_8;
                        String strH3 = ex0Var.H(charset2);
                        if (strH3 == null) {
                            g8VarC = null;
                            if (g8VarC != null) {
                                arrayList2.add(g8VarC);
                            }
                        } else {
                            Pattern pattern2 = m8.f6964a;
                            Matcher matcher = pattern2.matcher(strH3);
                            if (matcher.matches()) {
                                g8VarC = m8.c(null, matcher, ex0Var, arrayList);
                            } else {
                                String strH4 = ex0Var.H(charset2);
                                if (strH4 != null) {
                                    Matcher matcher2 = pattern2.matcher(strH4);
                                    if (matcher2.matches()) {
                                        g8VarC = m8.c(strH3.trim(), matcher2, ex0Var, arrayList);
                                    }
                                }
                            }
                            if (g8VarC != null) {
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        ex0Var.H(StandardCharsets.UTF_8);
                        e8 e8Var = (e8) r0Var.f8494t;
                        ex0 ex0Var2 = e8Var.f4155a;
                        StringBuilder sb = e8Var.f4156b;
                        sb.setLength(0);
                        int i14 = ex0Var.f4417b;
                        while (!TextUtils.isEmpty(ex0Var.H(StandardCharsets.UTF_8))) {
                        }
                        ex0Var2.h(ex0Var.f4417b, ex0Var.f4416a);
                        ex0Var2.j(i14);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            e8.b(ex0Var2);
                            if (ex0Var2.o() >= 5 && "::cue".equals(ex0Var2.b(5, StandardCharsets.UTF_8))) {
                                int i15 = ex0Var2.f4417b;
                                String strA = e8.a(ex0Var2, sb);
                                if (strA != null) {
                                    if ("{".equals(strA)) {
                                        ex0Var2.j(i15);
                                        strTrim = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                    } else {
                                        if ("(".equals(strA)) {
                                            int i16 = ex0Var2.f4417b;
                                            int i17 = ex0Var2.f4418c;
                                            int i18 = i12;
                                            while (i16 < i17 && i18 == 0) {
                                                int i19 = i16 + 1;
                                                int i20 = ((char) ex0Var2.f4416a[i16]) == ')' ? i8 : i12;
                                                i16 = i19;
                                                i18 = i20;
                                            }
                                            strTrim = ex0Var2.b((i16 - 1) - ex0Var2.f4417b, StandardCharsets.UTF_8).trim();
                                        } else {
                                            strTrim = null;
                                        }
                                        if (!")".equals(e8.a(ex0Var2, sb))) {
                                            strTrim = null;
                                        }
                                    }
                                    if (strTrim == null || !"{".equals(e8.a(ex0Var2, sb))) {
                                        break;
                                    }
                                    f8 f8Var = new f8();
                                    if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(strTrim)) {
                                        int iIndexOf = strTrim.indexOf(91);
                                        if (iIndexOf != i11) {
                                            Matcher matcher3 = e8.f4153c.matcher(strTrim.substring(iIndexOf));
                                            if (matcher3.matches()) {
                                                String strGroup = matcher3.group(i8);
                                                strGroup.getClass();
                                                f8Var.f4525d = strGroup;
                                            }
                                            strTrim = strTrim.substring(i12, iIndexOf);
                                        }
                                        int i21 = j31.f5914a;
                                        String[] strArrSplit = strTrim.split("\\.", i11);
                                        String str = strArrSplit[i12];
                                        int iIndexOf2 = str.indexOf(35);
                                        if (iIndexOf2 != i11) {
                                            f8Var.f4523b = str.substring(i12, iIndexOf2);
                                            f8Var.f4522a = str.substring(iIndexOf2 + 1);
                                        } else {
                                            f8Var.f4523b = str;
                                        }
                                        int length = strArrSplit.length;
                                        if (length > i8) {
                                            f8Var.f4524c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i8, length)));
                                        }
                                    }
                                    int i22 = i12;
                                    String str2 = null;
                                    while (i22 == 0) {
                                        int i23 = ex0Var2.f4417b;
                                        String strA2 = e8.a(ex0Var2, sb);
                                        int i24 = (strA2 == null || "}".equals(strA2)) ? i8 : i12;
                                        if (i24 == 0) {
                                            ex0Var2.j(i23);
                                            e8.b(ex0Var2);
                                            String strC = e8.c(ex0Var2, sb);
                                            if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(strC) && ":".equals(e8.a(ex0Var2, sb))) {
                                                e8.b(ex0Var2);
                                                StringBuilder sb2 = new StringBuilder();
                                                boolean z6 = false;
                                                while (true) {
                                                    if (z6) {
                                                        string = sb2.toString();
                                                        break;
                                                    }
                                                    int i25 = ex0Var2.f4417b;
                                                    boolean z7 = z6;
                                                    String strA3 = e8.a(ex0Var2, sb);
                                                    if (strA3 == null) {
                                                        string = null;
                                                        break;
                                                    } else if ("}".equals(strA3) || ";".equals(strA3)) {
                                                        ex0Var2.j(i25);
                                                        z6 = true;
                                                    } else {
                                                        sb2.append(strA3);
                                                        z6 = z7;
                                                    }
                                                }
                                                if (string == null || RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(string)) {
                                                    i8 = 1;
                                                } else {
                                                    int i26 = ex0Var2.f4417b;
                                                    String strA4 = e8.a(ex0Var2, sb);
                                                    if (";".equals(strA4)) {
                                                        if ("color".equals(strC)) {
                                                        }
                                                        i8 = i9;
                                                    } else {
                                                        if ("}".equals(strA4)) {
                                                            ex0Var2.j(i26);
                                                            if ("color".equals(strC)) {
                                                                i9 = 1;
                                                                if ("background-color".equals(strC)) {
                                                                    f8Var.h = zl0.a(string, true);
                                                                    f8Var.f4529i = true;
                                                                } else if ("ruby-position".equals(strC)) {
                                                                    if ("over".equals(string)) {
                                                                        f8Var.f4535o = 1;
                                                                    } else {
                                                                        if ("under".equals(string)) {
                                                                            f8Var.f4535o = 2;
                                                                        }
                                                                        i8 = 1;
                                                                    }
                                                                } else if ("text-combine-upright".equals(strC)) {
                                                                    f8Var.f4536p = "all".equals(string) || string.startsWith("digits");
                                                                } else if ("text-decoration".equals(strC)) {
                                                                    if ("underline".equals(string)) {
                                                                        i9 = 1;
                                                                        f8Var.f4530j = 1;
                                                                    }
                                                                } else if ("font-family".equals(strC)) {
                                                                    f8Var.f4526e = rj1.g(string);
                                                                } else if (!"font-weight".equals(strC)) {
                                                                    i9 = 1;
                                                                    if ("font-style".equals(strC)) {
                                                                        if ("italic".equals(string)) {
                                                                            f8Var.f4532l = 1;
                                                                        }
                                                                    } else if ("font-size".equals(strC)) {
                                                                        Matcher matcher4 = e8.f4154d.matcher(rj1.g(string));
                                                                        if (matcher4.matches()) {
                                                                            String strGroup2 = matcher4.group(2);
                                                                            strGroup2.getClass();
                                                                            int iHashCode = strGroup2.hashCode();
                                                                            if (iHashCode == 37) {
                                                                                if (!strGroup2.equals("%")) {
                                                                                    break loop1;
                                                                                }
                                                                                f8Var.f4533m = 3;
                                                                                i8 = 1;
                                                                            } else if (iHashCode == 3240) {
                                                                                if (!strGroup2.equals("em")) {
                                                                                    break loop1;
                                                                                }
                                                                                f8Var.f4533m = 2;
                                                                                i8 = 1;
                                                                            } else {
                                                                                if (iHashCode != 3592 || !strGroup2.equals("px")) {
                                                                                    break loop1;
                                                                                }
                                                                                f8Var.f4533m = 1;
                                                                                i8 = 1;
                                                                            }
                                                                            String strGroup3 = matcher4.group(i8);
                                                                            strGroup3.getClass();
                                                                            f8Var.f4534n = Float.parseFloat(strGroup3);
                                                                        } else {
                                                                            qs0.f("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                        }
                                                                    }
                                                                } else if ("bold".equals(string)) {
                                                                    i9 = 1;
                                                                    f8Var.f4531k = 1;
                                                                }
                                                            } else {
                                                                i9 = 1;
                                                                f8Var.f4527f = zl0.a(string, true);
                                                                f8Var.f4528g = true;
                                                            }
                                                            i8 = i9;
                                                        }
                                                        i8 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        str2 = strA2;
                                        i22 = i24;
                                        i12 = 0;
                                    }
                                    if ("}".equals(str2)) {
                                        arrayList3.add(f8Var);
                                    }
                                    i11 = -1;
                                    i12 = 0;
                                }
                            }
                        }
                    }
                    r0Var = this;
                }
            }
            throw new IllegalStateException();
        } catch (rn e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public x0 c(Object... objArr) {
        Constructor constructorZza;
        synchronized (((AtomicBoolean) this.f8494t)) {
            if (!((AtomicBoolean) this.f8494t).get()) {
                try {
                    constructorZza = ((q0) this.s).zza();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f8494t).set(true);
                } catch (Exception e6) {
                    throw new RuntimeException("Error instantiating extension", e6);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (x0) constructorZza.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        try {
            ((k30) this.f8494t).c0(zzbb.zzb(th));
        } catch (RemoteException e6) {
            zze.zzb("Service can't call client", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        vd1 vd1Var = (vd1) this.s;
        ((be1) obj).c((yd1) vd1Var.s, vd1Var.f9833t, (Throwable) this.f8494t);
    }

    public r0(e3.j0 j0Var, AlertDialog alertDialog) {
        this.f8494t = j0Var;
        this.s = alertDialog;
    }

    public /* synthetic */ r0(Object obj, Object obj2) {
        this.s = obj;
        this.f8494t = obj2;
    }

    public r0(int i6) {
        switch (i6) {
            case 2:
                this.s = new ex0();
                this.f8494t = new e8();
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
                this.s = byteArrayOutputStream;
                this.f8494t = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public void zza(boolean z6, int i6, String str, String str2) {
        gq0 gq0Var = (gq0) this.s;
        Map map = (Map) this.f8494t;
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        gq0Var.f5121b.b(map2);
    }

    public r0(q0 q0Var) {
        this.s = q0Var;
        this.f8494t = new AtomicBoolean(false);
    }

    public /* synthetic */ r0(kd0 kd0Var, Context context, String str) {
        y92 y92VarA = y92.a(context);
        w92 w92Var = kd0Var.H0;
        pj0 pj0Var = new pj0(y92VarA, w92Var, kd0Var.I0, 4);
        w92 w92VarB = w92.b(new cf0(8, w92Var));
        w92 w92VarB2 = w92.b(bq.B);
        w92 w92VarB3 = w92.b(new vj0(y92VarA, kd0Var.f6335d, kd0Var.C, pj0Var, w92VarB, w92VarB2));
        this.s = w92.b(new vh0(w92VarB3, w92VarB, w92VarB2, 3));
        this.f8494t = w92.b(new pb1(y92.b(str), w92VarB3, y92VarA, w92VarB, w92VarB2, kd0Var.f6348k, kd0Var.E, kd0Var.f6376z));
    }

    public r0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.s = new int[size];
        this.f8494t = new float[size];
        for (int i6 = 0; i6 < size; i6++) {
            ((int[]) this.s)[i6] = ((Integer) arrayList.get(i6)).intValue();
            ((float[]) this.f8494t)[i6] = ((Float) arrayList2.get(i6)).floatValue();
        }
    }

    public r0(int i6, int i7) {
        this.s = new int[]{i6, i7};
        this.f8494t = new float[]{0.0f, 1.0f};
    }

    public r0(int i6, int i7, int i8) {
        this.s = new int[]{i6, i7, i8};
        this.f8494t = new float[]{0.0f, 0.5f, 1.0f};
    }
}
