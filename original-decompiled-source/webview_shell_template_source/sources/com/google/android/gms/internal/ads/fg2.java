package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class fg2 extends pa2 {
    public static final byte[] P0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public long E0;
    public long F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public final of2 J;
    public qa2 J0;
    public final sj1 K;
    public eg2 K0;
    public final float L;
    public long L0;
    public final ja2 M;
    public boolean M0;
    public final ja2 N;
    public l2 N0;
    public final ja2 O;
    public l2 O0;
    public final nf2 P;
    public final MediaCodec.BufferInfo Q;
    public final ArrayDeque R;
    public final b5 S;
    public w T;
    public w U;
    public pc2 V;
    public float W;
    public float X;
    public wf2 Y;
    public w Z;

    /* renamed from: a0, reason: collision with root package name */
    public MediaFormat f4658a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4659b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f4660c0;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayDeque f4661d0;

    /* renamed from: e0, reason: collision with root package name */
    public dg2 f4662e0;

    /* renamed from: f0, reason: collision with root package name */
    public zf2 f4663f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f4664g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4665h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4666i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f4667j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f4668k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f4669l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f4670m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f4671n0;

    /* renamed from: o0, reason: collision with root package name */
    public long f4672o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f4673q0;

    /* renamed from: r0, reason: collision with root package name */
    public ByteBuffer f4674r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f4675s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f4676t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f4677u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4678v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f4679w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f4680x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f4681y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f4682z0;

    public fg2(int i6, of2 of2Var, float f6) {
        super(i6);
        this.J = of2Var;
        this.K = gg2.f5044k;
        this.L = f6;
        this.M = new ja2(0);
        this.N = new ja2(0);
        this.O = new ja2(2);
        nf2 nf2Var = new nf2(2);
        nf2Var.f7438k = 32;
        this.P = nf2Var;
        this.Q = new MediaCodec.BufferInfo();
        this.W = 1.0f;
        this.X = 1.0f;
        this.R = new ArrayDeque();
        this.K0 = eg2.f4282e;
        nf2Var.d(0);
        nf2Var.f6003d.order(ByteOrder.nativeOrder());
        b5 b5Var = new b5();
        b5Var.f2919c = jc0.f6021a;
        b5Var.f2918b = 0;
        b5Var.f2917a = 2;
        this.S = b5Var;
        this.f4660c0 = -1.0f;
        this.f4664g0 = 0;
        this.f4681y0 = 0;
        this.p0 = -1;
        this.f4673q0 = -1;
        this.f4672o0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.f4671n0 = -9223372036854775807L;
        this.f4682z0 = 0;
        this.A0 = 0;
        this.J0 = new qa2();
    }

    public abstract float A(float f6, w[] wVarArr);

    public yf2 B(IllegalStateException illegalStateException, zf2 zf2Var) {
        return new yf2(illegalStateException, zf2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x045c A[Catch: Exception -> 0x0179, TryCatch #1 {Exception -> 0x0179, blocks: (B:79:0x016e, B:82:0x017c, B:84:0x0180, B:85:0x018a, B:88:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01ac, B:108:0x020b, B:95:0x01b4, B:97:0x01bc, B:98:0x01c2, B:100:0x01ca, B:101:0x01d0, B:103:0x01d8, B:104:0x01de, B:106:0x01e6, B:107:0x01ec, B:109:0x020e, B:111:0x0222, B:113:0x0227, B:115:0x022b, B:116:0x023f, B:118:0x0243, B:120:0x0248, B:125:0x0252, B:127:0x0258, B:128:0x0266, B:130:0x026c, B:131:0x0276, B:133:0x027b, B:134:0x0285, B:136:0x028a, B:137:0x0294, B:139:0x0298, B:140:0x02a2, B:143:0x02ac, B:144:0x02c7, B:146:0x02cb, B:148:0x02db, B:149:0x02e0, B:151:0x02e4, B:152:0x02e9, B:153:0x02f3, B:155:0x02f7, B:157:0x0307, B:159:0x0313, B:161:0x0317, B:162:0x031c, B:164:0x0320, B:165:0x0325, B:167:0x0329, B:168:0x032e, B:170:0x0332, B:171:0x0337, B:173:0x033b, B:174:0x0340, B:176:0x0344, B:177:0x0349, B:179:0x034d, B:180:0x0352, B:182:0x0356, B:183:0x035b, B:185:0x035f, B:186:0x0364, B:188:0x0368, B:189:0x036d, B:191:0x0371, B:192:0x0376, B:194:0x037a, B:195:0x037f, B:197:0x0383, B:198:0x0388, B:200:0x038c, B:201:0x0391, B:203:0x0395, B:204:0x039a, B:206:0x03a8, B:208:0x03ae, B:209:0x03b8, B:211:0x03e2, B:213:0x03ef, B:215:0x03f7, B:217:0x0401, B:219:0x0409, B:221:0x0411, B:241:0x0456, B:243:0x045c, B:247:0x0468, B:249:0x046e, B:253:0x047a, B:255:0x0480, B:259:0x048c, B:261:0x0492, B:286:0x04ea, B:288:0x04f0, B:290:0x04f4, B:291:0x0502, B:293:0x0518, B:266:0x04a0, B:268:0x04a8, B:270:0x04b0, B:272:0x04b8, B:274:0x04c0, B:276:0x04c8, B:278:0x04d0, B:280:0x04da, B:282:0x04e4, B:226:0x041f, B:228:0x0427, B:232:0x0432, B:234:0x043c, B:236:0x0444, B:238:0x044c, B:295:0x051a, B:296:0x051f, B:300:0x0529, B:70:0x010a), top: B:324:0x016e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04f0 A[Catch: Exception -> 0x0179, TryCatch #1 {Exception -> 0x0179, blocks: (B:79:0x016e, B:82:0x017c, B:84:0x0180, B:85:0x018a, B:88:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01ac, B:108:0x020b, B:95:0x01b4, B:97:0x01bc, B:98:0x01c2, B:100:0x01ca, B:101:0x01d0, B:103:0x01d8, B:104:0x01de, B:106:0x01e6, B:107:0x01ec, B:109:0x020e, B:111:0x0222, B:113:0x0227, B:115:0x022b, B:116:0x023f, B:118:0x0243, B:120:0x0248, B:125:0x0252, B:127:0x0258, B:128:0x0266, B:130:0x026c, B:131:0x0276, B:133:0x027b, B:134:0x0285, B:136:0x028a, B:137:0x0294, B:139:0x0298, B:140:0x02a2, B:143:0x02ac, B:144:0x02c7, B:146:0x02cb, B:148:0x02db, B:149:0x02e0, B:151:0x02e4, B:152:0x02e9, B:153:0x02f3, B:155:0x02f7, B:157:0x0307, B:159:0x0313, B:161:0x0317, B:162:0x031c, B:164:0x0320, B:165:0x0325, B:167:0x0329, B:168:0x032e, B:170:0x0332, B:171:0x0337, B:173:0x033b, B:174:0x0340, B:176:0x0344, B:177:0x0349, B:179:0x034d, B:180:0x0352, B:182:0x0356, B:183:0x035b, B:185:0x035f, B:186:0x0364, B:188:0x0368, B:189:0x036d, B:191:0x0371, B:192:0x0376, B:194:0x037a, B:195:0x037f, B:197:0x0383, B:198:0x0388, B:200:0x038c, B:201:0x0391, B:203:0x0395, B:204:0x039a, B:206:0x03a8, B:208:0x03ae, B:209:0x03b8, B:211:0x03e2, B:213:0x03ef, B:215:0x03f7, B:217:0x0401, B:219:0x0409, B:221:0x0411, B:241:0x0456, B:243:0x045c, B:247:0x0468, B:249:0x046e, B:253:0x047a, B:255:0x0480, B:259:0x048c, B:261:0x0492, B:286:0x04ea, B:288:0x04f0, B:290:0x04f4, B:291:0x0502, B:293:0x0518, B:266:0x04a0, B:268:0x04a8, B:270:0x04b0, B:272:0x04b8, B:274:0x04c0, B:276:0x04c8, B:278:0x04d0, B:280:0x04da, B:282:0x04e4, B:226:0x041f, B:228:0x0427, B:232:0x0432, B:234:0x043c, B:236:0x0444, B:238:0x044c, B:295:0x051a, B:296:0x051f, B:300:0x0529, B:70:0x010a), top: B:324:0x016e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0544 A[Catch: dg2 -> 0x007a, TryCatch #5 {dg2 -> 0x007a, blocks: (B:27:0x004f, B:29:0x0054, B:31:0x0058, B:33:0x006e, B:38:0x007f, B:42:0x008b, B:44:0x0093, B:46:0x0097, B:48:0x009b, B:50:0x00a4, B:301:0x052a, B:303:0x0544, B:305:0x0564, B:308:0x056b, B:309:0x056d, B:304:0x0547, B:311:0x0570, B:312:0x0571, B:314:0x0576, B:315:0x0577, B:316:0x0580, B:40:0x0082, B:41:0x008a, B:318:0x0582), top: B:331:0x004f, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0547 A[Catch: dg2 -> 0x007a, TryCatch #5 {dg2 -> 0x007a, blocks: (B:27:0x004f, B:29:0x0054, B:31:0x0058, B:33:0x006e, B:38:0x007f, B:42:0x008b, B:44:0x0093, B:46:0x0097, B:48:0x009b, B:50:0x00a4, B:301:0x052a, B:303:0x0544, B:305:0x0564, B:308:0x056b, B:309:0x056d, B:304:0x0547, B:311:0x0570, B:312:0x0571, B:314:0x0576, B:315:0x0577, B:316:0x0580, B:40:0x0082, B:41:0x008a, B:318:0x0582), top: B:331:0x004f, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x056b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        w wVar;
        int i6;
        ?? r19;
        dg2 dg2Var;
        w wVar2;
        float fA;
        long j6;
        int i7;
        String str;
        int i8;
        int i9;
        if (this.Y != null || this.f4677u0 || (wVar = this.T) == null) {
            return;
        }
        int i10 = 1;
        if (this.O0 == null && i0(wVar)) {
            U();
            String str2 = wVar.f9978m;
            boolean zEquals = "audio/mp4a-latm".equals(str2);
            nf2 nf2Var = this.P;
            if (zEquals || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                nf2Var.f7438k = 32;
            } else {
                nf2Var.f7438k = 1;
            }
            this.f4677u0 = true;
            return;
        }
        l2 l2Var = this.O0;
        this.N0 = l2Var;
        if (l2Var != null) {
            int i11 = ff2.f4643a;
        }
        try {
            w wVar3 = this.T;
            ArrayDeque arrayDeque = null;
            if (wVar3 == null) {
                throw null;
            }
            if (this.f4661d0 == null) {
                try {
                    ArrayList arrayListX = X(this.K, wVar3);
                    arrayListX.isEmpty();
                    this.f4661d0 = new ArrayDeque();
                    if (!arrayListX.isEmpty()) {
                        this.f4661d0.add((zf2) arrayListX.get(0));
                    }
                    this.f4662e0 = null;
                } catch (jg2 e6) {
                    throw new dg2(wVar3, e6, -49998);
                }
            }
            if (this.f4661d0.isEmpty()) {
                throw new dg2(wVar3, (jg2) null, -49999);
            }
            ArrayDeque arrayDeque2 = this.f4661d0;
            if (arrayDeque2 == null) {
                throw null;
            }
            while (this.Y == null) {
                zf2 zf2Var = (zf2) arrayDeque2.peekFirst();
                if (zf2Var == null) {
                    throw arrayDeque;
                }
                if (!K(zf2Var)) {
                    return;
                }
                try {
                    wVar2 = this.T;
                } catch (Exception e7) {
                    e = e7;
                    i6 = i10;
                }
                if (wVar2 == null) {
                    throw arrayDeque;
                }
                String str3 = zf2Var.f11282a;
                int i12 = j31.f5914a;
                if (i12 < 23) {
                    fA = -1.0f;
                } else {
                    float f6 = this.X;
                    w[] wVarArr = this.B;
                    wVarArr.getClass();
                    fA = A(f6, wVarArr);
                }
                if (fA <= this.L) {
                    fA = -1.0f;
                }
                F(wVar2);
                el0 el0Var = this.f8013y;
                el0Var.getClass();
                long jZzb = el0Var.zzb();
                vf2 vf2VarW = W(zf2Var, wVar2, fA);
                i6 = i10;
                if (i12 >= 31) {
                    try {
                        hd2 hd2Var = this.f8012x;
                        hd2Var.getClass();
                        gd2 gd2Var = hd2Var.f5343b;
                        gd2Var.getClass();
                        LogSessionId logSessionId = gd2Var.f5002a;
                        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                            vf2VarW.f9853b.setString("log-session-id", logSessionId.getStringId());
                        }
                    } catch (Exception e8) {
                        e = e8;
                        r19 = arrayDeque;
                        qs0.g("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zf2Var.f11282a), e);
                        arrayDeque2.removeFirst();
                        dg2 dg2Var2 = new dg2(wVar3, e, zf2Var);
                        b0(dg2Var2);
                        dg2Var = this.f4662e0;
                        if (dg2Var != null) {
                        }
                        if (!arrayDeque2.isEmpty()) {
                        }
                    }
                }
                try {
                    Trace.beginSection("createCodec:" + str3);
                    wf2 wf2VarA = this.J.a(vf2VarW);
                    this.Y = wf2VarA;
                    wf2VarA.g(new aa1((fg2) this));
                    Trace.endSection();
                    el0 el0Var2 = this.f8013y;
                    el0Var2.getClass();
                    long jZzb2 = el0Var2.zzb();
                    if (zf2Var.c(wVar2)) {
                        j6 = jZzb2;
                        r19 = arrayDeque;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("id=");
                        sb.append(wVar2.f9967a);
                        sb.append(", mimeType=");
                        sb.append(wVar2.f9978m);
                        if (wVar2.f9977l != null) {
                            sb.append(", container=");
                            sb.append(wVar2.f9977l);
                        }
                        r19 = arrayDeque;
                        if (wVar2.f9974i != -1) {
                            try {
                                sb.append(", bitrate=");
                                sb.append(wVar2.f9974i);
                            } catch (Exception e9) {
                                e = e9;
                                r19 = r19;
                                qs0.g("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zf2Var.f11282a), e);
                                arrayDeque2.removeFirst();
                                dg2 dg2Var22 = new dg2(wVar3, e, zf2Var);
                                b0(dg2Var22);
                                dg2Var = this.f4662e0;
                                if (dg2Var != null) {
                                    this.f4662e0 = dg2Var22;
                                } else {
                                    this.f4662e0 = new dg2(dg2Var.getMessage(), dg2Var.getCause(), dg2Var.s, dg2Var.f3933t, dg2Var.f3934u);
                                }
                                if (!arrayDeque2.isEmpty()) {
                                    throw this.f4662e0;
                                }
                                i10 = i6;
                                arrayDeque = r19;
                            }
                        }
                        if (wVar2.f9975j != null) {
                            sb.append(", codecs=");
                            sb.append(wVar2.f9975j);
                        }
                        if (wVar2.f9982q != null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            j6 = jZzb2;
                            int i13 = 0;
                            while (true) {
                                ih2 ih2Var = wVar2.f9982q;
                                if (i13 >= ih2Var.f5771v) {
                                    break;
                                }
                                UUID uuid = ih2Var.s[i13].f7754t;
                                if (uuid.equals(f72.f4518b)) {
                                    linkedHashSet.add("cenc");
                                } else if (uuid.equals(f72.f4519c)) {
                                    linkedHashSet.add("clearkey");
                                } else if (uuid.equals(f72.f4521e)) {
                                    linkedHashSet.add("playready");
                                } else if (uuid.equals(f72.f4520d)) {
                                    linkedHashSet.add("widevine");
                                } else if (uuid.equals(f72.f4517a)) {
                                    linkedHashSet.add("universal");
                                } else {
                                    String string = uuid.toString();
                                    StringBuilder sb2 = new StringBuilder();
                                    i9 = i13;
                                    sb2.append("unknown (");
                                    sb2.append(string);
                                    sb2.append(")");
                                    linkedHashSet.add(sb2.toString());
                                    i13 = i9 + 1;
                                }
                                i9 = i13;
                                i13 = i9 + 1;
                            }
                            sb.append(", drm=[");
                            ih1.l(sb, linkedHashSet.iterator(), ",");
                            sb.append(']');
                        } else {
                            j6 = jZzb2;
                        }
                        if (wVar2.f9984t != -1 && wVar2.f9985u != -1) {
                            sb.append(", res=");
                            sb.append(wVar2.f9984t);
                            sb.append("x");
                            sb.append(wVar2.f9985u);
                        }
                        mb2 mb2Var = wVar2.A;
                        if (mb2Var != null) {
                            if (((mb2Var.f7079e == -1 || mb2Var.f7080f == -1) ? 0 : i6) != 0 || mb2Var.d()) {
                                sb.append(", color=");
                                sb.append(wVar2.A.c());
                            }
                        }
                        if (wVar2.f9986v != -1.0f) {
                            sb.append(", fps=");
                            sb.append(wVar2.f9986v);
                        }
                        if (wVar2.B != -1) {
                            sb.append(", channels=");
                            sb.append(wVar2.B);
                        }
                        if (wVar2.C != -1) {
                            sb.append(", sample_rate=");
                            sb.append(wVar2.C);
                        }
                        if (wVar2.f9970d != null) {
                            sb.append(", language=");
                            sb.append(wVar2.f9970d);
                        }
                        if (!wVar2.f9969c.isEmpty()) {
                            sb.append(", labels=[");
                            ih1.l(sb, ed0.n(wVar2.f9969c, new a6(6)).iterator(), ",");
                            sb.append("]");
                        }
                        if (wVar2.f9971e != 0) {
                            sb.append(", selectionFlags=[");
                            int i14 = wVar2.f9971e;
                            ArrayList arrayList = new ArrayList();
                            if ((i14 & 1) != 0) {
                                arrayList.add("default");
                            }
                            if ((i14 & 2) != 0) {
                                arrayList.add("forced");
                            }
                            ih1.l(sb, arrayList.iterator(), ",");
                            sb.append("]");
                        }
                        if (wVar2.f9972f != 0) {
                            sb.append(", roleFlags=[");
                            int i15 = wVar2.f9972f;
                            ArrayList arrayList2 = new ArrayList();
                            if ((i15 & 1) != 0) {
                                i8 = 32768;
                                arrayList2.add("main");
                            } else {
                                i8 = 32768;
                            }
                            if ((i15 & 2) != 0) {
                                arrayList2.add("alt");
                            }
                            if ((i15 & 4) != 0) {
                                arrayList2.add("supplementary");
                            }
                            if ((i15 & 8) != 0) {
                                arrayList2.add("commentary");
                            }
                            if ((i15 & 16) != 0) {
                                arrayList2.add("dub");
                            }
                            if ((i15 & 32) != 0) {
                                arrayList2.add("emergency");
                            }
                            if ((i15 & 64) != 0) {
                                arrayList2.add("caption");
                            }
                            if ((i15 & 128) != 0) {
                                arrayList2.add("subtitle");
                            }
                            if ((i15 & 256) != 0) {
                                arrayList2.add("sign");
                            }
                            if ((i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                                arrayList2.add("describes-video");
                            }
                            if ((i15 & 1024) != 0) {
                                arrayList2.add("describes-music");
                            }
                            if ((i15 & 2048) != 0) {
                                arrayList2.add("enhanced-intelligibility");
                            }
                            if ((i15 & 4096) != 0) {
                                arrayList2.add("transcribes-dialog");
                            }
                            if ((i15 & 8192) != 0) {
                                arrayList2.add("easy-read");
                            }
                            if ((i15 & 16384) != 0) {
                                arrayList2.add("trick-play");
                            }
                            if ((i15 & i8) != 0) {
                                arrayList2.add("auxiliary");
                            }
                            ih1.l(sb, arrayList2.iterator(), ",");
                            sb.append("]");
                        } else {
                            i8 = 32768;
                        }
                        if ((wVar2.f9972f & i8) != 0) {
                            sb.append(", auxiliaryTrackType=");
                            sb.append(AdError.UNDEFINED_DOMAIN);
                        }
                        String string2 = sb.toString();
                        Locale locale = Locale.US;
                        qs0.f("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + string2 + ", " + str3 + "]");
                        r19 = r19;
                    }
                    this.f4663f0 = zf2Var;
                    this.f4660c0 = fA;
                    this.Z = wVar2;
                    int i16 = j31.f5914a;
                    if (i16 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                        String str4 = j31.f5917d;
                        if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                            i7 = 2;
                        }
                        this.f4664g0 = i7;
                    } else if (i16 >= 24 || !("OMX.Nvidia.h264.decode".equals(str3) || "OMX.Nvidia.h264.decode.secure".equals(str3))) {
                        i7 = 0;
                        this.f4664g0 = i7;
                        this.f4665h0 = (i16 == 29 && "c2.android.aac.decoder".equals(str3)) ? i6 : 0;
                        this.f4666i0 = (i16 <= 23 || !"OMX.google.vorbis.decoder".equals(str3)) ? 0 : i6;
                        this.f4667j0 = (i16 == 21 || !"OMX.google.aac.decoder".equals(str3)) ? 0 : i6;
                        str = zf2Var.f11282a;
                        if (i16 <= 25 || !"OMX.rk.video_decoder.avc".equals(str)) {
                            ?? r02 = ((i16 <= 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) && !("Amazon".equals(j31.f5916c) && "AFTS".equals(j31.f5917d) && zf2Var.f11287f)) ? 0 : i6;
                            this.f4670m0 = r02;
                            if (this.Y == null) {
                                throw r19;
                            }
                            if (this.f8014z == 2) {
                                el0 el0Var3 = this.f8013y;
                                el0Var3.getClass();
                                this.f4672o0 = el0Var3.zzb() + 1000;
                            }
                            this.J0.f8287a++;
                            c0(str3, j6, j6 - jZzb);
                        }
                    } else {
                        String str5 = j31.f5915b;
                        if ("flounder".equals(str5) || "flounder_lte".equals(str5) || "grouper".equals(str5) || "tilapia".equals(str5)) {
                            i7 = i6;
                        }
                        this.f4664g0 = i7;
                        if (i16 == 29) {
                            this.f4665h0 = (i16 == 29 && "c2.android.aac.decoder".equals(str3)) ? i6 : 0;
                            if (i16 <= 23) {
                                this.f4666i0 = (i16 <= 23 || !"OMX.google.vorbis.decoder".equals(str3)) ? 0 : i6;
                                if (i16 == 21) {
                                    this.f4667j0 = (i16 == 21 || !"OMX.google.aac.decoder".equals(str3)) ? 0 : i6;
                                    str = zf2Var.f11282a;
                                    if (i16 <= 25) {
                                        if (i16 <= 29) {
                                            this.f4670m0 = r02;
                                            if (this.Y == null) {
                                            }
                                        } else {
                                            this.f4670m0 = r02;
                                            if (this.Y == null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i10 = i6;
                    arrayDeque = r19;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            this.f4661d0 = arrayDeque;
        } catch (dg2 e10) {
            throw q(e10, wVar, false, 4001);
        }
    }

    public void D(long j6) {
        this.L0 = j6;
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (arrayDeque.isEmpty() || j6 < ((eg2) arrayDeque.peek()).f4283a) {
                return;
            }
            eg2 eg2Var = (eg2) arrayDeque.poll();
            eg2Var.getClass();
            M(eg2Var);
            f0();
        }
    }

    public final void G() {
        try {
            wf2 wf2Var = this.Y;
            if (wf2Var != null) {
                wf2Var.zzm();
                this.J0.f8288b++;
                zf2 zf2Var = this.f4663f0;
                if (zf2Var == null) {
                    throw null;
                }
                d0(zf2Var.f11282a);
            }
            this.Y = null;
            this.N0 = null;
            I();
        } catch (Throwable th) {
            this.Y = null;
            this.N0 = null;
            I();
            throw th;
        }
    }

    public void H() {
        this.p0 = -1;
        this.N.f6003d = null;
        this.f4673q0 = -1;
        this.f4674r0 = null;
        this.f4672o0 = -9223372036854775807L;
        this.C0 = false;
        this.f4671n0 = -9223372036854775807L;
        this.B0 = false;
        this.f4668k0 = false;
        this.f4669l0 = false;
        this.f4675s0 = false;
        this.f4676t0 = false;
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.f4682z0 = 0;
        this.A0 = 0;
        this.f4681y0 = this.f4680x0 ? 1 : 0;
    }

    public final void I() {
        H();
        this.f4661d0 = null;
        this.f4663f0 = null;
        this.Z = null;
        this.f4658a0 = null;
        this.f4659b0 = false;
        this.D0 = false;
        this.f4660c0 = -1.0f;
        this.f4664g0 = 0;
        this.f4665h0 = false;
        this.f4666i0 = false;
        this.f4667j0 = false;
        this.f4670m0 = false;
        this.f4680x0 = false;
        this.f4681y0 = 0;
    }

    public final boolean J() {
        if (this.Y == null) {
            return false;
        }
        int i6 = this.A0;
        if (i6 == 3 || ((this.f4665h0 && !this.D0) || (this.f4666i0 && this.C0))) {
            G();
            return true;
        }
        if (i6 == 2) {
            int i7 = j31.f5914a;
            y5.r(i7 >= 23);
            if (i7 >= 23) {
                try {
                    l2 l2Var = this.O0;
                    l2Var.getClass();
                    this.N0 = l2Var;
                    this.f4682z0 = 0;
                    this.A0 = 0;
                } catch (wa2 e6) {
                    qs0.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e6);
                    G();
                    return true;
                }
            }
        }
        Y();
        return false;
    }

    public boolean K(zf2 zf2Var) {
        return true;
    }

    public boolean L(ja2 ja2Var) {
        return false;
    }

    public final void M(eg2 eg2Var) {
        this.K0 = eg2Var;
        if (eg2Var.f4285c != -9223372036854775807L) {
            this.M0 = true;
        }
    }

    @TargetApi(23)
    public final boolean N() {
        if (this.B0) {
            this.f4682z0 = 1;
            if (this.f4666i0) {
                this.A0 = 3;
                return false;
            }
            this.A0 = 2;
            return true;
        }
        l2 l2Var = this.O0;
        l2Var.getClass();
        this.N0 = l2Var;
        this.f4682z0 = 0;
        this.A0 = 0;
        return true;
    }

    public final boolean O(long j6, long j7) {
        if (j7 >= j6) {
            return false;
        }
        w wVar = this.U;
        return wVar == null || !Objects.equals(wVar.f9978m, "audio/opus") || j6 - j7 > 80000;
    }

    public final boolean P(int i6) {
        ro0 ro0Var = this.f8009u;
        ro0Var.f8673t = null;
        ro0Var.s = null;
        ja2 ja2Var = this.M;
        ja2Var.c();
        int iP = p(ro0Var, ja2Var, i6 | 4);
        if (iP == -5) {
            T(ro0Var);
            return true;
        }
        if (iP != -4 || !ja2Var.a(4)) {
            return false;
        }
        this.G0 = true;
        Z();
        return false;
    }

    public final boolean Q(w wVar) {
        if (j31.f5914a >= 23 && this.Y != null && this.A0 != 3 && this.f8014z != 0) {
            float f6 = this.X;
            wVar.getClass();
            w[] wVarArr = this.B;
            wVarArr.getClass();
            float fA = A(f6, wVarArr);
            float f7 = this.f4660c0;
            if (f7 != fA) {
                if (fA == -1.0f) {
                    V();
                    return false;
                }
                if (f7 != -1.0f || fA > this.L) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fA);
                    wf2 wf2Var = this.Y;
                    wf2Var.getClass();
                    wf2Var.k(bundle);
                    this.f4660c0 = fA;
                }
            }
        }
        return true;
    }

    public abstract int R(sj1 sj1Var, w wVar);

    public abstract ra2 S(zf2 zf2Var, w wVar, w wVar2);

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra2 T(ro0 ro0Var) {
        int i6;
        boolean z6 = true;
        this.I0 = true;
        w wVar = (w) ro0Var.s;
        wVar.getClass();
        String str = wVar.f9978m;
        if (str == null) {
            throw q(new IllegalArgumentException("Sample MIME type is null."), wVar, false, 4005);
        }
        if (str.equals("video/av01") && !wVar.f9981p.isEmpty()) {
            tk2 tk2Var = new tk2(wVar);
            tk2Var.f9333o = null;
            wVar = new w(tk2Var);
        }
        w wVar2 = wVar;
        this.O0 = (l2) ro0Var.f8673t;
        this.T = wVar2;
        if (this.f4677u0) {
            this.f4679w0 = true;
            return null;
        }
        wf2 wf2Var = this.Y;
        if (wf2Var == null) {
            this.f4661d0 = null;
            C();
            return null;
        }
        zf2 zf2Var = this.f4663f0;
        zf2Var.getClass();
        w wVar3 = this.Z;
        wVar3.getClass();
        l2 l2Var = this.N0;
        l2 l2Var2 = this.O0;
        if (l2Var != l2Var2) {
            V();
            return new ra2(zf2Var.f11282a, wVar3, wVar2, 0, 128);
        }
        boolean z7 = l2Var2 != l2Var;
        y5.r(!z7 || j31.f5914a >= 23);
        ra2 ra2VarS = S(zf2Var, wVar3, wVar2);
        int i7 = ra2VarS.f8599d;
        if (i7 != 0) {
            i6 = 2;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (Q(wVar2)) {
                        this.Z = wVar2;
                        if (!z7 || N()) {
                        }
                    } else {
                        i6 = 16;
                    }
                } else if (Q(wVar2)) {
                    this.f4680x0 = true;
                    this.f4681y0 = 1;
                    int i8 = this.f4664g0;
                    if (i8 != 2 && (i8 != 1 || wVar2.f9984t != wVar3.f9984t || wVar2.f9985u != wVar3.f9985u)) {
                        z6 = false;
                    }
                    this.f4668k0 = z6;
                    this.Z = wVar2;
                    if (!z7 || N()) {
                    }
                }
            } else if (Q(wVar2)) {
                this.Z = wVar2;
                if (z7) {
                    if (N()) {
                    }
                } else if (this.B0) {
                    this.f4682z0 = 1;
                    if (this.f4666i0) {
                        this.A0 = 3;
                    } else {
                        this.A0 = 1;
                    }
                }
            }
            return (i7 != 0 || (this.Y == wf2Var && this.A0 != 3)) ? ra2VarS : new ra2(zf2Var.f11282a, wVar3, wVar2, 0, i6);
        }
        V();
        i6 = 0;
        if (i7 != 0) {
        }
    }

    public final void U() {
        this.f4679w0 = false;
        this.P.c();
        this.O.c();
        this.f4678v0 = false;
        this.f4677u0 = false;
        b5 b5Var = this.S;
        b5Var.getClass();
        b5Var.f2919c = jc0.f6021a;
        b5Var.f2918b = 0;
        b5Var.f2917a = 2;
    }

    public final void V() {
        if (this.B0) {
            this.f4682z0 = 1;
            this.A0 = 3;
        } else {
            G();
            C();
        }
    }

    public abstract vf2 W(zf2 zf2Var, w wVar, float f6);

    public abstract ArrayList X(sj1 sj1Var, w wVar);

    public final void Y() {
        try {
            wf2 wf2Var = this.Y;
            y5.k(wf2Var);
            wf2Var.zzj();
        } finally {
            H();
        }
    }

    @TargetApi(23)
    public final void Z() {
        int i6 = this.A0;
        if (i6 == 1) {
            Y();
            return;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                this.H0 = true;
                g0();
                return;
            } else {
                G();
                C();
                return;
            }
        }
        Y();
        l2 l2Var = this.O0;
        l2Var.getClass();
        this.N0 = l2Var;
        this.f4682z0 = 0;
        this.A0 = 0;
    }

    public abstract void a0(ja2 ja2Var);

    public abstract void b0(Exception exc);

    public abstract void c0(String str, long j6, long j7);

    public abstract void d0(String str);

    public abstract void e0(w wVar, MediaFormat mediaFormat);

    public abstract void f0();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.pa2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(w[] wVarArr, long j6, long j7, oh2 oh2Var) {
        if (this.K0.f4285c == -9223372036854775807L) {
            M(new eg2(-9223372036854775807L, j6, j7));
            return;
        }
        ArrayDeque arrayDeque = this.R;
        if (arrayDeque.isEmpty()) {
            long j8 = this.E0;
            if (j8 != -9223372036854775807L) {
                long j9 = this.L0;
                if (j9 != -9223372036854775807L) {
                }
            }
            M(new eg2(-9223372036854775807L, j6, j7));
            if (this.K0.f4285c != -9223372036854775807L) {
                f0();
                return;
            }
            return;
        }
        arrayDeque.add(new eg2(this.E0, j6, j7));
    }

    public abstract boolean h0(long j6, long j7, wf2 wf2Var, ByteBuffer byteBuffer, int i6, int i7, int i8, long j8, boolean z6, boolean z7, w wVar);

    @Override // com.google.android.gms.internal.ads.pa2
    public void i(float f6, float f7) {
        this.W = f6;
        this.X = f7;
        Q(this.Z);
    }

    public boolean i0(w wVar) {
        return false;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // com.google.android.gms.internal.ads.pa2
    public void l(long r28, long r30) {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fg2.l(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public boolean n() {
        boolean zZze;
        if (this.T != null) {
            if (j()) {
                zZze = this.F;
            } else {
                mi2 mi2Var = this.A;
                mi2Var.getClass();
                zZze = mi2Var.zze();
            }
            if (!zZze) {
                if (!(this.f4673q0 >= 0)) {
                    if (this.f4672o0 != -9223372036854775807L) {
                        el0 el0Var = this.f8013y;
                        el0Var.getClass();
                        if (el0Var.zzb() >= this.f4672o0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final int o(w wVar) throws wa2 {
        try {
            return R(this.K, wVar);
        } catch (jg2 e6) {
            throw q(e6, wVar, false, 4002);
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final int r() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public void x() {
        this.T = null;
        M(eg2.f4282e);
        this.R.clear();
        J();
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public void z(boolean z6, long j6) {
        this.G0 = false;
        this.H0 = false;
        if (this.f4677u0) {
            this.P.c();
            this.O.c();
            this.f4678v0 = false;
            b5 b5Var = this.S;
            b5Var.getClass();
            b5Var.f2919c = jc0.f6021a;
            b5Var.f2918b = 0;
            b5Var.f2917a = 2;
        } else if (J()) {
            C();
        }
        t01 t01Var = this.K0.f4286d;
        if (t01Var.a() > 0) {
            this.I0 = true;
        }
        t01Var.e();
        this.R.clear();
    }

    public void E() {
    }

    public void g0() {
    }

    public void j0() {
    }

    public void F(w wVar) {
    }
}
