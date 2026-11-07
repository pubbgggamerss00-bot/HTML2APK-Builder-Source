package com.basitce.htmltoapk.domain.model;

import ai.a;
import bi.f;
import ci.c;
import ci.e;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
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
public /* synthetic */ class Project$$serializer implements GeneratedSerializer<Project> {
    public static final int $stable;
    public static final Project$$serializer INSTANCE;
    private static final f descriptor;

    static {
        Project$$serializer project$$serializer = new Project$$serializer();
        INSTANCE = project$$serializer;
        $stable = 8;
        n0 n0Var = new n0("com.basitce.htmltoapk.domain.model.Project", project$$serializer, 66);
        n0Var.j("id", true);
        n0Var.j("name", false);
        n0Var.j("appName", false);
        n0Var.j("packageName", false);
        n0Var.j("versionCode", false);
        n0Var.j("versionName", false);
        n0Var.j("minSdk", false);
        n0Var.j("targetSdk", false);
        n0Var.j("maxSdk", true);
        n0Var.j("contentSource", false);
        n0Var.j("sourcePath", true);
        n0Var.j("sourceUrl", true);
        n0Var.j("permissions", true);
        n0Var.j("iconPath", true);
        n0Var.j("splashPath", true);
        n0Var.j("primaryColor", true);
        n0Var.j("orientation", true);
        n0Var.j("showHeader", true);
        n0Var.j("showActionBar", true);
        n0Var.j("keepScreenOn", true);
        n0Var.j("showCameraCutout", true);
        n0Var.j("desktopMode", true);
        n0Var.j("webViewSettings", true);
        n0Var.j("keystoreId", true);
        n0Var.j("outputFormat", true);
        n0Var.j("buildMode", true);
        n0Var.j("showWatermark", true);
        n0Var.j("autoIncrementVersionCode", true);
        n0Var.j("deepLinkScheme", true);
        n0Var.j("billingEnabled", true);
        n0Var.j("billingProductId", true);
        n0Var.j("billingSubscriptionId", true);
        n0Var.j("billingType", true);
        n0Var.j("billingTestMode", true);
        n0Var.j("billingAutoConsume", true);
        n0Var.j("billingAcknowledge", true);
        n0Var.j("billingEnablePendingPurchases", true);
        n0Var.j("billingSubscriptionPeriod", true);
        n0Var.j("billingFreeTrialDays", true);
        n0Var.j("billingIntroductoryPrice", true);
        n0Var.j("billingProductName", true);
        n0Var.j("billingProductDescription", true);
        n0Var.j("admobEnabled", true);
        n0Var.j("admobAppId", true);
        n0Var.j("admobBannerUnitId", true);
        n0Var.j("admobInterstitialUnitId", true);
        n0Var.j("admobRewardedUnitId", true);
        n0Var.j("admobBannerPosition", true);
        n0Var.j("admobShowBannerOnStart", true);
        n0Var.j("admobTestDeviceIds", true);
        n0Var.j("admobAutoLoadInterstitial", true);
        n0Var.j("admobAutoLoadRewarded", true);
        n0Var.j("admobUseTestAds", true);
        n0Var.j("admobBannerEnabled", true);
        n0Var.j("admobInterstitialEnabled", true);
        n0Var.j("admobRewardedEnabled", true);
        n0Var.j("admobInterstitialIntervalSeconds", true);
        n0Var.j("admobInterstitialPageCount", true);
        n0Var.j("admobChildDirectedTreatment", true);
        n0Var.j("admobUnderAgeOfConsent", true);
        n0Var.j("admobMaxAdContentRating", true);
        n0Var.j("umpDebugEnabled", true);
        n0Var.j("umpDebugGeography", true);
        n0Var.j("umpTestDeviceIds", true);
        n0Var.j("createdAt", true);
        n0Var.j("updatedAt", true);
        descriptor = n0Var;
    }

    private Project$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final b<?>[] childSerializers() {
        b<?>[] bVarArr = Project.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        b<?> bVarD = a.d(intSerializer);
        b<?> bVar = bVarArr[9];
        b<?> bVarD2 = a.d(stringSerializer);
        b<?> bVarD3 = a.d(stringSerializer);
        b<?> bVar2 = bVarArr[12];
        b<?> bVarD4 = a.d(stringSerializer);
        b<?> bVarD5 = a.d(stringSerializer);
        b<?> bVarD6 = a.d(stringSerializer);
        b<?> bVarD7 = a.d(longSerializer);
        b<?> bVarD8 = a.d(stringSerializer);
        b<?> bVarD9 = a.d(stringSerializer);
        b<?> bVarD10 = a.d(stringSerializer);
        b<?> bVarD11 = a.d(stringSerializer);
        b<?> bVarD12 = a.d(stringSerializer);
        b<?> bVarD13 = a.d(stringSerializer);
        b<?> bVarD14 = a.d(stringSerializer);
        b<?> bVarD15 = a.d(stringSerializer);
        b<?> bVarD16 = a.d(stringSerializer);
        b<?> bVarD17 = a.d(stringSerializer);
        b<?> bVarD18 = a.d(stringSerializer);
        b<?> bVarD19 = a.d(stringSerializer);
        b<?> bVarD20 = a.d(stringSerializer);
        b<?> bVarD21 = a.d(stringSerializer);
        b<?> bVarD22 = a.d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new b[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, intSerializer, intSerializer, bVarD, bVar, bVarD2, bVarD3, bVar2, bVarD4, bVarD5, bVarD6, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, WebViewSettings$$serializer.INSTANCE, bVarD7, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, bVarD8, booleanSerializer, bVarD9, bVarD10, bVarD11, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, bVarD12, intSerializer, bVarD13, bVarD14, bVarD15, booleanSerializer, bVarD16, bVarD17, bVarD18, bVarD19, bVarD20, booleanSerializer, bVarD21, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, intSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, booleanSerializer, stringSerializer, bVarD22, longSerializer, longSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.a
    public final Project deserialize(ci.d decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        r.e(decoder, "decoder");
        f fVar = descriptor;
        ci.b bVarC = decoder.c(fVar);
        b[] bVarArr = Project.$childSerializers;
        String str5 = null;
        long jK = 0;
        long j10 = 0;
        long jK2 = 0;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        Integer num = null;
        ContentSource contentSource = null;
        String str22 = null;
        String str23 = null;
        List list = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        WebViewSettings webViewSettings = null;
        Long l10 = null;
        String str28 = null;
        String str29 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        int i15 = 0;
        boolean z10 = true;
        int i16 = 0;
        int i17 = 0;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
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
        boolean zA11 = false;
        boolean zA12 = false;
        int iW4 = 0;
        boolean zA13 = false;
        boolean zA14 = false;
        boolean zA15 = false;
        boolean zA16 = false;
        boolean zA17 = false;
        boolean zA18 = false;
        boolean zA19 = false;
        boolean zA20 = false;
        int iW5 = 0;
        int iW6 = 0;
        int iW7 = 0;
        int iW8 = 0;
        boolean zA21 = false;
        while (z10) {
            String str34 = str16;
            int iG = bVarC.g(fVar);
            switch (iG) {
                case -1:
                    str = str6;
                    str2 = str7;
                    str3 = str17;
                    f0 f0Var = f0.f21461a;
                    z10 = false;
                    str16 = str34;
                    str7 = str2;
                    str17 = str3;
                    str6 = str;
                case 0:
                    str = str6;
                    str2 = str7;
                    str3 = str17;
                    jK = bVarC.k(fVar, 0);
                    f0 f0Var2 = f0.f21461a;
                    i16 |= 1;
                    str16 = str34;
                    str7 = str2;
                    str17 = str3;
                    str6 = str;
                case 1:
                    str = str6;
                    str3 = str17;
                    String strZ = bVarC.z(fVar, 1);
                    f0 f0Var3 = f0.f21461a;
                    i16 |= 2;
                    str20 = strZ;
                    str16 = str34;
                    str7 = str7;
                    str17 = str3;
                    str6 = str;
                case 2:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    String strZ2 = bVarC.z(fVar, 2);
                    i10 = i16 | 4;
                    f0 f0Var4 = f0.f21461a;
                    str21 = strZ2;
                    i16 = i10;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 3:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    String strZ3 = bVarC.z(fVar, 3);
                    i10 = i16 | 8;
                    f0 f0Var5 = f0.f21461a;
                    str18 = strZ3;
                    i16 = i10;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 4:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    iW = bVarC.w(fVar, 4);
                    i11 = i16 | 16;
                    f0 f0Var6 = f0.f21461a;
                    i16 = i11;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 5:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    String strZ4 = bVarC.z(fVar, 5);
                    i10 = i16 | 32;
                    f0 f0Var7 = f0.f21461a;
                    str19 = strZ4;
                    i16 = i10;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 6:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    iW2 = bVarC.w(fVar, 6);
                    i11 = i16 | 64;
                    f0 f0Var62 = f0.f21461a;
                    i16 = i11;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 7:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    iW3 = bVarC.w(fVar, 7);
                    i11 = i16 | 128;
                    f0 f0Var622 = f0.f21461a;
                    i16 = i11;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 8:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    Integer num2 = (Integer) bVarC.s(fVar, 8, IntSerializer.INSTANCE, num);
                    i12 = i16 | 256;
                    f0 f0Var8 = f0.f21461a;
                    num = num2;
                    i16 = i12;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 9:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    ContentSource contentSource2 = (ContentSource) bVarC.u(fVar, 9, bVarArr[9], contentSource);
                    i12 = i16 | 512;
                    f0 f0Var9 = f0.f21461a;
                    contentSource = contentSource2;
                    i16 = i12;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 10:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    String str35 = (String) bVarC.s(fVar, 10, StringSerializer.INSTANCE, str22);
                    i12 = i16 | 1024;
                    f0 f0Var10 = f0.f21461a;
                    str22 = str35;
                    i16 = i12;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 11:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    String str36 = (String) bVarC.s(fVar, 11, StringSerializer.INSTANCE, str23);
                    i12 = i16 | 2048;
                    f0 f0Var11 = f0.f21461a;
                    str23 = str36;
                    i16 = i12;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 12:
                    str = str6;
                    str4 = str7;
                    str3 = str17;
                    List list2 = (List) bVarC.u(fVar, 12, bVarArr[12], list);
                    i12 = i16 | 4096;
                    f0 f0Var12 = f0.f21461a;
                    list = list2;
                    i16 = i12;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 13:
                    str = str6;
                    str3 = str17;
                    str4 = str7;
                    String str37 = (String) bVarC.s(fVar, 13, StringSerializer.INSTANCE, str25);
                    i12 = i16 | 8192;
                    f0 f0Var13 = f0.f21461a;
                    str25 = str37;
                    i16 = i12;
                    str16 = str34;
                    str7 = str4;
                    str17 = str3;
                    str6 = str;
                case 14:
                    str = str6;
                    str3 = str17;
                    String str38 = (String) bVarC.s(fVar, 14, StringSerializer.INSTANCE, str26);
                    i13 = i16 | 16384;
                    f0 f0Var14 = f0.f21461a;
                    str26 = str38;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 15:
                    str = str6;
                    str3 = str17;
                    String str39 = (String) bVarC.s(fVar, 15, StringSerializer.INSTANCE, str27);
                    i13 = i16 | 32768;
                    f0 f0Var15 = f0.f21461a;
                    str27 = str39;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 16:
                    str = str6;
                    str3 = str17;
                    String strZ5 = bVarC.z(fVar, 16);
                    i14 = i16 | 65536;
                    f0 f0Var16 = f0.f21461a;
                    str24 = strZ5;
                    i16 = i14;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 17:
                    str = str6;
                    str3 = str17;
                    zA = bVarC.A(fVar, 17);
                    i13 = i16 | 131072;
                    f0 f0Var17 = f0.f21461a;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 18:
                    str = str6;
                    str3 = str17;
                    zA2 = bVarC.A(fVar, 18);
                    i13 = i16 | PKIFailureInfo.transactionIdInUse;
                    f0 f0Var172 = f0.f21461a;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 19:
                    str = str6;
                    str3 = str17;
                    zA3 = bVarC.A(fVar, 19);
                    i13 = i16 | PKIFailureInfo.signerNotTrusted;
                    f0 f0Var1722 = f0.f21461a;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 20:
                    str = str6;
                    str3 = str17;
                    zA4 = bVarC.A(fVar, 20);
                    i13 = i16 | PKIFailureInfo.badCertTemplate;
                    f0 f0Var17222 = f0.f21461a;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 21:
                    str = str6;
                    str3 = str17;
                    zA5 = bVarC.A(fVar, 21);
                    i13 = i16 | PKIFailureInfo.badSenderNonce;
                    f0 f0Var172222 = f0.f21461a;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 22:
                    str = str6;
                    str3 = str17;
                    WebViewSettings webViewSettings2 = (WebViewSettings) bVarC.u(fVar, 22, WebViewSettings$$serializer.INSTANCE, webViewSettings);
                    i13 = i16 | 4194304;
                    f0 f0Var18 = f0.f21461a;
                    webViewSettings = webViewSettings2;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 23:
                    str = str6;
                    str3 = str17;
                    Long l11 = (Long) bVarC.s(fVar, 23, LongSerializer.INSTANCE, l10);
                    i13 = i16 | 8388608;
                    f0 f0Var19 = f0.f21461a;
                    l10 = l11;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 24:
                    str = str6;
                    str3 = str17;
                    String strZ6 = bVarC.z(fVar, 24);
                    i14 = i16 | 16777216;
                    f0 f0Var20 = f0.f21461a;
                    str28 = strZ6;
                    i16 = i14;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 25:
                    str = str6;
                    str3 = str17;
                    String strZ7 = bVarC.z(fVar, 25);
                    i14 = i16 | 33554432;
                    f0 f0Var21 = f0.f21461a;
                    str29 = strZ7;
                    i16 = i14;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 26:
                    str = str6;
                    str3 = str17;
                    zA6 = bVarC.A(fVar, 26);
                    i13 = i16 | 67108864;
                    f0 f0Var1722222 = f0.f21461a;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 27:
                    str = str6;
                    str3 = str17;
                    zA7 = bVarC.A(fVar, 27);
                    i13 = i16 | 134217728;
                    f0 f0Var17222222 = f0.f21461a;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 28:
                    str = str6;
                    str3 = str17;
                    String str40 = (String) bVarC.s(fVar, 28, StringSerializer.INSTANCE, str30);
                    i13 = i16 | 268435456;
                    f0 f0Var22 = f0.f21461a;
                    str30 = str40;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 29:
                    str = str6;
                    str3 = str17;
                    zA8 = bVarC.A(fVar, 29);
                    i13 = i16 | PKIFailureInfo.duplicateCertReq;
                    f0 f0Var172222222 = f0.f21461a;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 30:
                    str = str6;
                    str3 = str17;
                    String str41 = (String) bVarC.s(fVar, 30, StringSerializer.INSTANCE, str31);
                    i13 = i16 | 1073741824;
                    f0 f0Var23 = f0.f21461a;
                    str31 = str41;
                    i16 = i13;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 31:
                    str = str6;
                    str3 = str17;
                    String str42 = (String) bVarC.s(fVar, 31, StringSerializer.INSTANCE, str34);
                    int i18 = i16 | PKIFailureInfo.systemUnavail;
                    f0 f0Var24 = f0.f21461a;
                    i16 = i18;
                    str16 = str42;
                    str17 = str3;
                    str6 = str;
                case 32:
                    str = str6;
                    String str43 = (String) bVarC.s(fVar, 32, StringSerializer.INSTANCE, str17);
                    i15 |= 1;
                    f0 f0Var25 = f0.f21461a;
                    str3 = str43;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 33:
                    str3 = str17;
                    zA9 = bVarC.A(fVar, 33);
                    i15 |= 2;
                    f0 f0Var26 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 34:
                    str3 = str17;
                    zA10 = bVarC.A(fVar, 34);
                    i15 |= 4;
                    f0 f0Var262 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 35:
                    str3 = str17;
                    zA11 = bVarC.A(fVar, 35);
                    i15 |= 8;
                    f0 f0Var2622 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 36:
                    str3 = str17;
                    zA12 = bVarC.A(fVar, 36);
                    i15 |= 16;
                    f0 f0Var26222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 37:
                    str3 = str17;
                    str5 = (String) bVarC.s(fVar, 37, StringSerializer.INSTANCE, str5);
                    i15 |= 32;
                    f0 f0Var262222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 38:
                    str3 = str17;
                    iW4 = bVarC.w(fVar, 38);
                    i15 |= 64;
                    f0 f0Var2622222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 39:
                    str3 = str17;
                    str9 = (String) bVarC.s(fVar, 39, StringSerializer.INSTANCE, str9);
                    i15 |= 128;
                    f0 f0Var26222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 40:
                    str3 = str17;
                    str10 = (String) bVarC.s(fVar, 40, StringSerializer.INSTANCE, str10);
                    i15 |= 256;
                    f0 f0Var262222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 41:
                    str3 = str17;
                    str11 = (String) bVarC.s(fVar, 41, StringSerializer.INSTANCE, str11);
                    i15 |= 512;
                    f0 f0Var2622222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 42:
                    str3 = str17;
                    zA13 = bVarC.A(fVar, 42);
                    i15 |= 1024;
                    f0 f0Var26222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    str3 = str17;
                    str12 = (String) bVarC.s(fVar, 43, StringSerializer.INSTANCE, str12);
                    i15 |= 2048;
                    f0 f0Var262222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 44:
                    str3 = str17;
                    str13 = (String) bVarC.s(fVar, 44, StringSerializer.INSTANCE, str13);
                    i15 |= 4096;
                    f0 f0Var2622222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 45:
                    str3 = str17;
                    str14 = (String) bVarC.s(fVar, 45, StringSerializer.INSTANCE, str14);
                    i15 |= 8192;
                    f0 f0Var26222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 46:
                    str3 = str17;
                    str8 = (String) bVarC.s(fVar, 46, StringSerializer.INSTANCE, str8);
                    i15 |= 16384;
                    f0 f0Var262222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    str3 = str17;
                    str7 = (String) bVarC.s(fVar, 47, StringSerializer.INSTANCE, str7);
                    i15 |= 32768;
                    f0 f0Var2622222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 48:
                    str3 = str17;
                    zA14 = bVarC.A(fVar, 48);
                    i15 |= 65536;
                    f0 f0Var26222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 49:
                    str3 = str17;
                    str6 = (String) bVarC.s(fVar, 49, StringSerializer.INSTANCE, str6);
                    i15 |= 131072;
                    f0 f0Var262222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 50:
                    str3 = str17;
                    zA15 = bVarC.A(fVar, 50);
                    i15 |= PKIFailureInfo.transactionIdInUse;
                    f0 f0Var2622222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    str3 = str17;
                    zA16 = bVarC.A(fVar, 51);
                    i15 |= PKIFailureInfo.signerNotTrusted;
                    f0 f0Var26222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 52:
                    str3 = str17;
                    zA17 = bVarC.A(fVar, 52);
                    i15 |= PKIFailureInfo.badCertTemplate;
                    f0 f0Var262222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case EACTags.SEX /* 53 */:
                    str3 = str17;
                    zA18 = bVarC.A(fVar, 53);
                    i15 |= PKIFailureInfo.badSenderNonce;
                    f0 f0Var2622222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    str3 = str17;
                    zA19 = bVarC.A(fVar, 54);
                    i15 |= 4194304;
                    f0 f0Var26222222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 55:
                    str3 = str17;
                    zA20 = bVarC.A(fVar, 55);
                    i15 |= 8388608;
                    f0 f0Var262222222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 56:
                    str3 = str17;
                    iW5 = bVarC.w(fVar, 56);
                    i15 |= 16777216;
                    f0 f0Var2622222222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 57:
                    str3 = str17;
                    iW6 = bVarC.w(fVar, 57);
                    i15 |= 33554432;
                    f0 f0Var26222222222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    str3 = str17;
                    iW7 = bVarC.w(fVar, 58);
                    i15 |= 67108864;
                    f0 f0Var262222222222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    str3 = str17;
                    iW8 = bVarC.w(fVar, 59);
                    i15 |= 134217728;
                    f0 f0Var2622222222222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 60:
                    str3 = str17;
                    String strZ8 = bVarC.z(fVar, 60);
                    i15 |= 268435456;
                    f0 f0Var27 = f0.f21461a;
                    str = str6;
                    str32 = strZ8;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 61:
                    str3 = str17;
                    zA21 = bVarC.A(fVar, 61);
                    i15 |= PKIFailureInfo.duplicateCertReq;
                    f0 f0Var26222222222222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 62:
                    str3 = str17;
                    String strZ9 = bVarC.z(fVar, 62);
                    i15 |= 1073741824;
                    f0 f0Var28 = f0.f21461a;
                    str = str6;
                    str33 = strZ9;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 63:
                    str3 = str17;
                    str15 = (String) bVarC.s(fVar, 63, StringSerializer.INSTANCE, str15);
                    i15 |= PKIFailureInfo.systemUnavail;
                    f0 f0Var262222222222222222222222222222 = f0.f21461a;
                    str = str6;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                case 64:
                    long jK3 = bVarC.k(fVar, 64);
                    i17 |= 1;
                    f0 f0Var29 = f0.f21461a;
                    str = str6;
                    str3 = str17;
                    str16 = str34;
                    j10 = jK3;
                    str17 = str3;
                    str6 = str;
                case EACTags.ELEMENT_LIST /* 65 */:
                    jK2 = bVarC.k(fVar, 65);
                    i17 |= 2;
                    f0 f0Var30 = f0.f21461a;
                    str = str6;
                    str3 = str17;
                    str16 = str34;
                    str17 = str3;
                    str6 = str;
                default:
                    throw new q(iG);
            }
        }
        String str44 = str6;
        String str45 = str7;
        Integer num3 = num;
        int i19 = i16;
        bVarC.b(fVar);
        return new Project(i19, i15, i17, jK, str20, str21, str18, iW, str19, iW2, iW3, num3, contentSource, str22, str23, list, str25, str26, str27, str24, zA, zA2, zA3, zA4, zA5, webViewSettings, l10, str28, str29, zA6, zA7, str30, zA8, str31, str16, str17, zA9, zA10, zA11, zA12, str5, iW4, str9, str10, str11, zA13, str12, str13, str14, str8, str45, zA14, str44, zA15, zA16, zA17, zA18, zA19, zA20, iW5, iW6, iW7, iW8, str32, zA21, str33, str15, j10, jK2, (v0) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i, zh.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i
    public final void serialize(e encoder, Project value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        f fVar = descriptor;
        c cVarC = encoder.c(fVar);
        Project.write$Self$app_release(value, cVarC, fVar);
        cVarC.b(fVar);
    }
}
