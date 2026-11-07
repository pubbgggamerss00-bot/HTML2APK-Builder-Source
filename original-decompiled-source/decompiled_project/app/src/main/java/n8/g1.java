package n8;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Base64;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class g1 implements sh.f<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f18451b;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18452a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m1 f18453b;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$4$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.g1$a$a, reason: collision with other inner class name */
        public static final class C0191a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18454a;

            /* renamed from: b, reason: collision with root package name */
            public int f18455b;

            public C0191a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18454a = obj;
                this.f18455b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar, m1 m1Var) {
            this.f18452a = gVar;
            this.f18453b = m1Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0248 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01b2 A[LOOP:4: B:79:0x01ae->B:81:0x01b2, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01ed  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, InvalidKeyException {
            C0191a c0191a;
            boolean z10;
            Boolean boolValueOf;
            boolean z11;
            ArrayList arrayList;
            PackageInfo packageInfo;
            Signature[] signatureArr;
            String strValueOf;
            int i10;
            ArrayList arrayList2;
            jh.f it;
            String strEncodeToString;
            String str = "";
            if (eVar instanceof C0191a) {
                c0191a = (C0191a) eVar;
                int i11 = c0191a.f18455b;
                if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                    c0191a.f18455b = i11 - PKIFailureInfo.systemUnavail;
                } else {
                    c0191a = new C0191a(eVar);
                }
            }
            Object obj2 = c0191a.f18454a;
            ug.a aVar = ug.a.f29706a;
            int i12 = c0191a.f18455b;
            int i13 = 1;
            if (i12 == 0) {
                pg.q.b(obj2);
                v4.e eVar2 = (v4.e) obj;
                Boolean bool = (Boolean) eVar2.b(m1.f18523y);
                if (bool != null ? bool.booleanValue() : false) {
                    Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = this.f18453b.f18525a;
                    String str2 = (String) eVar2.b(m1.f18524z);
                    try {
                        arrayList = new ArrayList();
                        SigningInfo signingInfo = hilt_HtmlToApkApplication.getPackageManager().getPackageInfo(hilt_HtmlToApkApplication.getPackageName(), 134217728).signingInfo;
                        if (signingInfo != null) {
                            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                            if (apkContentsSigners != null) {
                                qg.t.q(arrayList, apkContentsSigners);
                            }
                            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                qg.t.q(arrayList, signingCertificateHistory);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                packageInfo = hilt_HtmlToApkApplication.getPackageManager().getPackageInfo(hilt_HtmlToApkApplication.getPackageName(), 64);
                            } catch (Exception unused) {
                                packageInfo = null;
                            }
                            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null) {
                                qg.t.q(arrayList, signatureArr);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    if (arrayList.isEmpty()) {
                        z11 = false;
                        z10 = z11;
                        boolValueOf = Boolean.valueOf(z10);
                        i13 = 1;
                    } else {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        if (arrayList.isEmpty()) {
                            z11 = false;
                            z10 = z11;
                            boolValueOf = Boolean.valueOf(z10);
                            i13 = 1;
                        } else {
                            int size = arrayList.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size) {
                                    break;
                                }
                                Object obj3 = arrayList.get(i14);
                                i14++;
                                byte[] bArrDigest = messageDigest.digest(((Signature) obj3).toByteArray());
                                kotlin.jvm.internal.r.b(bArrDigest);
                                String strY = qg.o.y(bArrDigest, str, new l9.q0(), 30);
                                int[][] iArr = l9.r0.f16879a;
                                ArrayList arrayList3 = new ArrayList(4);
                                int i15 = 0;
                                for (int i16 = 4; i15 < i16; i16 = 4) {
                                    int[] iArr2 = iArr[i15];
                                    String str3 = str;
                                    int length = iArr2.length;
                                    Hilt_HtmlToApkApplication hilt_HtmlToApkApplication2 = hilt_HtmlToApkApplication;
                                    char[] cArr = new char[length];
                                    int i17 = i15;
                                    int i18 = 0;
                                    while (i18 < length) {
                                        cArr[i18] = (char) (iArr2[i18] ^ 71);
                                        i18++;
                                        length = length;
                                    }
                                    arrayList3.add(new String(cArr));
                                    i15 = i17 + 1;
                                    str = str3;
                                    hilt_HtmlToApkApplication = hilt_HtmlToApkApplication2;
                                }
                                String str4 = str;
                                Hilt_HtmlToApkApplication hilt_HtmlToApkApplication3 = hilt_HtmlToApkApplication;
                                Set setH0 = qg.x.h0(arrayList3);
                                if (!(setH0 instanceof Collection) || !setH0.isEmpty()) {
                                    Iterator<T> it2 = setH0.iterator();
                                    while (it2.hasNext()) {
                                        if (mh.t.j((String) it2.next(), strY, true)) {
                                            if (str2 != null && !mh.x.A(str2)) {
                                                try {
                                                    strValueOf = String.valueOf(hilt_HtmlToApkApplication3.getPackageManager().getPackageInfo(hilt_HtmlToApkApplication3.getPackageName(), 0).firstInstallTime);
                                                } catch (Exception unused3) {
                                                    strValueOf = "default_salt";
                                                }
                                                String packageName = hilt_HtmlToApkApplication3.getPackageName();
                                                kotlin.jvm.internal.r.b(packageName);
                                                if (!str2.equals(l9.r0.a(l9.r0.b(packageName, strValueOf)))) {
                                                    try {
                                                        z11 = false;
                                                        z11 = false;
                                                        try {
                                                            i10 = hilt_HtmlToApkApplication3.getPackageManager().getPackageInfo(hilt_HtmlToApkApplication3.getPackageName(), 0).versionCode;
                                                        } catch (Exception unused4) {
                                                            i10 = z11 ? 1 : 0;
                                                            jh.g gVar = new jh.g(1, Math.max(z11 ? 1 : 0, i10), 1);
                                                            arrayList2 = new ArrayList(qg.p.h(gVar, 10));
                                                            it = gVar.iterator();
                                                            while (it.f15749c) {
                                                            }
                                                            if (strValueOf.equals("default_salt")) {
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                            }
                                                            z10 = z11;
                                                            boolValueOf = Boolean.valueOf(z10);
                                                            i13 = 1;
                                                            c0191a.f18455b = i13;
                                                            if (this.f18452a.c(boolValueOf, c0191a) == aVar) {
                                                            }
                                                            return pg.f0.f21461a;
                                                        }
                                                    } catch (Exception unused5) {
                                                        z11 = false;
                                                    }
                                                    jh.g gVar2 = new jh.g(1, Math.max(z11 ? 1 : 0, i10), 1);
                                                    arrayList2 = new ArrayList(qg.p.h(gVar2, 10));
                                                    it = gVar2.iterator();
                                                    while (it.f15749c) {
                                                        arrayList2.add(packageName + "_PREMIUM_ACTIVE_v1_" + strValueOf + "_" + it.nextInt());
                                                    }
                                                    if (strValueOf.equals("default_salt")) {
                                                        arrayList2 = qg.x.P(packageName.concat("_PREMIUM_ACTIVE_v1_default_salt"), arrayList2);
                                                    }
                                                    if (!arrayList2.isEmpty()) {
                                                        int size2 = arrayList2.size();
                                                        int i19 = z11 ? 1 : 0;
                                                        while (i19 < size2) {
                                                            Object obj4 = arrayList2.get(i19);
                                                            i19++;
                                                            String payload = (String) obj4;
                                                            kotlin.jvm.internal.r.e(payload, "payload");
                                                            try {
                                                                Mac mac = Mac.getInstance("HmacSHA256");
                                                                mac.init(new SecretKeySpec(l9.r0.f16881c, "HmacSHA256"));
                                                                byte[] bytes = payload.getBytes(mh.a.f18238b);
                                                                kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
                                                                strEncodeToString = Base64.encodeToString(mac.doFinal(bytes), 2);
                                                            } catch (Exception unused6) {
                                                                strEncodeToString = str4;
                                                            }
                                                            if (str2.equals(strEncodeToString)) {
                                                            }
                                                        }
                                                    }
                                                }
                                                z10 = true;
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                                str = str4;
                                hilt_HtmlToApkApplication = hilt_HtmlToApkApplication3;
                            }
                            boolValueOf = Boolean.valueOf(z10);
                            i13 = 1;
                        }
                    }
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                c0191a.f18455b = i13;
                if (this.f18452a.c(boolValueOf, c0191a) == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj2);
            }
            return pg.f0.f21461a;
        }
    }

    public g1(sh.f fVar, m1 m1Var) {
        this.f18450a = fVar;
        this.f18451b = m1Var;
    }

    @Override // sh.f
    public final Object b(sh.g<? super Boolean> gVar, tg.e eVar) {
        Object objB = this.f18450a.b(new a(gVar, this.f18451b), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
