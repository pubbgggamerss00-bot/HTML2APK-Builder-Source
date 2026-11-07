package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rz1 {
    static {
        int i6 = r22.zza;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() throws GeneralSecurityException {
        vx1 vx1Var = vx1.f9959b;
        vx1Var.d(wz1.f10320a);
        vx1Var.c(wz1.f10321b);
        vx1Var.d(jz1.f6196a);
        int i6 = nz1.f7539f;
        if (!aa1.j(i6)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        ww1 ww1Var = c02.f3352a;
        wx1 wx1Var = wx1.f10304b;
        wx1Var.h(c02.f3354c);
        wx1Var.g(c02.f3355d);
        wx1Var.f(c02.f3356e);
        wx1Var.e(c02.f3357f);
        vx1Var.c(nz1.f7534a);
        vx1Var.c(nz1.f7535b);
        ux1 ux1Var = ux1.f9659b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", xz1.f10753a);
        mx mxVar = new mx(3);
        mxVar.c(32);
        mxVar.e(16);
        pz1 pz1Var = pz1.f8185e;
        mxVar.f7235w = pz1Var;
        oz1 oz1Var = oz1.f7900d;
        mxVar.f7234v = oz1Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", mxVar.g());
        mx mxVar2 = new mx(3);
        mxVar2.c(32);
        mxVar2.e(32);
        pz1 pz1Var2 = pz1.f8182b;
        mxVar2.f7235w = pz1Var2;
        mxVar2.f7234v = oz1Var;
        map.put("HMAC_SHA256_256BITTAG", mxVar2.g());
        mx mxVar3 = new mx(3);
        mxVar3.c(32);
        mxVar3.e(32);
        mxVar3.f7235w = pz1Var;
        mxVar3.f7234v = oz1Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", mxVar3.g());
        mx mxVar4 = new mx(3);
        mxVar4.c(64);
        mxVar4.e(16);
        mxVar4.f7235w = pz1Var2;
        oz1 oz1Var2 = oz1.f7902f;
        mxVar4.f7234v = oz1Var2;
        map.put("HMAC_SHA512_128BITTAG", mxVar4.g());
        mx mxVar5 = new mx(3);
        mxVar5.c(64);
        mxVar5.e(16);
        mxVar5.f7235w = pz1Var;
        mxVar5.f7234v = oz1Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", mxVar5.g());
        mx mxVar6 = new mx(3);
        mxVar6.c(64);
        mxVar6.e(32);
        mxVar6.f7235w = pz1Var2;
        mxVar6.f7234v = oz1Var2;
        map.put("HMAC_SHA512_256BITTAG", mxVar6.g());
        mx mxVar7 = new mx(3);
        mxVar7.c(64);
        mxVar7.e(32);
        mxVar7.f7235w = pz1Var;
        mxVar7.f7234v = oz1Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", mxVar7.g());
        map.put("HMAC_SHA512_512BITTAG", xz1.f10754b);
        mx mxVar8 = new mx(3);
        mxVar8.c(64);
        mxVar8.e(64);
        mxVar8.f7235w = pz1Var;
        mxVar8.f7234v = oz1Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", mxVar8.g());
        ux1Var.b(Collections.unmodifiableMap(map));
        px1 px1Var = px1.f8174b;
        px1Var.b(nz1.f7538e, qz1.class);
        rx1.f8732b.a(nz1.f7537d, qz1.class);
        xw1 xw1Var = xw1.f10733d;
        xw1Var.b(nz1.f7536c, i6);
        if (vw1.a()) {
            return;
        }
        cz1 cz1Var = ez1.f4427a;
        if (!aa1.j(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        wx1Var.h(zz1.f11608a);
        wx1Var.g(zz1.f11609b);
        wx1Var.f(zz1.f11610c);
        wx1Var.e(zz1.f11611d);
        px1Var.b(ez1.f4427a, gz1.class);
        vx1Var.c(ez1.f4428b);
        vx1Var.c(ez1.f4429c);
        HashMap map2 = new HashMap();
        gz1 gz1Var = xz1.f10755c;
        map2.put("AES_CMAC", gz1Var);
        map2.put("AES256_CMAC", gz1Var);
        fz1 fz1Var = new fz1();
        fz1Var.a(32);
        fz1Var.b(16);
        fz1Var.f4832c = jv1.B;
        map2.put("AES256_CMAC_RAW", fz1Var.c());
        ux1Var.b(Collections.unmodifiableMap(map2));
        xw1Var.a(ez1.f4430d);
    }
}
