package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class el2 extends fg2 {

    /* renamed from: x1, reason: collision with root package name */
    public static final int[] f4334x1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: y1, reason: collision with root package name */
    public static boolean f4335y1;

    /* renamed from: z1, reason: collision with root package name */
    public static boolean f4336z1;
    public final Context Q0;
    public final boolean R0;
    public final y S0;
    public final boolean T0;
    public final j U0;
    public final i V0;
    public dl2 W0;
    public boolean X0;
    public boolean Y0;
    public c Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f4337a1;

    /* renamed from: b1, reason: collision with root package name */
    public List f4338b1;

    /* renamed from: c1, reason: collision with root package name */
    public Surface f4339c1;

    /* renamed from: d1, reason: collision with root package name */
    public gl2 f4340d1;

    /* renamed from: e1, reason: collision with root package name */
    public sx0 f4341e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f4342f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f4343g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f4344h1;

    /* renamed from: i1, reason: collision with root package name */
    public long f4345i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f4346j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f4347k1;

    /* renamed from: l1, reason: collision with root package name */
    public int f4348l1;

    /* renamed from: m1, reason: collision with root package name */
    public long f4349m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f4350n1;

    /* renamed from: o1, reason: collision with root package name */
    public long f4351o1;

    /* renamed from: p1, reason: collision with root package name */
    public n90 f4352p1;

    /* renamed from: q1, reason: collision with root package name */
    public n90 f4353q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f4354r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f4355s1;

    /* renamed from: t1, reason: collision with root package name */
    public h f4356t1;
    public long u1;

    /* renamed from: v1, reason: collision with root package name */
    public long f4357v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f4358w1;

    public el2(Context context, of2 of2Var, Handler handler, db2 db2Var) {
        super(2, of2Var, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.Q0 = applicationContext;
        this.Z0 = null;
        this.S0 = new y(handler, db2Var);
        this.R0 = true;
        this.U0 = new j(applicationContext, this);
        this.V0 = new i();
        this.T0 = "NVIDIA".equals(j31.f5916c);
        this.f4341e1 = sx0.f9043c;
        this.f4343g1 = 1;
        this.f4344h1 = 0;
        this.f4352p1 = n90.f7346d;
        this.f4355s1 = 0;
        this.f4353q1 = null;
        this.f4354r1 = -1000;
        this.u1 = -9223372036854775807L;
        this.f4357v1 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0656 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean n0(String str) {
        boolean z6 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (el2.class) {
            if (!f4335y1) {
                int i6 = j31.f5914a;
                if (i6 <= 28) {
                    String str2 = j31.f5915b;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z6 = true;
                                break;
                            } else {
                                if (i6 > 27 || !"HWEML".equals(j31.f5915b)) {
                                    String str3 = j31.f5917d;
                                    switch (str3.hashCode()) {
                                        case -349662828:
                                            if (!str3.equals("AFTJMST12")) {
                                                if (i6 <= 26) {
                                                    String str4 = j31.f5915b;
                                                    switch (str4.hashCode()) {
                                                        case -2144781245:
                                                            if (!str4.equals("GIONEE_SWW1609")) {
                                                                if (str3.hashCode() == -594534941 && str3.equals("JSN-L21")) {
                                                                }
                                                            }
                                                            break;
                                                        case -2144781185:
                                                            if (str4.equals("GIONEE_SWW1627")) {
                                                            }
                                                            break;
                                                        case -2144781160:
                                                            if (str4.equals("GIONEE_SWW1631")) {
                                                            }
                                                            break;
                                                        case -2097309513:
                                                            if (str4.equals("K50a40")) {
                                                            }
                                                            break;
                                                        case -2022874474:
                                                            if (str4.equals("CP8676_I02")) {
                                                            }
                                                            break;
                                                        case -1978993182:
                                                            if (str4.equals("NX541J")) {
                                                            }
                                                            break;
                                                        case -1978990237:
                                                            if (str4.equals("NX573J")) {
                                                            }
                                                            break;
                                                        case -1936688988:
                                                            if (str4.equals("PGN528")) {
                                                            }
                                                            break;
                                                        case -1936688066:
                                                            if (str4.equals("PGN610")) {
                                                            }
                                                            break;
                                                        case -1936688065:
                                                            if (str4.equals("PGN611")) {
                                                            }
                                                            break;
                                                        case -1931988508:
                                                            if (str4.equals("AquaPowerM")) {
                                                            }
                                                            break;
                                                        case -1885099851:
                                                            if (str4.equals("RAIJIN")) {
                                                            }
                                                            break;
                                                        case -1696512866:
                                                            if (str4.equals("XT1663")) {
                                                            }
                                                            break;
                                                        case -1680025915:
                                                            if (str4.equals("ComioS1")) {
                                                            }
                                                            break;
                                                        case -1615810839:
                                                            if (str4.equals("Phantom6")) {
                                                            }
                                                            break;
                                                        case -1600724499:
                                                            if (str4.equals("pacificrim")) {
                                                            }
                                                            break;
                                                        case -1554255044:
                                                            if (str4.equals("vernee_M5")) {
                                                            }
                                                            break;
                                                        case -1481772737:
                                                            if (str4.equals("panell_dl")) {
                                                            }
                                                            break;
                                                        case -1481772730:
                                                            if (str4.equals("panell_ds")) {
                                                            }
                                                            break;
                                                        case -1481772729:
                                                            if (str4.equals("panell_dt")) {
                                                            }
                                                            break;
                                                        case -1320080169:
                                                            if (str4.equals("GiONEE_GBL7319")) {
                                                            }
                                                            break;
                                                        case -1217592143:
                                                            if (str4.equals("BRAVIA_ATV2")) {
                                                            }
                                                            break;
                                                        case -1180384755:
                                                            if (str4.equals("iris60")) {
                                                            }
                                                            break;
                                                        case -1139198265:
                                                            if (str4.equals("Slate_Pro")) {
                                                            }
                                                            break;
                                                        case -1052835013:
                                                            if (str4.equals("namath")) {
                                                            }
                                                            break;
                                                        case -993250464:
                                                            if (str4.equals("A10-70F")) {
                                                            }
                                                            break;
                                                        case -993250458:
                                                            if (str4.equals("A10-70L")) {
                                                            }
                                                            break;
                                                        case -965403638:
                                                            if (str4.equals("s905x018")) {
                                                            }
                                                            break;
                                                        case -958336948:
                                                            if (str4.equals("ELUGA_Ray_X")) {
                                                            }
                                                            break;
                                                        case -879245230:
                                                            if (str4.equals("tcl_eu")) {
                                                            }
                                                            break;
                                                        case -842500323:
                                                            if (str4.equals("nicklaus_f")) {
                                                            }
                                                            break;
                                                        case -821392978:
                                                            if (str4.equals("A7000-a")) {
                                                            }
                                                            break;
                                                        case -797483286:
                                                            if (str4.equals("SVP-DTV15")) {
                                                            }
                                                            break;
                                                        case -794946968:
                                                            if (str4.equals("watson")) {
                                                            }
                                                            break;
                                                        case -788334647:
                                                            if (str4.equals("whyred")) {
                                                            }
                                                            break;
                                                        case -782144577:
                                                            if (str4.equals("OnePlus5T")) {
                                                            }
                                                            break;
                                                        case -575125681:
                                                            if (str4.equals("GiONEE_CBL7513")) {
                                                            }
                                                            break;
                                                        case -521118391:
                                                            if (str4.equals("GIONEE_GBL7360")) {
                                                            }
                                                            break;
                                                        case -430914369:
                                                            if (str4.equals("Pixi4-7_3G")) {
                                                            }
                                                            break;
                                                        case -290434366:
                                                            if (str4.equals("taido_row")) {
                                                            }
                                                            break;
                                                        case -282781963:
                                                            if (str4.equals("BLACK-1X")) {
                                                            }
                                                            break;
                                                        case -277133239:
                                                            if (str4.equals("Z12_PRO")) {
                                                            }
                                                            break;
                                                        case -173639913:
                                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                            }
                                                            break;
                                                        case -56598463:
                                                            if (str4.equals("woods_fn")) {
                                                            }
                                                            break;
                                                        case 2126:
                                                            if (str4.equals("C1")) {
                                                            }
                                                            break;
                                                        case 2564:
                                                            if (str4.equals("Q5")) {
                                                            }
                                                            break;
                                                        case 2715:
                                                            if (str4.equals("V1")) {
                                                            }
                                                            break;
                                                        case 2719:
                                                            if (str4.equals("V5")) {
                                                            }
                                                            break;
                                                        case 3091:
                                                            if (str4.equals("b5")) {
                                                            }
                                                            break;
                                                        case 3483:
                                                            if (str4.equals("mh")) {
                                                            }
                                                            break;
                                                        case 73405:
                                                            if (str4.equals("JGZ")) {
                                                            }
                                                            break;
                                                        case 75537:
                                                            if (str4.equals("M04")) {
                                                            }
                                                            break;
                                                        case 75739:
                                                            if (str4.equals("M5c")) {
                                                            }
                                                            break;
                                                        case 76779:
                                                            if (str4.equals("MX6")) {
                                                            }
                                                            break;
                                                        case 78669:
                                                            if (str4.equals("P85")) {
                                                            }
                                                            break;
                                                        case 79305:
                                                            if (str4.equals("PLE")) {
                                                            }
                                                            break;
                                                        case 80618:
                                                            if (str4.equals("QX1")) {
                                                            }
                                                            break;
                                                        case 88274:
                                                            if (str4.equals("Z80")) {
                                                            }
                                                            break;
                                                        case 98846:
                                                            if (str4.equals("cv1")) {
                                                            }
                                                            break;
                                                        case 98848:
                                                            if (str4.equals("cv3")) {
                                                            }
                                                            break;
                                                        case 99329:
                                                            if (str4.equals("deb")) {
                                                            }
                                                            break;
                                                        case 101481:
                                                            if (str4.equals("flo")) {
                                                            }
                                                            break;
                                                        case 1513190:
                                                            if (str4.equals("1601")) {
                                                            }
                                                            break;
                                                        case 1514184:
                                                            if (str4.equals("1713")) {
                                                            }
                                                            break;
                                                        case 1514185:
                                                            if (str4.equals("1714")) {
                                                            }
                                                            break;
                                                        case 2133089:
                                                            if (str4.equals("F01H")) {
                                                            }
                                                            break;
                                                        case 2133091:
                                                            if (str4.equals("F01J")) {
                                                            }
                                                            break;
                                                        case 2133120:
                                                            if (str4.equals("F02H")) {
                                                            }
                                                            break;
                                                        case 2133151:
                                                            if (str4.equals("F03H")) {
                                                            }
                                                            break;
                                                        case 2133182:
                                                            if (str4.equals("F04H")) {
                                                            }
                                                            break;
                                                        case 2133184:
                                                            if (str4.equals("F04J")) {
                                                            }
                                                            break;
                                                        case 2436959:
                                                            if (str4.equals("P681")) {
                                                            }
                                                            break;
                                                        case 2463773:
                                                            if (str4.equals("Q350")) {
                                                            }
                                                            break;
                                                        case 2464648:
                                                            if (str4.equals("Q427")) {
                                                            }
                                                            break;
                                                        case 2689555:
                                                            if (str4.equals("XE2X")) {
                                                            }
                                                            break;
                                                        case 3154429:
                                                            if (str4.equals("fugu")) {
                                                            }
                                                            break;
                                                        case 3284551:
                                                            if (str4.equals("kate")) {
                                                            }
                                                            break;
                                                        case 3351335:
                                                            if (str4.equals("mido")) {
                                                            }
                                                            break;
                                                        case 3386211:
                                                            if (str4.equals("p212")) {
                                                            }
                                                            break;
                                                        case 41325051:
                                                            if (str4.equals("MEIZU_M5")) {
                                                            }
                                                            break;
                                                        case 51349633:
                                                            if (str4.equals("601LV")) {
                                                            }
                                                            break;
                                                        case 51350594:
                                                            if (str4.equals("602LV")) {
                                                            }
                                                            break;
                                                        case 55178625:
                                                            if (str4.equals("Aura_Note_2")) {
                                                            }
                                                            break;
                                                        case 61542055:
                                                            if (str4.equals("A1601")) {
                                                            }
                                                            break;
                                                        case 65355429:
                                                            if (str4.equals("E5643")) {
                                                            }
                                                            break;
                                                        case 66214468:
                                                            if (str4.equals("F3111")) {
                                                            }
                                                            break;
                                                        case 66214470:
                                                            if (str4.equals("F3113")) {
                                                            }
                                                            break;
                                                        case 66214473:
                                                            if (str4.equals("F3116")) {
                                                            }
                                                            break;
                                                        case 66215429:
                                                            if (str4.equals("F3211")) {
                                                            }
                                                            break;
                                                        case 66215431:
                                                            if (str4.equals("F3213")) {
                                                            }
                                                            break;
                                                        case 66215433:
                                                            if (str4.equals("F3215")) {
                                                            }
                                                            break;
                                                        case 66216390:
                                                            if (str4.equals("F3311")) {
                                                            }
                                                            break;
                                                        case 76402249:
                                                            if (str4.equals("PRO7S")) {
                                                            }
                                                            break;
                                                        case 76404105:
                                                            if (str4.equals("Q4260")) {
                                                            }
                                                            break;
                                                        case 76404911:
                                                            if (str4.equals("Q4310")) {
                                                            }
                                                            break;
                                                        case 80963634:
                                                            if (str4.equals("V23GB")) {
                                                            }
                                                            break;
                                                        case 82882791:
                                                            if (str4.equals("X3_HK")) {
                                                            }
                                                            break;
                                                        case 98715550:
                                                            if (str4.equals("i9031")) {
                                                            }
                                                            break;
                                                        case 101370885:
                                                            if (str4.equals("l5460")) {
                                                            }
                                                            break;
                                                        case 102844228:
                                                            if (str4.equals("le_x6")) {
                                                            }
                                                            break;
                                                        case 165221241:
                                                            if (str4.equals("A2016a40")) {
                                                            }
                                                            break;
                                                        case 182191441:
                                                            if (str4.equals("CPY83_I00")) {
                                                            }
                                                            break;
                                                        case 245388979:
                                                            if (str4.equals("marino_f")) {
                                                            }
                                                            break;
                                                        case 287431619:
                                                            if (str4.equals("griffin")) {
                                                            }
                                                            break;
                                                        case 307593612:
                                                            if (str4.equals("A7010a48")) {
                                                            }
                                                            break;
                                                        case 308517133:
                                                            if (str4.equals("A7020a48")) {
                                                            }
                                                            break;
                                                        case 316215098:
                                                            if (str4.equals("TB3-730F")) {
                                                            }
                                                            break;
                                                        case 316215116:
                                                            if (str4.equals("TB3-730X")) {
                                                            }
                                                            break;
                                                        case 316246811:
                                                            if (str4.equals("TB3-850F")) {
                                                            }
                                                            break;
                                                        case 316246818:
                                                            if (str4.equals("TB3-850M")) {
                                                            }
                                                            break;
                                                        case 407160593:
                                                            if (str4.equals("Pixi5-10_4G")) {
                                                            }
                                                            break;
                                                        case 507412548:
                                                            if (str4.equals("QM16XE_U")) {
                                                            }
                                                            break;
                                                        case 793982701:
                                                            if (str4.equals("GIONEE_WBL5708")) {
                                                            }
                                                            break;
                                                        case 794038622:
                                                            if (str4.equals("GIONEE_WBL7365")) {
                                                            }
                                                            break;
                                                        case 794040393:
                                                            if (str4.equals("GIONEE_WBL7519")) {
                                                            }
                                                            break;
                                                        case 835649806:
                                                            if (str4.equals("manning")) {
                                                            }
                                                            break;
                                                        case 917340916:
                                                            if (str4.equals("A7000plus")) {
                                                            }
                                                            break;
                                                        case 958008161:
                                                            if (str4.equals("j2xlteins")) {
                                                            }
                                                            break;
                                                        case 1060579533:
                                                            if (str4.equals("panell_d")) {
                                                            }
                                                            break;
                                                        case 1150207623:
                                                            if (str4.equals("LS-5017")) {
                                                            }
                                                            break;
                                                        case 1176899427:
                                                            if (str4.equals("itel_S41")) {
                                                            }
                                                            break;
                                                        case 1280332038:
                                                            if (str4.equals("hwALE-H")) {
                                                            }
                                                            break;
                                                        case 1306947716:
                                                            if (str4.equals("EverStar_S")) {
                                                            }
                                                            break;
                                                        case 1349174697:
                                                            if (str4.equals("htc_e56ml_dtul")) {
                                                            }
                                                            break;
                                                        case 1522194893:
                                                            if (str4.equals("woods_f")) {
                                                            }
                                                            break;
                                                        case 1691543273:
                                                            if (str4.equals("CPH1609")) {
                                                            }
                                                            break;
                                                        case 1691544261:
                                                            if (str4.equals("CPH1715")) {
                                                            }
                                                            break;
                                                        case 1709443163:
                                                            if (str4.equals("iball8735_9806")) {
                                                            }
                                                            break;
                                                        case 1865889110:
                                                            if (str4.equals("santoni")) {
                                                            }
                                                            break;
                                                        case 1906253259:
                                                            if (str4.equals("PB2-670M")) {
                                                            }
                                                            break;
                                                        case 1977196784:
                                                            if (str4.equals("Infinix-X572")) {
                                                            }
                                                            break;
                                                        case 2006372676:
                                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                            }
                                                            break;
                                                        case 2019281702:
                                                            if (str4.equals("DM-01K")) {
                                                            }
                                                            break;
                                                        case 2029784656:
                                                            if (str4.equals("HWBLN-H")) {
                                                            }
                                                            break;
                                                        case 2030379515:
                                                            if (str4.equals("HWCAM-H")) {
                                                            }
                                                            break;
                                                        case 2033393791:
                                                            if (str4.equals("ASUS_X00AD_2")) {
                                                            }
                                                            break;
                                                        case 2047190025:
                                                            if (str4.equals("ELUGA_Note")) {
                                                            }
                                                            break;
                                                        case 2047252157:
                                                            if (str4.equals("ELUGA_Prim")) {
                                                            }
                                                            break;
                                                        case 2048319463:
                                                            if (str4.equals("HWVNS-H")) {
                                                            }
                                                            break;
                                                        case 2048855701:
                                                            if (str4.equals("HWWAS-H")) {
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case -321033677:
                                            if (str3.equals("AFTKMST12")) {
                                            }
                                            break;
                                        case 2006354:
                                            if (str3.equals("AFTA")) {
                                            }
                                            break;
                                        case 2006367:
                                            if (str3.equals("AFTN")) {
                                            }
                                            break;
                                        case 2006371:
                                            if (str3.equals("AFTR")) {
                                            }
                                            break;
                                        case 1785421873:
                                            if (str3.equals("AFTEU011")) {
                                            }
                                            break;
                                        case 1785421876:
                                            if (str3.equals("AFTEU014")) {
                                            }
                                            break;
                                        case 1798172390:
                                            if (str3.equals("AFTSO001")) {
                                            }
                                            break;
                                        case 2119412532:
                                            if (str3.equals("AFTEUFF014")) {
                                            }
                                            break;
                                    }
                                }
                                z6 = true;
                            }
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                            }
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                            }
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                            }
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                            }
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                            }
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                            }
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                            }
                            break;
                    }
                    f4336z1 = z6;
                    f4335y1 = true;
                }
            }
        }
        return f4336z1;
    }

    public static List p0(Context context, gg2 gg2Var, w wVar, boolean z6, boolean z7) {
        String str = wVar.f9978m;
        if (str == null) {
            return cp1.f3636w;
        }
        if (j31.f5914a >= 26 && "video/dolby-vision".equals(str) && !cl2.a(context)) {
            String strA = pg2.a(wVar);
            List listA = strA == null ? cp1.f3636w : gg2Var.a(z6, z7, strA);
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return pg2.c(gg2Var, wVar, z6, z7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r3.equals("video/av01") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q0(zf2 zf2Var, w wVar) {
        int iIntValue;
        int i6 = wVar.f9984t;
        int i7 = wVar.f9985u;
        if (i6 != -1 && i7 != -1) {
            String str = wVar.f9978m;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                HashMap map = pg2.f8070a;
                Pair pairA = sl0.a(wVar);
                str = (pairA == null || !((iIntValue = ((Integer) pairA.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            int i8 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        return Math.max(2097152, ((i6 * i7) * 3) / 4);
                    }
                    break;
                case 1187890754:
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        String str2 = j31.f5917d;
                        if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(j31.f5916c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zf2Var.f11287f)))) {
                            return ((((i7 + 15) / 16) * ((i6 + 15) / 16)) * 768) / 4;
                        }
                    }
                    break;
                case 1599127256:
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        i8 = 8;
                        return ((i6 * i7) * 3) / i8;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int r0(zf2 zf2Var, w wVar) {
        int i6 = wVar.f9979n;
        List list = wVar.f9981p;
        if (i6 == -1) {
            return q0(zf2Var, wVar);
        }
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += ((byte[]) list.get(i7)).length;
        }
        return wVar.f9979n + length;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final float A(float f6, w[] wVarArr) {
        float fMax = -1.0f;
        for (w wVar : wVarArr) {
            float f7 = wVar.f9986v;
            if (f7 != -1.0f) {
                fMax = Math.max(fMax, f7);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f6;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final yf2 B(IllegalStateException illegalStateException, zf2 zf2Var) {
        Surface surface = this.f4339c1;
        al2 al2Var = new al2(illegalStateException, zf2Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return al2Var;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void D(long j6) {
        super.D(j6);
        this.f4348l1--;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void E() {
        this.f4348l1++;
        int i6 = j31.f5914a;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void F(w wVar) throws wa2 {
        c cVar = this.Z0;
        if (cVar == null) {
            return;
        }
        try {
            cVar.c(wVar);
            throw null;
        } catch (a0 e6) {
            throw q(e6, wVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void H() {
        super.H();
        this.f4348l1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final boolean K(zf2 zf2Var) {
        Surface surface = this.f4339c1;
        if (surface == null || !surface.isValid()) {
            return (j31.f5914a >= 35 && zf2Var.h) || t0(zf2Var);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final boolean L(ja2 ja2Var) {
        if (!ja2Var.a(67108864) || j() || ja2Var.a(536870912)) {
            return false;
        }
        long j6 = this.f4357v1;
        return j6 != -9223372036854775807L && j6 - (ja2Var.f6005f - this.K0.f4285c) > 100000 && !ja2Var.a(1073741824) && ja2Var.f6005f < this.D;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final int R(sj1 sj1Var, w wVar) {
        boolean z6;
        if (!bk.g(wVar.f9978m)) {
            return 128;
        }
        int i6 = 0;
        boolean z7 = wVar.f9982q != null;
        Context context = this.Q0;
        List listP0 = p0(context, sj1Var, wVar, z7, false);
        if (z7 && listP0.isEmpty()) {
            listP0 = p0(context, sj1Var, wVar, false, false);
        }
        if (listP0.isEmpty()) {
            return 129;
        }
        if (wVar.I != 0) {
            return 130;
        }
        zf2 zf2Var = (zf2) listP0.get(0);
        boolean zC = zf2Var.c(wVar);
        if (zC) {
            z6 = true;
        } else {
            for (int i7 = 1; i7 < listP0.size(); i7++) {
                zf2 zf2Var2 = (zf2) listP0.get(i7);
                if (zf2Var2.c(wVar)) {
                    zC = true;
                    z6 = false;
                    zf2Var = zf2Var2;
                    break;
                }
            }
            z6 = true;
        }
        int i8 = true != zC ? 3 : 4;
        int i9 = true != zf2Var.d(wVar) ? 8 : 16;
        int i10 = true != zf2Var.f11288g ? 0 : 64;
        int i11 = true != z6 ? 0 : 128;
        if (j31.f5914a >= 26 && "video/dolby-vision".equals(wVar.f9978m) && !cl2.a(context)) {
            i11 = 256;
        }
        if (zC) {
            List listP02 = p0(context, sj1Var, wVar, z7, true);
            if (!listP02.isEmpty()) {
                HashMap map = pg2.f8070a;
                ArrayList arrayList = new ArrayList(listP02);
                Collections.sort(arrayList, new hg2(new xj1(28, wVar)));
                zf2 zf2Var3 = (zf2) arrayList.get(0);
                if (zf2Var3.c(wVar) && zf2Var3.d(wVar)) {
                    i6 = 32;
                }
            }
        }
        return i8 | i9 | i6 | i10 | i11;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final ra2 S(zf2 zf2Var, w wVar, w wVar2) {
        int i6;
        int i7;
        ra2 ra2VarA = zf2Var.a(wVar, wVar2);
        int i8 = ra2VarA.f8600e;
        dl2 dl2Var = this.W0;
        dl2Var.getClass();
        if (wVar2.f9984t > dl2Var.f3975a || wVar2.f9985u > dl2Var.f3976b) {
            i8 |= 256;
        }
        if (r0(zf2Var, wVar2) > dl2Var.f3977c) {
            i8 |= 64;
        }
        String str = zf2Var.f11282a;
        if (i8 != 0) {
            i7 = 0;
            i6 = i8;
        } else {
            i6 = 0;
            i7 = ra2VarA.f8599d;
        }
        return new ra2(str, wVar, wVar2, i7, i6);
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final ra2 T(ro0 ro0Var) {
        ra2 ra2VarT = super.T(ro0Var);
        w wVar = (w) ro0Var.s;
        wVar.getClass();
        y yVar = this.S0;
        Handler handler = yVar.f10756a;
        if (handler != null) {
            handler.post(new v(yVar, wVar, ra2VarT, 0));
        }
        return ra2VarT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
    
        r1 = null;
     */
    @Override // com.google.android.gms.internal.ads.fg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vf2 W(zf2 zf2Var, w wVar, float f6) {
        int iMax;
        int iMax2;
        mb2 mb2Var;
        Point point;
        int i6;
        int i7;
        int i8;
        int i9;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        char c7;
        int i11;
        int iQ0;
        w[] wVarArr = this.B;
        wVarArr.getClass();
        int length = wVarArr.length;
        int iR0 = r0(zf2Var, wVar);
        float f7 = wVar.f9986v;
        mb2 mb2Var2 = wVar.A;
        int i12 = wVar.f9984t;
        int i13 = wVar.f9985u;
        if (length == 1) {
            if (iR0 != -1 && (iQ0 = q0(zf2Var, wVar)) != -1) {
                iR0 = Math.min((int) (iR0 * 1.5f), iQ0);
            }
            mb2Var = mb2Var2;
            iMax = i12;
            iMax2 = i13;
        } else {
            iMax = i12;
            iMax2 = i13;
            int i14 = 0;
            boolean z6 = false;
            while (i14 < length) {
                w wVar2 = wVarArr[i14];
                w[] wVarArr2 = wVarArr;
                if (mb2Var2 != null && wVar2.A == null) {
                    tk2 tk2Var = new tk2(wVar2);
                    tk2Var.f9343z = mb2Var2;
                    wVar2 = new w(tk2Var);
                }
                ra2 ra2VarA = zf2Var.a(wVar, wVar2);
                int i15 = length;
                int i16 = wVar2.f9985u;
                if (ra2VarA.f8599d != 0) {
                    int i17 = wVar2.f9984t;
                    i10 = i14;
                    c7 = 65535;
                    z6 |= i17 == -1 || i16 == -1;
                    iMax = Math.max(iMax, i17);
                    iMax2 = Math.max(iMax2, i16);
                    iR0 = Math.max(iR0, r0(zf2Var, wVar2));
                } else {
                    i10 = i14;
                    c7 = 65535;
                }
                length = i15;
                i14 = i10 + 1;
                wVarArr = wVarArr2;
            }
            if (z6) {
                qs0.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z7 = i13 > i12;
                int i18 = z7 ? i13 : i12;
                int i19 = true == z7 ? i12 : i13;
                mb2Var = mb2Var2;
                int i20 = 0;
                while (true) {
                    Point pointF = null;
                    if (i20 >= 9) {
                        break;
                    }
                    float f8 = i19;
                    int i21 = i20;
                    float f9 = i18;
                    int i22 = f4334x1[i21];
                    float f10 = i22;
                    if (i22 <= i18 || (i6 = (int) (f10 * (f8 / f9))) <= i19) {
                        break;
                    }
                    if (true != z7) {
                        i7 = i6;
                        i6 = i22;
                    } else {
                        i7 = i6;
                    }
                    int i23 = true == z7 ? i22 : i7;
                    boolean z8 = z7;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = zf2Var.f11285d;
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                        pointF = zf2.f(videoCapabilities, i6, i23);
                    }
                    point = pointF;
                    if (point != null) {
                        i8 = i18;
                        i9 = i19;
                        if (zf2Var.e(point.x, point.y, f7)) {
                            break;
                        }
                    } else {
                        i8 = i18;
                        i9 = i19;
                    }
                    i20 = i21 + 1;
                    z7 = z8;
                    i18 = i8;
                    i19 = i9;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    tk2 tk2Var2 = new tk2(wVar);
                    tk2Var2.s = iMax;
                    tk2Var2.f9337t = iMax2;
                    iR0 = Math.max(iR0, q0(zf2Var, new w(tk2Var2)));
                    qs0.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                mb2Var = mb2Var2;
            }
        }
        String str = zf2Var.f11284c;
        this.W0 = new dl2(iMax, iMax2, iR0);
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i13);
        tt0.b(mediaFormat, wVar.f9981p);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f7);
        }
        tt0.a(mediaFormat, "rotation-degrees", wVar.f9987w);
        if (mb2Var != null) {
            mb2 mb2Var3 = mb2Var;
            tt0.a(mediaFormat, "color-transfer", mb2Var3.f7077c);
            tt0.a(mediaFormat, "color-standard", mb2Var3.f7075a);
            tt0.a(mediaFormat, "color-range", mb2Var3.f7076b);
            byte[] bArr = mb2Var3.f7078d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(wVar.f9978m)) {
            HashMap map = pg2.f8070a;
            Pair pairA = sl0.a(wVar);
            if (pairA != null) {
                tt0.a(mediaFormat, "profile", ((Integer) pairA.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", iMax);
        mediaFormat.setInteger("max-height", iMax2);
        tt0.a(mediaFormat, "max-input-size", iR0);
        int i24 = j31.f5914a;
        if (i24 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f6 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f6);
            }
        }
        if (this.T0) {
            mediaFormat.setInteger("no-post-process", 1);
            i11 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i11 = 0;
        }
        if (i24 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i11, -this.f4354r1));
        }
        Surface surfaceO0 = o0(zf2Var);
        if (this.Z0 != null && !j31.d(this.Q0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new vf2(zf2Var, mediaFormat, wVar, surfaceO0, null);
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final ArrayList X(sj1 sj1Var, w wVar) {
        List listP0 = p0(this.Q0, sj1Var, wVar, false, false);
        HashMap map = pg2.f8070a;
        ArrayList arrayList = new ArrayList(listP0);
        Collections.sort(arrayList, new hg2(new xj1(28, wVar)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    @TargetApi(29)
    public final void a0(ja2 ja2Var) {
        if (this.Y0) {
            ByteBuffer byteBuffer = ja2Var.f6006g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s == 60 && s3 == 1 && b8 == 4) {
                    if (b9 == 0 || b9 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        wf2 wf2Var = this.Y;
                        wf2Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        wf2Var.k(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2, com.google.android.gms.internal.ads.lc2
    public final void b(int i6, Object obj) {
        Handler handler;
        j jVar = this.U0;
        if (i6 == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.f4339c1;
            y yVar = this.S0;
            if (surface2 == surface) {
                if (surface != null) {
                    n90 n90Var = this.f4353q1;
                    if (n90Var != null) {
                        yVar.a(n90Var);
                    }
                    Surface surface3 = this.f4339c1;
                    if (surface3 == null || !this.f4342f1 || (handler = yVar.f10756a) == null) {
                        return;
                    }
                    handler.post(new s(yVar, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            this.f4339c1 = surface;
            if (this.Z0 == null) {
                n nVar = jVar.f5882b;
                if (nVar.f7262e != surface) {
                    nVar.b();
                    nVar.f7262e = surface;
                    nVar.d(true);
                }
                jVar.f(1);
            }
            this.f4342f1 = false;
            int i7 = this.f8014z;
            wf2 wf2Var = this.Y;
            if (wf2Var != null && this.Z0 == null) {
                zf2 zf2Var = this.f4663f0;
                zf2Var.getClass();
                Surface surface4 = this.f4339c1;
                boolean z6 = (surface4 != null && surface4.isValid()) || (j31.f5914a >= 35 && zf2Var.h) || t0(zf2Var);
                int i8 = j31.f5914a;
                if (i8 < 23 || !z6 || this.X0) {
                    G();
                    C();
                } else {
                    Surface surfaceO0 = o0(zf2Var);
                    if (i8 >= 23 && surfaceO0 != null) {
                        wf2Var.d(surfaceO0);
                    } else {
                        if (i8 < 35) {
                            throw new IllegalStateException();
                        }
                        wf2Var.zzi();
                    }
                }
            }
            if (surface == null) {
                this.f4353q1 = null;
                c cVar = this.Z0;
                if (cVar != null) {
                    g gVar = cVar.f3347m;
                    sx0.f9043c.getClass();
                    gVar.f4844l = null;
                    return;
                }
                return;
            }
            n90 n90Var2 = this.f4353q1;
            if (n90Var2 != null) {
                yVar.a(n90Var2);
            }
            if (i7 == 2) {
                c cVar2 = this.Z0;
                if (cVar2 != null) {
                    cVar2.d(true);
                    return;
                } else {
                    jVar.f5888i = true;
                    jVar.h = -9223372036854775807L;
                    return;
                }
            }
            return;
        }
        if (i6 == 7) {
            obj.getClass();
            h hVar = (h) obj;
            this.f4356t1 = hVar;
            c cVar3 = this.Z0;
            if (cVar3 != null) {
                cVar3.f3347m.f4842j = hVar;
                return;
            }
            return;
        }
        if (i6 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f4355s1 != iIntValue) {
                this.f4355s1 = iIntValue;
                return;
            }
            return;
        }
        if (i6 == 16) {
            obj.getClass();
            this.f4354r1 = ((Integer) obj).intValue();
            wf2 wf2Var2 = this.Y;
            if (wf2Var2 == null || j31.f5914a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f4354r1));
            wf2Var2.k(bundle);
            return;
        }
        if (i6 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f4343g1 = iIntValue2;
            wf2 wf2Var3 = this.Y;
            if (wf2Var3 != null) {
                wf2Var3.h(iIntValue2);
                return;
            }
            return;
        }
        if (i6 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f4344h1 = iIntValue3;
            c cVar4 = this.Z0;
            if (cVar4 != null) {
                cVar4.e(iIntValue3);
                return;
            }
            n nVar2 = jVar.f5882b;
            if (nVar2.f7266j == iIntValue3) {
                return;
            }
            nVar2.f7266j = iIntValue3;
            nVar2.d(true);
            return;
        }
        if (i6 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f4338b1 = list;
            c cVar5 = this.Z0;
            if (cVar5 != null) {
                cVar5.i(list);
                return;
            }
            return;
        }
        if (i6 != 14) {
            if (i6 == 11) {
                this.V = (pc2) obj;
                return;
            }
            return;
        }
        obj.getClass();
        sx0 sx0Var = (sx0) obj;
        if (sx0Var.f9044a == 0 || sx0Var.f9045b == 0) {
            return;
        }
        this.f4341e1 = sx0Var;
        c cVar6 = this.Z0;
        if (cVar6 != null) {
            Surface surface5 = this.f4339c1;
            y5.k(surface5);
            cVar6.f(surface5, sx0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void b0(Exception exc) {
        qs0.d("MediaCodecVideoRenderer", "Video codec error", exc);
        y yVar = this.S0;
        Handler handler = yVar.f10756a;
        if (handler != null) {
            handler.post(new u(yVar, exc, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void c() {
        c cVar = this.Z0;
        if (cVar == null || !this.R0) {
            return;
        }
        g gVar = cVar.f3347m;
        if (gVar.f4846n == 2) {
            return;
        }
        xo0 xo0Var = gVar.f4843k;
        if (xo0Var != null) {
            xo0Var.zze();
        }
        gVar.f4844l = null;
        gVar.f4846n = 2;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void c0(String str, long j6, long j7) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        y yVar = this.S0;
        Handler handler = yVar.f10756a;
        if (handler != null) {
            str2 = str;
            handler.post(new p(yVar, str2, j6, j7));
        } else {
            str2 = str;
        }
        this.X0 = n0(str2);
        zf2 zf2Var = this.f4663f0;
        zf2Var.getClass();
        boolean z6 = false;
        if (j31.f5914a >= 29 && "video/x-vnd.on2.vp9".equals(zf2Var.f11283b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = zf2Var.f11285d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i6].profile == 16384) {
                    z6 = true;
                    break;
                }
                i6++;
            }
        }
        this.Y0 = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.pa2
    public final void d() {
        try {
            try {
                U();
                G();
            } finally {
                this.O0 = null;
            }
        } finally {
            this.f4337a1 = false;
            this.u1 = -9223372036854775807L;
            gl2 gl2Var = this.f4340d1;
            if (gl2Var != null) {
                gl2Var.release();
                this.f4340d1 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void d0(String str) {
        y yVar = this.S0;
        Handler handler = yVar.f10756a;
        if (handler != null) {
            handler.post(new x(yVar, str));
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void e() {
        this.f4346j1 = 0;
        el0 el0Var = this.f8013y;
        el0Var.getClass();
        this.f4345i1 = el0Var.zzb();
        this.f4349m1 = 0L;
        this.f4350n1 = 0;
        c cVar = this.Z0;
        if (cVar != null) {
            ((j) cVar.f3347m.f4840g.f11094t).b();
        } else {
            this.U0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void e0(w wVar, MediaFormat mediaFormat) {
        wf2 wf2Var = this.Y;
        if (wf2Var != null) {
            wf2Var.h(this.f4343g1);
        }
        mediaFormat.getClass();
        boolean z6 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float integer3 = wVar.f9988x;
        if (j31.f5914a >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            integer3 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i6 = wVar.f9987w;
        if (i6 == 90 || i6 == 270) {
            integer3 = 1.0f / integer3;
            int i7 = integer2;
            integer2 = integer;
            integer = i7;
        }
        this.f4352p1 = new n90(integer3, integer, integer2);
        c cVar = this.Z0;
        if (cVar == null || !this.f4358w1) {
            float f6 = wVar.f9986v;
            n nVar = this.U0.f5882b;
            nVar.f7263f = f6;
            zk2 zk2Var = nVar.f7258a;
            zk2Var.f11330a.b();
            zk2Var.f11331b.b();
            zk2Var.f11332c = false;
            zk2Var.f11333d = -9223372036854775807L;
            zk2Var.f11334e = 0;
            nVar.c();
        } else {
            tk2 tk2Var = new tk2(wVar);
            tk2Var.s = integer;
            tk2Var.f9337t = integer2;
            tk2Var.f9340w = integer3;
            w wVar2 = new w(tk2Var);
            y5.r(false);
            cVar.f3338c = wVar2;
            if (cVar.h) {
                y5.r(cVar.f3342g != -9223372036854775807L);
                cVar.f3343i = true;
                cVar.f3344j = cVar.f3342g;
            } else {
                cVar.a();
                cVar.h = true;
                cVar.f3343i = false;
                cVar.f3344j = -9223372036854775807L;
            }
        }
        this.f4358w1 = false;
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void f() {
        int i6 = this.f4346j1;
        final y yVar = this.S0;
        if (i6 > 0) {
            el0 el0Var = this.f8013y;
            el0Var.getClass();
            long jZzb = el0Var.zzb();
            final long j6 = jZzb - this.f4345i1;
            final int i7 = this.f4346j1;
            Handler handler = yVar.f10756a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        y yVar2 = yVar;
                        yVar2.getClass();
                        int i8 = j31.f5914a;
                        bd2 bd2Var = yVar2.f10757b.s.I;
                        xc2 xc2VarR = bd2Var.r(bd2Var.f3044d.f2669e);
                        bd2Var.q(xc2VarR, 1018, new wg0(xc2VarR, i7, j6));
                    }
                });
            }
            this.f4346j1 = 0;
            this.f4345i1 = jZzb;
        }
        int i8 = this.f4350n1;
        if (i8 != 0) {
            long j7 = this.f4349m1;
            Handler handler2 = yVar.f10756a;
            if (handler2 != null) {
                handler2.post(new t(i8, j7, yVar));
            }
            this.f4349m1 = 0L;
            this.f4350n1 = 0;
        }
        c cVar = this.Z0;
        if (cVar != null) {
            ((j) cVar.f3347m.f4840g.f11094t).c();
        } else {
            this.U0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void f0() {
        c cVar = this.Z0;
        if (cVar != null) {
            eg2 eg2Var = this.K0;
            cVar.h(eg2Var.f4284b, eg2Var.f4285c, -this.u1, this.D);
        } else {
            this.U0.f(2);
        }
        this.f4358w1 = true;
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final void g(w[] wVarArr, long j6, long j7, oh2 oh2Var) {
        super.g(wVarArr, j6, j7, oh2Var);
        if (this.u1 == -9223372036854775807L) {
            this.u1 = j6;
        }
        zy zyVar = this.H;
        if (zyVar.o()) {
            this.f4357v1 = -9223372036854775807L;
        } else {
            this.f4357v1 = zyVar.n(oh2Var.f7769a, new jx()).f6183d;
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final boolean h0(long j6, long j7, wf2 wf2Var, ByteBuffer byteBuffer, int i6, int i7, int i8, long j8, boolean z6, boolean z7, w wVar) throws wa2 {
        wf2Var.getClass();
        eg2 eg2Var = this.K0;
        long j9 = j8 - eg2Var.f4285c;
        c cVar = this.Z0;
        if (cVar != null) {
            try {
                return cVar.l(j8 + (-this.u1), z7, j6, j7, new bl2(this, wf2Var, i6, j9));
            } catch (a0 e6) {
                throw q(e6, e6.s, false, 7001);
            }
        }
        int iA = this.U0.a(j8, j6, j7, eg2Var.f4284b, z7, this.V0);
        if (iA != 4) {
            if (z6 && !z7) {
                k0(wf2Var, i6);
                return true;
            }
            Surface surface = this.f4339c1;
            i iVar = this.V0;
            if (surface == null) {
                if (iVar.f5521a < 30000) {
                    k0(wf2Var, i6);
                    m0(iVar.f5521a);
                    return true;
                }
            } else {
                if (iA == 0) {
                    el0 el0Var = this.f8013y;
                    el0Var.getClass();
                    s0(wf2Var, i6, el0Var.zzc());
                    m0(iVar.f5521a);
                    return true;
                }
                if (iA == 1) {
                    long j10 = iVar.f5522b;
                    long j11 = iVar.f5521a;
                    if (j10 == this.f4351o1) {
                        k0(wf2Var, i6);
                    } else {
                        s0(wf2Var, i6, j10);
                    }
                    m0(j11);
                    this.f4351o1 = j10;
                    return true;
                }
                if (iA == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    wf2Var.j(i6);
                    Trace.endSection();
                    l0(0, 1);
                    m0(iVar.f5521a);
                    return true;
                }
                if (iA == 3) {
                    k0(wf2Var, i6);
                    m0(iVar.f5521a);
                    return true;
                }
                if (iA != 5) {
                    throw new IllegalStateException(String.valueOf(iA));
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final void i(float f6, float f7) {
        super.i(f6, f7);
        c cVar = this.Z0;
        if (cVar != null) {
            cVar.g(f6);
        } else {
            this.U0.d(f6);
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void j0() {
        int i6 = j31.f5914a;
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    public final void k0(wf2 wf2Var, int i6) {
        Trace.beginSection("skipVideoBuffer");
        wf2Var.j(i6);
        Trace.endSection();
        this.J0.f8292f++;
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final void l(long j6, long j7) throws wa2 {
        super.l(j6, j7);
        c cVar = this.Z0;
        if (cVar != null) {
            try {
                g.a(cVar.f3347m, j6, j7);
            } catch (a0 e6) {
                throw q(e6, e6.s, false, 7001);
            }
        }
    }

    public final void l0(int i6, int i7) {
        qa2 qa2Var = this.J0;
        qa2Var.h += i6;
        int i8 = i6 + i7;
        qa2Var.f8293g += i8;
        this.f4346j1 += i8;
        int i9 = this.f4347k1 + i8;
        this.f4347k1 = i9;
        qa2Var.f8294i = Math.max(i9, qa2Var.f8294i);
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final boolean m() {
        return this.H0 && this.Z0 == null;
    }

    public final void m0(long j6) {
        qa2 qa2Var = this.J0;
        qa2Var.f8296k += j6;
        qa2Var.f8297l++;
        this.f4349m1 += j6;
        this.f4350n1++;
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final boolean n() {
        boolean zN = super.n();
        c cVar = this.Z0;
        if (cVar != null) {
            return ((j) cVar.f3347m.f4840g.f11094t).e(false);
        }
        if (zN && (this.Y == null || this.f4339c1 == null)) {
            return true;
        }
        return this.U0.e(zN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface o0(zf2 zf2Var) {
        boolean z6;
        fl2 fl2Var;
        boolean z7 = false;
        if (this.Z0 != null) {
            y5.r(false);
            y5.k(null);
            throw null;
        }
        Surface surface = this.f4339c1;
        if (surface != null) {
            return surface;
        }
        if (j31.f5914a >= 35 && zf2Var.h) {
            return null;
        }
        y5.r(t0(zf2Var));
        gl2 gl2Var = this.f4340d1;
        if (gl2Var != null) {
            if (gl2Var.s != zf2Var.f11287f && gl2Var != null) {
                gl2Var.release();
                this.f4340d1 = null;
            }
        }
        if (this.f4340d1 == null) {
            Context context = this.Q0;
            boolean z8 = zf2Var.f11287f;
            if (z8) {
                if (!gl2.l(context)) {
                    z6 = false;
                }
                y5.r(z6);
                fl2Var = new fl2("ExoPlayer:PlaceholderSurface");
                int i6 = !z8 ? gl2.f5089v : 0;
                fl2Var.start();
                Handler handler = new Handler(fl2Var.getLooper(), fl2Var);
                fl2Var.f4720t = handler;
                fl2Var.s = new fn0(handler);
                synchronized (fl2Var) {
                    fl2Var.f4720t.obtainMessage(1, i6, 0).sendToTarget();
                    while (fl2Var.f4723w == null && fl2Var.f4722v == null && fl2Var.f4721u == null) {
                        try {
                            fl2Var.wait();
                        } catch (InterruptedException unused) {
                            z7 = true;
                        }
                    }
                }
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = fl2Var.f4722v;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = fl2Var.f4721u;
                if (error != null) {
                    throw error;
                }
                gl2 gl2Var2 = fl2Var.f4723w;
                gl2Var2.getClass();
                this.f4340d1 = gl2Var2;
            } else {
                int i7 = gl2.f5089v;
            }
            z6 = true;
            y5.r(z6);
            fl2Var = new fl2("ExoPlayer:PlaceholderSurface");
            if (!z8) {
            }
            fl2Var.start();
            Handler handler2 = new Handler(fl2Var.getLooper(), fl2Var);
            fl2Var.f4720t = handler2;
            fl2Var.s = new fn0(handler2);
            synchronized (fl2Var) {
            }
        }
        return this.f4340d1;
    }

    public final void s0(wf2 wf2Var, int i6, long j6) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        wf2Var.f(i6, j6);
        Trace.endSection();
        this.J0.f8291e++;
        this.f4347k1 = 0;
        if (this.Z0 == null) {
            n90 n90Var = this.f4352p1;
            boolean zEquals = n90Var.equals(n90.f7346d);
            y yVar = this.S0;
            if (!zEquals && !n90Var.equals(this.f4353q1)) {
                this.f4353q1 = n90Var;
                yVar.a(n90Var);
            }
            j jVar = this.U0;
            int i7 = jVar.f5884d;
            jVar.f5884d = 3;
            jVar.f5886f = j31.s(jVar.f5890k.zzb());
            if (i7 == 3 || (surface = this.f4339c1) == null) {
                return;
            }
            Handler handler = yVar.f10756a;
            if (handler != null) {
                handler.post(new s(yVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f4342f1 = true;
        }
    }

    public final boolean t0(zf2 zf2Var) {
        if (j31.f5914a < 23 || n0(zf2Var.f11282a)) {
            return false;
        }
        return !zf2Var.f11287f || gl2.l(this.Q0);
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void w() {
        c cVar = this.Z0;
        if (cVar != null) {
            j jVar = (j) cVar.f3347m.f4840g.f11094t;
            if (jVar.f5884d == 0) {
                jVar.f5884d = 1;
                return;
            }
            return;
        }
        j jVar2 = this.U0;
        if (jVar2.f5884d == 0) {
            jVar2.f5884d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final void x() {
        y yVar = this.S0;
        this.f4353q1 = null;
        this.f4357v1 = -9223372036854775807L;
        c cVar = this.Z0;
        if (cVar != null) {
            ((j) cVar.f3347m.f4840g.f11094t).f(0);
        } else {
            this.U0.f(0);
        }
        this.f4342f1 = false;
        try {
            super.x();
            qa2 qa2Var = this.J0;
            yVar.getClass();
            synchronized (qa2Var) {
            }
            Handler handler = yVar.f10756a;
            if (handler != null) {
                handler.post(new q(1, yVar, qa2Var));
            }
            yVar.a(n90.f7346d);
        } catch (Throwable th) {
            qa2 qa2Var2 = this.J0;
            yVar.getClass();
            synchronized (qa2Var2) {
                Handler handler2 = yVar.f10756a;
                if (handler2 != null) {
                    handler2.post(new q(1, yVar, qa2Var2));
                }
                yVar.a(n90.f7346d);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void y(boolean z6, boolean z7) {
        this.J0 = new qa2();
        u();
        qa2 qa2Var = this.J0;
        y yVar = this.S0;
        Handler handler = yVar.f10756a;
        if (handler != null) {
            handler.post(new b(yVar, qa2Var));
        }
        boolean z8 = this.f4337a1;
        j jVar = this.U0;
        if (!z8) {
            if (this.f4338b1 != null && this.Z0 == null) {
                il2 il2Var = new il2(this.Q0, jVar);
                el0 el0Var = this.f8013y;
                el0Var.getClass();
                il2Var.f5814f = el0Var;
                y5.r(!il2Var.f5815g);
                if (il2Var.f5812d == null) {
                    if (il2Var.f5811c == null) {
                        il2Var.f5811c = new e();
                    }
                    il2Var.f5812d = new f(il2Var.f5811c);
                }
                g gVar = new g(il2Var);
                il2Var.f5815g = true;
                this.Z0 = gVar.f4835b;
            }
            this.f4337a1 = true;
        }
        c cVar = this.Z0;
        if (cVar == null) {
            el0 el0Var2 = this.f8013y;
            el0Var2.getClass();
            jVar.f5890k = el0Var2;
            jVar.f5884d = z7 ? 1 : 0;
            return;
        }
        cVar.f3345k = new v31(22, this);
        cVar.f3346l = ur1.s;
        h hVar = this.f4356t1;
        if (hVar != null) {
            cVar.f3347m.f4842j = hVar;
        }
        if (this.f4339c1 != null && !this.f4341e1.equals(sx0.f9043c)) {
            this.Z0.f(this.f4339c1, this.f4341e1);
        }
        this.Z0.e(this.f4344h1);
        this.Z0.g(this.W);
        List list = this.f4338b1;
        if (list != null) {
            this.Z0.i(list);
        }
        ((j) this.Z0.f3347m.f4840g.f11094t).f5884d = z7 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final void z(boolean z6, long j6) {
        c cVar = this.Z0;
        if (cVar != null) {
            cVar.b(true);
            c cVar2 = this.Z0;
            eg2 eg2Var = this.K0;
            cVar2.h(eg2Var.f4284b, eg2Var.f4285c, -this.u1, this.D);
            this.f4358w1 = true;
        }
        super.z(z6, j6);
        c cVar3 = this.Z0;
        j jVar = this.U0;
        if (cVar3 == null) {
            n nVar = jVar.f5882b;
            nVar.f7269m = 0L;
            nVar.f7272p = -1L;
            nVar.f7270n = -1L;
            jVar.f5887g = -9223372036854775807L;
            jVar.f5885e = -9223372036854775807L;
            jVar.f(1);
            jVar.h = -9223372036854775807L;
        }
        if (z6) {
            c cVar4 = this.Z0;
            if (cVar4 != null) {
                cVar4.d(false);
            } else {
                jVar.f5888i = false;
                jVar.h = -9223372036854775807L;
            }
        }
        this.f4347k1 = 0;
    }
}
