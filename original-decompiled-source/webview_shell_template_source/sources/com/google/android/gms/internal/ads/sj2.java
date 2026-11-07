package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sj2 {

    /* renamed from: a, reason: collision with root package name */
    public final Spatializer f8959a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8960b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f8961c;

    /* renamed from: d, reason: collision with root package name */
    public lj2 f8962d;

    public sj2(Spatializer spatializer) {
        this.f8959a = spatializer;
        this.f8960b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public final boolean a(w wVar, gy0 gy0Var) throws IllegalArgumentException {
        String str = wVar.f9978m;
        int i6 = wVar.B;
        if (Objects.equals(str, "audio/eac3-joc") && i6 == 16) {
            i6 = 12;
        } else if (Objects.equals(wVar.f9978m, "audio/iamf") && i6 == -1) {
            i6 = 6;
        }
        int iM = j31.m(i6);
        if (iM == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM);
        int i7 = wVar.C;
        if (i7 != -1) {
            channelMask.setSampleRate(i7);
        }
        return this.f8959a.canBeSpatialized(gy0Var.a().f6595a, channelMask.build());
    }
}
