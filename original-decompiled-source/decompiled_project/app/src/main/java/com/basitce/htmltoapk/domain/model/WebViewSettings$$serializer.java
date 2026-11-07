package com.basitce.htmltoapk.domain.model;

import ai.a;
import bi.f;
import ci.c;
import ci.e;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.n0;
import kotlinx.serialization.internal.v0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import pg.d;
import pg.f0;
import zh.b;
import zh.q;

@d
/* loaded from: classes.dex */
public /* synthetic */ class WebViewSettings$$serializer implements GeneratedSerializer<WebViewSettings> {
    public static final int $stable;
    public static final WebViewSettings$$serializer INSTANCE;
    private static final f descriptor;

    static {
        WebViewSettings$$serializer webViewSettings$$serializer = new WebViewSettings$$serializer();
        INSTANCE = webViewSettings$$serializer;
        $stable = 8;
        n0 n0Var = new n0("com.basitce.htmltoapk.domain.model.WebViewSettings", webViewSettings$$serializer, 54);
        n0Var.j("javaScriptEnabled", true);
        n0Var.j("domStorageEnabled", true);
        n0Var.j("allowFileAccess", true);
        n0Var.j("allowContentAccess", true);
        n0Var.j("allowUniversalAccessFromFileURLs", true);
        n0Var.j("allowFileAccessFromFileURLs", true);
        n0Var.j("builtInZoomControls", true);
        n0Var.j("displayZoomControls", true);
        n0Var.j("useWideViewPort", true);
        n0Var.j("loadWithOverviewMode", true);
        n0Var.j("cacheMode", true);
        n0Var.j("mixedContentMode", true);
        n0Var.j("userAgent", true);
        n0Var.j("textZoom", true);
        n0Var.j("geolocationEnabled", true);
        n0Var.j("pullToRefresh", true);
        n0Var.j("noInternetDialog", true);
        n0Var.j("loadingIndicator", true);
        n0Var.j("backHistoryNavigation", true);
        n0Var.j("exitConfirmationDialog", true);
        n0Var.j("bridgeOwnOriginOnly", true);
        n0Var.j("openExternalPdfs", true);
        n0Var.j("splashEnabled", true);
        n0Var.j("splashBgColor", true);
        n0Var.j("splashFadeOut", true);
        n0Var.j("splashLoaderStyle", true);
        n0Var.j("splashIconSize", true);
        n0Var.j("splashIconRadius", true);
        n0Var.j("splashLoaderSize", true);
        n0Var.j("splashSpacing", true);
        n0Var.j("splashDuration", true);
        n0Var.j("splashLoaderThickness", true);
        n0Var.j("splashFadeDuration", true);
        n0Var.j("splashLoaderColor", true);
        n0Var.j("splashFullScreen", true);
        n0Var.j("splashHideLoader", true);
        n0Var.j("colorMode", true);
        n0Var.j("webBackgroundColor", true);
        n0Var.j("statusBarColor", true);
        n0Var.j("statusBarAlpha", true);
        n0Var.j("statusBarIcons", true);
        n0Var.j("navBarColor", true);
        n0Var.j("navBarAlpha", true);
        n0Var.j("navBarIcons", true);
        n0Var.j("pdfScrollMode", true);
        n0Var.j("pdfNightMode", true);
        n0Var.j("pdfRememberPage", true);
        n0Var.j("pdfShowToolbar", true);
        n0Var.j("pdfShowPageIndicator", true);
        n0Var.j("pdfFastScroll", true);
        n0Var.j("pdfZoomEnabled", true);
        n0Var.j("pdfBookmarks", true);
        n0Var.j("pdfAllowExport", true);
        n0Var.j("pdfStartPage", true);
        descriptor = n0Var;
    }

    private WebViewSettings$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final b<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        b<?> bVarD = a.d(stringSerializer);
        b<?> bVarD2 = a.d(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new b[]{booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, intSerializer, intSerializer, bVarD, intSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, bVarD2, booleanSerializer, stringSerializer, booleanSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.a
    public final WebViewSettings deserialize(ci.d decoder) {
        int i10;
        r.e(decoder, "decoder");
        f fVar = descriptor;
        ci.b bVarC = decoder.c(fVar);
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        boolean z10 = true;
        int i11 = 0;
        int i12 = 0;
        boolean zA = false;
        boolean zA2 = false;
        boolean zA3 = false;
        boolean zA4 = false;
        boolean zA5 = false;
        boolean zA6 = false;
        boolean zA7 = false;
        boolean zA8 = false;
        boolean zA9 = false;
        boolean zA10 = false;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zA11 = false;
        boolean zA12 = false;
        boolean zA13 = false;
        boolean zA14 = false;
        boolean zA15 = false;
        boolean zA16 = false;
        boolean zA17 = false;
        boolean zA18 = false;
        boolean zA19 = false;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        int iW7 = 0;
        int iW8 = 0;
        int iW9 = 0;
        int iW10 = 0;
        boolean zA20 = false;
        boolean zA21 = false;
        int iW11 = 0;
        int iW12 = 0;
        boolean zA22 = false;
        boolean zA23 = false;
        boolean zA24 = false;
        boolean zA25 = false;
        boolean zA26 = false;
        boolean zA27 = false;
        boolean zA28 = false;
        int iW13 = 0;
        while (z10) {
            int iG = bVarC.g(fVar);
            switch (iG) {
                case -1:
                    f0 f0Var = f0.f21461a;
                    z10 = false;
                case 0:
                    zA = bVarC.A(fVar, 0);
                    i11 |= 1;
                    f0 f0Var2 = f0.f21461a;
                case 1:
                    zA2 = bVarC.A(fVar, 1);
                    i11 |= 2;
                    f0 f0Var3 = f0.f21461a;
                case 2:
                    zA3 = bVarC.A(fVar, 2);
                    i11 |= 4;
                    f0 f0Var4 = f0.f21461a;
                case 3:
                    zA4 = bVarC.A(fVar, 3);
                    i11 |= 8;
                    f0 f0Var42 = f0.f21461a;
                case 4:
                    zA5 = bVarC.A(fVar, 4);
                    i11 |= 16;
                    f0 f0Var422 = f0.f21461a;
                case 5:
                    zA6 = bVarC.A(fVar, 5);
                    i11 |= 32;
                    f0 f0Var4222 = f0.f21461a;
                case 6:
                    zA7 = bVarC.A(fVar, 6);
                    i11 |= 64;
                    f0 f0Var42222 = f0.f21461a;
                case 7:
                    zA8 = bVarC.A(fVar, 7);
                    i11 |= 128;
                    f0 f0Var422222 = f0.f21461a;
                case 8:
                    zA9 = bVarC.A(fVar, 8);
                    i11 |= 256;
                    f0 f0Var4222222 = f0.f21461a;
                case 9:
                    zA10 = bVarC.A(fVar, 9);
                    i11 |= 512;
                    f0 f0Var42222222 = f0.f21461a;
                case 10:
                    iW = bVarC.w(fVar, 10);
                    i11 |= 1024;
                    f0 f0Var422222222 = f0.f21461a;
                case 11:
                    iW2 = bVarC.w(fVar, 11);
                    i11 |= 2048;
                    f0 f0Var4222222222 = f0.f21461a;
                case 12:
                    String str13 = (String) bVarC.s(fVar, 12, StringSerializer.INSTANCE, str);
                    i11 |= 4096;
                    f0 f0Var5 = f0.f21461a;
                    str = str13;
                case 13:
                    iW3 = bVarC.w(fVar, 13);
                    i11 |= 8192;
                    f0 f0Var42222222222 = f0.f21461a;
                case 14:
                    zA11 = bVarC.A(fVar, 14);
                    i11 |= 16384;
                    f0 f0Var422222222222 = f0.f21461a;
                case 15:
                    zA12 = bVarC.A(fVar, 15);
                    i11 |= 32768;
                    f0 f0Var4222222222222 = f0.f21461a;
                case 16:
                    zA13 = bVarC.A(fVar, 16);
                    i11 |= 65536;
                    f0 f0Var42222222222222 = f0.f21461a;
                case 17:
                    zA14 = bVarC.A(fVar, 17);
                    i11 |= 131072;
                    f0 f0Var422222222222222 = f0.f21461a;
                case 18:
                    zA15 = bVarC.A(fVar, 18);
                    i11 |= PKIFailureInfo.transactionIdInUse;
                    f0 f0Var4222222222222222 = f0.f21461a;
                case 19:
                    zA16 = bVarC.A(fVar, 19);
                    i11 |= PKIFailureInfo.signerNotTrusted;
                    f0 f0Var42222222222222222 = f0.f21461a;
                case 20:
                    zA17 = bVarC.A(fVar, 20);
                    i11 |= PKIFailureInfo.badCertTemplate;
                    f0 f0Var422222222222222222 = f0.f21461a;
                case 21:
                    Boolean bool2 = (Boolean) bVarC.s(fVar, 21, BooleanSerializer.INSTANCE, bool);
                    i11 |= PKIFailureInfo.badSenderNonce;
                    f0 f0Var6 = f0.f21461a;
                    bool = bool2;
                case 22:
                    zA18 = bVarC.A(fVar, 22);
                    i10 = 4194304;
                    i11 |= i10;
                    f0 f0Var7 = f0.f21461a;
                case 23:
                    String strZ = bVarC.z(fVar, 23);
                    i11 |= 8388608;
                    f0 f0Var8 = f0.f21461a;
                    str2 = strZ;
                case 24:
                    zA19 = bVarC.A(fVar, 24);
                    i10 = 16777216;
                    i11 |= i10;
                    f0 f0Var72 = f0.f21461a;
                case 25:
                    String strZ2 = bVarC.z(fVar, 25);
                    i11 |= 33554432;
                    f0 f0Var9 = f0.f21461a;
                    str3 = strZ2;
                case 26:
                    iW4 = bVarC.w(fVar, 26);
                    i10 = 67108864;
                    i11 |= i10;
                    f0 f0Var722 = f0.f21461a;
                case 27:
                    iW5 = bVarC.w(fVar, 27);
                    i10 = 134217728;
                    i11 |= i10;
                    f0 f0Var7222 = f0.f21461a;
                case 28:
                    iW6 = bVarC.w(fVar, 28);
                    i10 = 268435456;
                    i11 |= i10;
                    f0 f0Var72222 = f0.f21461a;
                case 29:
                    iW7 = bVarC.w(fVar, 29);
                    i10 = PKIFailureInfo.duplicateCertReq;
                    i11 |= i10;
                    f0 f0Var722222 = f0.f21461a;
                case 30:
                    iW8 = bVarC.w(fVar, 30);
                    i10 = 1073741824;
                    i11 |= i10;
                    f0 f0Var7222222 = f0.f21461a;
                case 31:
                    iW9 = bVarC.w(fVar, 31);
                    i10 = PKIFailureInfo.systemUnavail;
                    i11 |= i10;
                    f0 f0Var72222222 = f0.f21461a;
                case 32:
                    iW10 = bVarC.w(fVar, 32);
                    i12 |= 1;
                    f0 f0Var722222222 = f0.f21461a;
                case 33:
                    String strZ3 = bVarC.z(fVar, 33);
                    i12 |= 2;
                    f0 f0Var10 = f0.f21461a;
                    str4 = strZ3;
                case 34:
                    zA20 = bVarC.A(fVar, 34);
                    i12 |= 4;
                    f0 f0Var7222222222 = f0.f21461a;
                case 35:
                    zA21 = bVarC.A(fVar, 35);
                    i12 |= 8;
                    f0 f0Var72222222222 = f0.f21461a;
                case 36:
                    String strZ4 = bVarC.z(fVar, 36);
                    i12 |= 16;
                    f0 f0Var11 = f0.f21461a;
                    str5 = strZ4;
                case 37:
                    String strZ5 = bVarC.z(fVar, 37);
                    i12 |= 32;
                    f0 f0Var12 = f0.f21461a;
                    str6 = strZ5;
                case 38:
                    String strZ6 = bVarC.z(fVar, 38);
                    i12 |= 64;
                    f0 f0Var13 = f0.f21461a;
                    str7 = strZ6;
                case 39:
                    iW11 = bVarC.w(fVar, 39);
                    i12 |= 128;
                    f0 f0Var722222222222 = f0.f21461a;
                case 40:
                    String strZ7 = bVarC.z(fVar, 40);
                    i12 |= 256;
                    f0 f0Var14 = f0.f21461a;
                    str8 = strZ7;
                case 41:
                    String strZ8 = bVarC.z(fVar, 41);
                    i12 |= 512;
                    f0 f0Var15 = f0.f21461a;
                    str9 = strZ8;
                case 42:
                    iW12 = bVarC.w(fVar, 42);
                    i12 |= 1024;
                    f0 f0Var7222222222222 = f0.f21461a;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    String strZ9 = bVarC.z(fVar, 43);
                    i12 |= 2048;
                    f0 f0Var16 = f0.f21461a;
                    str10 = strZ9;
                case 44:
                    String strZ10 = bVarC.z(fVar, 44);
                    i12 |= 4096;
                    f0 f0Var17 = f0.f21461a;
                    str11 = strZ10;
                case 45:
                    String strZ11 = bVarC.z(fVar, 45);
                    i12 |= 8192;
                    f0 f0Var18 = f0.f21461a;
                    str12 = strZ11;
                case 46:
                    zA22 = bVarC.A(fVar, 46);
                    i12 |= 16384;
                    f0 f0Var72222222222222 = f0.f21461a;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    zA23 = bVarC.A(fVar, 47);
                    i12 |= 32768;
                    f0 f0Var722222222222222 = f0.f21461a;
                case 48:
                    zA24 = bVarC.A(fVar, 48);
                    i12 |= 65536;
                    f0 f0Var7222222222222222 = f0.f21461a;
                case 49:
                    zA25 = bVarC.A(fVar, 49);
                    i12 |= 131072;
                    f0 f0Var72222222222222222 = f0.f21461a;
                case 50:
                    zA26 = bVarC.A(fVar, 50);
                    i12 |= PKIFailureInfo.transactionIdInUse;
                    f0 f0Var722222222222222222 = f0.f21461a;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    zA27 = bVarC.A(fVar, 51);
                    i12 |= PKIFailureInfo.signerNotTrusted;
                    f0 f0Var7222222222222222222 = f0.f21461a;
                case 52:
                    zA28 = bVarC.A(fVar, 52);
                    i12 |= PKIFailureInfo.badCertTemplate;
                    f0 f0Var72222222222222222222 = f0.f21461a;
                case EACTags.SEX /* 53 */:
                    iW13 = bVarC.w(fVar, 53);
                    i12 |= PKIFailureInfo.badSenderNonce;
                    f0 f0Var722222222222222222222 = f0.f21461a;
                default:
                    throw new q(iG);
            }
        }
        bVarC.b(fVar);
        return new WebViewSettings(i11, i12, zA, zA2, zA3, zA4, zA5, zA6, zA7, zA8, zA9, zA10, iW, iW2, str, iW3, zA11, zA12, zA13, zA14, zA15, zA16, zA17, bool, zA18, str2, zA19, str3, iW4, iW5, iW6, iW7, iW8, iW9, iW10, str4, zA20, zA21, str5, str6, str7, iW11, str8, str9, iW12, str10, str11, str12, zA22, zA23, zA24, zA25, zA26, zA27, zA28, iW13, (v0) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i, zh.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i
    public final void serialize(e encoder, WebViewSettings value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        f fVar = descriptor;
        c cVarC = encoder.c(fVar);
        WebViewSettings.write$Self$app_release(value, cVarC, fVar);
        cVarC.b(fVar);
    }
}
