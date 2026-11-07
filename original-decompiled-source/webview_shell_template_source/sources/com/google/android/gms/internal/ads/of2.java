package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.ads.AdSize;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class of2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7746a;

    public of2(Context context) {
        this.f7746a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wf2 a(vf2 vf2Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str;
        MediaCodec mediaCodecCreateByCodecName2;
        xf2 rg2Var;
        Context context;
        int i6 = j31.f5914a;
        int i7 = 0;
        MediaCodec mediaCodec = null;
        if2Var = null;
        if2 if2Var = null;
        mediaCodec = null;
        if (i6 < 23 || (i6 < 31 && ((context = this.f7746a) == null || i6 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            try {
                String str2 = vf2Var.f9852a.f11282a;
                Trace.beginSection("createCodec:".concat(str2));
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str2);
                Trace.endSection();
            } catch (IOException e6) {
                e = e6;
            } catch (RuntimeException e7) {
                e = e7;
            }
            try {
                Trace.beginSection("configureCodec");
                Surface surface = vf2Var.f9855d;
                if (surface == null && vf2Var.f9852a.h && i6 >= 35) {
                    i7 = 8;
                }
                mediaCodecCreateByCodecName.configure(vf2Var.f9853b, surface, (MediaCrypto) null, i7);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new qg2(mediaCodecCreateByCodecName, vf2Var.f9856e);
            } catch (IOException e8) {
                e = e8;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e9) {
                e = e9;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                }
                throw e;
            }
        }
        w wVar = vf2Var.f9854c;
        zf2 zf2Var = vf2Var.f9852a;
        int iB = bk.b(wVar.f9978m);
        switch (iB) {
            case AdSize.AUTO_HEIGHT /* -2 */:
                str = "none";
                break;
            case -1:
                str = "unknown";
                break;
            case 0:
                str = "default";
                break;
            case 1:
                str = "audio";
                break;
            case 2:
                str = "video";
                break;
            case 3:
                str = "text";
                break;
            case 4:
                str = "image";
                break;
            case 5:
                str = "metadata";
                break;
            default:
                str = "camera motion";
                break;
        }
        qs0.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
        String str3 = zf2Var.f11282a;
        try {
            Trace.beginSection("createCodec:" + str3);
            mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName(str3);
            try {
                w wVar2 = vf2Var.f9854c;
                if (i6 >= 34 && (i6 >= 35 || bk.g(wVar2.f9978m))) {
                    rg2Var = new rg2(mediaCodecCreateByCodecName2);
                    i7 = 4;
                } else {
                    rg2Var = new lf2(mediaCodecCreateByCodecName2, new HandlerThread(if2.m(iB, "ExoPlayer:MediaCodecQueueingThread:")));
                }
                if2 if2Var2 = new if2(mediaCodecCreateByCodecName2, new HandlerThread(if2.m(iB, "ExoPlayer:MediaCodecAsyncAdapter:")), rg2Var, vf2Var.f9856e);
                try {
                    Trace.endSection();
                    Surface surface2 = vf2Var.f9855d;
                    if (surface2 == null && zf2Var.h && i6 >= 35) {
                        i7 |= 8;
                    }
                    if2.l(if2Var2, vf2Var.f9853b, surface2, i7);
                    return if2Var2;
                } catch (Exception e10) {
                    e = e10;
                    if2Var = if2Var2;
                    if (if2Var != null) {
                        if2Var.zzm();
                    } else if (mediaCodecCreateByCodecName2 != null) {
                        mediaCodecCreateByCodecName2.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName2 = null;
        }
    }
}
