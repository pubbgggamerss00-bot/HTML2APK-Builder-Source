package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.AdRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ve2 extends fg2 implements ub2 {
    public final Context Q0;
    public final vd2 R0;
    public final te2 S0;
    public final tf2 T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public w X0;
    public w Y0;
    public long Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f9838a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f9839b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f9840c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f9841d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve2(Context context, of2 of2Var, Handler handler, db2 db2Var, te2 te2Var) {
        super(1, of2Var, 44100.0f);
        tf2 tf2Var = j31.f5914a >= 35 ? new tf2() : null;
        this.Q0 = context.getApplicationContext();
        this.S0 = te2Var;
        this.T0 = tf2Var;
        this.f9841d1 = -1000;
        this.R0 = new vd2(handler, db2Var);
        te2Var.f9250l = new xj1(27, this);
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final float A(float f6, w[] wVarArr) {
        int iMax = -1;
        for (w wVar : wVarArr) {
            int i6 = wVar.C;
            if (i6 != -1) {
                iMax = Math.max(iMax, i6);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // com.google.android.gms.internal.ads.fg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R(sj1 sj1Var, w wVar) {
        int i6;
        int i7;
        int i8;
        boolean z6;
        int i9;
        cp1 cp1VarC;
        boolean z7;
        rd2 rd2VarA;
        boolean zBooleanValue;
        AudioManager audioManager;
        int iM;
        String str = wVar.f9978m;
        int i10 = wVar.B;
        int i11 = wVar.C;
        if (!"audio".equals(bk.h(str))) {
            return 128;
        }
        int i12 = wVar.I;
        boolean z8 = i12 == 0;
        te2 te2Var = this.S0;
        if (!z8) {
            i6 = 0;
        } else if (i12 != 0) {
            List listB = pg2.b(false, false, "audio/raw");
            if ((listB.isEmpty() ? null : (zf2) listB.get(0)) != null) {
                if (te2Var.S) {
                    rd2VarA = rd2.f8613d;
                } else {
                    r0 r0Var = te2Var.Y;
                    gy0 gy0Var = te2Var.f9257t;
                    r0Var.getClass();
                    gy0Var.getClass();
                    int i13 = j31.f5914a;
                    if (i13 < 29 || i11 == -1) {
                        rd2VarA = rd2.f8613d;
                    } else {
                        Context context = (Context) r0Var.s;
                        Boolean bool = (Boolean) r0Var.f8494t;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                                r0Var.f8494t = Boolean.FALSE;
                            } else {
                                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                                r0Var.f8494t = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                            }
                            zBooleanValue = ((Boolean) r0Var.f8494t).booleanValue();
                        }
                        str.getClass();
                        int iA = bk.a(str, wVar.f9975j);
                        if (iA == 0 || i13 < j31.l(iA) || (iM = j31.m(i10)) == 0) {
                            rd2VarA = rd2.f8613d;
                        } else {
                            try {
                                AudioFormat audioFormatW = j31.w(i11, iM, iA);
                                if (i13 >= 31) {
                                    int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatW, gy0Var.a().f6595a);
                                    if (playbackOffloadSupport == 0) {
                                        rd2VarA = rd2.f8613d;
                                    } else {
                                        qd2 qd2Var = new qd2();
                                        boolean z9 = i13 > 32 && playbackOffloadSupport == 2;
                                        qd2Var.f8359a = true;
                                        qd2Var.f8360b = z9;
                                        qd2Var.f8361c = zBooleanValue;
                                        rd2VarA = qd2Var.a();
                                    }
                                } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatW, gy0Var.a().f6595a)) {
                                    qd2 qd2Var2 = new qd2();
                                    qd2Var2.f8359a = true;
                                    qd2Var2.f8361c = zBooleanValue;
                                    rd2VarA = qd2Var2.a();
                                } else {
                                    rd2VarA = rd2.f8613d;
                                }
                            } catch (IllegalArgumentException unused) {
                                rd2VarA = rd2.f8613d;
                            }
                        }
                    }
                }
                if (rd2VarA.f8614a) {
                    i6 = true != rd2VarA.f8615b ? AdRequest.MAX_CONTENT_URL_LENGTH : 1536;
                    if (rd2VarA.f8616c) {
                        i6 |= 2048;
                    }
                } else {
                    i6 = 0;
                }
                if (te2Var.l(wVar) != 0) {
                    return i6 | 172;
                }
            } else {
                i6 = 0;
            }
        }
        if ("audio/raw".equals(str) && te2Var.l(wVar) == 0) {
            i8 = 128;
            i7 = 1;
        } else {
            tk2 tk2Var = new tk2();
            tk2Var.c("audio/raw");
            tk2Var.A = i10;
            tk2Var.B = i11;
            tk2Var.C = 2;
            if (te2Var.l(new w(tk2Var)) != 0) {
                if (wVar.f9978m == null) {
                    i9 = 0;
                    cp1VarC = cp1.f3636w;
                } else {
                    if (te2Var.l(wVar) != 0) {
                        z6 = 0;
                        i9 = 0;
                        List listB2 = pg2.b(false, false, "audio/raw");
                        zf2 zf2Var = listB2.isEmpty() ? null : (zf2) listB2.get(0);
                        if (zf2Var != null) {
                            cp1VarC = bo1.n(zf2Var);
                        }
                    } else {
                        z6 = 0;
                    }
                    cp1VarC = pg2.c(sj1Var, wVar, z6, z6);
                    i9 = z6;
                }
                if (!cp1VarC.isEmpty()) {
                    if (z8) {
                        zf2 zf2Var2 = (zf2) cp1VarC.get(i9);
                        boolean zC = zf2Var2.c(wVar);
                        if (zC) {
                            z7 = true;
                        } else {
                            for (int i14 = 1; i14 < cp1VarC.f3638v; i14++) {
                                zf2 zf2Var3 = (zf2) cp1VarC.get(i14);
                                if (zf2Var3.c(wVar)) {
                                    z7 = i9;
                                    zf2Var2 = zf2Var3;
                                    zC = true;
                                    break;
                                }
                            }
                            z7 = true;
                        }
                        int i15 = true != zC ? 3 : 4;
                        int i16 = 8;
                        if (zC && zf2Var2.d(wVar)) {
                            i16 = 16;
                        }
                        int i17 = true != zf2Var2.f11288g ? i9 : 64;
                        if (true == z7) {
                            i9 = 128;
                        }
                        return i17 | i15 | i16 | 32 | i9 | i6;
                    }
                    i7 = 2;
                }
                i8 = 128;
                i7 = 1;
            } else {
                i7 = 1;
            }
            i8 = 128;
        }
        return i8 | i7;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final ra2 S(zf2 zf2Var, w wVar, w wVar2) {
        int i6;
        int i7;
        ra2 ra2VarA = zf2Var.a(wVar, wVar2);
        int i8 = ra2VarA.f8600e;
        if (this.O0 == null && i0(wVar2)) {
            i8 |= 32768;
        }
        if (k0(zf2Var, wVar2) > this.U0) {
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
        w wVar = (w) ro0Var.s;
        wVar.getClass();
        this.X0 = wVar;
        ra2 ra2VarT = super.T(ro0Var);
        vd2 vd2Var = this.R0;
        Handler handler = vd2Var.f9835a;
        if (handler != null) {
            handler.post(new v(vd2Var, wVar, ra2VarT, 3));
        }
        return ra2VarT;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    @Override // com.google.android.gms.internal.ads.fg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vf2 W(zf2 zf2Var, w wVar, float f6) {
        boolean z6;
        w[] wVarArr = this.B;
        wVarArr.getClass();
        int length = wVarArr.length;
        int iK0 = k0(zf2Var, wVar);
        String str = zf2Var.f11282a;
        if (length != 1) {
            for (w wVar2 : wVarArr) {
                if (zf2Var.a(wVar, wVar2).f8599d != 0) {
                    iK0 = Math.max(iK0, k0(zf2Var, wVar2));
                }
            }
        }
        this.U0 = iK0;
        int i6 = j31.f5914a;
        if (i6 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(j31.f5916c)) {
            String str2 = j31.f5915b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        this.V0 = z6;
        this.W0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = zf2Var.f11284c;
        int i7 = this.U0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i8 = wVar.B;
        String str4 = wVar.f9978m;
        int i9 = wVar.C;
        mediaFormat.setInteger("channel-count", i8);
        mediaFormat.setInteger("sample-rate", i9);
        tt0.b(mediaFormat, wVar.f9981p);
        tt0.a(mediaFormat, "max-input-size", i7);
        if (i6 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f6 != -1.0f) {
                if (i6 == 23) {
                    String str5 = j31.f5917d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f6);
                    }
                }
            }
        }
        if (i6 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i6 >= 24) {
            int i10 = wVar.B;
            tk2 tk2Var = new tk2();
            tk2Var.c("audio/raw");
            tk2Var.A = i10;
            tk2Var.B = i9;
            tk2Var.C = 4;
            if (this.S0.l(new w(tk2Var)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i6 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i6 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f9841d1));
        }
        w wVar3 = null;
        if ("audio/raw".equals(zf2Var.f11283b) && !"audio/raw".equals(str4)) {
            wVar3 = wVar;
        }
        this.Y0 = wVar3;
        return new vf2(zf2Var, mediaFormat, wVar, null, this.T0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // com.google.android.gms.internal.ads.fg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList X(sj1 sj1Var, w wVar) {
        cp1 cp1VarN;
        if (wVar.f9978m == null) {
            cp1VarN = cp1.f3636w;
        } else if (this.S0.l(wVar) != 0) {
            List listB = pg2.b(false, false, "audio/raw");
            zf2 zf2Var = listB.isEmpty() ? null : (zf2) listB.get(0);
            cp1VarN = zf2Var != null ? bo1.n(zf2Var) : pg2.c(sj1Var, wVar, false, false);
        }
        HashMap map = pg2.f8070a;
        ArrayList arrayList = new ArrayList(cp1VarN);
        Collections.sort(arrayList, new hg2(new xj1(28, wVar)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final void a(ip ipVar) {
        te2 te2Var = this.S0;
        te2Var.getClass();
        te2Var.f9260w = new ip(Math.max(0.1f, Math.min(ipVar.f5818a, 8.0f)), Math.max(0.1f, Math.min(ipVar.f5819b, 8.0f)));
        ke2 ke2Var = new ke2(ipVar, -9223372036854775807L, -9223372036854775807L);
        if (te2Var.k()) {
            te2Var.f9258u = ke2Var;
        } else {
            te2Var.f9259v = ke2Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void a0(ja2 ja2Var) {
        w wVar;
        if (j31.f5914a < 29 || (wVar = ja2Var.f6001b) == null || !Objects.equals(wVar.f9978m, "audio/opus") || !this.f4677u0) {
            return;
        }
        ByteBuffer byteBuffer = ja2Var.f6006g;
        byteBuffer.getClass();
        ja2Var.f6001b.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            AudioTrack audioTrack = this.S0.f9254p;
            if (audioTrack != null) {
                te2.m(audioTrack);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2, com.google.android.gms.internal.ads.lc2
    public final void b(int i6, Object obj) throws IllegalStateException {
        ck1 ck1Var;
        tf2 tf2Var;
        te2 te2Var = this.S0;
        if (i6 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (te2Var.G != fFloatValue) {
                te2Var.G = fFloatValue;
                if (te2Var.k()) {
                    te2Var.f9254p.setVolume(te2Var.G);
                    return;
                }
                return;
            }
            return;
        }
        if (i6 == 3) {
            gy0 gy0Var = (gy0) obj;
            gy0Var.getClass();
            if (te2Var.f9257t.equals(gy0Var)) {
                return;
            }
            te2Var.f9257t = gy0Var;
            pd2 pd2Var = te2Var.f9256r;
            if (pd2Var != null) {
                pd2Var.h = gy0Var;
                pd2Var.b(ld2.b(pd2Var.f8041a, gy0Var, pd2Var.f8047g));
            }
            te2Var.p();
            return;
        }
        if (i6 == 6) {
            gb1 gb1Var = (gb1) obj;
            gb1Var.getClass();
            if (te2Var.P.equals(gb1Var)) {
                return;
            }
            if (te2Var.f9254p != null) {
                te2Var.P.getClass();
            }
            te2Var.P = gb1Var;
            return;
        }
        if (i6 == 12) {
            if (j31.f5914a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    ck1Var = null;
                } else {
                    te2Var.getClass();
                    ck1Var = new ck1(19, audioDeviceInfo);
                }
                te2Var.Q = ck1Var;
                pd2 pd2Var2 = te2Var.f9256r;
                if (pd2Var2 != null) {
                    pd2Var2.a(audioDeviceInfo);
                }
                AudioTrack audioTrack = te2Var.f9254p;
                if (audioTrack != null) {
                    ck1 ck1Var2 = te2Var.Q;
                    audioTrack.setPreferredDevice(ck1Var2 != null ? (AudioDeviceInfo) ck1Var2.f3613t : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i6 == 16) {
            obj.getClass();
            this.f9841d1 = ((Integer) obj).intValue();
            wf2 wf2Var = this.Y;
            if (wf2Var == null || j31.f5914a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f9841d1));
            wf2Var.k(bundle);
            return;
        }
        if (i6 == 9) {
            obj.getClass();
            te2Var.f9261x = ((Boolean) obj).booleanValue();
            ke2 ke2Var = new ke2(te2Var.f9260w, -9223372036854775807L, -9223372036854775807L);
            if (te2Var.k()) {
                te2Var.f9258u = ke2Var;
                return;
            } else {
                te2Var.f9259v = ke2Var;
                return;
            }
        }
        if (i6 != 10) {
            if (i6 == 11) {
                this.V = (pc2) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (te2Var.O != iIntValue) {
            te2Var.O = iIntValue;
            te2Var.p();
        }
        if (j31.f5914a < 35 || (tf2Var = this.T0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = tf2Var.f9268b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            tf2Var.f9268b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, ur1.s, new pf2());
        tf2Var.f9268b = loudnessCodecControllerCreate;
        Iterator it = tf2Var.f9267a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void b0(Exception exc) {
        qs0.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        vd2 vd2Var = this.R0;
        Handler handler = vd2Var.f9835a;
        if (handler != null) {
            handler.post(new u(vd2Var, exc, 11));
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void c() {
        tf2 tf2Var;
        md2 md2Var;
        pd2 pd2Var = this.S0.f9256r;
        if (pd2Var != null) {
            Context context = pd2Var.f8041a;
            if (pd2Var.f8048i) {
                pd2Var.f8046f = null;
                if (j31.f5914a >= 23 && (md2Var = pd2Var.f8043c) != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    audioManager.getClass();
                    audioManager.unregisterAudioDeviceCallback(md2Var);
                }
                context.unregisterReceiver(pd2Var.f8044d);
                nd2 nd2Var = pd2Var.f8045e;
                if (nd2Var != null) {
                    nd2Var.f7422a.unregisterContentObserver(nd2Var);
                }
                pd2Var.f8048i = false;
            }
        }
        if (j31.f5914a < 35 || (tf2Var = this.T0) == null) {
            return;
        }
        tf2Var.f9267a.clear();
        LoudnessCodecController loudnessCodecController = tf2Var.f9268b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void c0(String str, long j6, long j7) {
        vd2 vd2Var = this.R0;
        Handler handler = vd2Var.f9835a;
        if (handler != null) {
            handler.post(new td2(vd2Var, str, j6, j7));
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void d() throws IllegalStateException {
        te2 te2Var = this.S0;
        this.f9840c1 = false;
        try {
            try {
                U();
                G();
                if (this.f9839b1) {
                    this.f9839b1 = false;
                    te2Var.r();
                }
            } finally {
                this.O0 = null;
            }
        } catch (Throwable th) {
            if (this.f9839b1) {
                this.f9839b1 = false;
                te2Var.r();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void d0(String str) {
        vd2 vd2Var = this.R0;
        Handler handler = vd2Var.f9835a;
        if (handler != null) {
            handler.post(new ud2(vd2Var, str, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void e() throws IllegalStateException {
        this.S0.q();
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void e0(w wVar, MediaFormat mediaFormat) throws wa2, pb0 {
        w wVar2 = this.Y0;
        int[] iArr = null;
        boolean z6 = true;
        if (wVar2 != null) {
            wVar = wVar2;
        } else if (this.Y != null) {
            mediaFormat.getClass();
            String str = wVar.f9978m;
            int i6 = wVar.B;
            int iQ = "audio/raw".equals(str) ? wVar.D : (j31.f5914a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? j31.q(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            tk2 tk2Var = new tk2();
            tk2Var.c("audio/raw");
            tk2Var.C = iQ;
            tk2Var.D = wVar.E;
            tk2Var.E = wVar.F;
            tk2Var.f9328j = wVar.f9976k;
            tk2Var.f9320a = wVar.f9967a;
            tk2Var.f9321b = wVar.f9968b;
            tk2Var.f9322c = bo1.l(wVar.f9969c);
            tk2Var.f9323d = wVar.f9970d;
            tk2Var.f9324e = wVar.f9971e;
            tk2Var.f9325f = wVar.f9972f;
            tk2Var.A = mediaFormat.getInteger("channel-count");
            tk2Var.B = mediaFormat.getInteger("sample-rate");
            wVar = new w(tk2Var);
            boolean z7 = this.V0;
            int i7 = wVar.B;
            if (z7 && i7 == 6 && i6 < 6) {
                iArr = new int[i6];
                for (int i8 = 0; i8 < i6; i8++) {
                    iArr[i8] = i8;
                }
            } else if (this.W0) {
                if (i7 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i7 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i7 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i7 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i7 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i9 = j31.f5914a;
            if (i9 >= 29) {
                if (this.f4677u0) {
                    u();
                }
                if (i9 < 29) {
                    z6 = false;
                }
                y5.r(z6);
            }
            this.S0.o(wVar, iArr);
        } catch (xd2 e6) {
            throw q(e6, e6.s, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void f() throws IllegalStateException {
        l0();
        te2 te2Var = this.S0;
        te2Var.N = false;
        if (te2Var.k()) {
            de2 de2Var = te2Var.f9245f;
            de2Var.f3875k = 0L;
            de2Var.f3886w = 0;
            de2Var.f3885v = 0;
            de2Var.f3876l = 0L;
            de2Var.C = 0L;
            de2Var.F = 0L;
            de2Var.f3874j = false;
            if (de2Var.f3887x == -9223372036854775807L) {
                ce2 ce2Var = de2Var.f3870e;
                ce2Var.getClass();
                ce2Var.a(0);
            } else {
                de2Var.f3889z = de2Var.d();
                if (!te2.m(te2Var.f9254p)) {
                    return;
                }
            }
            te2Var.f9254p.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void f0() {
        this.S0.D = true;
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final void g0() throws IllegalStateException, wa2 {
        try {
            te2 te2Var = this.S0;
            if (!te2Var.K && te2Var.k() && te2Var.j()) {
                te2Var.g();
                te2Var.K = true;
            }
        } catch (ae2 e6) {
            throw q(e6, e6.f2735u, e6.f2734t, true != this.f4677u0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final boolean h0(long j6, long j7, wf2 wf2Var, ByteBuffer byteBuffer, int i6, int i7, int i8, long j8, boolean z6, boolean z7, w wVar) throws wa2 {
        byteBuffer.getClass();
        if (this.Y0 != null && (i7 & 2) != 0) {
            wf2Var.getClass();
            wf2Var.j(i6);
            return true;
        }
        te2 te2Var = this.S0;
        if (z6) {
            if (wf2Var != null) {
                wf2Var.j(i6);
            }
            this.J0.f8292f += i8;
            te2Var.D = true;
            return true;
        }
        try {
            if (!te2Var.s(byteBuffer, j8, i8)) {
                return false;
            }
            if (wf2Var != null) {
                wf2Var.j(i6);
            }
            this.J0.f8291e += i8;
            return true;
        } catch (ae2 e6) {
            if (this.f4677u0) {
                u();
            }
            throw q(e6, wVar, e6.f2734t, 5002);
        } catch (yd2 e7) {
            w wVar2 = this.X0;
            if (this.f4677u0) {
                u();
            }
            throw q(e7, wVar2, e7.f10933t, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.fg2
    public final boolean i0(w wVar) {
        u();
        return this.S0.l(wVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    public final int k0(zf2 zf2Var, w wVar) {
        int i6;
        if (!"OMX.google.raw.decoder".equals(zf2Var.f11282a) || (i6 = j31.f5914a) >= 24 || (i6 == 23 && j31.e(this.Q0))) {
            return wVar.f9979n;
        }
        return -1;
    }

    public final void l0() {
        long jMax;
        long jR;
        boolean zM = m();
        te2 te2Var = this.S0;
        com.google.android.gms.ads.mediation.customevent.b bVar = te2Var.X;
        ArrayDeque arrayDeque = te2Var.f9246g;
        if (!te2Var.k() || te2Var.E) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(te2Var.f9245f.a(zM), j31.t(te2Var.f9252n.f6046e, te2Var.b()));
            while (!arrayDeque.isEmpty() && jMin >= ((ke2) arrayDeque.getFirst()).f6391c) {
                te2Var.f9259v = (ke2) arrayDeque.remove();
            }
            long jU = jMin - te2Var.f9259v.f6391c;
            if (arrayDeque.isEmpty()) {
                he0 he0Var = (he0) bVar.f2375u;
                if (he0Var.zzg()) {
                    long j6 = he0Var.f5364o;
                    if (j6 >= 1024) {
                        long j7 = he0Var.f5363n;
                        vd0 vd0Var = he0Var.f5359j;
                        vd0Var.getClass();
                        int i6 = vd0Var.f9821k * vd0Var.f9813b;
                        long j8 = j7 - (i6 + i6);
                        int i7 = he0Var.h.f11241a;
                        int i8 = he0Var.f5357g.f11241a;
                        jU = i7 == i8 ? j31.u(jU, j8, j6, RoundingMode.DOWN) : j31.u(jU, j8 * i7, j6 * i8, RoundingMode.DOWN);
                    } else {
                        jU = (long) (he0Var.f5353c * jU);
                    }
                }
                jR = te2Var.f9259v.f6390b + jU;
            } else {
                ke2 ke2Var = (ke2) arrayDeque.getFirst();
                jR = ke2Var.f6390b - j31.r(ke2Var.f6391c - jMin, te2Var.f9259v.f6389a.f5818a);
            }
            long j9 = ((we2) bVar.f2374t).f10183l;
            jMax = j31.t(te2Var.f9252n.f6046e, j9) + jR;
            long j10 = te2Var.U;
            if (j9 > j10) {
                long jT = j31.t(te2Var.f9252n.f6046e, j9 - j10);
                te2Var.U = j9;
                te2Var.V += jT;
                if (te2Var.W == null) {
                    te2Var.W = new Handler(Looper.myLooper());
                }
                te2Var.W.removeCallbacksAndMessages(null);
                te2Var.W.postDelayed(new b(20, te2Var), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f9838a1) {
                jMax = Math.max(this.Z0, jMax);
            }
            this.Z0 = jMax;
            this.f9838a1 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final boolean m() {
        if (!this.H0) {
            return false;
        }
        te2 te2Var = this.S0;
        if (te2Var.k()) {
            return te2Var.K && !te2Var.t();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final boolean n() {
        return this.S0.t() || super.n();
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final void x() {
        vd2 vd2Var = this.R0;
        this.f9839b1 = true;
        this.X0 = null;
        try {
            try {
                this.S0.p();
                super.x();
                qa2 qa2Var = this.J0;
                vd2Var.getClass();
                synchronized (qa2Var) {
                }
                Handler handler = vd2Var.f9835a;
                if (handler != null) {
                    handler.post(new wx(12, vd2Var, qa2Var));
                }
            } catch (Throwable th) {
                super.x();
                qa2 qa2Var2 = this.J0;
                vd2Var.getClass();
                synchronized (qa2Var2) {
                    Handler handler2 = vd2Var.f9835a;
                    if (handler2 != null) {
                        handler2.post(new wx(12, vd2Var, qa2Var2));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            qa2 qa2Var3 = this.J0;
            vd2Var.getClass();
            synchronized (qa2Var3) {
                Handler handler3 = vd2Var.f9835a;
                if (handler3 != null) {
                    handler3.post(new wx(12, vd2Var, qa2Var3));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void y(boolean z6, boolean z7) {
        qa2 qa2Var = new qa2();
        this.J0 = qa2Var;
        vd2 vd2Var = this.R0;
        Handler handler = vd2Var.f9835a;
        if (handler != null) {
            handler.post(new sd2(vd2Var, qa2Var, 0));
        }
        u();
        hd2 hd2Var = this.f8012x;
        hd2Var.getClass();
        te2 te2Var = this.S0;
        te2Var.f9249k = hd2Var;
        el0 el0Var = this.f8013y;
        el0Var.getClass();
        te2Var.f9245f.G = el0Var;
    }

    @Override // com.google.android.gms.internal.ads.fg2, com.google.android.gms.internal.ads.pa2
    public final void z(boolean z6, long j6) throws IllegalStateException {
        super.z(z6, j6);
        this.S0.p();
        this.Z0 = j6;
        this.f9840c1 = false;
        this.f9838a1 = true;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final long zza() {
        if (this.f8014z == 2) {
            l0();
        }
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final ip zzc() {
        return this.S0.f9260w;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final boolean zzj() {
        boolean z6 = this.f9840c1;
        this.f9840c1 = false;
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final ub2 t() {
        return this;
    }
}
