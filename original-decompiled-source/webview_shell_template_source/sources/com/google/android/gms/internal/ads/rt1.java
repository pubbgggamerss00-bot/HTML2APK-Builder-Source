package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rt1 {
    static {
        int i6 = r22.zza;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() {
        vx1 vx1Var = vx1.f9959b;
        vx1Var.d(vt1.f9939a);
        vx1Var.c(vt1.f9940b);
        rz1.a();
        int i6 = bu1.f3297e;
        if (!aa1.j(i6)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        by1 by1Var = yv1.f11090a;
        wx1 wx1Var = wx1.f10304b;
        wx1Var.h(yv1.f11090a);
        wx1Var.g(yv1.f11091b);
        wx1Var.f(yv1.f11092c);
        wx1Var.e(yv1.f11093d);
        vx1Var.c(bu1.f3293a);
        ux1 ux1Var = ux1.f9659b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", qv1.f8464e);
        cu1 cu1Var = new cu1();
        cu1Var.a(16);
        cu1Var.b(32);
        cu1Var.d(16);
        cu1Var.c(16);
        du1 du1Var = du1.f4033e;
        cu1Var.f3668e = du1Var;
        eu1 eu1Var = eu1.f4403w;
        cu1Var.f3669f = eu1Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", cu1Var.e());
        map.put("AES256_CTR_HMAC_SHA256", qv1.f8465f);
        cu1 cu1Var2 = new cu1();
        cu1Var2.a(32);
        cu1Var2.b(32);
        cu1Var2.d(32);
        cu1Var2.c(16);
        cu1Var2.f3668e = du1Var;
        cu1Var2.f3669f = eu1Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", cu1Var2.e());
        ux1Var.b(Collections.unmodifiableMap(map));
        rx1 rx1Var = rx1.f8732b;
        rx1Var.a(bu1.f3295c, fu1.class);
        px1 px1Var = px1.f8174b;
        px1Var.b(bu1.f3296d, fu1.class);
        xw1 xw1Var = xw1.f10733d;
        xw1Var.b(bu1.f3294b, i6);
        int i7 = su1.f9008e;
        if (!aa1.j(i7)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        wx1Var.h(dw1.f4053a);
        wx1Var.g(dw1.f4054b);
        wx1Var.f(dw1.f4055c);
        wx1Var.e(dw1.f4056d);
        vx1Var.c(su1.f9004a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", qv1.f8460a);
        mx mxVar = new mx(2);
        mxVar.b();
        mxVar.c(16);
        mxVar.d();
        tu1 tu1Var = tu1.f9377w;
        mxVar.f7235w = tu1Var;
        map2.put("AES128_GCM_RAW", mxVar.f());
        map2.put("AES256_GCM", qv1.f8461b);
        mx mxVar2 = new mx(2);
        mxVar2.b();
        mxVar2.c(32);
        mxVar2.d();
        mxVar2.f7235w = tu1Var;
        map2.put("AES256_GCM_RAW", mxVar2.f());
        ux1Var.b(Collections.unmodifiableMap(map2));
        rx1Var.a(su1.f9006c, uu1.class);
        px1Var.b(su1.f9007d, uu1.class);
        xw1Var.b(su1.f9005b, i7);
        if (vw1.a()) {
            return;
        }
        ey1 ey1Var = ku1.f6493a;
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        wx1Var.h(aw1.f2864a);
        wx1Var.g(aw1.f2865b);
        wx1Var.f(aw1.f2866c);
        wx1Var.e(aw1.f2867d);
        vx1Var.c(ku1.f6493a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", qv1.f8462c);
        eu euVar = new eu();
        euVar.b(16);
        euVar.d(16);
        euVar.f();
        lu1 lu1Var = lu1.f6858w;
        euVar.f4397v = lu1Var;
        map3.put("AES128_EAX_RAW", euVar.g());
        map3.put("AES256_EAX", qv1.f8463d);
        eu euVar2 = new eu();
        euVar2.b(16);
        euVar2.d(32);
        euVar2.f();
        euVar2.f4397v = lu1Var;
        map3.put("AES256_EAX_RAW", euVar2.g());
        ux1Var.b(Collections.unmodifiableMap(map3));
        px1Var.b(ku1.f6495c, mu1.class);
        xw1Var.a(ku1.f6494b);
        ey1 ey1Var2 = yu1.f11080a;
        eu1 eu1Var2 = eu1.f4406z;
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        wx1Var.h(ew1.f4408a);
        wx1Var.g(ew1.f4409b);
        wx1Var.f(ew1.f4410c);
        wx1Var.e(ew1.f4411d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            vx1Var.c(yu1.f11080a);
            HashMap map4 = new HashMap();
            eu1 eu1Var3 = eu1.f4404x;
            map4.put("AES128_GCM_SIV", new zu1(16, eu1Var3));
            map4.put("AES128_GCM_SIV_RAW", new zu1(16, eu1Var2));
            map4.put("AES256_GCM_SIV", new zu1(32, eu1Var3));
            map4.put("AES256_GCM_SIV_RAW", new zu1(32, eu1Var2));
            ux1Var.b(Collections.unmodifiableMap(map4));
            rx1Var.a(yu1.f11082c, zu1.class);
            px1Var.b(yu1.f11081b, zu1.class);
            xw1Var.a(yu1.f11083d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        ey1 ey1Var3 = bv1.f3305a;
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        by1 by1Var2 = hw1.f5509a;
        wx1 wx1Var2 = wx1.f10304b;
        wx1Var2.h(hw1.f5509a);
        wx1Var2.g(hw1.f5510b);
        wx1Var2.f(hw1.f5511c);
        wx1Var2.e(hw1.f5512d);
        vx1 vx1Var2 = vx1.f9959b;
        vx1Var2.c(bv1.f3305a);
        px1 px1Var2 = px1.f8174b;
        px1Var2.b(bv1.f3306b, cv1.class);
        ux1 ux1Var2 = ux1.f9659b;
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new cv1(tu1.f9378x));
        map5.put("CHACHA20_POLY1305_RAW", new cv1(tu1.f9380z));
        ux1Var2.b(Collections.unmodifiableMap(map5));
        xw1 xw1Var2 = xw1.f10733d;
        xw1Var2.a(bv1.f3307c);
        ey1 ey1Var4 = dv1.f4045a;
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        wx1Var2.h(lv1.f6864a);
        wx1Var2.g(lv1.f6865b);
        wx1Var2.f(lv1.f6866c);
        wx1Var2.e(lv1.f6867d);
        vx1Var2.c(dv1.f4045a);
        px1Var2.b(dv1.f4047c, kv1.class);
        xw1Var2.a(dv1.f4046b);
        fx1 fx1Var = hv1.f5501a;
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        wx1Var2.h(pv1.f8160a);
        wx1Var2.g(pv1.f8161b);
        wx1Var2.f(pv1.f8162c);
        wx1Var2.e(pv1.f8163d);
        px1Var2.b(hv1.f5502b, nv1.class);
        vx1Var2.c(hv1.f5503c);
        xw1Var2.a(hv1.f5501a);
        ey1 ey1Var5 = wv1.f10280a;
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        wx1Var2.h(tw1.f9402a);
        wx1Var2.g(tw1.f9403b);
        wx1Var2.f(tw1.f9404c);
        wx1Var2.e(tw1.f9405d);
        vx1Var2.c(wv1.f10280a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new xv1(du1.h));
        map6.put("XCHACHA20_POLY1305_RAW", new xv1(du1.f4037j));
        ux1Var2.b(Collections.unmodifiableMap(map6));
        px1Var2.b(wv1.f10283d, xv1.class);
        rx1.f8732b.a(wv1.f10282c, xv1.class);
        xw1Var2.a(wv1.f10281b);
        wx1Var2.h(rw1.f8722a);
        wx1Var2.g(rw1.f8723b);
        wx1Var2.f(rw1.f8724c);
        wx1Var2.e(rw1.f8725d);
        HashMap map7 = new HashMap();
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", qv1.f8466g);
        ux1Var2.b(Collections.unmodifiableMap(map7));
        vx1Var2.c(sv1.f9032b);
        px1Var2.b(sv1.f9031a, tv1.class);
    }
}
